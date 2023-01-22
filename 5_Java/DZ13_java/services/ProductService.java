package services;

import java.util.ArrayList;

import entities.Products.Product;
import repository.ProductRepository;

// TODO нарушение "dependency inversion principle", обращение к репозиторию без интерфейса
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    public void addProduct(Product[] arr) {
        repository.addProduct(arr);
    }

    public ArrayList<Product> getProduct(String typeProduct) {
        return repository.getProduct(typeProduct);
    }
    public Product buyProduct(String productName, int price) {
        return repository.buyProduct(productName, price);
    }

}
