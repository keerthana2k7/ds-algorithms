import java.util.*;
public class iteratorremove{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num == 15) {
                itr.remove();  
            }
        }
        System.out.println(numbers);
    }
}
