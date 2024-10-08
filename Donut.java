

public class Donut extends MenuItem {
    

    private DonutFlavors flavor;
    private DonutTypes type;

    public Donut(){
        super();
        this.flavor = DonutFlavors.NOT_FOUND;
        this.type = DonutTypes.NOT_FOUND;
    }
    public Donut(DonutFlavors flavor, DonutTypes type){
        super();
        this.flavor = flavor;
        this.type = type;
    }
    public Donut(double price, DonutFlavors flavor, DonutTypes type){
        super(price);
        this.flavor = flavor;
        this.type = type;
    }
    public Donut copy(){
        return new Donut(this.getPriceState(), this.flavor, this.type);
    }
}
