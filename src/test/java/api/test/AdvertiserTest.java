package api.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.json.JSONObject;
import com.github.javafaker.Faker;
import api.endpoints.AdvertiserEndPoints;
import api.payload.AdvertiserGroupPojo;
import api.payload.AdvertiserPojo;
import io.restassured.response.Response;

public class AdvertiserTest 
{
	
	
	int getgroupid;
	int getadvertiserid;
	int getadvertiserUserId;
	
	Faker faker;
	AdvertiserPojo advertiserLeadPayload;
	AdvertiserGroupPojo advertiserGroupPayload;
	AdvertiserGroupPojo profilePermission;
	AdvertiserPojo advertiserPayload;
	AdvertiserPojo companyinfo;
	AdvertiserPojo userinfo;
	
	@BeforeClass
	public void setupdata()
	{
	
		 faker=new Faker();
		 
/*--------------advertiser payload------------------------*/	
		 
		 advertiserPayload=new AdvertiserPojo();
		
		 companyinfo=new AdvertiserPojo(); 
		 companyinfo.setBusiness_name("gshgd");
		 companyinfo.setWebsite(faker.company().url());
		 companyinfo.setVat("1");
		 companyinfo.setCountry("79");
		 companyinfo.setCity("5258");
		 companyinfo.setPostal_code(faker.address().zipCode());
		 companyinfo.setAddress(faker.address().fullAddress());
		 companyinfo.setFunctional_area("2");
		 companyinfo.setIndustry("10");
		 companyinfo.setDma_reg_no(faker.idNumber().valid());
		 companyinfo.setAid(faker.number().digit());
		 companyinfo.setTime_zone(faker.country().name());
		 
			
		 userinfo=new AdvertiserPojo();
		 userinfo.setFirst_name(faker.name().firstName());
		 userinfo.setLast_name(faker.name().lastName());
		 userinfo.setJob_title(faker.company().logo());
		 userinfo.setEmail_id(faker.internet().emailAddress());
		 userinfo.setMobile(faker.phoneNumber().cellPhone());
		 
		 AdvertiserPojo billinginfo=new AdvertiserPojo();
		 billinginfo.setFirst_name(faker.name().firstName());
		 billinginfo.setLast_name(faker.name().lastName());
		 billinginfo.setJob_title(faker.company().logo());
		 billinginfo.setEmail_id(faker.internet().emailAddress());
		 billinginfo.setMobile(faker.phoneNumber().cellPhone());
			
		 advertiserPayload.setAdvertiser_company(companyinfo);
		 advertiserPayload.setAdvertiser_user(userinfo);
		 advertiserPayload.setAdvertiser_billing_user(billinginfo);
		 

/*--------------advertiser user group payload------------------------*/		 
		 
		    advertiserGroupPayload=new AdvertiserGroupPojo();
		 
		    AdvertiserGroupPojo dashboardPermission=new AdvertiserGroupPojo(); 
		    dashboardPermission.setModule("String");
		    dashboardPermission.setView(true);
		    dashboardPermission.setAdd(true);
		    dashboardPermission.setEdit(true);
		    dashboardPermission.setDelete(true);
		    dashboardPermission.setImport(true);
		    dashboardPermission.setExport(true);
		    
		    
		    profilePermission=new AdvertiserGroupPojo();
		    profilePermission.setModule("String");
		    profilePermission.setView(true);
		    profilePermission.setAdd(true);
		    profilePermission.setEdit(true);
		    profilePermission.setDelete(true);
		    profilePermission.setImport(true);
		    profilePermission.setExport(true);
		    
		    
		    AdvertiserGroupPojo companyinfoPermission=new AdvertiserGroupPojo();
		    companyinfoPermission.setModule("String");
		    companyinfoPermission.setView(true);
		    companyinfoPermission.setAdd(true);
		    companyinfoPermission.setEdit(true);
		    companyinfoPermission.setDelete(true);
		    companyinfoPermission.setImport(true);
		    companyinfoPermission.setExport(true);
		    
		    
		    AdvertiserGroupPojo invoicePermission=new AdvertiserGroupPojo();
		    invoicePermission.setModule("String");
		    invoicePermission.setView(true);
		    invoicePermission.setAdd(true);
		    invoicePermission.setEdit(true);
		    invoicePermission.setDelete(true);
		    invoicePermission.setImport(true);
		    invoicePermission.setExport(true);
		    
		    
		    AdvertiserGroupPojo paymentsPermission=new AdvertiserGroupPojo();
		    paymentsPermission.setModule("String");
		    paymentsPermission.setView(true);
		    paymentsPermission.setAdd(true);
		    paymentsPermission.setEdit(true);
		    paymentsPermission.setDelete(true);
		    paymentsPermission.setImport(true);
		    paymentsPermission.setExport(true);
		    
		    AdvertiserGroupPojo manageuserPermission=new AdvertiserGroupPojo();
		    manageuserPermission.setModule("String");
		    manageuserPermission.setView(true);
		    manageuserPermission.setAdd(true);
		    manageuserPermission.setEdit(true);
		    manageuserPermission.setDelete(true);
		    manageuserPermission.setImport(true);
		    manageuserPermission.setExport(true);
		    
		    AdvertiserGroupPojo groupsPermission=new AdvertiserGroupPojo();
		    groupsPermission.setModule("String");
		    groupsPermission.setView(true);
		    groupsPermission.setAdd(true);
		    groupsPermission.setEdit(true);
		    groupsPermission.setDelete(true);
		    groupsPermission.setImport(true);
		    groupsPermission.setExport(true);
		    
		    AdvertiserGroupPojo campaignsPermission=new AdvertiserGroupPojo();
		    campaignsPermission.setModule("String");
		    campaignsPermission.setView(true);
		    campaignsPermission.setAdd(true);
		    campaignsPermission.setEdit(true);
		    campaignsPermission.setDelete(true);
		    campaignsPermission.setImport(true);
		    campaignsPermission.setExport(true);
		    
		    AdvertiserGroupPojo recurringPermission=new AdvertiserGroupPojo();
		    recurringPermission.setModule("String");
		    recurringPermission.setView(true);
		    recurringPermission.setAdd(true);
		    recurringPermission.setEdit(true);
		    recurringPermission.setDelete(true);
		    recurringPermission.setImport(true);
		    recurringPermission.setExport(true);
		    
		    
		    AdvertiserGroupPojo suppressionlistPermission=new AdvertiserGroupPojo();
		    suppressionlistPermission.setModule("String");
		    suppressionlistPermission.setView(true);
		    suppressionlistPermission.setAdd(true);
		    suppressionlistPermission.setEdit(true);
		    suppressionlistPermission.setDelete(true);
		    suppressionlistPermission.setImport(true);
		    suppressionlistPermission.setExport(true);
		    
		    AdvertiserGroupPojo helpsupportPermission=new AdvertiserGroupPojo();
		    helpsupportPermission.setModule("String");
		    helpsupportPermission.setView(true);
		    helpsupportPermission.setAdd(true);
		    helpsupportPermission.setEdit(true);
		    helpsupportPermission.setDelete(true);
		    helpsupportPermission.setImport(true);
		    helpsupportPermission.setExport(true);
		    
		    AdvertiserGroupPojo submodule1Permission=new AdvertiserGroupPojo();
		    submodule1Permission.setModule_main("String");
		    submodule1Permission.setModule("String");
		    submodule1Permission.setView(true);
		    submodule1Permission.setAdd(true);
		    submodule1Permission.setEdit(true);
		    submodule1Permission.setDelete(true);
		    submodule1Permission.setImport(true);
		    submodule1Permission.setExport(true);
		    
		    
		    AdvertiserGroupPojo submodule2Permission=new AdvertiserGroupPojo();
		    submodule2Permission.setModule_main("String");
		    submodule2Permission.setModule("String");
		    submodule2Permission.setView(true);
		    submodule2Permission.setAdd(true);
		    submodule2Permission.setEdit(true);
		    submodule2Permission.setDelete(true);
		    submodule2Permission.setImport(true);
		    submodule2Permission.setExport(true);
		 
		    advertiserGroupPayload.setGroup_id(1);
		    advertiserGroupPayload.setGroup_name(faker.name().fullName());
		    advertiserGroupPayload.setAdvertiser_id(1);
		    advertiserGroupPayload.setDashboard(dashboardPermission);
		    advertiserGroupPayload.setProfile(profilePermission);
		    advertiserGroupPayload.setCompany_info(companyinfoPermission);
		    advertiserGroupPayload.setInvoice(invoicePermission);
		    advertiserGroupPayload.setPayments(paymentsPermission);
		    advertiserGroupPayload.setManage_user(manageuserPermission);
		    advertiserGroupPayload.setGroups(groupsPermission);
		    advertiserGroupPayload.setCampaigns(campaignsPermission);
		    advertiserGroupPayload.setRecurring(recurringPermission);
		    advertiserGroupPayload.setSuppression_list(suppressionlistPermission);
		    advertiserGroupPayload.setHelp_support(helpsupportPermission);
		    advertiserGroupPayload.setSub_module1(submodule1Permission);
		    advertiserGroupPayload.setSub_module2(submodule2Permission);
		 
/*--------------advertiser lead payload------------------------*/		    
		    
		    advertiserLeadPayload=new AdvertiserPojo();
		    advertiserLeadPayload.setAdvertiser_company(companyinfo);
		    advertiserLeadPayload.setAdvertiser_user(userinfo);
		    
		    
		    
		    
	}

/*-------------------------------------------------------Advertisers-------------------------------------------------------------*/	
	
	
	
