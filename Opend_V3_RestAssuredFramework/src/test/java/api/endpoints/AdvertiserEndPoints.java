package api.endpoints;


import api.payload.AdvertiserGroupPojo;
import api.payload.AdvertiserPojo;
import api.test.SignIn;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.json.JSONException;


public class AdvertiserEndPoints 
{
	
	
	public static Response insertAdvertiser(AdvertiserPojo payload)
	{
		Response response=given()
		  .auth().oauth2(SignIn.token)
		  .accept(ContentType.JSON)
		  .contentType(ContentType.JSON)
		  .body(payload)
		
		.when()
		   .post(Routes.insert_url);
		return response;
	
	}
	
	
    public static Response getAdvertiser(int advertiser_id)
    {
		Response response=given()
		   .auth().oauth2(SignIn.token)
		   .queryParam("advertiser_id", advertiser_id)
				
				
		.when()
		   .get(Routes.getadvertiser_url);
		
		return response;

    }
	
	
	public static Response listAdvertiser()
	{
		Response response=given()
				.auth().oauth2(SignIn.token)
				
				.when()
				   .get(Routes.listadvertiser_url);
				
				return response;
	}
	
	
	public static Response updateAdvertiser(AdvertiserPojo payload,int advertiser_id,int advertiserUser_id)
	{
		Response response=given()
		  .auth().oauth2(SignIn.token)
		  .accept(ContentType.JSON)
		  .contentType(ContentType.JSON)
		  .body(payload)
		  .queryParam("advertiser_id", advertiser_id)
		  .queryParam("advertiser_user_id", advertiserUser_id)
		
		.when()
		  .put(Routes.updateadvertiser_url);
		return response;
	
	}
	
	public static Response getAdvertiserSetting(int advertiser_id)
	{
		Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_id", advertiser_id)
	      
		.when()
		  .put(Routes.getAdvertiserSetting);
	  
		return response;
	}
	
/*-------------------------------------------------------Advertiser Groups------------------------------------------------*/
 
	public static Response insertAdvertiserGroup(AdvertiserGroupPojo payload)
   {
	   Response response=given()
			   .auth().oauth2(SignIn.token)
			   .accept(ContentType.JSON)
			   .contentType(ContentType.JSON)
			   .body(payload)
			   
			   
			   .when()
			       .post(Routes.insertGroup_url);
	   
	   return response;
   }
   
  
   public static Response listAdvertiserGroup(int advertiserID)
   {
	   Response response=given()
			   .auth().oauth2(SignIn.token)
			   .queryParam("advertiser_id", advertiserID)
			   
			   .when()
			       .get(Routes.listGroup_url);
	   
	   return response;
   }
   
  
   public static Response getAdvertiserGroup(int groupid)
   {
	   Response response=given()
			   .auth().oauth2(SignIn.token)
			   .queryParam("group_id", groupid)
			   
			   .when()
			       .get(Routes.getGroup_url);
	   
	   return response;
   }
   
 
   public static Response updateAdvertiserGroup(AdvertiserGroupPojo payload)
   {
	   Response response=given()
			   .auth().oauth2(SignIn.token)
			   .accept(ContentType.JSON)
			   .contentType(ContentType.JSON)
			   .body(payload)
			   
			   .when()
			       .put(Routes.updateGroup_url);
	   
	   return response;
   }
   
  
   public static Response updateAdvertiserGroupStatus(int advertiserID,int groupID)
   {
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_id", advertiserID)
	      .queryParam("group_id", groupID)
	      .queryParam("status", "1")
	      
	      .when()
	         .put(Routes.updateGroupStatus_url);
	   
	   
	   
	   return response;
   }
	
 
   public static Response deleteAdvertiserGroup(int advertiserID,int groupID)
   {
	   Response response=given()
			   .auth().oauth2(SignIn.token)
			   .queryParam("advertiser_id", advertiserID)
			   .queryParam("group_id", groupID)
			   
			   
			   .when()
			       .delete(Routes.deleteGroup_url);
	   
	   return response;
	  
   }
	
   
/*-------------------------------------------------------Advertiser Users------------------------------------------------*/   
   
	
   public static Response insertAdvertiserUser(AdvertiserPojo payload,int advertiserID)
   {
	   
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .accept(ContentType.JSON)
	      .contentType(ContentType.JSON)
	      .queryParam("insert_type",2)
	      .queryParam("advertiser_id",advertiserID)
	      .body(payload)
	   
	   .when()
	      .post(Routes.insertUser_url);
	   
	   return response;
   }
   
   
   public static Response listAdvertiserUser(int advertiserID)
   {
	   
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_id",advertiserID)
	   
	   .when()
	      .get(Routes.listUser_url);
	   
	   return response;
   }
   
   
   public static Response getAdvertiserUser(int advertiserUserID)
   {
	   
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_user_id",advertiserUserID)
	   
	   .when()
	      .get(Routes.getUser_url);
	   
	   return response;
   }
   
   
   public static Response updateAdvertiserUser(AdvertiserPojo payload,int advertiserID,int advertiserUserID)
   {
	   
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .accept(ContentType.JSON)
	      .contentType(ContentType.JSON)
	      .queryParam("advertiser_id",advertiserID)
	      .queryParam("advertiser_user_id",advertiserUserID)
	      .body(payload)
	   
	   .when()
	      .put(Routes.updateUser_url);
	   
	   return response;
   }
   
   
   public static Response resendInvite(int advertiserID,int advertiserUserID)
   {
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_id", advertiserID)
	      .queryParam("advertiser_user_id",advertiserUserID)
	      
	      .when()
	         .post(Routes.resendInviteUser_url);
	   
	   return response;
   }
   
   
   
