package strategy;

public interface FileStrategy {
    void create(String data);
    void read();
    void update(String data);
    void delete();
}