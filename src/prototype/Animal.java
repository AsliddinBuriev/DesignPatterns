package prototype;

public interface Animal extends Cloneable {
    public Animal makeClone() throws CloneNotSupportedException;
}
