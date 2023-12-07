// Main.java
public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        List<Product> products = productRepository.getProducts();

        ShoppingCart shoppingCart = new ShoppingCart();
        for (Product product : products) {
            shoppingCart.addToCart(product);
        }

        shoppingCart.displayCart();

        Checkout checkout = new Checkout();
        checkout.processCheckout(shoppingCart);
    }
}
