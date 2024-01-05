package api.endpoints;

import api.payload.CreativeGroupPojo;
import api.test.SignIn;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class CreativesEndPoint
{
	static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoxLCJjbGllbnRfdHlwZSI6MSwiZW1haWxfaWQiOiJhZG1pbkBvcGVuZC5jb20iLCJicm93c2VyIjoiY2hyb21lIiwiY3JlYXRlZF9kYXRlIjoiMjAyMy0xMi0xOSAxNDowMjo1My4yODQ4MDkrMDU6MzAiLCJvcyI6InVidW50dSIsImRldmljZSI6ImRlbGwiLCJpcCI6IjEzNC4yMDkuMjMuMTciLCJ1c2VyX2FnZW50IjoiQXBhY2hlLUh0dHBDbGllbnQvNC41LjEzIChKYXZhLzE3LjAuOC4xKSIsImlhdCI6MTcwMjk3NDc3MywiZXhwIjoxNzAyOTc2NTczfQ.Y0419jNLYiDAbGIOoGF-vsHpdTxSXgNUDLuGYEt9ZlI";
   
	 public static Response insertCreativeGroup(int advertiserUserid,String groupName)
	 {
		 Response response=given()
				 .auth().oauth2(token)
			     .accept(ContentType.JSON)
			     .contentType(ContentType.JSON)
			     .queryParam("advertiser_user_id", advertiserUserid)
			     .queryParam("group_name", "groupName")
			     
		      .when()
				 .post(Routes.insertCreativeGroup);
		 
		 return response;
	 }
		
	 
	 public static Response listCreativeGroup(int advertiserid)
	 {
		 Response response=given()
				 .auth().oauth2(token)
			     .queryParam("advertiser_id", advertiserid)
			     
		      .when()
				 .get(Routes.listCreativeGroup);
		 
		 return response;
	 }
	 
	 
	 public static Response updateCreativeGroup(CreativeGroupPojo payload)
	 {
		 Response response=given()
				 .auth().oauth2(SignIn.token)
			  
			     
		      .when()
				 .put(Routes.updateCreativeGroup);
		 
		 return response;
	 }
		
	 
	 public static Response deleteCreativeGroup(int insertedID)
	 {
		 Response response=given()
				 .auth().oauth2(SignIn.token)
				 .queryParam("inserted_id", insertedID)
			  
		      .when()
				 .delete(Routes.deleteCreativeGroup);
		 
		 return response;
	 }
}
	

