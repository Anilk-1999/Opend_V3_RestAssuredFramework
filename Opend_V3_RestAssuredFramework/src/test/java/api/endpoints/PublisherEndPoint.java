package api.endpoints;



import api.payload.PublisherGroupPojo;
import api.payload.PublisherPojo;
import api.test.SignIn;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class PublisherEndPoint 
{
	
/*---------------------------------------------------------------------------Publisher api's---------------------------------------------------------------------*/	
	
	public static Response insertPublisher(PublisherPojo payload)
	{
		Response response=given()
				.auth().oauth2(SignIn.token)
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.queryParam("insert_type", 1)
				.body(payload)
		
		.when()
		   .post(Routes.insertpublisher_url);
		
		return response;
	}
	

	public static Response listPublishers()
	{
		Response response=given()
			.auth().oauth2(SignIn.token)
		
		.when()
		   .get(Routes.listpublisher_url);
		return response;
	}
	
	
	public static Response getSinglePublisher(int publisherID)
	{
		Response response=given()
			.auth().oauth2(SignIn.token)
		    .queryParam("publisher_id", publisherID)
			
		.when()
		   .get(Routes.getpublisher_url);
		return response;
	}
	
	
	
	public static Response updatePublisher(PublisherPojo payload,int publisherID,int publisherUserID)
	{
		Response response=given()
				.auth().oauth2(SignIn.token)
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(payload)
                .queryParam("publisher_id", publisherID)
                .queryParam("publisher_user_id", publisherUserID)
				
		
		.when()
		   .put(Routes.updatepublisher_url);
		
		return response;
	}

	
/*---------------------------------------------------------Publisher Group---------------------------------------------------------------------*/	
	
	public static Response insertPublisherGroup(PublisherGroupPojo payload)
	   {
		   Response response=given()
				   .auth().oauth2(SignIn.token)
				   .accept(ContentType.JSON)
				   .contentType(ContentType.JSON)
				   .body(payload)
				   
				   
				   .when()
				       .post(Routes.insertPublisherGroup_url);
		   
		   return response;
	   }
	   
	  
	   public static Response listPublisherGroup(int publisherID)
	   {
		   Response response=given()
				   .auth().oauth2(SignIn.token)
				   .queryParam("Publisher_id", publisherID)
				   
				   .when()
				       .get(Routes.listPublisherGroup_url);
		   
		   return response;
	   }
	   
	  
	   public static Response getPublisherGroup(int groupid)
	   {
		   Response response=given()
				   .auth().oauth2(SignIn.token)
				   .queryParam("group_id", groupid)
				   
				   .when()
				       .get(Routes.getPublisherGroup_url);
		   
		   return response;
	   }
	   
	 
	   public static Response updatePublisherGroup(PublisherGroupPojo payload)
	   {
		   Response response=given()
				   .auth().oauth2(SignIn.token)
				   .accept(ContentType.JSON)
				   .contentType(ContentType.JSON)
				   .body(payload)
				   
				   .when()
				       .put(Routes.updatePublisherGroup_url);
		   
		   return response;
	   }
	   
	  
	   public static Response updatePublisherGroupStatus(int publisherID,int groupID)
	   {
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .queryParam("Publisher_id", publisherID)
		      .queryParam("group_id", groupID)
		      .queryParam("status", "1")
		      
		      .when()
		         .put(Routes.updatePublisherGroupStatus_url);
		   
		   return response;
	   }
		
	 
	   public static Response deletePublisherGroup(int publisherID,int groupID)
	   {
		   Response response=given()
				   .auth().oauth2(SignIn.token)
				   .queryParam("Publisher_id", publisherID)
				   .queryParam("group_id", groupID)
				   
				   
				   .when()
				       .delete(Routes.deletePublisherGroup_url);
		   
		   return response;
		  
	   }
	
	
/*--------------------------------------------------Publisher User---------------------------------------------------------------*/	
	
		
	   public static Response insertPublisherUser(PublisherPojo payload,int publisherID)
	   {
		   
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .accept(ContentType.JSON)
		      .contentType(ContentType.JSON)
		      .queryParam("insert_type",2)
		      .queryParam("publisher_id",publisherID)
		      .body(payload)
		   
		   .when()
		      .post(Routes.insertPublisherUser_url);
		   
		   return response;
	   }
	   
	   
	   public static Response listPublisherUser(int publisherID)
	   {
		   
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .queryParam("publisher_id",publisherID)
		   
		   .when()
		      .get(Routes.listPublisherUser_url);
		   
		   return response;
	   }
	   
	   
	   public static Response getPublisherUser(int publisherUserID)
	   {
		   
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .queryParam("publisher_user_id",publisherUserID)
		   
		   .when()
		      .get(Routes.getPublisherUser_url);
		   
		   return response;
	   }
	   
	   
	   public static Response updatepublisherUser(PublisherPojo payload,int publisherID,int publisherUserID)
	   {
		   
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .accept(ContentType.JSON)
		      .contentType(ContentType.JSON)
		      .queryParam("publisher_id",publisherID)
		      .queryParam("publisher_user_id",publisherUserID)
		      .body(payload)
		   
		   .when()
		      .put(Routes.updatePublisherUser_url);
		   
		   return response;
	   }
	   
	   
	   public static Response resendInvite(int publisherID,int publisherUserID)
	   {
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .queryParam("publisher_id", publisherID)
		      .queryParam("publisher_user_id",publisherUserID)
		      
		      .when()
		         .post(Routes.resendInvitePublisherUser_url);
		   
		   return response;
	   }
	   
	   
	   
	   public static Response updatePublisherUserStatus(int publisherID,int publisherUserID)
	   {
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .queryParam("publisher_id", publisherID)
		      .queryParam("publisher_user_id",publisherUserID)
		      .queryParam("status",2)
		      
		      .when()
		         .put(Routes.updatePublisherUserStatus_url);
		   
		   return response;
	   }
	   
	   
	   public static Response deletePublisherUser(int publisherID,int publisherUserID)
	   {
		   Response response=given()
		      .auth().oauth2(SignIn.token)
		      .queryParam("publisher_id", publisherID)
		      .queryParam("publisher_user_id",publisherUserID)
		      
		      .when()
		         .delete(Routes.deletePublisherUser_url);
		   
		   return response;
	   }
	   	

/*-------------------------------------------------------Publisher Lead------------------------------------------------*/   
	   
	     
	   public static Response insertPublisherLead(PublisherPojo payload)
	   {
		   
		   Response response=given()
		       .auth().oauth2(SignIn.token)
		       .accept(ContentType.JSON)
		       .contentType(ContentType.JSON)
		       .body(payload)
		       
		       .when()
		         .post(Routes.insertPublisherLead);
		   
		   return response;
	   }
	   
	   
	   public static Response listPublisherLead() 
	   {	   
		   Response response=given()
		       .auth().oauth2(SignIn.token)
		          
		       .when()
		         .get(Routes.listPublisherLead);
		   
		   return response;
	   }
	   
	   
	   public static Response getPublisherLead(int insertedID) 
	   {	   
		   Response response=given()
		       .auth().oauth2(SignIn.token)
		       .queryParam("inserted_id", insertedID)
		          
		       .when()
		         .get(Routes.getPublisherLead);
		   
		   return response;
	   }
	   
	   
	   public static Response updatePublisherLead(PublisherPojo payload,int insertedID)
	   {
		   
		   Response response=given()
		       .auth().oauth2(SignIn.token)
		       .accept(ContentType.JSON)
		       .contentType(ContentType.JSON)
		       .queryParam("inserted_id", insertedID)
		       .body(payload)
		       
		       .when()
		         .put(Routes.updatePublisherLead);
		      
		   return response;
	   }
	   
	   
	   public static Response deletePublisherLead(int insertedID) 
	   {	   
		   Response response=given()
		       .auth().oauth2(SignIn.token)
		       .queryParam("inserted_id", insertedID)
		          
		       .when()
		         .delete(Routes.deletePublisherLead);
		   
		   return response;
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
