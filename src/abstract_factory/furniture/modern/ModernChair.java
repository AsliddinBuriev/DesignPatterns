package abstract_factory.furniture.modern;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Chair;

class ModernChair extends Chair {
    public ModernChair(){
        setStyle(FurnitureStyle.MODERN);
    }
}
