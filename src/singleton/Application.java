package singleton;
import java.util.Scanner;

public class Application {
    static public void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'connect' to establish a database connection, or 'exit' to quit:");
        while (true) {
            System.out.print("Enter command > ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("Exiting the application!");
                break;
            }else if(input.equals("connect")) {
                DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
                System.out.println("Connected to database: " + System.identityHashCode(databaseConnection));
            }else {
                System.out.println("Invalid command");
            }
        }
        scanner.close();
    }
}
