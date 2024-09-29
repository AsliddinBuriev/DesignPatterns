package abstract_factory.furniture;

import abstract_factory.FurnitureStyle;

abstract public class Chair {
    private FurnitureStyle style;

    public void setStyle(FurnitureStyle style) {
        this.style = style;
    }

    public String getStyle() {
        return style.toString();
    }
}
