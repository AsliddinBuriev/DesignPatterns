package strategy;

import java.util.Scanner;

public class FileStrategyClient {
    public static void main(String[] args) {
        FileContext fileContext = new FileContext();
        FileStrategyFactory fileStrategyFactory = new FileStrategyFactory();

        Scanner input = new Scanner(System.in);
        FileType fileType = null;
        while(fileType == null) {
            System.out.println("Please enter your preferred file type (CSV, EXCEL, PDF): ");
            try{
                fileType = FileType.valueOf(input.nextLine());
            }catch (Exception e) {
                System.out.println("Please enter a valid file type: ");
                System.out.println("Please reenter your preferred file type(CSV, EXCEL, PDF): ");
            }
        }
        input.close();

        FileStrategy fileStrategy = fileStrategyFactory.createFileStrategy(fileType);
        fileContext.setFileStrategy(fileStrategy);

        fileContext.createFile("CSV Data");
        fileContext.readFile();
        fileContext.updateFile("Updated CSV Data");
        fileContext.deleteFile();

    }
}
