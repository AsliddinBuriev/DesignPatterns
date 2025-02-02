package strategy;

public class PdfFileStrategy implements FileStrategy {
    @Override
    public void create(String data) {
        System.out.println("Creating PDF file with data: " + data);
    }

    @Override
    public void read() {
        System.out.println("Reading PDF file");
    }

    @Override
    public void update(String data) {
        System.out.println("Updating PDF file with data: " + data);
    }

    @Override
    public void delete() {
        System.out.println("Deleting PDF file");
    }
}

