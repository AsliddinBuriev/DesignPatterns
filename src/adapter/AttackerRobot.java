package adapter;

import java.util.Random;

public class AttackerRobot {
    private final String name = "Enemy Robot";
    private int healthPoints = 120;
    private boolean isAngry = false;

    public AttackerRobot() {
        System.out.println(name + " is activated with " + healthPoints + " health points.");
    }

    public void smashWithHand() {
        System.out.println(name + " smashes with its powerful mechanical hand!");
        if (isAngry) {
            int damage = new Random().nextInt(20) + 10;
            System.out.println(name + " did " + damage + " points of damage with a powerful smash!");
            takeDamage(damage);
        } else {
            int damage = 10;
            System.out.println(name + " did " + damage + " points of damage with a regular smash.");
            takeDamage(damage);
        }
    }

    public void throwFire() {
        System.out.println(name + " throws fire to scorch its enemies!");
        int damage = 15;
        takeDamage(damage);
    }

    public void walk() {
        System.out.println(name + " walks with robotic grace.");
    }

    public void attackWithSuperPower() {
        System.out.println(name + " unleashes its devastating superpower!");
        // Superpower attack could be randomly stronger based on the robot's mood
        int damage = isAngry ? new Random().nextInt(50) + 30 : 25;
        takeDamage(damage);
    }

    public void changeMood() {
        isAngry = !isAngry;
        if (isAngry) {
            System.out.println(name + " is now in an angry state! It will deal more damage!");
        } else {
            System.out.println(name + " has calmed down.");
        }
    }

    public void takeDamage(int damagePoints) {
        healthPoints -= damagePoints;
        if (healthPoints <= 0) {
            System.out.println(name + " has been destroyed!");
        } else {
            System.out.println(name + " has " + healthPoints + " health left.");
        }
    }
}
