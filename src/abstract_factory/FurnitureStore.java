package abstract_factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.FurnitureFactoryProducer;
import abstract_factory.furniture.*;

public class FurnitureStore {
    static public void main(String[] args) {
        System.out.println("Furniture Store Opened 🎉🎉🎉");
        System.out.println(" ");
        System.out.println("Ordering Modern Furniture");
        System.out.println(" ");
        FurnitureFactory modernFurnitureFactory = FurnitureFactoryProducer.getFurnitureFactory(FurnitureStyle.MODERN);
        Chair modernChair = modernFurnitureFactory.makeChair();
        Sofa modernSofa = modernFurnitureFactory.makeSofa();
        Table modernTable = modernFurnitureFactory.makeTable();
        System.out.println(" ");
        System.out.println("Ordering Victorian Furniture");
        System.out.println(" ");
        FurnitureFactory victorianFactory = FurnitureFactoryProducer.getFurnitureFactory(FurnitureStyle.VICTORIAN);
        Chair victorianChair = victorianFactory.makeChair();
        Sofa victorianSofa = victorianFactory.makeSofa();
        Table victorianTable = victorianFactory.makeTable();
        System.out.println(" ");
        System.out.println("Ordering Art Deco Furniture");
        System.out.println(" ");
        FurnitureFactory artDecoFurnitureFactory = FurnitureFactoryProducer.getFurnitureFactory(FurnitureStyle.ARTDECO);
        Chair artDecoChair = artDecoFurnitureFactory.makeChair();
        Sofa artDecoSofa = artDecoFurnitureFactory.makeSofa();
        Table artDecoTable = artDecoFurnitureFactory.makeTable();
        System.out.println(" ");
        System.out.println("Furniture Store Closed 🎉🎉🎉");
    }
}
