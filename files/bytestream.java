
import java.io.*;
public class bytestream{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt");
        fos.write(65); 
        fos.close();
        System.out.println("Data written to file");
    }
}
