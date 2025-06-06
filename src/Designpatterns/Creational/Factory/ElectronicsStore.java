package Designpatterns.Creational.Factory;

public class ElectronicsStore {

    public Object shop(String type){
        if(type.equalsIgnoreCase("MOBILE")){
            return new Mobile();
        }if(type.equalsIgnoreCase("LAPTOP")){
            return new Laptop();
        }if(type.equalsIgnoreCase("ACCESSORIES")){
            return new Accessories();
        }
        return null;
    }
    public static void main(String[] args) {
        ElectronicsStore es = new ElectronicsStore();
        ElectronicsFactory mobile_details = (Mobile) es.shop("MOBILE");
        ElectronicsFactory laptop_details = (Laptop) es.shop("LAPTOP");
        ElectronicsFactory accessories_details = (Accessories)  es.shop("ACCESSORIES");

        mobile_details.productDetails();
        laptop_details.productDetails();
        accessories_details.productDetails();

    }
}