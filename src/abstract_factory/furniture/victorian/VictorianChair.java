package abstract_factory.furniture.victorian;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Chair;

class VictorianChair extends Chair {
    public VictorianChair() {
        setStyle(FurnitureStyle.VICTORIAN);
    }
}
