package decorator;

import java.io.*;

public class FileDataSource implements DataSource {
    private final String fileName;
    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }
    public void writeData(String data) {
        File file = new File(fileName);
        try(OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String readData() {
        File file = new File(fileName);
        if (!file.exists() || file.length() == 0) {
            System.out.println("File does not exist or is empty");
            return "";
        }
        char[] buffer = new char[(int) file.length()];
        int charsRead = 0;
        try (FileReader reader = new FileReader(file)) {
            charsRead = reader.read(buffer);
        } catch (IOException ex) {
            System.out.println("Error reading the file: " + ex.getMessage());
        }
        return new String(buffer, 0 , charsRead);
    }
}
