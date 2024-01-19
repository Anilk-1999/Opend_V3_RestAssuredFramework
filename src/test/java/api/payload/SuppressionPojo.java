package api.payload;

public class SuppressionPojo 
{

	private String file;
	private String suppression_list_name;
	private int advertiser_id;
	private int advertiser_user_id;
	private int upload_type;
	private String map_column;
	
	
	
	public String getFile() 
	{
		return file;
	}
	
	public void setFile(String file) 
	{
		this.file = file;
	}
	
	public String getSuppression_list_name() 
	{
		return suppression_list_name;
	}
	
	public void setSuppression_list_name(String suppression_list_name) 
	{
		this.suppression_list_name = suppression_list_name;
	}
	
	public int getAdvertiser_id() 
	{
		return advertiser_id;
	}
	
	public void setAdvertiser_id(int advertiser_id) 
	{
		this.advertiser_id = advertiser_id;
	}
	
	public int getAdvertiser_user_id() 
	{
		return advertiser_user_id;
	}
	
	public void setAdvertiser_user_id(int advertiser_user_id) 
	{
		this.advertiser_user_id = advertiser_user_id;
	}
	
	public int getUpload_type() 
	{
		return upload_type;
	}
	
	public void setUpload_type(int upload_type) 
	{
		this.upload_type = upload_type;
	}
	
	public String getMap_column() 
	{
		return map_column;
	}
	
	public void setMap_column(String map_column) 
	{
		this.map_column = map_column;
	}
	
	
}
