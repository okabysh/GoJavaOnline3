package Module10.LecturePart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException{
        try (final FileInputStream in = new FileInputStream("Hello.txt");
        FileOutputStream out = new FileOutputStream("out.txt");) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c);
                out.write(c);
            }
        }
    }
}
