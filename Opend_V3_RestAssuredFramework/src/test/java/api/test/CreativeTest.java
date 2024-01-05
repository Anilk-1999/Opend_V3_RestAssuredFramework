package api.test;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.CreativesEndPoint;
import api.payload.CreativesPojo;
import io.restassured.response.Response;

public class CreativeTest 
{
	
	CreativesPojo creativePayload;
	
	Faker faker=new Faker();
	
	
//	@Test
//	public void creativeGroupSetup()
//	{
//		
//		CreativeGroupPojo creativeGroupPayload=new CreativeGroupPojo();
//		creativeGroupPayload.setAdvertiser_id(1);
//		creativeGroupPayload.setInserted_id(1);
//		creativeGroupPayload.setGroup_id(1);
//		creativeGroupPayload.setGroup_name("group");
//		
//	}
	
	@Test(priority=1)
	public void insertCreativeGroup()
	{
		Response response=CreativesEndPoint.insertCreativeGroup(1, "creative group5");
		response.then().log().body();	
		
	}

	
	@Test(priority=2)
	public void listCreativeGroup()
	{
		Response response=CreativesEndPoint.listCreativeGroup(1);
		response.then().log().body();
	}


//	
//	
//	@Test(priority=1)
//	public void creativeSetup()
//	{
//	    creativePayload=new CreativesPojo();
//		
//		creativePayload.setAdvertiser_id(1);
//		creativePayload.setTemplate_name("Template 1");
//		creativePayload.setPre_header_text("pre header");
//		creativePayload.setGroup_id(1);
//		creativePayload.setTemplate_body("#jkjdfkjdnknkJHW<html>hdgfgjhdjsjf<html>");
//		creativePayload.setEditor_type("CKEditer");
//		creativePayload.setCbSavedState("String");
//		creativePayload.setCbSavedStatus("String");
//		creativePayload.setClient_type(1);
//		creativePayload.setSelected_urls(null);
//	}
	
}
