//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Synchecronlevel2 {
//
//
//    static class  FilterList<T> {
//        private List<Integer> data;
//
//        public FilterList(T data) {
//        }
//
//        public boolean filter(){
//            return true;
//        }
//
//
//        public Stream<Object> filter(Object o) {
//        }
//    }
//
////    String input="1a2b34c5";
////
////    output = 42
////
////    Sum of numbers using Stream API.
//    public static void main(String[] args) {
//        List<Integer> data = List.of(1,2,3,4,5,6);
//        List<Integer> filterList =  new FilterList<>(data).filter(n -> n %2 == 0).toList();
//        System.out.println(filterList);
//// 2,4,6
////        String input="1a2b34c5";
////        String[] iArr = input.split("/-z");
////        String numberStr = "1234567890";
////        Integer sum = Arrays.stream(iArr).map(Integer::parseInt)
////                .reduce(Integer::sum).get();
////        System.out.println(sum);
//
//    }
//}
