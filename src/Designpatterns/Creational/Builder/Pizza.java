package Designpatterns.Creational.Builder;

public class Pizza {
    String bread, toppings;
    public Pizza(String bread, String toppings){
        this.bread = bread;
        this.toppings = toppings;

    }
    private boolean meat;
    private boolean cheese;
    private boolean tomato;
    public Pizza(Builderpattern builder){
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
    }

    public void displayOrder(){
        System.out.println("Pizza order");
        System.out.println("bread"+bread);
        System.out.println("toppings"+toppings);
    }

}
