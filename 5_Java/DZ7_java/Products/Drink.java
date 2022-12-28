package Products;

public class Drink {

    protected String name;
    protected Integer volume;
    protected Integer price;

    public Drink(String name, Integer volume, Integer price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    // public Integer getVolume() {
    //     return volume;
    // }

    // public Integer getPrice() {
    //     return price;
    // }

    @Override
    public String toString() {
        return "Напиток "+ getName() +
        " volume = " + volume+
        " price = " + price;
    }
}
