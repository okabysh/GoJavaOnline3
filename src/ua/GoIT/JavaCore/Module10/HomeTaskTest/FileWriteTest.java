package ua.GoIT.JavaCore.Module10.HomeTaskTest;

import ua.GoIT.JavaCore.Module10.HomeTask.FileWrite;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static ua.GoIT.JavaCore.Module10.HomeTask.Constants.FILE_NAME;

public class FileWriteTest {
    Boolean result;
    Boolean expected;

    // test read file from not an existing path
    @Test(timeout = 1000)
    public void testWriteFromFile() throws IOException {
        expected = true;
        result = new FileWrite().writeToFile(FILE_NAME,"Hello World");

        Assert.assertEquals(expected, result);
    }

}
