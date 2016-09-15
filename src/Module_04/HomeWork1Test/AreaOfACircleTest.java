package Module_04.HomeWork1Test;

import Module_04.HomeWork1.AreaOfACircle;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class AreaOfACircleTest {

    @Test(timeout = 1000)
    public void testGetArea() throws Exception {
        int radius = 5;
        double expectedValue;
        double result;
        double delta = 1E-10;

        result = new AreaOfACircle(radius).getArea();
        expectedValue = radius * Math.PI;

        result = BigDecimal.valueOf(result).setScale(10, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        expectedValue = BigDecimal.valueOf(expectedValue).setScale(10, BigDecimal.ROUND_HALF_DOWN).doubleValue();

        Assert.assertEquals(expectedValue, result, delta);
    }
}