   public static Response updateAdvertiserUserStatus(int advertiserID,int advertiserUserID)
   {
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_id", advertiserID)
	      .queryParam("advertiser_user_id",advertiserUserID)
	      .queryParam("status",2)
	      
	      .when()
	         .put(Routes.updateUserStatus_url);
	   
	   return response;
   }
   
   
   public static Response deleteAdvertiserUser(int advertiserID,int advertiserUserID)
   {
	   Response response=given()
	      .auth().oauth2(SignIn.token)
	      .queryParam("advertiser_id", advertiserID)
	      .queryParam("advertiser_user_id",advertiserUserID)
	      
	      .when()
	         .delete(Routes.deleteUser_url);
	   
	   return response;
   }
   
   
/*-------------------------------------------------------Advertiser Lead------------------------------------------------*/   
   
     
   public static Response insertAdvertiserLead(AdvertiserPojo payload) throws JSONException
   {
	   
	   Response response=given()
	       .auth().oauth2(SignIn.token)
	       .accept(ContentType.JSON)
	       .contentType(ContentType.JSON)
	       .body(payload)
	       
	       .when()
	         .post(Routes.insertAdvertiserLead);
	   
	   return response;
   }
   
   
   public static Response listAdvertiserLead() 
   {	   
	   Response response=given()
	       .auth().oauth2(SignIn.token)
	          
	       .when()
	         .get(Routes.listAdvertiserLead);
	   
	   return response;
   }
   
   
   public static Response getAdvertiserLead(int insertedID) 
   {	   
	   Response response=given()
	       .auth().oauth2(SignIn.token)
	       .queryParam("inserted_id", insertedID)
	          
	       .when()
	         .get(Routes.getAdvertiserLead);
	   
	   return response;
   }
   
   
   public static Response updateAdvertiserLead(AdvertiserPojo payload,int insertedID)
   {
	   
	   Response response=given()
	       .auth().oauth2(SignIn.token)
	       .accept(ContentType.JSON)
	       .contentType(ContentType.JSON)
	       .queryParam("inserted_id", insertedID)
	       .body(payload)
	       
	       .when()
	         .put(Routes.updateAdvertiserLead);
	      
	   return response;
   }
   
   
   public static Response deleteAdvertiserLead(int insertedID) 
   {	   
	   Response response=given()
	       .auth().oauth2(SignIn.token)
	       .queryParam("inserted_id", insertedID)
	          
	       .when()
	         .delete(Routes.deleteAdvertiserLead);
	   
	   return response;
   }
   
	
}
