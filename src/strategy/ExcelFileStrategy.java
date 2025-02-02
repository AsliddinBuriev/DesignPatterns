package strategy;

public class ExcelFileStrategy implements FileStrategy {
    @Override
    public void create(String data) {
        System.out.println("Creating Excel file with data: " + data);
    }

    @Override
    public void read() {
        System.out.println("Reading Excel file");
    }

    @Override
    public void update(String data) {
        System.out.println("Updating Excel file with data: " + data);
    }

    @Override
    public void delete() {
        System.out.println("Deleting Excel file");
    }
}

