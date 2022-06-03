package qa.hometest.endpoints;

import io.restassured.response.Response;
import org.junit.Test;
import qa.hometest.model.UserPojo;

import static io.restassured.RestAssured.given;

public class BuyPostProduct {
    @Test
    public void buyProduct(){
        UserPojo userPojo = new UserPojo();
        userPojo.setUser_id(2);
        userPojo.setAmount(3);
        Response response = given()
                .when()
                .pathParam("id",1)
                .body(userPojo)
                .post("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}

