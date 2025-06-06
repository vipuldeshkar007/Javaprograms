package functionalInterfaceLambda;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> getStringLength = String::length;
        Function<String, String> subString = x -> x.substring(0,3);
        Function<String, String> toUpperCase = String::toUpperCase;

        System.out.println(getStringLength.apply("Vipul"));
        System.out.println(toUpperCase.apply("Vipul"));
        System.out.println(subString.apply("Vipul"));
        System.out.println(toUpperCase.andThen(subString).apply("Vipul"));
        System.out.println(toUpperCase.compose(subString).apply("Vipul"));
    }
}
