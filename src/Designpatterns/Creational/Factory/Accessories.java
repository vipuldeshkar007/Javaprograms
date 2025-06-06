package Designpatterns.Creational.Factory;

public class Accessories implements ElectronicsFactory {
    @Override
    public void productDetails() {
        System.out.println("Accessories Factory");
    }
}