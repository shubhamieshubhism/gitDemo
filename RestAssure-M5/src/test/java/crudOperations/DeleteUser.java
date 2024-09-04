package crudOperations;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {

	public static void main(String[] args) {
		//step 1: create data
		
				//step 2: send request
				Response resp = RestAssured.delete("https://reqres.in/api/users/2");
		        
				//step 3: log the response
				 resp.then().log().all();

	}

}
