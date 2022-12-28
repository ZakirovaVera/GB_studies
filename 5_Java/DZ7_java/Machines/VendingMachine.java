package Machines;
import Products.ColdDrink;
import Products.Drink;
import Products.HotDrink;


public class VendingMachine {
    
    private Integer id;
    private Drink readyDrink;

    public VendingMachine(Integer id){
        this.id = id;
    }

    public void makeDrink(String name, Integer volume, Integer price, Integer temperatura){
        HotDrink drink = new HotDrink(name, volume, price, temperatura);
        readyDrink = drink;
    }
    public void makeDrink(String name, Integer volume, Integer price){
        ColdDrink drink = new ColdDrink(name, volume, price);
        readyDrink = drink;
    }

    public Drink getDrink(){
        return readyDrink;
    }
}
