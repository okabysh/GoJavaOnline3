package src.Module_04_2;

public class Convert {
    private int temperatureInCelsius;
    private int temperatureInFahrenheit;
    Convert(int temperatureInCelsius, int temperatureInFahrenheit) {
        this.temperatureInCelsius = temperatureInCelsius;
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    public int getTemperatureInCelsius() {
        int convertTemperatureInCelsius = (this.temperatureInFahrenheit - 32) * 5 / 9;
        return convertTemperatureInCelsius;
    }

    public int getTemperatureInFahrenheit() {
        int convertTemperatureInFahrenheit = (this.temperatureInCelsius * 9 / 5) + 32;
        return convertTemperatureInFahrenheit;
    }
}
