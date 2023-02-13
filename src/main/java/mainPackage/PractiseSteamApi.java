//package mainPackage;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class PractiseSteamApi {
//
//    public static void main(String[] args) {
//
//        Collection<String> stringCollection = Arrays.asList("Highload", "High", "Load", "Highload");
//        Collection<String> countCollection = Arrays.asList("f10", "f15", "f2", "f4");
//
//        //Посчитаем, сколько раз объект «High» встречается в коллекции:
//        long count = stringCollection.stream().filter("High"::equals).count(); // 1
//        System.out.println(count);
//
//        //посмотрим, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0:
//        String firstElement = stringCollection.stream().findFirst().orElse("0"); // Highload
//        System.out.println(firstElement);
//
//        //Благодаря методам filter и findFirst можно находить элементы, равные заданным в условии:
//        String findFirst = stringCollection.stream().filter("Load"::equals).findFirst().get(); // Load
//        System.out.println(findFirst);
//
//        //Получить последний элемент
//        List<String> qwe = stringCollection.stream().skip(stringCollection.size() - 1).collect(Collectors.toList()); // Highload
//        System.out.println(qwe);
//
//
//        //todo
//
//        //минимальное значение
//        String min = countCollection.stream().min(String::compareTo).get(); // f2
//        System.out.println(min);
//
//        //максимальное значение
////        String max = countCollection.stream().max(Comparator.naturalOrder()).get(); // f15
////        System.out.println(max);
//    }
//}
