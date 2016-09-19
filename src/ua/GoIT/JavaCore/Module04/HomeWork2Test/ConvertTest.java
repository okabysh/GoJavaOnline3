package ua.GoIT.JavaCore.Module04.HomeWork2Test;

import ua.GoIT.JavaCore.Module04.HomeWork2.*;
import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    int temperature;
    ConversionTypes conversionTypes;
    int expectedValue;
    int result;

    @Test(timeout = 1000)
    public void testConvertTemperature() throws Exception  {
        /*test conversion Celsius to Fahrenheit*/
        temperature = 44;
        conversionTypes = ConversionTypes.toFahrenheit;
        expectedValue = 111;
        result = new Convert(temperature, conversionTypes).convertTemperature();

        Assert.assertEquals(expectedValue, result);

        /*test conversion Fahrenheit to Celsius*/
        temperature = 220;
        conversionTypes = ConversionTypes.toCelsius;
        expectedValue = 104;
        result = new Convert(temperature, conversionTypes).convertTemperature();

        Assert.assertEquals(expectedValue, result);
    }
}
