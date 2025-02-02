package abstract_factory.modern;

import abstract_factory.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    public ModernCoffeeTable(){
        System.out.println("Modern Coffee Table Factory has received an order");
    }


    @Override
    public void makeCoffeeTable(int count) {
        String log = "Making " + count + " modern coffee table" + (count == 1 ? "" : "s");
        System.out.println(log);
    }
}
