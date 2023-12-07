// ProductRepository.java
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "Product A", 19.99));
        products.add(new Product(2, "Product B", 29.99));
        products.add(new Product(3, "Product C", 39.99));
        // Add more products as needed
    }

    public List<Product> getProducts() {
        return products;
    }
}
