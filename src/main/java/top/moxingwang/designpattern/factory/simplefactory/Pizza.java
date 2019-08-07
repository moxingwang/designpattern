package top.moxingwang.designpattern.factory.simplefactory;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public void prepare(){
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
