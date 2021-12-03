
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.Create an ArrayList of type String with 10 string elements Add 10 string
 * elements to ArrayList and perform the below operations Add an element to the
 * ArrayList Iterate through the ArrayList by using Iterator object Add an
 * element at a specific index Remove an element from the ArrayList, Remove at
 * an index Update the element at a specific index Check the element is present
 * at a particular index Get an element at a particular index Find out the size
 * of the ArrayList Check the given element is present in the ArrayList Remove
 * all elements of the ArrayList
 *
 * @author shruti
 */
public class Collection1 {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Aastha");
        alist.add("Aditi");
        alist.add("Anshika");
        alist.add("Bhavna");
        alist.add("Diya");
        alist.add("Farheen");
        alist.add("Neha");
        alist.add("Palak");
        alist.add("Nikhat");
        alist.add("Shruti");
        System.out.println("-----------Iterator Start-----------");
        Iterator i = alist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("-----------Iterator End-----------");
        System.out.println(alist);
        //adding element at index 3    
        alist.add(3, "Iram");
        System.out.println("Array list after adding element at index 3 : " + alist);
        //remove element Aastha
        alist.remove("Aastha");
        System.out.println("Aastha Removed : " + alist);
        //remove element from index 5(i.e 6th element)
        alist.remove(5);
        System.out.println("6th element removed : " + alist);
        //updating element at index 7
        alist.set(7, "Harshit");
        System.out.println("After updating 8th element : " + alist);
        //Check the element is present at a  index 1
        int ix = 1;
        try {

            String chk = alist.get(ix);
            if (chk != null) {
                System.out.println("Element present at index " + ix);
            }

        } catch (Exception e) {
            System.out.println("Element NOT present at index " + ix);

        }

        //Get an element at a particular index
        String str = alist.get(2);//Function get would return the string stored at 3rd position (index 2) 
        System.out.println("String at index 2 : " + str);
        //size of arraylist
        int numberofitems = alist.size();
        System.out.println("Size of Arraylist : " + numberofitems);
        //given element is present in the ArrayList
        System.out.println("Contains Shruti ? : " + alist.contains("Shruti"));
        System.out.println("Contains Zehra ? : " + alist.contains("Zehra"));
        //remove all the elements of Arraylist
        System.out.println("-----------Removing all the elements--------");
        alist.clear();
        System.out.println("Size of Arraylist : " + alist.size());
    }
}
