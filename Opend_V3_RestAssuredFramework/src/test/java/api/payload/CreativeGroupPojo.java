package api.payload;

public class CreativeGroupPojo 
{

		  private int advertiser_id;
		  private int inserted_id;
		  private int group_id;
		  private String group_name;
		  
		  
	    public int getAdvertiser_id() 
	    {
			return advertiser_id;
		}
	    
		public void setAdvertiser_id(int advertiser_id)
		{
			this.advertiser_id = advertiser_id;
		}
		
		public int getInserted_id()
		{
			return inserted_id;
		}
		
		public void setInserted_id(int inserted_id) 
		{
			this.inserted_id = inserted_id;
		}
		
		public int getGroup_id() 
		{
			return group_id;
		}
		
		public void setGroup_id(int group_id)
		{
			this.group_id = group_id;
		}
		
		public String getGroup_name() 
		{
			return group_name;
		}
		
		public void setGroup_name(String group_name)
		{
			this.group_name = group_name;
		}
		
}
