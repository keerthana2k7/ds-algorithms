
import java.io.ByteArrayInputStream;
public class bytearrayinstream {
    public static void main(String[] args) {
        byte[] data = "Hello Java".getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int ch;
        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
