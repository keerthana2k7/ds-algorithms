import java.util.*;
public class iterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            String fruit = itr.next();
            System.out.println(fruit);
        }
    }
}
