package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import api.payload.SuppressionPojo;
import api.test.SignIn;
import io.restassured.http.ContentType;


public class SuppressionEndPoint 
{

	
	public static Response insertAdvertiserSuppressions(SuppressionPojo payload)
	{
		
		Response response=given()
		   .auth().oauth2(SignIn.token)
		   .accept(ContentType.JSON)
		   .contentType(ContentType.JSON)
		   .body(payload)
		   
		.when()
		   .post(Routes.insertAdvertiserSuppression);
		   
		   return response;
		
	}
	
	public static Response getSuppressions(int suppressionId)
	{
		
		Response response=given()
		    .auth().oauth2(SignIn.token)
		    .accept(ContentType.JSON)
		    .contentType(ContentType.JSON)
		    .queryParam("suppression_list_id", suppressionId)
		    

		.when()
		    .get(Routes.getSuppression);
		
		return response;
		
	}
	
	public static Response getSuppressionLists()
	{
		 Response response=given()
		    .auth().oauth2(SignIn.token)
		    .accept(ContentType.JSON)
		    .contentType(ContentType.JSON)
		    
		    
		 .when()
		    .get(Routes.suppressionList);
		 
		 return response;
		    	
	}
	
	public static Response downloadSuppressions(int suppressionId,int clientUserId)
	{
		Response response=given()
		   .auth().oauth2(SignIn.token)
		   .accept(ContentType.JSON)
		   .contentType(ContentType.JSON)
		   .queryParam("suppression_list_id", suppressionId)
		   .queryParam("client_user_id", clientUserId)
		   
		.when() 
		   .post(Routes.downloadSuppression);
		
		return response;
	}
	
	public static Response getSuppressionStatus(int clientType,int clientId)
	{
		Response response=given()
		   .auth().oauth2(SignIn.token)
		   .accept(ContentType.JSON)
		   .contentType(ContentType.JSON)
		   .queryParam("client_type", clientType)
		   .queryParam("client_id", clientId)
		   
		.when()
		   .get(Routes.getSuppressionStatus);
		
		return response;
		
	}
	
}
