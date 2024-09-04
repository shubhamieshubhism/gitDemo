package crudOperations;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchUser {

	public static void main(String[] args) {
		// step 1: create data required /reques body required

				JSONObject j = new JSONObject();
				j.put("name", "shubham2");
				j.put("job", "superhero");

				// step 2: send the request

				RequestSpecification req = RestAssured.given();// help you to provide body and will return us interface
				// called as request specification
				req.body(j);
				req.contentType(ContentType.JSON);
				req.when();
				req.put("https://reqres.in/api/users/2");

				Response resp = req.patch("https://reqres.in/api/users/2");

				// step 3: log the response

				resp.then().log().all();

	}

}
