package abstract_factory.modern;

import abstract_factory.Chair;
import abstract_factory.CoffeeTable;
import abstract_factory.FurnitureFactory;
import abstract_factory.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public void makeChair(int count) {
        Chair chairFactory = new ModernChair();
        chairFactory.makeChair(count);
    }

    @Override
    public void makeSofa(int count) {
        Sofa sofaFactory = new ModernSofa();
        sofaFactory.makeSofa(count);
    }

    @Override
    public void makeCoffeeTable(int count) {
        CoffeeTable coffeeTableFactory = new ModernCoffeeTable();
        coffeeTableFactory.makeCoffeeTable(count);
    }
}
