package streams;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(40, 10, 30, 20);
        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}
