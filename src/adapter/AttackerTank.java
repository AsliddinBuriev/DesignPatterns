package adapter;

public class AttackerTank implements Attacker {
    private final String name = "Enemy Tank";
    private String[] listOfWeapons = {"Cannon", "Machine Gun", "Missiles"};
    private String currentWeapon;
    private int healthPoints = 100;

    public AttackerTank() {
        // Initial weapon is Cannon
        currentWeapon = listOfWeapons[0];
    }

    @Override
    public void fireWeapon() {
        int damagePoints;
        switch (currentWeapon) {
            case "Cannon":
                damagePoints = 30;
                break;
            case "Machine Gun":
                damagePoints = 10;
                break;
            case "Missiles":
                damagePoints = 50;
                break;
            default:
                damagePoints = 10;
        }
        System.out.println(name + " fired " + currentWeapon + " and did " + damagePoints + " points of damage.");
    }

    @Override
    public void walkForward() {
        System.out.println(name + " moves forward slowly, crushing anything in its path!");
    }

    @Override
    public void walkBackward() {
        System.out.println(name + " moves backward slowly, repositioning!");
    }

    @Override
    public void changeWeapon() {
        int currentWeaponIndex = 0;
        // Find the current weapon index
        for (int i = 0; i < listOfWeapons.length; i++) {
            if (currentWeapon.equals(listOfWeapons[i])) {
                currentWeaponIndex = i;
                break;
            }
        }
        // Cycle to the next weapon in the array
        currentWeaponIndex = (currentWeaponIndex + 1) % listOfWeapons.length;
        currentWeapon = listOfWeapons[currentWeaponIndex];
        System.out.println(name + " now holding " + currentWeapon);
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints <= 0) {
            System.out.println(name + " has been destroyed!");
        } else {
            System.out.println(name + " has " + healthPoints + " health left.");
        }
    }
}
