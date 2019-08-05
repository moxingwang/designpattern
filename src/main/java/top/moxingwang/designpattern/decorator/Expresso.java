package top.moxingwang.designpattern.decorator;

public class Expresso extends Beverage {

    @Override
    public String getDesc() {
        return "Expresso";
    }

    public double cost() {
        return 1.5;
    }
}
