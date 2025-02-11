package SmartWarehouseManagementSystem;

public class Electronic extends WarehouseItem
{
    public Electronic(String name, int price, int quantity)
    {
        super(name, price, quantity, ItemType.ELECTRONIC);
    }
}