	@Test(priority = 1)
	public void insertAdvertiser()
	{
		Response response=AdvertiserEndPoints.insertAdvertiser(advertiserPayload);
		response.then().log().all();
		
		int getStatusCode=response.statusCode();
		AssertJUnit.assertEquals(getStatusCode, 200);
		
		JSONObject json=new JSONObject(response.asString());
		getadvertiserid=json.getJSONObject("data").getInt("advertiser_id");
		System.out.println("this is id : "+getadvertiserid);
		
	    getadvertiserUserId=json.getJSONObject("data").getInt("advertiser_user_id");
	}
	
	
	@Test(priority = 2)
	public void listadvertisers()
	{
		Response response=AdvertiserEndPoints.listAdvertiser();
		response.then().log().all();
	
	}
	
	@Test(priority=3)
	public void getSingleAdvertiser()
	{
		Response response=AdvertiserEndPoints.getAdvertiser(getadvertiserid);
	    response.then().log().all();
	}

	@Test(priority=4)
	public void updateAdvertiser()
	{
		companyinfo.setBusiness_name(faker.name().username());
		
		Response response=AdvertiserEndPoints.updateAdvertiser(companyinfo, getadvertiserid,getadvertiserUserId);
		response.then().log().body();
	}
	

	@Test(priority=5)
	public void getAdvertiserSettings()
	{	
		Response response=AdvertiserEndPoints.getAdvertiserSetting(getadvertiserid);
		response.then().log().body();
	}
	
	
/*-------------------------------------------------------Advertiser User Group-------------------------------------------------------------*/	
	
