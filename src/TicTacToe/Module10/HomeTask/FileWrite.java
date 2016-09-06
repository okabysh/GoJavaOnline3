package Module10.HomeTask;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    boolean result;
    public boolean WriteToFile(String inputPathFile, String inputMessage) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(inputPathFile);
            writer.write(inputMessage);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
            writer = null;
            result = false;
        } finally {
            writer.close();
        }
        return result;
    }
}
