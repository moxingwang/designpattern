package top.moxingwang.designpattern.decorator;

public abstract class Beverage {
    String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();

}

