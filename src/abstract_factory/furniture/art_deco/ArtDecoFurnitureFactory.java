package abstract_factory.furniture.art_deco;

import abstract_factory.furniture.*;

public class ArtDecoFurnitureFactory extends FurnitureFactory {
    public ArtDecoFurnitureFactory() {
        setChair(new ArtDecoChair());
        setSofa(new ArtDecoSofa());
        setTable(new ArtDecoTable());
    }
}
