package ua.GoIT.JavaCore.Module04.HomeWork3Test;

import ua.GoIT.JavaCore.Module04.HomeWork3.CalculationLengthSegment;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculationLengthSegmentTest {
    int coordinateX1;
    int coordinateY1;
    int coordinateX2;
    int coordinateY2;
    double result;
    double expectedValue;
    double delta;

    @Test(timeout = 1000)
    public void testGetLengthSegment() throws Exception {
        coordinateX1 = -4;
        coordinateY1 = -5;
        coordinateX2 = 6;
        coordinateY2 = 7;
        delta = 1E-10;
        expectedValue = 15.6204993518;
        result = new CalculationLengthSegment(coordinateX1, coordinateY1, coordinateX2, coordinateY2).getLengthSegment();
        result = BigDecimal.valueOf(result).setScale(10, BigDecimal.ROUND_HALF_DOWN).doubleValue();

        Assert.assertEquals(expectedValue, result, delta);
    }
}
