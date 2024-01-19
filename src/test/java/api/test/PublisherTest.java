package api.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.PublisherEndPoint;
import api.payload.PublisherGroupPojo;
import api.payload.PublisherPojo;
import io.restassured.response.Response;

public class PublisherTest 
{

	PublisherGroupPojo publisherGroupPayload;
	PublisherGroupPojo profilePermission;
	PublisherPojo publisherLeadPayload;
	PublisherPojo publisherPayload;
	PublisherPojo companyInfo;
	PublisherPojo userInfo;
	Faker faker;
	
	int getPublisherID;
	int getPublisherUserID;
	
	@BeforeClass
	public void publisherRequestBodySetup()
	{
	    faker=new Faker();
		
		publisherPayload =new PublisherPojo();
		
		
		companyInfo=new PublisherPojo();
		companyInfo.setBusiness_name("sds");
		companyInfo.setWebsite(faker.company().url());
		companyInfo.setVat("1");
		companyInfo.setCountry("79");
		companyInfo.setCity("5258");
		companyInfo.setPostal_code(faker.address().zipCode());
		companyInfo.setAddress(faker.address().fullAddress());
		companyInfo.setIco_no("123");
		companyInfo.setHoidl(123);
		companyInfo.setDma_reg_no("11111");
		companyInfo.setTime_zone("London");
		
		
	    userInfo=new PublisherPojo();
		userInfo.setFirst_name(faker.name().firstName());
		userInfo.setLast_name(faker.name().lastName());
		userInfo.setJob_title(faker.company().logo());
		userInfo.setEmail_id(faker.internet().emailAddress());
		userInfo.setMobile(faker.phoneNumber().cellPhone());
		
		
		PublisherPojo billingInfo=new PublisherPojo();
		billingInfo.setFirst_name(faker.name().firstName());
		billingInfo.setLast_name(faker.name().lastName());
		billingInfo.setJob_title(faker.company().logo());
		billingInfo.setEmail_id(faker.internet().emailAddress());
		billingInfo.setMobile(faker.phoneNumber().cellPhone());
		billingInfo.setCountryid("79");
		billingInfo.setBank("SBI");
		billingInfo.setSwift_sort("546544");
		billingInfo.setAccount_ibac("656556");
		
		publisherPayload.setPublisher_company(companyInfo);
		publisherPayload.setPublisher_user(userInfo);
		publisherPayload.setPublisher_billing_user(billingInfo);
		
		
/*--------------Publisher user group payload------------------------*/		 
		 
	    publisherGroupPayload=new PublisherGroupPojo();
	 
	    PublisherGroupPojo dashboardPermission=new PublisherGroupPojo(); 
	    dashboardPermission.setModule("String");
	    dashboardPermission.setView(true);
	    dashboardPermission.setAdd(true);
	    dashboardPermission.setEdit(true);
	    dashboardPermission.setDelete(true);
	    dashboardPermission.setImport(true);
	    dashboardPermission.setExport(true);
	    
	    
	    profilePermission=new PublisherGroupPojo();
	    profilePermission.setModule("String");
	    profilePermission.setView(true);
	    profilePermission.setAdd(true);
	    profilePermission.setEdit(true);
	    profilePermission.setDelete(true);
	    profilePermission.setImport(true);
	    profilePermission.setExport(true);
	    
	    
	    PublisherGroupPojo companyinfoPermission=new PublisherGroupPojo();
	    companyinfoPermission.setModule("String");
	    companyinfoPermission.setView(true);
	    companyinfoPermission.setAdd(true);
	    companyinfoPermission.setEdit(true);
	    companyinfoPermission.setDelete(true);
	    companyinfoPermission.setImport(true);
	    companyinfoPermission.setExport(true);
	    
	    
	    PublisherGroupPojo invoicePermission=new PublisherGroupPojo();
	    invoicePermission.setModule("String");
	    invoicePermission.setView(true);
	    invoicePermission.setAdd(true);
	    invoicePermission.setEdit(true);
	    invoicePermission.setDelete(true);
	    invoicePermission.setImport(true);
	    invoicePermission.setExport(true);
	    
	    
	    PublisherGroupPojo paymentsPermission=new PublisherGroupPojo();
	    paymentsPermission.setModule("String");
	    paymentsPermission.setView(true);
	    paymentsPermission.setAdd(true);
	    paymentsPermission.setEdit(true);
	    paymentsPermission.setDelete(true);
	    paymentsPermission.setImport(true);
	    paymentsPermission.setExport(true);
	    
	    PublisherGroupPojo manageuserPermission=new PublisherGroupPojo();
	    manageuserPermission.setModule("String");
	    manageuserPermission.setView(true);
	    manageuserPermission.setAdd(true);
	    manageuserPermission.setEdit(true);
	    manageuserPermission.setDelete(true);
	    manageuserPermission.setImport(true);
	    manageuserPermission.setExport(true);
	    
	    PublisherGroupPojo groupsPermission=new PublisherGroupPojo();
	    groupsPermission.setModule("String");
	    groupsPermission.setView(true);
	    groupsPermission.setAdd(true);
	    groupsPermission.setEdit(true);
	    groupsPermission.setDelete(true);
	    groupsPermission.setImport(true);
	    groupsPermission.setExport(true);
	    
	    PublisherGroupPojo campaignsPermission=new PublisherGroupPojo();
	    campaignsPermission.setModule("String");
	    campaignsPermission.setView(true);
	    campaignsPermission.setAdd(true);
	    campaignsPermission.setEdit(true);
	    campaignsPermission.setDelete(true);
	    campaignsPermission.setImport(true);
	    campaignsPermission.setExport(true);
	    
	    PublisherGroupPojo recurringPermission=new PublisherGroupPojo();
	    recurringPermission.setModule("String");
	    recurringPermission.setView(true);
	    recurringPermission.setAdd(true);
	    recurringPermission.setEdit(true);
	    recurringPermission.setDelete(true);
	    recurringPermission.setImport(true);
	    recurringPermission.setExport(true);
	    
	    
	    PublisherGroupPojo suppressionlistPermission=new PublisherGroupPojo();
	    suppressionlistPermission.setModule("String");
	    suppressionlistPermission.setView(true);
	    suppressionlistPermission.setAdd(true);
	    suppressionlistPermission.setEdit(true);
	    suppressionlistPermission.setDelete(true);
	    suppressionlistPermission.setImport(true);
	    suppressionlistPermission.setExport(true);
	    
	    PublisherGroupPojo helpsupportPermission=new PublisherGroupPojo();
	    helpsupportPermission.setModule("String");
	    helpsupportPermission.setView(true);
	    helpsupportPermission.setAdd(true);
	    helpsupportPermission.setEdit(true);
	    helpsupportPermission.setDelete(true);
	    helpsupportPermission.setImport(true);
	    helpsupportPermission.setExport(true);
	    
	    PublisherGroupPojo submodule1Permission=new PublisherGroupPojo();
	    submodule1Permission.setModule_main("String");
	    submodule1Permission.setModule("String");
	    submodule1Permission.setView(true);
	    submodule1Permission.setAdd(true);
	    submodule1Permission.setEdit(true);
	    submodule1Permission.setDelete(true);
	    submodule1Permission.setImport(true);
	    submodule1Permission.setExport(true);
	    
	    
	    PublisherGroupPojo submodule2Permission=new PublisherGroupPojo();
	    submodule2Permission.setModule_main("String");
	    submodule2Permission.setModule("String");
	    submodule2Permission.setView(true);
	    submodule2Permission.setAdd(true);
	    submodule2Permission.setEdit(true);
	    submodule2Permission.setDelete(true);
	    submodule2Permission.setImport(true);
	    submodule2Permission.setExport(true);
	 
	    publisherGroupPayload.setGroup_id(1);
	    publisherGroupPayload.setGroup_name(faker.name().fullName());
	    publisherGroupPayload.setPublisher_id(7);
	    publisherGroupPayload.setDashboard(dashboardPermission);
	    publisherGroupPayload.setProfile(profilePermission);
	    publisherGroupPayload.setCompany_info(companyinfoPermission);
	    publisherGroupPayload.setInvoice(invoicePermission);
	    publisherGroupPayload.setPayments(paymentsPermission);
	    publisherGroupPayload.setManage_user(manageuserPermission);
	    publisherGroupPayload.setGroups(groupsPermission);
	    publisherGroupPayload.setSuppression_list(suppressionlistPermission);
	    publisherGroupPayload.setHelp_support(helpsupportPermission);
	    publisherGroupPayload.setSub_module1(submodule1Permission);
	    publisherGroupPayload.setSub_module2(submodule2Permission);
		
		
	
/*-----------------------------------------------advertiser lead payload---------------------------------------------------*/		    
	    
	    publisherLeadPayload=new PublisherPojo();
	    publisherLeadPayload.setPublisher_company(companyInfo);
	    publisherLeadPayload.setPublisher_user(userInfo);
		
		
	}
	
/*------------------------------------------------------------Publisher------------------------------------------------------------*/	
	
	
	@Test(priority = 1)
	public void insertPublisher()
	{
		Response response=PublisherEndPoint.insertPublisher(publisherPayload);
		response.then().log().all();
		
		JSONObject json=new JSONObject(response.asString());
		getPublisherID=json.getJSONObject("data").getInt("publisher_id");
		getPublisherUserID=json.getJSONObject("data").getInt("publisher_user_id");
		
		System.out.println(getPublisherID);
		System.out.println(getPublisherUserID);
	}
	
	
	@Test(priority = 2)
	public void listPublishers()
	{
		Response response=PublisherEndPoint.listPublishers();
		response.then().log().body();
	}
	
	
	@Test(priority = 3)
	public void getSinglePublisher()
	{
		Response response=PublisherEndPoint.getSinglePublisher(getPublisherID);
		response.then().log().body();
	}
	
	
	@Test(priority = 4)
	public void updatePublisher()
	{
		
		companyInfo.setBusiness_name("ghsdf");
		
		Response updatepublisher=PublisherEndPoint.updatePublisher(companyInfo, getPublisherID, getPublisherUserID);
		updatepublisher.then().log().body();
	}
	
/*---------------------------------------------------------Publisher user group------------------------------------------------------------*/
	
