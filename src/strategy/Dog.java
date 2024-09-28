package strategy;

public class Dog extends Animal {
    public Dog() {
        super();
        setSound("Bark");
        setAbilityToFly(new ItCantFly());
    }
}
