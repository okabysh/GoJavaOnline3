package Module_04.HomeWork1Test;

import Module_04.HomeWork1.AreaOfATriangle;
import org.junit.Assert;
import org.junit.Test;

public class AreaOfATriangleTest {

    @Test(timeout = 1000)
    public void testGetArea() throws Exception {
        int sideA = 6;
        int height = 7;
        float expectedValue;
        float result;
        int delta = 1;

        result = new AreaOfATriangle(sideA, height).getArea();
        expectedValue = 0.5f * sideA * height;

        Assert.assertEquals(expectedValue, result, delta);
    }
}
