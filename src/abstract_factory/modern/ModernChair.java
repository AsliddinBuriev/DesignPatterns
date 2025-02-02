package abstract_factory.modern;

import abstract_factory.Chair;

public class ModernChair implements Chair {
    public ModernChair(){
        System.out.println("Modern Chair Factory has received an order.");
    }

    @Override
    public void makeChair(int count) {
        String log = "Making " + count + " modern chair" +
                (count > 1 ? "s." : ".");
        System.out.println(log);
    }
}

