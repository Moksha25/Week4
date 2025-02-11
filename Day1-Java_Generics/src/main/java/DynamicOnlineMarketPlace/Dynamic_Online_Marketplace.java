package DynamicOnlineMarketPlace;

public class Dynamic_Online_Marketplace
{
    public static void main (String args[])
    {
        Product<BookCategory> book = new Product<>("Too Good to be True", 300, new BookCategory());

        Product<ClothingCategory> cloth = new Product<>("Top", 800, new ClothingCategory());

        ProductUtility.displayDetails(book);
        ProductUtility.displayDetails(cloth);
    }
}
