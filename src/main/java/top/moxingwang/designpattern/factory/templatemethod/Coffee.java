package top.moxingwang.designpattern.factory.templatemethod;

public class Coffee extends CaffeineBeverage {

    protected void brew() {
        System.out.println("coffee brew");
    }

    protected void addCondiments() {
        System.out.println("coffee addCondiments");

    }
}
