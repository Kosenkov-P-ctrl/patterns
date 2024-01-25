package org.patterns.obesrver;

public interface Subject {
    float getTemperature();

    float getHumidity();

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
