import controller.ProductController;
import repository.IProductRepository;
import repository.ProductInMemoryRepository;
import view.ProductView;

public class Main {

    public static void main(String[] args) {
        IProductRepository repository= new ProductInMemoryRepository();
        ProductController productController= new ProductController(repository);

        ProductView productView = new ProductView(productController);
        productView.start();
    }

}

