import Machines.VendingMachine;
import Products.ColdDrink;
import Products.Drink;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(111);
        vendingMachine.makeDrink("чай", 250, 50, 60);
        Drink drink = vendingMachine.getDrink();
        printDrink(drink);
        
        vendingMachine.makeDrink("вода", 300, 100);
        Drink voda = vendingMachine.getDrink();
        printDrink(voda);

    }

    public static void printDrink(Drink drink){
        System.out.println(drink);
    }

}