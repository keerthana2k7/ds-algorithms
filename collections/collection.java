import java.util.*;
public class collection{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\n");

        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");   
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("\n");

        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Keerthana");
        students.put(102, "Arun");
        students.put(103, "Divya");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("\n");   
    }
}


