
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 2.Create a HashMap with at least 10 key value pairs of the Student ID and
 * Name Insert a Key value mapping into the map Fetch the value of a Key Create
 * a clone/copy of HashMap Check if the given Key is in the Map Check if the
 * value is in the Map Check if the map is empty Print the size of the Map to
 * the console Print all the Keys of the map to the console Print all the Keys
 * of the map to the console Remove a specific Key-value pair Copy all the
 * elements of the Map to another Map
 *
 * @author shruti
 */
public class Collection2 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//creating hashmap
        map.put(1, "Aastha");
        map.put(2, "Aditi");
        map.put(3, "Diya");
        map.put(4, "Riya");
        map.put(5, "Aena");
        map.put(6, "Savi");
        map.put(7, "Bhavna");
        map.put(8, "Shruti");
        map.put(9, "Shreya");
        map.put(10, "Lavina");
//        Fetch the value of a Key
        System.out.println("The value of key 5 : " + map.get(5));
        System.out.println("Initial Mapping are : " + map);

//clone/copy of hashmap
        System.out.println("The Cloned Map : " + map.clone());
//key is present or not
        System.out.println("Is the key '20' present? " + map.containsKey(20));
        System.out.println("Is the key '10' present? " + map.containsKey(10));
//value is present or not
        System.out.println("Is the value 'Shruti' present? " + map.containsValue("Shruti"));
//map is empty or not
        System.out.println("Is the Map Empty? " + map.isEmpty());
//size of map
        System.out.println("The Size of a map is " + map.size());
//Print all the Keys of the map to the console
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.println("Key : " + k);
        }
//Print all the Values of the map to the console
        Collection<String> values = map.values();
        for (String v : values) {
            System.out.println("Value : " + v);
        }
//remove specific key value pair
        System.out.println("Initial Mapping : " + map);
        map.remove(10);
        System.out.println("Key value 10 is removed..");
        System.out.println("New Map is : " + map);
//        Copy all the elements of the Map to another Map
        HashMap<Integer, String> second_map = new HashMap<Integer, String>();
        second_map.putAll(map);
        System.out.println("Second Map " + second_map);

    }
}
