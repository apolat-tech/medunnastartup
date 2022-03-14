package utilities;

import base_url_set.MedunnaBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication extends MedunnaBaseUrl {

    public static String generateToken() {
        //Set the base url
        spec.pathParams("first", "api", "second", "authenticate");

        //Set the expected data
        Map<String, Object> data = new HashMap<>();
        data.put("username", "admin79");
        data.put("password", "admin");
        data.put("rememberme", "true");

        //Send the Post request and get response
        Response response = given().spec(spec).when().contentType(ContentType.JSON).body(data).when().post("/{first}/{second}");
        response.prettyPrint();
        JsonPath token = response.jsonPath();
        return token.getString("id_token");

    }


}
