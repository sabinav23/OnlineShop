package view;

import controller.ProductController;
import model.Product;
import model.ProductType;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private ProductController productController;
    private Scanner inputScanner;

    public ProductView(ProductController productController){
        this.productController = productController;
        this.inputScanner = new Scanner(System.in);
    }

    private void showMenu(){
        System.out.println("1.Show products");
        System.out.println("2.Add product");
    }

    public void start(){
        this.showMenu();
        int option = this.inputScanner.nextInt();

        switch(option){
            case 1:
                this.showProducts();
                break;
            case 2:
                this.addProduct();
                break;
        }
    }

    private void showProducts(){
        this.printProducts();
        this.backOption();
    }

    private void printProducts(){
        List<Product> products = this.productController.getProducts();
        for(int i = 0; i < products.size(); i++){
            System.out.println(i + 1 + " . " + products.get(i));
        }
    }

    private void addProduct() {
        System.out.println("Please enter product price");
        this.inputScanner.nextLine();
        int price = this.inputScanner.nextInt();
        System.out.println("Please enter product brand");
        this.inputScanner.nextLine();
        String brand = this.inputScanner.nextLine();
        System.out.println("Please enter product stock");
        this.inputScanner.nextLine();
        int stock = this.inputScanner.nextInt();
        this.productController.addProduct(price, brand, stock, ProductType.TV);
    }

    private void backOption(){
        System.out.println("1. Go back!");
        int option = this.inputScanner.nextInt();

        if(option == 1){
            this.start();
        }
    }
}
