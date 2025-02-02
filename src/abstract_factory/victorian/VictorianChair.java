package abstract_factory.victorian;

import abstract_factory.Chair;

public class VictorianChair implements Chair {
    public VictorianChair(){
        System.out.println("Victorian Chair Factory has received an order.");
    }

    @Override
    public void makeChair(int count) {
        String log = "Making " + count + " victorian chair" +
                (count > 1 ? "s." : ".");
        System.out.println(log);
    }
}
