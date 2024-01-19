package api.payload;

import java.util.List;

public class CreativesPojo 
{
    
	 private int inserted_id;
	 private int advertiser_id;
	 private int template_id;
	 private String template_name;
	 private String pre_header_text;
	 private int group_id;
	 private String template_body;
	 private String editor_type;
	 private String cbSavedState;
	 private String cbSavedStatus;
	 private int client_type;
	 private List<String> selected_urls;
	
	 
	 
    public int getInserted_id()
    {
		return inserted_id;
	}
   
	public void setInserted_id(int inserted_id) 
	{
		this.inserted_id = inserted_id;
	}
	
	public int getAdvertiser_id() 
	{
		return advertiser_id;
	}
	
	public void setAdvertiser_id(int advertiser_id)
	{
		this.advertiser_id = advertiser_id;
	}
	
	public int getTemplate_id() 
	{
		return template_id;
	}
	
	public void setTemplate_id(int template_id) 
	{
		this.template_id = template_id;
	}
	
	public String getTemplate_name() 
	{
		return template_name;
	}
	
	public void setTemplate_name(String template_name)
	{
		this.template_name = template_name;
	}
	
	public String getPre_header_text() 
	{
		return pre_header_text;
	}
	
	public void setPre_header_text(String pre_header_text) 
	{
		this.pre_header_text = pre_header_text;
	}
	
	public int getGroup_id() 
	{
		return group_id;
	}
	
	public void setGroup_id(int group_id)
	{
		this.group_id = group_id;
	}
	
	public String getTemplate_body() 
	{
		return template_body;
	}
	
	public void setTemplate_body(String template_body)
	{
		this.template_body = template_body;
	}
	
	public String getEditor_type() 
	{
		return editor_type;
	}
	
	public void setEditor_type(String editor_type) 
	{
		this.editor_type = editor_type;
	}
	
	public String getCbSavedState() 
	{
		return cbSavedState;
	}
	
	public void setCbSavedState(String cbSavedState) 
	{
		this.cbSavedState = cbSavedState;
	}
	
	public String getCbSavedStatus() 
	{
		return cbSavedStatus;
	}
	
	public void setCbSavedStatus(String cbSavedStatus) 
	{
		this.cbSavedStatus = cbSavedStatus;
	}
	
	public int getClient_type() 
	{
		return client_type;
	}
	
	public void setClient_type(int client_type) 
	{
		this.client_type = client_type;
	}
	
	public List<String> getSelected_urls() 
	{
		return selected_urls;
	}

	public void setSelected_urls(List<String> selected_urls)
	{
		this.selected_urls = selected_urls;
	}
	
	
}
