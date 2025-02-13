package Shopping_Cart;

public class Main {
    public static void main(String[] args)
    {
        Shopping shoppingCart = new Shopping();

        Product apple = new Product("Apple", 0.99);
        Product banana = new Product("Banana", 0.59);
        Product cherry = new Product("Cherry", 2.99);

        shoppingCart.setProductPrice(apple, 0.99);
        shoppingCart.setProductPrice(banana, 0.59);
        shoppingCart.setProductPrice(cherry, 2.99);

        shoppingCart.addProduct(apple, 3);
        shoppingCart.addProduct(banana, 5);
        shoppingCart.addProduct(cherry, 2);

        shoppingCart.displayCart();

        shoppingCart.displaySortedByPrice();
    }
}
