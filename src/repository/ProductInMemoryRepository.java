package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductInMemoryRepository implements IProductRepository {

    private List<Product> products;
    private int nextId;

    public ProductInMemoryRepository(){
        this.products = new ArrayList<>();
        this.nextId = 0;
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public void addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
    }


}
