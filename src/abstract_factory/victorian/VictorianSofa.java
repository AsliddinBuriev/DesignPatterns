package abstract_factory.victorian;

import abstract_factory.Sofa;

public class VictorianSofa implements Sofa {
    public VictorianSofa() {
        System.out.println("Victorian Sofa Factory has received an order.");
    }
    @Override
    public void makeSofa(int count) {
        String log = "Making " + count + " victorian sofa" + (count == 1 ? "." : "s.");
        System.out.println(log);
    }
}
