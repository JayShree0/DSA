package hashMaps;

import java.util.HashMap;

public class basicMap {
    public static void main(String[] args) {
        // Note : In a Hashmap their 2 or more key with same value, but key are unique.
        // unique key and same values..

        //--------------- HashMap Time Complexity (Average Case) --------------
        // put(key, value)        -> O(1)
        // get(key)               -> O(1)
        // size()                 -> O(1)
        // find()                 -> NOT a HashMap method
        // remove(key)            -> O(1)
        // containsKey(key)       -> O(1)
        // containsValue(value)   -> O(n)
        // entrySet()             -> O(1)

        // ---------------- Create HashMap ----------------
        HashMap<String, Integer> map = new HashMap<>();

        // ---------------- Put (Insert / Update) ----------------
        map.put("Jay", 1);
        map.put("Shruti", 2);
        map.put("Muskan", 3);
        map.put("Prem", 4);
        map.put("Suman", 6);
        map.put("Suman", 5);      // override existing value
        map.put("khayati", 4);    // duplicate value allowed

        // ---------------- Print Map ----------------
        System.out.println(map);

        // ---------------- get(key) ----------------
        System.out.println(map.get("khayati"));     // 4

        // ---------------- containsKey(key) ----------------
        System.out.println(map.containsKey("Prem"));  // true
        System.out.println(map.containsKey("shuu"));  // false

        // ---------------- containsValue(value) ----------------
        System.out.println(map.containsValue(4));   // true

        // ---------------- remove(key) ----------------
        System.out.println(map.remove("Prem"));     // 4 (removed value)
        System.out.println(map);

        // ---------------- size() & isEmpty() ----------------
        System.out.println(map.size());     // 5
        System.out.println(map.isEmpty());  // false

        System.out.println("---------------------------");

        // ---------------- Iterate using keySet() ----------------
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("---------------------------");

        // ---------------- Iterate using values() ----------------
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }

}

