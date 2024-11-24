package prototype;

public class Dog implements Animal{
    private String name;
    private String sound = "woof";
    public Dog() {
        System.out.println("Dog class created");
    }
    public Animal makeClone()  {
        System.out.println("Dog clone is being made!");
        try {
            return (Dog)  super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
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
