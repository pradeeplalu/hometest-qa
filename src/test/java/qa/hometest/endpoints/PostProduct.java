package qa.hometest.endpoints;

import io.restassured.response.Response;
import org.junit.Test;
import qa.hometest.model.UserPojo;
import qa.hometest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostProduct extends TestBase {
    @Test
    public void postCreateProducts(){
        UserPojo userPojo = new UserPojo();
        userPojo.setName("Lime Curd check");
        userPojo.setAvailable(100);
        Response response = given()
                .when()
                .body(userPojo)
                .post("/products");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}



