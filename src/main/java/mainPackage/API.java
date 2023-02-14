package mainPackage;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static io.restassured.RestAssured.given;

public class API {

    private static final Logger log = Logger.getLogger(API.class);

    @Step
    public static Response get(String url) {
        log.info("Get response");
        return given()
                .when()
                .get(url)
                .then()
                .log().all()
                .extract().response();
    }

    @Step
    public static Response postWithParams(String body, String endPoint) {
        log.info("Post response with params");
        return given()
                .body(body)
                .when()
                .post(endPoint)
                .then()
                .log().all()
                .extract().response();
    }

    @Step
    public static void setUpRequestSpecifications(String url) {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .setAccept(ContentType.JSON)
                .build();
    }


    //    public static Response postWithParam(Map<String, String> params, String endPoint) {
//        return given()
//                .params(params)
//                .when()
//                .post(endPoint)
//                .then()
//                .log().all()
//                .extract().response();
//    }
}
