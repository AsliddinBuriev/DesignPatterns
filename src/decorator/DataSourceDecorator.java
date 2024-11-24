package decorator;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrappee;
    protected DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    public void writeData(String data) {
        wrappee.writeData(data);
    }

    public String readData() {
        return wrappee.readData();
    }
}
