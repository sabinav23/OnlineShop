package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProducts();
    void addProduct(Product product);

}
