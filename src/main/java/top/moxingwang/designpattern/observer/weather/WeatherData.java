package top.moxingwang.designpattern.observer.weather;

import java.util.List;

public class WeatherData implements Subject {
    private float temp, humidity, pressure;
    private List<Observer> observers;

    public WeatherData(List<Observer> observers) {
        this.observers = observers;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChange(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }
}
