package SmartWarehouseManagementSystem;

public class Smart_Warehouse_System
{
    public static void main (String args[])
    {
        Furniture table = new Furniture("Table", 1500, 2);
        Furniture bed = new Furniture("Bed", 20000,1);

        Electronic desktop = new Electronic("Dell desktop", 25000, 1);
        Electronic speaker = new Electronic("Boat Speaker", 8000, 2);

        Grocery maggie = new Grocery("Maggie", 100, 2);
        Grocery oil = new Grocery("Fortune oil", 108, 3);

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(table);
        furniture.addItem(bed);
        WarehouseUtitlity.listItems(furniture.getItems());

        Storage<Electronic> electronic = new Storage<>();
        electronic.addItem(desktop);
        electronic.addItem(speaker);
        WarehouseUtitlity.listItems(electronic.getItems());

        Storage<Grocery> grocery = new Storage<>();
        grocery.addItem(maggie);
        grocery.addItem(oil);

        Storage<WarehouseItem> totalStorage = new Storage<>();
        totalStorage.addItem(table);
        totalStorage.addItem(bed);
        totalStorage.addItem(desktop);
        totalStorage.addItem(speaker);
        totalStorage.addItem(maggie);
        totalStorage.addItem(oil);
        WarehouseUtitlity.listItems(totalStorage.getItems());
    }
}
