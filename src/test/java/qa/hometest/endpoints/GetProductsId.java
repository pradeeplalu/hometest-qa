package qa.hometest.endpoints;

import io.restassured.response.Response;
import org.junit.Test;
import qa.hometest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductsId extends TestBase {
    @Test
    public void getProductbyId(){
        Response response = given()
                .when()
                .pathParam("id",2)
                .get("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}


