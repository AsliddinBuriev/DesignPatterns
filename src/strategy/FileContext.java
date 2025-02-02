package strategy;

public class FileContext {
    private FileStrategy fileStrategy;

    public void setFileStrategy(FileStrategy fileStrategy) {
        this.fileStrategy = fileStrategy;
    }

    public void createFile(String data) {
        fileStrategy.create(data);
    }

    public void readFile() {
        fileStrategy.read();
    }

    public void updateFile(String data) {
        fileStrategy.update(data);
    }

    public void deleteFile() {
        fileStrategy.delete();
    }
}

