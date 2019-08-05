package top.moxingwang.designpattern.observer.weather;

public class StatisticConditionsObserver implements Observer {
    public void update(float temp, float humidity, float pressure) {
        System.out.println(String.format("StatisticConditionsObserver观察到数据%f,%f,%f",temp,humidity,pressure));
    }
}
