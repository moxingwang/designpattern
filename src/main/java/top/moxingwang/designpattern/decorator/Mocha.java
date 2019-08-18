package top.moxingwang.designpattern.decorator;

public class Mocha extends Beverage {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return "Mocha";
    }

    public double cost() {
        return 9.9 + beverage.cost();
    }
}
