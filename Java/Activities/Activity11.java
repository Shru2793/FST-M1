package activities;
import java.util.HashMap;
public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(1, "Black");
        hash_map.put(2, "White");
        hash_map.put(3, "Red");
        hash_map.put(4, "Orange");
        hash_map.put(5, "Green");

        System.out.println("Original HasMap: " + hash_map);

        hash_map.remove(3);
        System.out.println("Hash Map After removing Red: " + hash_map);

        if (hash_map.containsValue("Blue")) {
            System.out.println("Blue is present in the Map");
        } else {
            System.out.println("Blue is not present in the Map");
        }

        System.out.println("Number of pairs in the Map: " + hash_map.size());
    }
}