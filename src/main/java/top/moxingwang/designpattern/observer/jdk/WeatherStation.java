package top.moxingwang.designpattern.observer.jdk;


import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new CurrentConditionsObserver());
        weatherData.addObserver(new StatisticConditionsObserver());
        weatherData.measurementsChange(1.7F,3.6F,65F);
        weatherData.measurementsChange(199.9F,30.6F,6995F);
    }
}
