package Designpatterns.Creational;
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){}

    public synchronized Singleton getinstance(){
        if(instance == null){
            instance  = new Singleton();
        }
        return instance;
    }

    public static void main() {
        Singleton s1 = new Singleton().getinstance();
    }
}
