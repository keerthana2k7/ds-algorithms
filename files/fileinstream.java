

import java.io.FileInputStream;

public class fileinstream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("files/data.txt");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}
