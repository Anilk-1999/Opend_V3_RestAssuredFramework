package api.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.CreativesEndPoint;
import api.payload.CreativeGroupPojo;
import api.payload.CreativesPojo;
import io.restassured.response.Response;


public class CreativeTest 
{

/*-------------------------------------------------------Creative groups----------------------------------------------------------*/
	
	private CreativeGroupPojo updateCreativegroup;
	private Faker faker=new Faker();
	
	//@Test(priority=1)
	public void insertcreativeGroup()
	{
		 		
		Response response=CreativesEndPoint.insertCreativeGroup(1, "arunhdjhjjname");
		response.then().log().body();
		
		int getStatusCode=response.statusCode();
		System.out.println("The status code is : "+getStatusCode);
		AssertJUnit.assertEquals(getStatusCode, 200);
		
		String getConfirmMessage=response.jsonPath().getString("message");
		System.out.println("The confirmation message is : "+getConfirmMessage);
//		Assert.assertEquals(getConfirmMessage, "Creative group added successfully");
		
	}

	private int getInsertId;
	private int getGroupId;
	
	@Test(priority=2)
	public void getCreativeGroupList()
	{
		Response response=CreativesEndPoint.listCreativeGroup();
		response.then().log().body();
		
		int getStatuscode=response.getStatusCode();
		AssertJUnit.assertEquals(getStatuscode, 200);
		
		String getStatusline=response.getStatusLine();
		AssertJUnit.assertEquals(getStatusline, "HTTP/1.1 200 OK");
		
		JSONObject json=new JSONObject(response.asString());
		String getconfirmMessage=json.getString("message");
		AssertJUnit.assertEquals(getconfirmMessage, "Creatives group list");
		
		JSONArray jsonArrayData = json.getJSONObject("data").getJSONArray("data");
		getInsertId=jsonArrayData.getJSONObject(1).getInt("inserted_id");
		getGroupId=jsonArrayData.getJSONObject(1).getInt("group_id");
	
	}
	
	@Test(priority=3,dependsOnMethods = {"getCreativeGroupList"})
	public void getSingleCreativeGroup()
	{
		Response response=CreativesEndPoint.getsingleCreativeGroup(getInsertId, getGroupId);
		response.then().log().body();
		
		AssertJUnit.assertEquals(response.statusCode(), 200);
		AssertJUnit.assertEquals(response.jsonPath().getString("message"), "Creatives group");
		AssertJUnit.assertEquals(response.statusLine(), "HTTP/1.1 200 OK");
		AssertJUnit.assertEquals(response.headers().getValue("Content-Type"),"application/json");
	}
	
	@Test(priority=4)
	public void updateCreativeGroup()
	{
		updateCreativegroup=new CreativeGroupPojo();
		updateCreativegroup.setAdvertiser_id(1);
		updateCreativegroup.setInserted_id(getInsertId);
		updateCreativegroup.setGroup_id(getGroupId);
		updateCreativegroup.setGroup_name(faker.name().firstName());
		
		Response response=CreativesEndPoint.updateCreativeGroup(updateCreativegroup);
		response.then().log().body();
			
	}
	
	@Test(priority=5)
	public void deleteCreativeGroup()
	{
		Response response=CreativesEndPoint.deleteCreativeGroup(getInsertId);
		response.then().log().body();
		
		AssertJUnit.assertEquals(response.statusCode(), 200);
		AssertJUnit.assertEquals(response.jsonPath().getString("message"), "Creative group deleted successfully");
	}
	
	
/*-------------------------------------------------------Creatives----------------------------------------------------------------*/	
	
	private int insertId;
	private int templateId;
	private int groupId;
	private int clientId;
	
	@Test(priority=6)
	public void getlistCreatives()
	{
		Response response=CreativesEndPoint.listCreatives();
		response.then().log().body();
		
		AssertJUnit.assertEquals(response.statusCode(),200);
		AssertJUnit.assertEquals(response.jsonPath().getString("message"), "Creatives group list");
	
		JSONObject json=new JSONObject(response.asString());
		JSONObject arrayData = json.getJSONObject("data").getJSONArray("data").getJSONObject(1);
		
	    insertId=arrayData.getInt("inserted_id");
	    templateId=arrayData.getInt("template_id");
	    groupId=arrayData.getInt("group_id");
	    clientId=arrayData.getInt("client_id");
		
	}
	
	@Test(priority=7)
	public void getSingleCreative()
	{
		Response response=CreativesEndPoint.getSingleCreatives(insertId,templateId);
		response.then().log().body();
		
		AssertJUnit.assertEquals(response.statusCode(),200);
		AssertJUnit.assertEquals(response.statusLine(),"HTTP/1.1 200 OK");
	}
	
	//@Test(priority=8)
	public void insertCreatives()
	{
		
		
		CreativesPojo addCreativePayload=new CreativesPojo();
		addCreativePayload.setInserted_id(0);
		addCreativePayload.setAdvertiser_id(1);
		addCreativePayload.setTemplate_id(0);
		addCreativePayload.setTemplate_name(faker.name().fullName());
		addCreativePayload.setPre_header_text("xcxc");
		addCreativePayload.setGroup_id(0);
		addCreativePayload.setTemplate_body("sdsd");
		addCreativePayload.setEditor_type("new");
		addCreativePayload.setCbSavedState("");
		addCreativePayload.setCbSavedStatus("");	
		addCreativePayload.setClient_type(0);
		addCreativePayload.setSelected_urls(Arrays.asList());
	
		Response response=CreativesEndPoint.insertCreative(addCreativePayload);
		response.then().log().body();
		
		AssertJUnit.assertEquals(response.statusCode(),200);
		
//		JSONObject json=new JSONObject(response.asString());
//		JSONArray arrayData=json.getJSONObject("data").getJSONArray("data");
//		arrayData.getJSONObject(1).getString("");
		
		
	}
	
	//@Test(priority=9)
	public void updateCreatives()
	{
		CreativesPojo updateCreativePayload=new CreativesPojo();
		updateCreativePayload.setInserted_id(insertId);
		updateCreativePayload.setAdvertiser_id(clientId);
		updateCreativePayload.setTemplate_id(templateId);
		updateCreativePayload.setTemplate_name(faker.name().fullName());
		updateCreativePayload.setPre_header_text("");
		updateCreativePayload.setGroup_id(groupId);
		updateCreativePayload.setTemplate_body("sdsd");
		updateCreativePayload.setEditor_type("");
		updateCreativePayload.setCbSavedState("");
		updateCreativePayload.setCbSavedStatus("");
		updateCreativePayload.setClient_type(0);
		updateCreativePayload.setSelected_urls(null);
	
		Response response=CreativesEndPoint.insertCreative(updateCreativePayload);
		response.then().log().body();
	}
	
	//@Test(priority=10)
	public void updateCreativeStatus()
	{
		Response response=CreativesEndPoint.updateCreativeStatus(insertId, 1);
		response.then().log().body();
	}
	
	//@Test(priority=11)
	public void deleteCreatives()
	{
		System.out.println(insertId);
		Response response=CreativesEndPoint.deleteCreative(insertId);
		response.then().log().body();
	}
	
}
