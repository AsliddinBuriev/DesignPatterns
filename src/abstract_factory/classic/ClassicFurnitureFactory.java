package abstract_factory.classic;

import abstract_factory.Chair;
import abstract_factory.CoffeeTable;
import abstract_factory.FurnitureFactory;
import abstract_factory.Sofa;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public void makeChair(int count) {
        Chair chairFactory = new ClassicChair();
        chairFactory.makeChair(count);
    }

    @Override
    public void makeSofa(int count) {
        Sofa sofaFactory = new ClassicSofa();
        sofaFactory.makeSofa(count);
    }

    @Override
    public void makeCoffeeTable(int count) {
        CoffeeTable coffeeTableFactory = new ClassicCoffeeTable();
        coffeeTableFactory.makeCoffeeTable(count);
    }
}
