package prototype;

public class Cat implements Animal{
    private String name;
    private String sound = "meow";
    public Cat(){
        System.out.println("Cat class created");
    }
    public Animal makeClone() throws CloneNotSupportedException {
        System.out.println("Cat Clone is being made!");
        return (Cat) super.clone();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHi(){
        System.out.println("Hi from " + name + ". " + sound);
    }

}
