package model;

public class Product {
    private int id;
    private int price;
    private String brand;
    private int stock;
    private ProductType type;

    public Product(int price, String brand, int stock, ProductType type){
        this.price = price;
        this.brand = brand;
        this.stock = stock;
        this.type = type;
    }

    public void setId(int id){
        this.id = id;
    }
}