	@Test(priority=6)
	public void insertAdvertiserGroup()
	{
		Response response=AdvertiserEndPoints.insertAdvertiserGroup(advertiserGroupPayload);
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
	    getgroupid=json.getJSONObject("data").getInt("group_id");
	}
	
	
	@Test(priority=7)
	public void listAdvertiserGroups()
	{
		Response response=AdvertiserEndPoints.listAdvertiserGroup(getadvertiserid);
		response.then().log().body();
	}
	
	@Test(priority=8)
	public void getSingleAdvertiserGroup()
	{
		Response response=AdvertiserEndPoints.getAdvertiserGroup(getgroupid);
		response.then().log().body();
	}
	
	@Test(priority=9)
	public void updateAdvertiserGroup()
	{
		advertiserGroupPayload.setGroup_name(faker.name().fullName());
		
		Response response=AdvertiserEndPoints.updateAdvertiserGroup(advertiserGroupPayload);
		response.then().log().body();
		
	}
	
	int getadvertiserID;
	
	@Test(priority=10)
	public void updateAdvertiserGroupStatus()
	{
		
	    getadvertiserID=advertiserGroupPayload.getAdvertiser_id();
		
		Response response=AdvertiserEndPoints.updateAdvertiserGroupStatus(getadvertiserID, getgroupid);
		response.then().log().body();
		
	}
	
