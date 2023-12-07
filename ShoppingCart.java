// ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addToCart(Product product) {
        products.add(product);
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + " - Price: " + product.getPrice());
        }
    }
}
