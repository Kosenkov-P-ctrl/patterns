package org.patterns.obesrver;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject){
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(STR."Current conditions: \{temperature} F degrees and \{humidity} % humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

}
