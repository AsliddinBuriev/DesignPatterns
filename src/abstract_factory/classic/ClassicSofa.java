package abstract_factory.classic;

import abstract_factory.Sofa;

public class ClassicSofa implements Sofa {
    public ClassicSofa() {
        System.out.println("Classic Sofa Factory has received an order.");
    }
    @Override
    public void makeSofa(int count) {
        String log = "Making " + count + " classic sofa" + (count == 1 ? "." : "s.");
        System.out.println(log);
    }
}
