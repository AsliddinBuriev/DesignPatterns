package abstract_factory.furniture.modern;

import abstract_factory.furniture.*;

public class ModernFurnitureFactory extends FurnitureFactory {
    public ModernFurnitureFactory(){
        setChair(new ModernChair());
        setSofa(new ModernSofa());
        setTable(new ModernTable());
    }
}
