package abstract_factory.furniture.art_deco;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Sofa;

class ArtDecoSofa extends Sofa {
    public ArtDecoSofa() {
        setStyle(FurnitureStyle.ARTDECO);
    }
}
