package top.moxingwang.designpattern.factory.templatemethod;

public class Tea extends CaffeineBeverage {
    protected void brew() {
        System.out.println("tea brew");

    }

    protected void addCondiments() {
        System.out.println("tea addCondiments");

    }
}
