
import java.util.HashSet;
import java.util.Iterator;

/**
 * 3.Create a HashSet with at least 10 elements of type String Write program
 * covering all the operations of HashSet
 *
 * @author shruti
 */
public class Collection3 {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements
        h.add("Canada");
        h.add("Japan");
        h.add("Germany");
        h.add("New Zealand");
        h.add("Switzerland");
        h.add("Sweden");
        h.add("Netherlands");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                + h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
