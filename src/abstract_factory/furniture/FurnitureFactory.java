package abstract_factory.furniture;

abstract public class FurnitureFactory {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Chair makeChair() {
        System.out.println("Making " + chair.getStyle() + " style chair!");
        return chair;
    }

    public Sofa makeSofa() {
        System.out.println("Making " + sofa.getStyle() + " style sofa!");
        return sofa;
    }

    public Table makeTable() {
        System.out.println("Making " + table.getStyle() + " style table!");
        return table;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
