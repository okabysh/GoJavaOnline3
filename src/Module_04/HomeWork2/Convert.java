package Module_04.HomeWork2;

public class Convert {
    private int temperature;
    private ConversionTypes conversionTypes;
    private int result;

    public Convert(int temperature, ConversionTypes conversionTypes) {
        this.temperature = temperature;
        this.conversionTypes = conversionTypes;
    }

    public int convertTemperature() {
        if (conversionTypes == ConversionTypes.toCelsius) {
            result = (temperature - 32) * 5 / 9;
        } else if (conversionTypes == ConversionTypes.toFahrenheit) {
            result = (temperature * 9 / 5) + 32;
        }
        return result;
    }
}
