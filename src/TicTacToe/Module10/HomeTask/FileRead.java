package Module10.HomeTask;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    StringBuilder resultSB;
    String result;
    public String ReadFromFile(String inputPathFile) throws IOException {
        FileReader reader = null;
        resultSB = new StringBuilder();
        try {
            reader = new FileReader(inputPathFile);
            int c;
            while ((c = reader.read()) != -1) {
                resultSB.append((char) c);
            }
            result = resultSB.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        return result;
    }
}
