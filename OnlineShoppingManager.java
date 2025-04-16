import java.util.Vector;


public class OnlineShoppingManager {
    private Vector<Product>inventory;

    public OnlineShoppingManager() {
        inventory = new Vector<>();
    }

    public void addProduct(String name,double price, String category){
        Product product = new Product(name,price,category);
        inventory.add(product);
    }
    public void removeProduct(String name){
        for(int i=0;i<inventory.size();i++){
            if (inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayProducts(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty");
        }else{
            System.out.println("Inventory");
            for (int i = 0; i < inventory.size(); i++) {
                Product product = inventory.get(i);
                System.out.println(product);
            }
        }

    }


    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        manager.addProduct("Laptop", 999.99, "Electronics");
        manager.addProduct("Phone", 699.99, "Electronics");
        manager.addProduct("Shirt", 19.99, "Clothing");

        manager.displayProducts();

        manager.removeProduct("Phone");
        manager.displayProducts();
    }
}