package api.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.json.JSONObject;
import api.endpoints.SuppressionEndPoint;
import api.payload.SuppressionPojo;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class SuppressionTest
{

	SuppressionPojo addAdvertiserSuppressionPayload;
	
	
	@BeforeClass
	public void suppressionSetup()
	{
		addAdvertiserSuppressionPayload=new SuppressionPojo();
		addAdvertiserSuppressionPayload.setFile("/home/active30/Documents/csvFiles/Contacts - B2C.csv");
		addAdvertiserSuppressionPayload.setSuppression_list_name("advertiser suppression");
		addAdvertiserSuppressionPayload.setAdvertiser_id(1);
		addAdvertiserSuppressionPayload.setAdvertiser_user_id(1);
		addAdvertiserSuppressionPayload.setUpload_type(1);
		addAdvertiserSuppressionPayload.setMap_column("email");
		
	}
	
	//@Test(priority=1)
	public void insertAdvertiserSuppressions()
	{
		Response response=SuppressionEndPoint.insertAdvertiserSuppressions(addAdvertiserSuppressionPayload);
		response.then().log().body();
		
	}
	
	@Test(priority=3)
	public void getSingleSuppression()
	{
		Response response=SuppressionEndPoint.getSuppressions(1);
		response.then().log().body();
		
		String statusLine=response.statusLine();
		System.out.println("The status line is : "+statusLine);
		AssertJUnit.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		Headers header = response.headers();
        String getContentType = header.getValue("Content-Type");                 
		System.out.println("The ContentType is : "+getContentType);
		
	    AssertJUnit.assertEquals(getContentType, "application/json");
	    
	}
	
	@Test(priority=2)
	public void getSuppressionList()
	{
		Response response=SuppressionEndPoint.getSuppressionLists();
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
		String confirmationMsg=json.getString("message");
		int statusCode=json.getInt("status_code");
		
		System.out.println(confirmationMsg);
		System.out.println(statusCode);
		
		AssertJUnit.assertEquals(confirmationMsg, "Suppression list");
		AssertJUnit.assertEquals(statusCode,200);
		
	}
	
	@Test(priority=4)
	public void downloadSuppression()
	{
		Response response=SuppressionEndPoint.downloadSuppressions(233, 1);
		response.then().log().body();
		
		int statusCode=response.getStatusCode();
		System.out.println("The status code is : "+statusCode);
		AssertJUnit.assertEquals(statusCode, 200);
		
		JSONObject json=new JSONObject(response.asString());
		boolean success=json.getBoolean("success");
		System.out.println("is successed : "+success);
		AssertJUnit.assertEquals(success, true);
	}
	
	@Test(priority=5)
	public void SuppressionStatus()
	{
		Response response=SuppressionEndPoint.getSuppressionStatus(1, 233);
		response.then().log().body();
		
		int statusCode=response.statusCode();
		AssertJUnit.assertEquals(statusCode, 200);
		
		String statusLine=response.statusLine();
		System.out.println("The statusLine is : "+statusLine);
		AssertJUnit.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		boolean success=response.jsonPath().getBoolean("success");
		AssertJUnit.assertEquals(success, true);
		
		Cookies getCookies = response.detailedCookies();
		System.out.println(getCookies);
		
	}
	
	@Test(priority=6)
	public void getUnsubscribeCount()
	{
		Response response=SuppressionEndPoint.getUnsubscribeCounts(1);
		response.then().log().body();
		
		int getstatusCode=response.statusCode();
		AssertJUnit.assertEquals(getstatusCode, 200);
		
		String getMessage=response.jsonPath().getString("message");
		System.out.println("this is a message : "+getMessage);
		AssertJUnit.assertEquals(getMessage, "Unsubscribe count");
		
		JSONObject json=new JSONObject(response.asString());
		JSONObject dataObject = json.getJSONObject("data");
		
		int totalUnsubscribeList=dataObject.getInt("total_unsubscribe_list");
        System.out.println("The total Unsubscribe List is : "+totalUnsubscribeList);		
	}
	
	@Test(priority=7)
	public void suppressionRefresh()
	{
		Response response=SuppressionEndPoint.refreshSuppression(2,3);
		response.then().log().body();
		
		int getStatusCode=response.statusCode();
		AssertJUnit.assertEquals(getStatusCode, 200);
		
		String getMessage=response.jsonPath().getString("message");
	    System.out.println("The message is : "+getMessage);
	    AssertJUnit.assertEquals(getMessage, "Suppression refreshed successfully");
	}
	
}
