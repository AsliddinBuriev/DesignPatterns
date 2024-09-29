package abstract_factory.furniture.victorian;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Table;

class VictorianTable extends Table {
    public VictorianTable() {
        setStyle(FurnitureStyle.VICTORIAN);
    }
}