	int getgroupid;
	
	@Test(priority=6)
	public void insertPublisherGroup()
	{
		Response response=PublisherEndPoint.insertPublisherGroup(publisherGroupPayload);
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
	    getgroupid=json.getJSONObject("data").getInt("group_id");
	}
	
	
	@Test(priority=7)
	public void listPublisherGroups()
	{
		Response response=PublisherEndPoint.listPublisherGroup(getPublisherID);
		response.then().log().body();
	}
	
	@Test(priority=8)
	public void getSinglePublisherGroup()
	{
		Response response=PublisherEndPoint.getPublisherGroup(getgroupid);
		response.then().log().body();
	}
	
	@Test(priority=9)
	public void updatePublisherGroup()
	{
		publisherGroupPayload.setGroup_name(faker.name().fullName());
		
		Response response=PublisherEndPoint.updatePublisherGroup(publisherGroupPayload);
		response.then().log().body();
		
	}
	
	int getPublisherid;
	
	@Test(priority=10)
	public void updatePublisherGroupStatus()
	{
		
		getPublisherid=publisherGroupPayload.getPublisher_id();
		
		Response response=PublisherEndPoint.updatePublisherGroupStatus(getPublisherid, getgroupid);
		response.then().log().body();
		
	}
	
	//@Test(priority=11)
	public void deletePublisherGroup()
	{
		Response response=PublisherEndPoint.deletePublisherGroup(getPublisherid, getgroupid);
		response.then().log().body();
		
	}
	
	
/*------------------------------------------------------------Publisher User--------------------------------------------------------------*/	
	
