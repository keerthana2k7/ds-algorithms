package streams;
import java.util.*;
import java.util.stream.*;

public class convert_sl {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> even =
            list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);
    }
}
