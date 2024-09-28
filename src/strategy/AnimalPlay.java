package strategy;

public class AnimalPlay {
    public static void main(String[] args) {
        Dog sparky = new Dog();
        Bird tweety = new Bird();
        System.out.println("Dog:" + sparky.getAbilityToFly());
        System.out.println("Bird:" + tweety.getAbilityToFly());
        sparky.setAbilityToFly(new ItFlies());
    }
}
