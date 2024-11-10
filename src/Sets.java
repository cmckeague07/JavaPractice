import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String []args){
        /**
         *Key Characteristics of Sets
         * No Duplicate Elements: Sets automatically handle duplicates, meaning if you try to add an element that already exists, it won’t be added again.
         * Unordered Collection (in most implementations): The order in which elements are stored may not be the order in which they were added (with the exception of LinkedHashSet).
         * Efficient Containment Checks: Sets provide efficient methods for checking if a particular element is present in the collection.
         *
         */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("apple"); // Duplicate, won't be added

        System.out.println(hashSet); // Output might be [banana, apple], order is not guaranteed

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("cherry");

        System.out.println(treeSet); // Output: [apple, banana, cherry], sorted order



    }

}
