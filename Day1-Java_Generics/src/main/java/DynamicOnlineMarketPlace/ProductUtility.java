package DynamicOnlineMarketPlace;

public class ProductUtility
{
    public static <T extends Product<?>> void displayDetails(T product)
    {
        System.out.println("Name : " + product.getName());
        System.out.println("Price : " + product.getPrice());
        System.out.println("Category : " + product.getCategory());
    }

    public static <T extends Product<?>> void applyDiscount(T product, double persentage)
    {
        product.applyDiscount(persentage);
    }
}
