package ua.GoIT.JavaCore.Module10.LecturePart;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException{
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("Hello.txt");
            writer = new FileWriter("outCharacter.txt");

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            writer.append("pre last line\n");
            writer.append("last line\n");
        }   finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

    }
}
