package strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("koo koo");
        setAbilityToFly(new ItFlies());
    }
}
