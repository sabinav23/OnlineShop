package model;

import java.util.List;

public class Order {
    private List<Product> products;
    private String address;

    public Order(String address,List<Product> products){
        this.address = address;
        this.products = products;
    }

}
