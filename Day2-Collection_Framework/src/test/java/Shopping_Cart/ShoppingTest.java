package Shopping_Cart;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingTest
{
    @Test
    public void testAddProduct() {
        Shopping shoppingCart = new Shopping();

        Product apple = new Product("Apple", 0.99);
        Product banana = new Product("Banana", 0.59);

        shoppingCart.addProduct(apple, 3);
        shoppingCart.addProduct(banana, 5);
        shoppingCart.addProduct(apple, 2);

        Map<Product, Integer> expectedCart = new LinkedHashMap<>();
        expectedCart.put(apple, 5);
        expectedCart.put(banana, 5);

        assertEquals(expectedCart, shoppingCart.getCart());
    }
}
