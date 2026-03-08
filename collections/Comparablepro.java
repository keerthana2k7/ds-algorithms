import java.util.*;
class Student implements Comparable<Student> {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class Comparablepro{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Keerthana"));
        list.add(new Student(1, "Arun"));
        list.add(new Student(2, "Divya"));
        Collections.sort(list); 
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
