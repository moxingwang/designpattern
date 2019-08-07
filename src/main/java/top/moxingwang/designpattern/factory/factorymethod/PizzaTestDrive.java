package top.moxingwang.designpattern.factory.factorymethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore chinesePizzaStore = new ChinaPizzaStore();
        PizzaStore nypiPizzaStore = new NYPizzaStore();

        chinesePizzaStore.createPizza("cheese");
        nypiPizzaStore.createPizza("cheese");


    }
}
