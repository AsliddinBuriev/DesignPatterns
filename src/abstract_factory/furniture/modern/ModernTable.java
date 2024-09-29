package abstract_factory.furniture.modern;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Table;

class ModernTable extends Table {
    public ModernTable() {
        setStyle(FurnitureStyle.MODERN);
    }
}
