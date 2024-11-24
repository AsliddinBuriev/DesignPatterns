package adapter;

public class AttackerRobotAdapter implements Attacker {
    private final AttackerRobot enemyRobot;

    public AttackerRobotAdapter() {
        this.enemyRobot = new AttackerRobot();
    }

    @Override
    public void fireWeapon() {
        System.out.println("Enemy Robot does not fire weapons, but it attacks with superpower!");
        enemyRobot.attackWithSuperPower();
    }

    @Override
    public void walkForward() {
        enemyRobot.walk();
    }

    @Override
    public void walkBackward() {
        System.out.println("Enemy Robot walks backward with robotic grace.");
    }

    @Override
    public void changeWeapon() {
        System.out.println("Enemy Robot cannot change weapons, but it can change its mood.");
        enemyRobot.changeMood();
    }

    @Override
    public void takeDamage(int damage) {
        enemyRobot.takeDamage(damage);
    }
}
