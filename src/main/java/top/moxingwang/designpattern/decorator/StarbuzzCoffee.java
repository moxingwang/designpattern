package top.moxingwang.designpattern.decorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Expresso expresso = new Expresso();
        HouseBlend houseBlend = new HouseBlend(expresso);
        Mocha mocha = new Mocha(houseBlend);
        System.out.println(mocha.getDesc()+"cost:"+mocha.cost());
    }
}
