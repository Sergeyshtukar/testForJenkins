package tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RunTests {

    private static final Logger log = Logger.getLogger(RunTests.class);

    @Test
    public void StreamCollection() {
        log.info("Start test");
        log.info("----------------------");
        log.info("Collections");
        Collection<String> collectionForDistinct = Arrays.asList("1", "3", "1", "2", "2", "5");
        Collection<String> collectionSort = Arrays.asList("Москва", "Минск", "Витебск", "Брест", "Могилёв");
        Collection<String> collectionForReverseSort = Arrays.asList("1", "2", "4", "3", "5");

        log.info("Lists");
        List<String> distinct = collectionForDistinct.stream().distinct().collect(Collectors.toList());

        List<String> sorted = collectionSort.stream().sorted().collect(Collectors.toList());

        List<String> reverseSorted = collectionForReverseSort.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        log.info("-------------------------");

        log.info("Distinct: " + distinct);
        log.info("Sorted: " + sorted);
        log.info("Reverse sorted: " + reverseSorted);
        Assert.assertTrue(false, "assert message!!!");
    }

    //    @Test
//    public void apiGet() {
//        API.setUpRequestSpecifications("https://reqres.in/");
//        API.get("/api/users?page=2");
//    }

//    @Test
//    public void apiPost() {
//        log.info("qweqweqwe !!!!!!!!!!!!!!!!!!!");
//        API.setUpRequestSpecifications("https://reqres.in/");
//        API.postWithParams("{\"name\":\"morpheus\",\"job\":\"leader\"}", "/api/users");
//        Assert.assertTrue(true, "qweq qwe ");
//    }

    //    @Test
//    public void apiPost() {
//        API.setUpRequestSpecifications("https://reqres.in/");
//        Map<String, String> param = new HashMap<>();
//        param.put("name", "morpheus");
//        param.put("job", "leader");
//        API.postWithParam(param, "/api/users");
//    }

//    @Test
//    public static int mass(int[][] array) {
//        log.info("qweqweqwe !!!!!!!!!!!!!!!!!!!");
//        int length = array.length;
//        System.out.println("length" + length);
//        return length;
//    }
}
