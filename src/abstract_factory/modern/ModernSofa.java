package abstract_factory.modern;

import abstract_factory.Sofa;

public class ModernSofa implements Sofa {

    public ModernSofa() {
        System.out.println("Modern Sofa Factory has received an order.");
    }
    @Override
    public void makeSofa(int count) {
        String log = "Making " + count + " modern sofa" + (count == 1 ? "." : "s.");
        System.out.println(log);
    }
}
