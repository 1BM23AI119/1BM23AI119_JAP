import java.util.ArrayList;

class Pharmacy {
    public final int id;
    public final String name;
    public int quantity;
    public double price;

    public Pharmacy(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class PharmacyManagementSystem {
    private ArrayList<Pharmacy> inventory = new ArrayList<>();

    // Add new item to inventory
    public void addItem(Pharmacy item) {
        inventory.add(item);
    }

    // Update existing item in inventory
    public void updateItem(int id, int quantity, double price) {
        for (Pharmacy item : inventory) {
            if (item.id == id) {
                item.quantity = quantity;
                item.price = price;
                break;
            }
        }
    }

    // Remove item from inventory
    public void removeItem(int id) {
        inventory.removeIf(item -> item.id == id);
    }

    // Display list of all items
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Pharmacy item : inventory) {
            System.out.println(item.id + " | " + item.name + " | Quantity: "
                    + item.quantity + " | Price: " + item.price);
        }
    }

    // Search for item by ID
    public Pharmacy searchItemByID(int id) {
        for (Pharmacy item : inventory) {
            if (item.id == id) {
                return item;
            }
        }
        return null; // Item not found
    }
}
