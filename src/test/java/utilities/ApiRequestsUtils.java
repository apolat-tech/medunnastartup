package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiRequestsUtils {
    public static Response getRequest(String token, String endPoint) {
        Response response = given().headers("Authorization", "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                /*Above is just for authorization*/
                .when()
                .get(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()//extract to response
                .response();
                return response;

    }

}
