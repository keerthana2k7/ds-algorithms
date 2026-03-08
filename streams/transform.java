package streams;
import java.util.*;

public class transform {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream()
            .map(n -> n * n)
            .forEach(System.out::println);
    }
}
