package Module_04.HomeWork1Test;

import Module_04.HomeWork1.AreaOfARectangle;
import org.junit.Assert;
import org.junit.Test;

public class AreaOfARectangleTest {

    @Test(timeout = 1000)
    public void testGetArea() throws Exception {
        int sideA = 6;
        int sideB = 7;
        double expectedValue;
        double result;
        int delta = 1;

        result = new AreaOfARectangle(sideA, sideB).getArea();
        expectedValue = sideA * sideB;

        Assert.assertEquals(expectedValue, result, delta);
    }
}
