// library for parsing JSON
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
//Testng
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Tests_PATCH {
    // UPDATE method
    @Test
    public void test_01() {
        JSONObject request = new JSONObject();
        request.put("name", "Kat");
        request.put("job", "student");


        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().all();
    }
}

