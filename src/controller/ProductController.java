package controller;

import model.ProductType;
import repository.IProductRepository;
import model.Product;

import java.util.List;

public class ProductController {

    private IProductRepository productRepository;

    public ProductController(IProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return this.productRepository.getProducts();
    }

    public void addProduct(int price, String brand, int stock, ProductType type){
        Product product = new Product(price, brand, stock, type);
        this.productRepository.addProduct(product);
    }

}
