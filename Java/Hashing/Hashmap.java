package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    // Store two type of information -> Key and value means pair
    // value may be same but key must be different
    // unordered maps
    public static void main(String[] args) {
        // country(Key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        //get
        System.out.println(map.get("China"));

        //Size
        System.out.println(map.size());


        // Two cases made in map.put() 1.exist data -> update the value 2. doesn't exist
        // data -> new pair is inserted
        map.put("China", 180);
        System.out.println(map);

        // Search or LookUp
        if (map.containsKey("China")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        if (map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // which function came with the key
        System.out.println(map.get("China")); // key exist
        System.out.println(map.get("Indonesia")); // key doesn't exist

        // Iteration
        int arr[] = { 12, 15, 18 };
        // 1st method
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2nd method
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();


        //3rd method
        for( Map.Entry<String , Integer> ele : map.entrySet()){
            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

        //4th method -> for keys
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key) + " ");
        }

        //Delete
        map.remove("China");
        System.out.println(map);
    }
}
