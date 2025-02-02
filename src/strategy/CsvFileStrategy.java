package strategy;

public class CsvFileStrategy implements FileStrategy {
    @Override
    public void create(String data) {
        System.out.println("Creating CSV file with data: " + data);
    }

    @Override
    public void read() {
        System.out.println("Reading CSV file");
    }

    @Override
    public void update(String data) {
        System.out.println("Updating CSV file with data: " + data);
    }

    @Override
    public void delete() {
        System.out.println("Deleting CSV file");
    }
}

