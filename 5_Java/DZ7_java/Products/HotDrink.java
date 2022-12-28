package Products;
public class HotDrink extends Drink {
    
    private Integer temperatura;

    public HotDrink(String name, Integer volume, Integer price, Integer temperatura){
        super(name, volume, price);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() +" temperatura = " + temperatura;
    }
}
