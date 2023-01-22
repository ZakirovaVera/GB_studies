package entities.Products;

public abstract class Product {

    Integer price;

    public Product(Integer price){
        this.price = price;
    }

    public abstract String getName();

    public abstract String getTypeProduct();
    // получить цену
    public Integer getPrice(){
        return price;
    }
    
}