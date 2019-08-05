package top.moxingwang.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserver implements Observer {
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        System.out.println(String.format("StatisticConditionsObserver观察到数据%f,%f,%f",weatherData.getTemp(),weatherData.getHumidity(),weatherData.getPressure()));
    }
}
