package Shopping_Cart;

import java.util.*;

public class Shopping
{
    private Map<Product, Integer> cart = new LinkedHashMap<>();
    private Map<Product, Double> productPrices = new HashMap<>();

    public void addProduct(Product product, int quantity)
    {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void setProductPrice(Product product, double price)
    {
        productPrices.put(product, price);
    }

    public Map<Product, Integer> getCart()
    {
        return new LinkedHashMap<>(cart);
    }

    public Map<Product, Double> getProductPrices()
    {
        return new HashMap<>(productPrices);
    }

    public void displayCart()
    {
        System.out.println("Shopping Cart:");
        cart.forEach((product, quantity) ->
        {
            double price = productPrices.getOrDefault(product, 0.0);
            System.out.println(product + " x " + quantity + " = $" + (price * quantity));
        });
    }

    public void displaySortedByPrice()
    {
        System.out.println("\nItems Sorted by Price:");
        TreeMap<Double, List<Product>> sortedByPrice = new TreeMap<>();
        cart.forEach((product, quantity) ->
        {
            double price = productPrices.getOrDefault(product, 0.0);
            sortedByPrice
                    .computeIfAbsent(price, k -> new ArrayList<>())
                    .add(product);
        });
        sortedByPrice.forEach((price, products) ->
        {
            products.forEach(product ->
            {
                System.out.println(product + " x " + cart.get(product) + " = $" + (price * cart.get(product)));
            });
        });
    }
}
