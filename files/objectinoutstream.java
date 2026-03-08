
import java.io.*;
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class objectinoutstream {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Keerthana");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
        oos.writeObject(s1);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Student s2 = (Student) ois.readObject();
        ois.close();
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}

