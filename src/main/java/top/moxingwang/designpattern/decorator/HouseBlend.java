package top.moxingwang.designpattern.decorator;

public class HouseBlend extends Beverage {
    private Beverage beverage;

    public HouseBlend(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return "HouseBlend";
    }

    public double cost() {
        return 8.9+ beverage.cost();
    }
}
