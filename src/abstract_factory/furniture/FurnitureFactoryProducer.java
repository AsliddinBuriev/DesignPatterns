package abstract_factory.furniture;

import abstract_factory.FurnitureStyle;
import abstract_factory.furniture.art_deco.ArtDecoFurnitureFactory;
import abstract_factory.furniture.modern.ModernFurnitureFactory;
import abstract_factory.furniture.victorian.VictorianFurnitureFactory;

public class FurnitureFactoryProducer {
    static public FurnitureFactory getFurnitureFactory(FurnitureStyle furnitureStyle) {
        return switch (furnitureStyle) {
            case MODERN -> new ModernFurnitureFactory();
            case VICTORIAN -> new VictorianFurnitureFactory();
            case ARTDECO -> new ArtDecoFurnitureFactory();
            default -> throw new IllegalArgumentException("Unknown furniture style: " + furnitureStyle);
        };
    }
}
