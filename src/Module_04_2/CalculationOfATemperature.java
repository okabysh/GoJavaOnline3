package src.Module_04_2;

public class CalculationOfATemperature {
    public static void main(String[] args) {
        int temperatureInCelsius = 33;
        int temperatureInFahrenheit = 88;
        int resultConvertFromCelsiusToFahrenheit = new Convert(temperatureInCelsius,0).getTemperatureInFahrenheit();
        int resultConvertFromFahrenheitToCelsius = new Convert(0,temperatureInFahrenheit).getTemperatureInCelsius();
        System.out.println(temperatureInCelsius+" degrees of Celsius is "+resultConvertFromCelsiusToFahrenheit+" degrees of Fahrenheit");
        System.out.println(temperatureInFahrenheit+" degrees of Fahrenheit is "+resultConvertFromFahrenheitToCelsius+" degrees of Celsius");

    }
}
