import java.util.ArrayList;

public class Arraylistexample{
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>(); //define ArrayList
        animals.add("dog");   // add    elements
        animals.add("cat");
        System.out.println("First:"+animals.get(0));
        System.out.println("all animals"+animals);
    }
}