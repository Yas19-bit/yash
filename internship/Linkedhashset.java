import java.util.LinkedHashSet;
public class LinkedHashset{
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements in a specific order
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Mango");
        set.add("Pineapple");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet (Ordered): " + set);
    }
}
