package abstract_factory.furniture.victorian;

import abstract_factory.furniture.*;

public class VictorianFurnitureFactory extends FurnitureFactory {
    public VictorianFurnitureFactory(){
        setChair(new VictorianChair());
        setSofa(new VictorianSofa());
        setTable(new VictorianTable());
    }
}
