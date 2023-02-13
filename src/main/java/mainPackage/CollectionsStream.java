//package mainPackage;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class CollectionsStream {
//
//    public static void main(String[] args) {
//        Collection<String> collectionForDistinct = Arrays.asList("1", "3", "1", "2", "2", "5");
//        Collection<String> collectionSort = Arrays.asList("Москва", "Минск", "Витебск", "Брест", "Могилёв");
//        Collection<String> collectionForReverseSort = Arrays.asList("1", "2", "4", "3", "5");
//
//        List<String> distinct = collectionForDistinct.stream().distinct().collect(Collectors.toList());
//
//        List<String> sorted = collectionSort.stream().sorted().collect(Collectors.toList());
//
//        List<String> reverseSorted = collectionForReverseSort.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//
//        System.out.println("Distinct: " + distinct);
//        System.out.println("Sorted: " + sorted);
//        System.out.println("Reverse sorted: " + reverseSorted);
//    }
//}
