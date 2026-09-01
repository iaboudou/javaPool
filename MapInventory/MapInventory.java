import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        return (inventory.containsKey(productId)) ? inventory.get(productId) : -1;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {

        List res = new java.util.ArrayList<>();

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == price ) {
                res.add(entry.getKey());
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Map<String, Integer> inventory = new java.util.HashMap<>();
        inventory.put("P001", 100);
        inventory.put("P002", 50);
        inventory.put("P003", 75);
        inventory.put("P004", 50);
        inventory.put("P005", 75);

        System.out.println(MapInventory.getProductPrice(inventory, "P002")); // Output: 50
        System.out.println(MapInventory.getProductPrice(inventory, "P004")); // Output: 50
        System.out.println(MapInventory.getProductPrice(inventory, "P006")); // Output: -1

        List<String> productsWithPrice50 = MapInventory.getProductIdsByPrice(inventory, 50);
        System.out.println(productsWithPrice50); // Output: [P002, P004]

        List<String> productsWithPrice75 = MapInventory.getProductIdsByPrice(inventory, 75);
        System.out.println(productsWithPrice75); // Output: [P003, P005]

        List<String> productsWithPrice80 = MapInventory.getProductIdsByPrice(inventory, 80);
        System.out.println(productsWithPrice80); // Output: []
    }
}