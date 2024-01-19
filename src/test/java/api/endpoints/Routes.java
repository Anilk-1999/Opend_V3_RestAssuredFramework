package api.endpoints;

public class Routes 
{
         
	 public static String base_url="https://v3opend-api.tech-active.com";
	 
/*----------------------------------------------------------Advertiser api's------------------------------------------------------------*/
	 
	 public static String insert_url           = base_url+"/advertiser/insert-advertiser?insert_type=1";
	 public static String getadvertiser_url    = base_url+"/advertiser/get-advertiser-profile";
     public static String listadvertiser_url   = base_url+"/advertiser/list-advertisers";
     public static String updateadvertiser_url = base_url+"/advertiser/update-advertiser-profile";
     public static String getAdvertiserSetting = base_url+"/advertiser/get-advertiser-settings";
     
	
/*----------------------------------------------------------Advertiser user and group api's--------------------------------------------------------*/	
     
     public static String insertGroup_url      = base_url+"/advertiser/insert-advertiser-group";
     public static String listGroup_url        = base_url+"/advertiser/list-advertiser-manage-groups";
     public static String getGroup_url         = base_url+"/advertiser/get-advertiser-manage-group";
     public static String updateGroup_url      = base_url+"/advertiser/update-advertiser-manage-group";
     public static String updateGroupStatus_url= base_url+"/advertiser/update-advertiser-manage-group-status";
     public static String deleteGroup_url      = base_url+"/advertiser/delete-advertiser-manage-group";
     
     public static String insertUser_url       = base_url+"/advertiser/insert-advertiser";
     public static String listUser_url         = base_url+"/advertiser/list-advertiser-manage-users";
     public static String getUser_url          = base_url+"/advertiser/get-advertiser-manage-user";
     public static String updateUser_url       = base_url+"/advertiser/update-advertiser-manage-user";
     public static String resendInviteUser_url = base_url+"/advertiser/advertiser-manage-user-resend-invite";
     public static String updateUserStatus_url = base_url+"/advertiser/update-advertiser-manage-user-status";
     public static String deleteUser_url       = base_url+"/advertiser/delete-advertiser-manage-user";
     
/*-----------------------------------------------------------Advertiser lead-------------------------------------------------------------*/     
     
     public static String insertAdvertiserLead = base_url+"/advertiser/insert-lead";
     public static String listAdvertiserLead   = base_url+"/advertiser/list-advertiser-leads";
     public static String getAdvertiserLead    = base_url+"/advertiser/get-advertiser-lead";
     public static String updateAdvertiserLead = base_url+"/advertiser/update-lead";
     public static String deleteAdvertiserLead = base_url+"/advertiser/delete-advertiser-lead";
     
     
/*-----------------------------------------------------------Publisher api's-------------------------------------------------------------*/     
     
    public static String insertpublisher_url   = base_url+"/publisher/insert-publisher";
    public static String getpublisher_url      = base_url+"/publisher/get-publisher-profile";
    public static String listpublisher_url     = base_url+"/publisher/list-publishers";
    public static String updatepublisher_url   = base_url+"/publisher/update-publisher-profile";
    
    
    
/*----------------------------------------------------------Publisher user and group api's--------------------------------------------------------*/	
    
    public static String insertPublisherGroup_url      = base_url+"/publisher/insert-publisher-group";
    public static String listPublisherGroup_url        = base_url+"/publisher/list-publisher-manage-groups";
    public static String getPublisherGroup_url         = base_url+"/publisher/get-publisher-manage-group";
    public static String updatePublisherGroup_url      = base_url+"/publisher/update-publisher-manage-group";
    public static String updatePublisherGroupStatus_url= base_url+"/publisher/update-publisher-manage-group-status";
    public static String deletePublisherGroup_url      = base_url+"/publisher/delete-publisher-manage-group";
    
    public static String insertPublisherUser_url       = base_url+"/publisher/insert-publisher";
    public static String listPublisherUser_url         = base_url+"/publisher/list-publisher-manage-users";
    public static String getPublisherUser_url          = base_url+"/publisher/get-publisher-manage-user";
    public static String updatePublisherUser_url       = base_url+"/publisher/update-publisher-manage-user";
    public static String resendInvitePublisherUser_url = base_url+"/publisher/publisher-manage-user-resend-invite";
    public static String updatePublisherUserStatus_url = base_url+"/publisher/update-publisher-manage-user-status";
    public static String deletePublisherUser_url       = base_url+"/publisher/delete-publisher-manage-user";
    
    
/*-----------------------------------------------------------Publisher lead-------------------------------------------------------------*/     
    
    public static String insertPublisherLead = base_url+"/publisher/insert-lead";
    public static String listPublisherLead   = base_url+"/publisher/list-publisher-leads";
    public static String getPublisherLead    = base_url+"/publisher/get-publisher-lead?inserted_id=1";
    public static String updatePublisherLead = base_url+"/publisher/update-lead?inserted_id=1";
    public static String deletePublisherLead = base_url+"/publisher/delete-publisher-lead?inserted_id=1";
    
  
    
/*------------------------------------------------------------Creative groups---------------------------------------------------------------*/    
    
   public static String insertCreativeGroup   = base_url+"/creatives/insert-creative-group"; 
   public static String listCreativeGroup     = base_url+"/creatives/list-creative-groups";
   public static String getSingleCreativeGroup= base_url+"/creatives/get-creative-group";
   public static String updateCreativeGroup   = base_url+"/creatives/update-creative-group";
   public static String deleteCreativeGroup   = base_url+"/creatives/delete-creative-group";
    

/*--------------------------------------------------------------Creatives---------------------------------------------------------------------*/ 
    
    
    public static String insertCreatives     = base_url+"/creatives/insert-creative";
    public static String listCreatives       = base_url+"/creatives/list-creatives";
    public static String getCreatives        = base_url+"/creatives/get-creative";
    public static String updateCreatives     = base_url+"/creatives/update-creative";
    public static String updateCreativeStatus= base_url+"/creatives/update-creative-active-status";	
    public static String deleteCreatives     = base_url+"/creatives/delete-creative-template";
    
    
/*------------------------------------------------------------Suppressions--------------------------------------------------------------------------*/  
    
   
    public static String insertAdvertiserSuppression  = base_url+"/suppression/insert-advertiser-suppression";
    public static String getSuppression               = base_url+"/suppression/get-suppression";
    public static String downloadSuppression          = base_url+"/suppression/download-suppression";
    public static String suppressionList              = base_url+"/suppression/list-suppression";
    public static String getSuppressionStatus         = base_url+"/suppression/get-suppression-status";	
    public static String getUnsubscribeCount          = base_url+"/suppression/get-unsubscribe-count";  
    public static String suppressionRefresh           = base_url+"/suppression/refresh-suppression";
    
    

    
    
    
    
    
    
    
    
    
    
}
