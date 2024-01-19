package api.endpoints;

import api.payload.CreativeGroupPojo;
import api.payload.CreativesPojo;
import api.test.SignIn;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class CreativesEndPoint
{
	static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOjEsInVzZXJfaWQiOjEsImNsaWVudF90eXBlIjoxLCJlbWFpbF9pZCI6ImFkbWluQG9wZW5kLmNvbSIsImJyb3dzZXIiOiJjaHJvbWUiLCJjcmVhdGVkX2RhdGUiOiIyMDI0LTAxLTE5IDA4OjU5OjA3LjAzNTQwNCswMDowMCIsIm9zIjoidWJ1bnR1IiwiZGV2aWNlIjoiZGVsbCIsImlwIjoiMTM0LjIwOS4yMy4xNyIsInVzZXJfYWdlbnQiOiJBcGFjaGUtSHR0cENsaWVudC80LjUuMTMgKEphdmEvMTcuMC44LjEpIiwiaWF0IjoxNzA1NjU0NzQ3LCJleHAiOjE3MDU2NTY1NDd9.VkSMRjHa_uP282M4rX7o7l0yepft8pvG22EIaYi08nQ";
 
	
	/*-----------------------------------------------------Creative groups--------------------------------------------------------------*/
	
	
	 public static Response insertCreativeGroup(int advertiserUserid,String groupName)
	 {
		 Response response=given()
				 .auth().oauth2(SignIn.token)
			     .accept(ContentType.JSON)
			     .contentType(ContentType.JSON)
			     .queryParam("advertiser_user_id", advertiserUserid)
			     .queryParam("group_name", "groupName")
			     
		      .when()
				 .post(Routes.insertCreativeGroup);
		 
		 return response;
	 }
		
	 
	 public static Response listCreativeGroup()
	 {
		 Response response=given()
				 .auth().oauth2(SignIn.token)
			     .accept(ContentType.JSON)
			     .contentType(ContentType.JSON)
			     
		      .when()
				 .get(Routes.listCreativeGroup);
		 
		 return response;
	 }
	 
	 public static Response getsingleCreativeGroup(int insertedId,int groupId)
	 {
		 Response response=given()
		   .auth().oauth2(SignIn.token)
		   .accept(ContentType.JSON)
		   .contentType(ContentType.JSON)
		   .queryParam("inserted_id",insertedId )
		   .queryParam("group_id",groupId )
		   
		 
		 .when()
		    .get(Routes.getSingleCreativeGroup);
		 
		 return response;
	 }
	 
	 
	 public static Response updateCreativeGroup(CreativeGroupPojo payload)
	 {
		 Response response=given()
				 .auth().oauth2(SignIn.token)
				 .accept(ContentType.JSON)
				 .contentType(ContentType.JSON)
			  
			     
		      .when()
				 .put(Routes.updateCreativeGroup);
		 
		 return response;
	 }
		
	 
	 public static Response deleteCreativeGroup(int insertedID)
	 {
		 Response response=given()
				 .auth().oauth2(SignIn.token)
				 .accept(ContentType.JSON)
				 .contentType(ContentType.JSON)
				 .queryParam("inserted_id", insertedID)
				 
			  
		      .when()
				 .delete(Routes.deleteCreativeGroup);
		 
		 return response;
	 }
	 
	 
/*-----------------------------------------------------------------Creatives-----------------------------------------------------*/
	 
	 
	public static Response insertCreative(CreativesPojo payload)
	{
		Response response=given()
		          .auth().oauth2(SignIn.token)
		          .accept(ContentType.JSON)
		          .contentType(ContentType.JSON)
		          
		          
		        .when()
		           .post(Routes.insertCreatives);
		
		return response;
	}
	
	
	public static Response listCreatives()
	{
		Response response=given()
		          .auth().oauth2(SignIn.token)
		          .accept(ContentType.JSON)
		          .contentType(ContentType.JSON)
		          
		          
		        .when()
		           .get(Routes.listCreatives);
		
		return response;
	}
	
	
	public static Response getSingleCreatives(int insertID,int templateID)
	{
		Response response=given()
		          .auth().oauth2(SignIn.token)
		          .accept(ContentType.JSON)
		          .contentType(ContentType.JSON)
		          .queryParam("inserted_id", insertID)
		          .queryParam("template_id", templateID)
		          
		        .when()
		           .get(Routes.getCreatives);
		
		return response;
	}
	
	
	public static Response updateCreatives(CreativesPojo payload)
	{
		Response response=given()
		          .auth().oauth2(SignIn.token)
		          .accept(ContentType.JSON)
		          .contentType(ContentType.JSON)
		         
		          
		        .when()
		           .put(Routes.updateCreatives);
		
		return response;
	}
	
	
	public static Response updateCreativeStatus(int insertID,int statusID)
	{
		Response response=given()
		          .auth().oauth2(SignIn.token)
		          .accept(ContentType.JSON)
		          .contentType(ContentType.JSON)
		          .queryParam("inserted_id", "insertID")
		          .queryParam("status", "statusID")
		         
		          
		        .when()
		           .put(Routes.updateCreativeStatus);
		
		return response;
	}
	 
	
	public static Response deleteCreative(int insertID)
	{
		Response response=given()
		          .auth().oauth2(SignIn.token)
		          .accept(ContentType.JSON)
		          .contentType(ContentType.JSON)
		          .queryParam("inserted_id", "insertID")
		         
		          
		        .when()
		           .delete(Routes.deleteCreatives);
		
		return response;
	}
	
}
	

