package functionalInterfaceLambda;

import java.util.function.Predicate;

public class PredicateFunationalInteface {
    public static void main(String[] args) {

//        Integer x = 100000;
        Predicate<Integer> p = (x) -> x>10000;
        System.out.println(p.test(1000000));

        System.out.println(p.test(100));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<String> predicateStartWithV = name -> name.toLowerCase().startsWith("v");
        Predicate<String> predicateStartWithS = name -> name.toLowerCase().startsWith("S");
        Predicate<String> predicateWithVAndS = predicateStartWithS.and(predicateStartWithV);
        Predicate<String> predicateWithVOrS = predicateStartWithS.or(predicateStartWithV);

        System.out.println(predicateWithVOrS.test("abc"));
        System.out.println(predicateWithVAndS.test("vipul"));
        System.out.println(predicateWithVOrS.test("pqr"));
        System.out.println(predicateWithVOrS.test("Vaishnavi"));
        System.out.println(predicateWithVOrS.negate().test("Atharva"));
        System.out.println(predicateWithVOrS.negate().test("Vivek"));

    }
}
