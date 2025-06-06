package Designpatterns.Creational.Factory;

public class Laptop implements ElectronicsFactory {
    @Override
    public void productDetails() {
        System.out.println("Laptop Factory");
    }
}
