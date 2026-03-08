package streams;
import java.util.*;

public class creation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        list.stream().forEach(System.out::println);
    }
}

