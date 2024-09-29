package abstract_factory.furniture.victorian;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Sofa;

class VictorianSofa extends Sofa {
    public VictorianSofa(){
        setStyle(FurnitureStyle.VICTORIAN);
    }
}
