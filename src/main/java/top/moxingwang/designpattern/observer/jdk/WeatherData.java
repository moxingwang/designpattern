package top.moxingwang.designpattern.observer.jdk;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temp, humidity, pressure;

    public void measurementsChange(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
