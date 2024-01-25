package org.patterns.obesrver;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30.4f);
        weatherData.setMeasurements(82, 59, 30.4f);
        weatherData.setMeasurements(80, 65, 35.4f);
    }
}
