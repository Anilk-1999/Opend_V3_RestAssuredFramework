package api.test;


import org.json.JSONObject;
import org.testng.annotations.Test;
import api.endpoints.AdvertiserEndPoints;
import api.payload.AdvertiserPojo;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class AdvertiserTestUsingExcelData 
{
	AdvertiserPojo advertiserPayload;
	AdvertiserPojo companyinfo;
	
	int getAdvertiserUserID;
	int getAdvertiserID;

	@Test(priority=1,dataProvider = "data", dataProviderClass = DataProviders.class)
	public void insertAdvertiser(String bname,String web,String vat,String country,String city,String pcode,String address,String functArea,String industry,String dmaNo,String aidNo,String time,String fname,String lname,String job,String email,String mobile)
	{
		
	     advertiserPayload=new AdvertiserPojo();
		 
		 companyinfo=new AdvertiserPojo();
		 
		 companyinfo.setBusiness_name(bname);
		 companyinfo.setWebsite(web);
		 companyinfo.setVat(vat);
		 companyinfo.setCountry(country);
		 companyinfo.setCity(city);
		 companyinfo.setPostal_code(pcode);
		 companyinfo.setAddress(address);
		 companyinfo.setFunctional_area(functArea);
		 companyinfo.setIndustry(industry);
		 companyinfo.setDma_reg_no(dmaNo);
		 companyinfo.setAid(aidNo);
		 companyinfo.setTime_zone(time);
		 
			
		 AdvertiserPojo userinfo=new AdvertiserPojo();
		 userinfo.setFirst_name(fname);
		 userinfo.setLast_name(lname);
		 userinfo.setJob_title(job);
		 userinfo.setEmail_id(email);
		 userinfo.setMobile(mobile);
		 
		 AdvertiserPojo billinginfo=new AdvertiserPojo();
		 billinginfo.setFirst_name(fname);
		 billinginfo.setLast_name(lname);
		 billinginfo.setJob_title(job);
		 billinginfo.setEmail_id(email);
		 billinginfo.setMobile(mobile);
			
		 advertiserPayload.setAdvertiser_company(companyinfo);
		 advertiserPayload.setAdvertiser_user(userinfo);
		 advertiserPayload.setAdvertiser_billing_user(billinginfo);
		 
		 Response advertiserdata =AdvertiserEndPoints.insertAdvertiser(advertiserPayload);
		 advertiserdata.then().log().all();
		
		 JSONObject json=new JSONObject(advertiserdata.asString());
		 getAdvertiserID=json.getJSONObject("data").getInt("advertiser_id");
		 System.out.println("this is id : "+getAdvertiserID);
			
		 getAdvertiserUserID=json.getJSONObject("data").getInt("advertiser_user_id");
		 
	}
	
	@Test(priority=2)
	public void listAdvertisers()
	{
		Response listadvertiser=AdvertiserEndPoints.listAdvertiser();
		listadvertiser.then().log().body();
	}
	
	@Test(priority=3)
	public void getAdvertisers()
	{
		Response listadvertiser=AdvertiserEndPoints.getAdvertiser(getAdvertiserID);
		listadvertiser.then().log().body();
	}
	
	@Test(priority=4)
	public void UpdateAdvertisers()
	{
		companyinfo.setBusiness_name("gshgd");
		companyinfo.setWebsite("hdgh.dgsh.dsh");
		
		Response listadvertiser=AdvertiserEndPoints.updateAdvertiser(companyinfo,getAdvertiserID,getAdvertiserUserID);
		listadvertiser.then().log().body();
	}
	
}