    int getPublisheruserID;
    int getPublisherId;
	
	
	@Test(priority=12)
	public void insertPublisherUser()
	{
		userInfo.setEmail_id(faker.internet().emailAddress());
		userInfo.setGroup_id(getgroupid);
		
		Response response=PublisherEndPoint.insertPublisherUser(publisherPayload, getPublisherID);
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
		getPublisheruserID=json.getJSONObject("data").getInt("Publisher_user_id");
		
		getPublisherId=json.getJSONObject("data").getInt("publisher_id");
		
	}
	
	@Test(priority=13)
	public void listPublisherUser()
	{
		Response response=PublisherEndPoint.listPublisherUser(getPublisherId);
		response.then().log().body();
	}
	
	@Test(priority=14)
	public void getPublisherUser()
	{
		Response response=PublisherEndPoint.getPublisherUser(getPublisheruserID);
		response.then().log().body();
	}
	
	
	@Test(priority=15)
	public void updatePublisherUser()
	{
		
		userInfo.setFirst_name(faker.name().firstName());
	    userInfo.setLast_name(faker.name().lastName());
		
		Response response=PublisherEndPoint.updatepublisherUser(userInfo, getPublisherId,getPublisheruserID);
		response.then().log().body();
	}
	
	
	@Test(priority=16)
	public void inviteResend()
	{
		Response response=PublisherEndPoint.resendInvite(getPublisherId, getPublisheruserID);
	    response.then().log().body();
	}
	
	
	@Test(priority=17)
	public void updatePublisherUserStatus()
	{
		Response response=PublisherEndPoint.updatePublisherUserStatus(getPublisherId, getPublisheruserID);
	    response.then().log().body();
	}
	
	
	@Test(priority=18)
	public void deletePublisherUser()
	{
		Response response=PublisherEndPoint.deletePublisherUser(getPublisherId, getPublisheruserID);
		response.then().log().body();
	}
	
	
/*--------------------------------------------------------Publisher lead----------------------------------------------------------------*/		
	
	

    int PublisherLeadInsertID;
	
	@Test(priority=19)
	public void insertPublisherLead()
	{
		Response response=PublisherEndPoint.insertPublisherLead(publisherLeadPayload);
		response.then().log().body();
		
		JSONObject json=new JSONObject(response.asString());
	    PublisherLeadInsertID=json.getJSONObject("data").getInt("inserted_id");
	    System.out.println(PublisherLeadInsertID);
	    
	}
	
	
	
	@Test(priority=20)
	public void listPublisherLead()
	{
		Response response=PublisherEndPoint.listPublisherLead();
		response.then().log().body();
	}
	
	
	@Test(priority=21)
	public void getPublisherLead()
	{
		Response response=PublisherEndPoint.getPublisherLead(PublisherLeadInsertID);
		response.then().log().body();
	}
	
	
	@Test(priority=22)
	public void updatePublisherLead()
	{
		userInfo.setFirst_name(faker.name().firstName());
		userInfo.setLast_name(faker.name().lastName());
		
		Response response=PublisherEndPoint.updatePublisherLead(publisherLeadPayload,PublisherLeadInsertID);
		response.then().log().body();
	}
	
	
	@Test(priority=23)
	public void deletePublisherLead()
	{
		Response response=PublisherEndPoint.deletePublisherLead(PublisherLeadInsertID);
		response.then().log().body();
	}
	
	
	
	
}
