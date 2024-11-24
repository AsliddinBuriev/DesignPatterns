package adapter;

public class AttackerSolder implements Attacker {
    private final String name = "Enemy Soldier";
    private String[] listOfWeapons = {"Pistol", "Rifle", "Grenade"};
    private String currentWeapon;
    private int healthPoints = 50; // Soldier has less health than the tank

    public AttackerSolder() {
        currentWeapon = listOfWeapons[0]; // Start with Pistol
    }

    @Override
    public void fireWeapon() {
        int damagePoints;
        switch (currentWeapon) {
            case "Pistol":
                damagePoints = 5;
                break;
            case "Rifle":
                damagePoints = 15;
                break;
            case "Grenade":
                damagePoints = 25;
                break;
            default:
                damagePoints = 5;
        }
        System.out.println(name + " fired " + currentWeapon + " and did " + damagePoints + " points of damage.");
    }

    @Override
    public void walkForward() {
        System.out.println(name + " moves forward cautiously, aiming for the target!");
    }

    @Override
    public void walkBackward() {
        System.out.println(name + " retreats, keeping an eye on the enemy!");
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
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " has " + healthPoints + " health left.");
        }
    }
}
