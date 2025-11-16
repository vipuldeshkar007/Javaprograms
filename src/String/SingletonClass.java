package String;

import Designpatterns.Creational.Singleton;

public class SingletonClass {

    private static volatile SingletonClass instance  = null;
    private SingletonClass() {}

    public static SingletonClass getInstance(){
        synchronized ( SingletonClass.class){
            if(instance == null)
                instance = new SingletonClass();
        }

        return instance;
    }

    public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();
        SingletonClass sc2 =  SingletonClass.getInstance();
        System.out.println(sc.hashCode() == sc2.hashCode());
    }
}
