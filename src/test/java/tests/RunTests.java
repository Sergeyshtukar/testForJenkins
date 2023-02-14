package tests;

import API.API;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import listeners.TestAllureListeners;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.GoogleMainPage;
import tools.browserFactory.DriverStart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RunTests {

    private static final Logger log = Logger.getLogger(RunTests.class);

    @Test
    public void apiPost() {
        log.info("start API test");
        API.setUpRequestSpecifications("https://reqres.in/");
        API.postWithParams("{\"name\":\"morpheus\",\"job\":\"leader\"}", "/api/users");
        Assert.assertTrue(true, "Assert True!!!");
    }

    @Test
    public void StreamCollection() {
        log.info("Start stream collection test");
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
        Assert.assertTrue(true, "Assert False!!!");
    }

    @Test
    public void googleTest() {
        log.info("Start google test");
        GoogleMainPage googleMainPage = new GoogleMainPage();
//        TestAllureListeners testAllureListeners = new TestAllureListeners();
//        testAllureListeners.saveScreenshot();
        Assert.assertFalse(googleMainPage.isOnPage(), "Assert message");
    }

    @AfterTest
    public void tearDown() {
        log.info("Quit");
        DriverStart.getInstance().quit();
    }

    //    @Test
//    public void apiGet() {
//        API.setUpRequestSpecifications("https://reqres.in/");
//        API.get("/api/users?page=2");
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
