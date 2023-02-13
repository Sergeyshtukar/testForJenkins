package mainPackage;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class API {

    @Step
    public static Response get(String url) {
        return given()
                .when()
                .get(url)
                .then()
                .log().all()
                .extract().response();
    }

    @Step
    public static Response postWithParams(String body, String endPoint) {
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
