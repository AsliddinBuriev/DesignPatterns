package abstract_factory.furniture.art_deco;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.Table;

class ArtDecoTable extends Table {
    public ArtDecoTable() {
        setStyle(FurnitureStyle.ARTDECO);
    }
}
