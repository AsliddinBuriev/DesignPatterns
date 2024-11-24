package adapter;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Attacking Game Started!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are three characters Tank, Solder");
        while (true){
            System.out.print(" Robot: Please choose one > ");
            String input = scanner.nextLine();
            if (input.equals("T")) {
                playGame(new AttackerTank());
            }else if(input.equals("R")) {
                playGame(new AttackerRobotAdapter());
            }else if(input.equals("S")) {
                playGame(new AttackerSolder());
            }else if(input.equals("exit")) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
    public static void playGame(Attacker attacker){
        System.out.println("The following are the command:");
        System.out.println("wf - walk forward");
        System.out.println("wb - walk backward");
        System.out.println("ch - change weapon");
        System.out.println("f - fire weapon");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter Command > ");
            String input = scanner.nextLine();
            if (input.equals("wf")) {
                attacker.walkForward();
            }else if(input.equals("wb")) {
                attacker.walkBackward();
            }else if(input.equals("ch")) {
                attacker.changeWeapon();
            }else if (input.equals("f")) {
                attacker.fireWeapon();
            }else {
                System.out.println("Invalid Command!");
                System.out.print("Enter Command > ");
            }
        }
    }

}
