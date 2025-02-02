package abstract_factory.victorian;

import abstract_factory.Chair;
import abstract_factory.CoffeeTable;
import abstract_factory.FurnitureFactory;
import abstract_factory.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public void makeChair(int count) {
        Chair chairFactory = new VictorianChair();
        chairFactory.makeChair(count);
    }

    @Override
    public void makeSofa(int count) {
        Sofa sofaFactory = new VictorianSofa();
        sofaFactory.makeSofa(count);
    }

    @Override
    public void makeCoffeeTable(int count) {
        CoffeeTable coffeTableFactory = new VictorianCoffeeTable();
        coffeTableFactory.makeCoffeeTable(count);
    }
}
