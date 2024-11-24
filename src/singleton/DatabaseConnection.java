package singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private DatabaseConnection() {}
    public static DatabaseConnection getInstance() {
        synchronized (DatabaseConnection.class) {
            if (instance == null) {
                instance = new DatabaseConnection();
                System.out.println(Thread.currentThread().getName() + " created a new DatabaseConnection.");
            }
        }
        return instance;
    }
}
