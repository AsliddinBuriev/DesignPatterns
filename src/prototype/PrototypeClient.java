package prototype;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Prototype Client");

        Dog andy = new Dog();
        andy.setName("Andy");
        andy.sayHi();

        Dog andyClone = (Dog) andy.makeClone();
        andyClone.setName("Buddy");
        andyClone.sayHi();

        System.out.println("Are original and clone the same object? " + (andy == andyClone));

        Cat whiskers = new Cat();
        whiskers.setName("Whiskers");
        whiskers.sayHi();

        Cat whiskersClone = (Cat) whiskers.makeClone();
        whiskersClone.setName("Shadow");
        whiskersClone.sayHi();

        System.out.println("Are original and clone the same object? " + (whiskers == whiskersClone));
    }
}

