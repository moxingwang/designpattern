package top.moxingwang.designpattern.factory.factorymethod;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare(){
        System.out.println("prepare " + name);
        System.out.println("tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("...");
    }

    void bake(){
        System.out.println("bake for 30 minutes");
    }
    void cut(){
        System.out.println("cutting the pizza");
    }
    void box(){
        System.out.println("box the pizza");
    }
}
