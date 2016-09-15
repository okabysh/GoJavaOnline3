package Module10.LecturePart;

import java.io.File;

public class PathName {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "dir\\somefile.txt";
        File file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());

    }
}
