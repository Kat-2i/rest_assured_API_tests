// library for parsing JSON
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
//Testng
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Tests_DELETE {
    // DELETE method
    @Test
    public void test_01() {


                when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204). //no content status code 204
                log().all();
    }
}

