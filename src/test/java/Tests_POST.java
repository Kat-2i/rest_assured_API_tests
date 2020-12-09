// library for parsing JSON
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
//Testng
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Tests_POST {

    // Testing POST method

    @Test
    public void test_01(){
        Map<String, Object> map = new HashMap<String, Object>();
        //allowing key value pairs to be stored in map object, passed as a strings (K, V)
        map.put("name", "Kat");
        map.put("job", "student");
        // plain object: {name=Kat, job=student}
        System.out.println(map);
        // parsed as JSON:
        JSONObject request = new JSONObject(map);
        System.out.println(request);
        // {"name":"Kat","job":"student"}
        System.out.println(request.toJSONString());
        //{"name":"Kat","job":"student"}

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201); // created status code 201
    }
}
