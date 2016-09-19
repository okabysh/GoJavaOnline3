package ua.GoIT.JavaCore.Module10.HomeTaskTest;

import ua.GoIT.JavaCore.Module10.HomeTask.FileRead;
import org.junit.Test;

import java.io.IOException;

public class FileReadTest {
    String result;

    // test read file from not an existing path
    @Test(expected = NullPointerException.class)
    public void testReadFromFileWithException() throws IOException {
        new FileRead().readFromFile("NotExistingPath");
    }

}
