package qa.hometest.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import qa.hometest.utils.TestUtils;

/**
 * Created by Jay Vaghani
 */
public class TestBase extends TestUtils {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;




    }
}