	//@Test(priority=11)
	public void deleteAdvertiserGroup()
	{
		Response response=AdvertiserEndPoints.deleteAdvertiserGroup(getadvertiserID, getgroupid);
		response.then().log().body();
		
	}

	
/*-------------------------------------------------------Advertiser user-------------------------------------------------------------*/	
	
	int getAdvertiserUserID;
	
	
	@Test(priority=12)
	public void insertAdvertiserUser()
	{
		userinfo.setEmail_id(faker.internet().emailAddress());
		userinfo.setGroup_id(getgroupid);
		
		Response response=AdvertiserEndPoints.insertAdvertiserUser(advertiserPayload, getadvertiserID);
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
	    getAdvertiserUserID=json.getJSONObject("data").getInt("advertiser_user_id");
		
	}
	
	@Test(priority=13)
	public void listAdvertiserUser()
	{
		Response response=AdvertiserEndPoints.listAdvertiserUser(getadvertiserID);
		response.then().log().body();
	}
	
	@Test(priority=14)
	public void getAdvertiserUser()
	{
		Response response=AdvertiserEndPoints.getAdvertiserUser(getAdvertiserUserID);
		response.then().log().body();
	}
	
	
	@Test(priority=15)
	public void updateAdvertiserUser()
	{
		
		userinfo.setFirst_name(faker.name().firstName());
	    userinfo.setLast_name(faker.name().lastName());
		
		Response response=AdvertiserEndPoints.updateAdvertiserUser(userinfo, getadvertiserID,getAdvertiserUserID);
		response.then().log().body();
	}
	
	
	@Test(priority=16)
	public void inviteResend()
	{
		Response response=AdvertiserEndPoints.resendInvite(getadvertiserID, getAdvertiserUserID);
	    response.then().log().body();
	}
	
	
	@Test(priority=17)
	public void updateAdvertiserUserStatus()
	{
		Response response=AdvertiserEndPoints.updateAdvertiserUserStatus(getadvertiserID, getAdvertiserUserID);
	    response.then().log().body();
	}
	
	
	@Test(priority=18)
	public void deleteAdvertiserUser()
	{
		Response response=AdvertiserEndPoints.deleteAdvertiserUser(getadvertiserID, getAdvertiserUserID);
		response.then().log().body();
	}
	
/*-------------------------------------------------------Advertiser lead----------------------------------------------------------*/	
	
	int advertiserLeadInsertID;
	
	@Test(priority=19)
	public void insertAdvertiserLead()
	{
		Response response=AdvertiserEndPoints.insertAdvertiserLead(advertiserLeadPayload);
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
	    advertiserLeadInsertID=json.getJSONObject("data").getInt("inserted_id");
	    System.out.println(advertiserLeadInsertID);
	    
	}
	
	
	@Test(priority=20)
	public void listAdvertiserLead()
	{
		Response response=AdvertiserEndPoints.listAdvertiserLead();
		response.then().log().body();
	}
	
	
	@Test(priority=21)
	public void getAdvertiserLead()
	{
		Response response=AdvertiserEndPoints.getAdvertiserLead(advertiserLeadInsertID);
		response.then().log().body();
	}
	
	@Test(priority=22)
	public void updateAdvertiserLead()
	{
		userinfo.setFirst_name(faker.name().firstName());
		userinfo.setLast_name(faker.name().lastName());
		
		Response response=AdvertiserEndPoints.updateAdvertiserLead(advertiserLeadPayload,advertiserLeadInsertID);
		response.then().log().body();
	}
	
	
	@Test(priority=23)
	public void deleteAdvertiserLead()
	{
		Response response=AdvertiserEndPoints.deleteAdvertiserLead(advertiserLeadInsertID);
		response.then().log().body();
	}
	
	
}
