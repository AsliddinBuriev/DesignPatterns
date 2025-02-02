package abstract_factory.classic;

import abstract_factory.CoffeeTable;

public class ClassicCoffeeTable implements CoffeeTable {
    public ClassicCoffeeTable(){
        System.out.println("Classic Coffee Table Factory has received an order");
    }


    @Override
    public void makeCoffeeTable(int count) {
        String log = "Making " + count + " classic coffee table" + (count == 1 ? "" : "s");
        System.out.println(log);
    }
}
