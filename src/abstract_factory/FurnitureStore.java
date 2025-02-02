package abstract_factory;

import abstract_factory.classic.ClassicFurnitureFactory;
import abstract_factory.modern.ModernFurnitureFactory;
import abstract_factory.victorian.VictorianFurnitureFactory;

import java.util.Scanner;

public class FurnitureStore {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        FurnitureType furnitureType = null;
        Product product = null;
        int orderCount = 0;
        while (furnitureType == null) {
            System.out.print("Enter furniture type (VICTORIAN, CLASSIC, MODERN): ");
            String input = order.nextLine().toUpperCase();
            try {
                furnitureType = FurnitureType.valueOf(input);
            } catch (Exception e) {
                System.out.println("You entered invalid furniture type.");
                System.out.print("Please renter furniture type (VICTORIAN, CLASSIC, MODERN): ");
            }
        }

        while (product == null) {
            System.out.print("Enter product type (CHAIR, SOFA, COFFEE TABLE): ");
            String input = order.nextLine().toUpperCase();
            try {
                product = Product.valueOf(input);
            } catch (Exception e) {
                System.out.println("You entered invalid furniture type.");
                System.out.print("Please renter product type (CHAIR, SOFA, COFFEE TABLE): ");
            }
        }

        while (orderCount == 0) {
            System.out.println("Please enter a valid order quantity: ");
            orderCount = order.nextInt();
            if (orderCount < 0) {
                System.out.println("You entered invalid order quantity.");
                System.out.print("Please renter a valid order quantity: ");
            }
        }

        System.out.println("Your order is received: ");
        System.out.println("Selected Furniture Type: " + furnitureType);
        System.out.println("Selected Product: " + product);
        System.out.println("Order Quantity: " + orderCount);

        try{
            processOrder(furnitureType, product, orderCount);
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void processOrder(FurnitureType furnitureType, Product product, int count) {
        FurnitureFactory furnitureFactory = switch (furnitureType) {
            case VICTORIAN -> new VictorianFurnitureFactory();
            case CLASSIC -> new ClassicFurnitureFactory();
            case MODERN -> new ModernFurnitureFactory();
            default -> throw new RuntimeException("Something went wrong.");
        };

        switch (product) {
            case CHAIR:
                furnitureFactory.makeChair(count);
                break;
            case SOFA:
                furnitureFactory.makeSofa(count);
                break;
            case COFFEE_TABLE:
                furnitureFactory.makeCoffeeTable(count);
                break;
            default:
                throw new RuntimeException("Something went wrong.");

        }
    }
}
