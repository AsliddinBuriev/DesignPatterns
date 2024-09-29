package abstract_factory.furniture.modern;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Sofa;

class ModernSofa extends Sofa {
    public ModernSofa() {
        setStyle(FurnitureStyle.MODERN);
    }
}
