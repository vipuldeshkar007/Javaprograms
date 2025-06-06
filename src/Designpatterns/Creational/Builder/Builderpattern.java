package Designpatterns.Creational.Builder;

public class Builderpattern {
    boolean meat;
    boolean cheese;
    boolean tomato;

    public Pizza build(){
        return new Pizza(this);
    }

    public static void main(String[] args) {
//        Pizza p = new Builderpattern();
    }

}
