package SmartWarehouseManagementSystem;

public abstract class WarehouseItem
{
    private String name;
    private int price;
    private int quantity;
    private ItemType itemType;

    WarehouseItem(String name, int price, int quantity, ItemType itemType)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.itemType = itemType;
    }
    public String getName()
    {
        return this.name;
    }
    public String getItemType()
    {
        return this.itemType.name();
    }
    public int totalprice()
    {
        return (price * quantity);
    }
}
