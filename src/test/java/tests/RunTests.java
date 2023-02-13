package tests;

import mainPackage.API;
import org.testng.annotations.Test;

public class RunTests {

//    @Test
//    public void apiGet() {
//        API.setUpRequestSpecifications("https://reqres.in/");
//        API.get("/api/users?page=2");
//    }

    @Test
    public void apiPost() {
        API.setUpRequestSpecifications("https://reqres.in/");
        API.postWithParams("{\"name\":\"morpheus\",\"job\":\"leader\"}", "/api/users");
    }






































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
//        int length = array.length;
//        System.out.println("length" + length);
//        return length;
//    }
}
