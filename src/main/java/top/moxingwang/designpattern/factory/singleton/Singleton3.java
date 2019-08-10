package top.moxingwang.designpattern.factory.singleton;

/**
 * double check
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;
    private Singleton3(){

    }
    public Singleton3 getSingleton(){
        if(null == singleton){
            synchronized (Singleton3.class){
                if (null == singleton) {
                    singleton = new Singleton3();
                }
            }
        }

        return singleton;
    }
}
