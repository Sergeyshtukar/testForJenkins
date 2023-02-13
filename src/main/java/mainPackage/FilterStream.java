package mainPackage;

import java.util.Scanner;
import java.util.stream.Stream;

public class FilterStream {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Первая буква: ");
        String str = in.nextLine();
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид", "Берлин", "Брюссель");
        citiesStream.filter(s -> s.startsWith(str)).forEach(s -> System.out.println(s));

        System.out.println("Количество символов: ");
        int count = in.nextInt();
        citiesStream = Stream.of("Москва", "Минск", "Витебск", "Брест", "Могилёв");
        citiesStream.filter(s -> s.length()==count).forEach(s -> System.out.println(s));
    }
}
