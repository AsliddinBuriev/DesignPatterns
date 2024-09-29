package factory_method;

public abstract  class Enemy {
    private String name;
    private double amountOfDamage;
    private double health = 100.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountOfDamage() {
        return amountOfDamage;
    }

    public void setAmountOfDamage(double amountOfDamage) {
        this.amountOfDamage = amountOfDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Enemy displayEnemyShip() {
        System.out.println("Caution! " + name + " is out now!");
        return this;
    }

    public Enemy startShooting(){
        System.out.println("Caution! " + name + " has started shooting!");
        return this;
    }
}
