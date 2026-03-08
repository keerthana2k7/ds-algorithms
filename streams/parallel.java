package streams;
import java.util.*;

public class parallel {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.parallelStream()
            .forEach(System.out::println);
    }
}
