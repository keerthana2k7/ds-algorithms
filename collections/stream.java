import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class stream{
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
            new Employee(1, "A", 40000),
            new Employee(2, "B", 60000),
            new Employee(3, "C", 70000)
        );
        empList.stream()
               .filter(e -> e.salary > 50000)
               .map(e -> e.name)
               .forEach(System.out::println);
    }
}
