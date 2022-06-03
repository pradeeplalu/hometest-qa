package qa.hometest.endpoints;

import io.restassured.response.Response;
import qa.hometest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProducts extends TestBase {
    public void getProducts(){
        Response response = given()
                .when()
                .get("products");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
