package Designpatterns.Creational.Factory;

public class Mobile implements ElectronicsFactory {
    public int abc;
    @Override
    public void productDetails() {
        System.out.println("Mobile Factory");
    }
    public Mobile(){

    }
}