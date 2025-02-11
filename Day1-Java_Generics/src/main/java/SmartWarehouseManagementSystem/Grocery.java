package SmartWarehouseManagementSystem;

public class Grocery extends WarehouseItem
{
    public Grocery(String name, int price, int quantity)
    {
        super(name, price, quantity, ItemType.GROCERY);
    }
}
