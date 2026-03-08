
import java.io.*;
public class fildatabufinstream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(100);
        dos.writeUTF("Hello Java");
        dos.close();
        FileInputStream fis = new FileInputStream("data.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        int num = dis.readInt();
        String msg = dis.readUTF();
        System.out.println(num);
        System.out.println(msg);
        dis.close();
    }
}
