package adapter;

public interface Attacker {
    public void fireWeapon();
    public void walkForward();
    public void walkBackward();
    public void changeWeapon();
    public void takeDamage(int damage);
}
