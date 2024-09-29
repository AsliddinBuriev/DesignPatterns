package abstract_factory.furniture.art_deco;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Chair;

class ArtDecoChair extends Chair {
   public ArtDecoChair() {
       setStyle(FurnitureStyle.ARTDECO);
    }
}
