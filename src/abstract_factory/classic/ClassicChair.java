package abstract_factory.classic;

import abstract_factory.Chair;

public class ClassicChair implements Chair {
    public ClassicChair(){
        System.out.println("Classic Chair Factory has received an order.");
    }

    @Override
    public void makeChair(int count) {
        String log = "Making " + count + " classic chair" +
                (count > 1 ? "s." : ".");
        System.out.println(log);
    }
}
