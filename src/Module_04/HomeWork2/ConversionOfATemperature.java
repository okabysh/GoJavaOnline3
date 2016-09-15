package Module_04.HomeWork2;

public class ConversionOfATemperature {
    public static void main(String[] args) {
        int temperatureInCelsius = 33;
        int temperatureInFahrenheit = 88;
        int resultCelsius;
        int resultFahrenheit;

        resultCelsius = new Convert(temperatureInFahrenheit, ConversionTypes.toCelsius).convertTemperature();
        resultFahrenheit = new Convert(temperatureInCelsius, ConversionTypes.toFahrenheit).convertTemperature();

        System.out.println(temperatureInCelsius + " degrees of Celsius is " + resultFahrenheit + " degrees of Fahrenheit");
        System.out.println(temperatureInFahrenheit + " degrees of Fahrenheit is " + resultCelsius + " degrees of Celsius");
    }
}
