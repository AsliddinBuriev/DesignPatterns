package abstract_factory.victorian;

import abstract_factory.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    public VictorianCoffeeTable(){
        System.out.println("Victorian Coffee Table Factory has received an order");
    }


    @Override
    public void makeCoffeeTable(int count) {
        String log = "Making " + count + " victorian coffee table" + (count == 1 ? "" : "s");
        System.out.println(log);
    }
}
