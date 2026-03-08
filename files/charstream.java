
import java.io.*;
public class charstream {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("text.txt");
        fw.write("Hello Java");
        fw.close();
        System.out.println("Text written to file");
    }
}
