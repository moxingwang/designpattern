package top.moxingwang.designpattern.observer.weather;

import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new ArrayList<Observer>());
        weatherData.registerObserver(new CurrentConditionsObserver());
        weatherData.registerObserver(new StatisticConditionsObserver());
        weatherData.measurementsChange(1.7F,3.6F,65F);
        weatherData.measurementsChange(199.9F,30.6F,6995F);
    }
}
