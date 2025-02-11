package SmartWarehouseManagementSystem;
import java.util.List;
public class WarehouseUtitlity {
    public static void listItems(List<? extends WarehouseItem> warehouseItems)
    {
        for (WarehouseItem item : warehouseItems)
        {
            System.out.println("Item type: " + item.getItemType());
            System.out.println("Name: " + item.getName());
            System.out.println("Its total price: " + item.totalprice());
        }
    }
}
