package api.payload;

public class AdvertiserPojo
{


	//company information
	

	private String business_name;
	private String website;
	private String vat;
	private String country;
	private String city;
	private String postal_code;
	private String address;
	private String functional_area;
	private String industry;
	private String dma_reg_no;
	private String aid;
	private String time_zone;
	
	
	
	public String getBusiness_name() 
	{
		return business_name;
	}
	
	public void setBusiness_name(String business_name) 
	{
		this.business_name = business_name;
	}
	
	public String getWebsite() 
	{
		return website;
	}
	
	public void setWebsite(String website) 
	{
		this.website = website;
	}
	
	public String getVat() 
	{
		return vat;
	}
	
	public void setVat(String vat) 
	{
		this.vat = vat;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getPostal_code() 
	{
		return postal_code;
	}
	
	public void setPostal_code(String postal_code) 
	{
		this.postal_code = postal_code;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public String getFunctional_area() 
	{
		return functional_area;
	}
	
	public void setFunctional_area(String functional_area) 
	{
		this.functional_area = functional_area;
	}
	
	public String getIndustry() 
	{
		return industry;
	}
	
	public void setIndustry(String industry) 
	{
		this.industry = industry;
	}
	
	public String getDma_reg_no() 
	{
		return dma_reg_no;
	}
	
	public void setDma_reg_no(String dma_reg_no) 
	{
		this.dma_reg_no = dma_reg_no;
	}
	
	public String getAid() 
	{
		return aid;
	}
	
	public void setAid(String aid)
	{
		this.aid = aid;
	}
	
	public String getTime_zone() 
	{
		return time_zone;
	}
	
	public void setTime_zone(String time_zone) 
	{
		this.time_zone = time_zone;
	}
	
	
	
	
	//User informations
	
	private String first_name;
	private String last_name;
	private String job_title;
	private String email_id;
	private String mobile;
	private int group_id;
	
	
	public int getGroup_id() 
	{
		return group_id;
	}

	public void setGroup_id(int group_id) 
	{
		this.group_id = group_id;
	}

	public String getFirst_name() 
	{
		return first_name;
	}
	
	public void setFirst_name(String first_name) 
	{
		this.first_name = first_name;
	}
	
	public String getLast_name() 
	{
		return last_name;
	}
	
	public void setLast_name(String last_name) 
	{
		this.last_name = last_name;
	}
	
	public String getJob_title() 
	{
		return job_title;
	}
	
	public void setJob_title(String job_title) 
	{
		this.job_title = job_title;
	}
	
	public String getEmail_id() 
	{
		return email_id;
	}
	
	public void setEmail_id(String email_id) 
	{
		this.email_id = email_id;
	}
	
	public String getMobile()
	{
		return mobile;
	}
	
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	
	//advertiser objects
	
	private AdvertiserPojo advertiser_company;
	private AdvertiserPojo advertiser_user;
	private AdvertiserPojo advertiser_billing_user;
	
	
	public AdvertiserPojo getAdvertiser_company() 
	{
		return advertiser_company;
	}
	
	public void setAdvertiser_company(AdvertiserPojo advertiser_company) 
	{
		this.advertiser_company = advertiser_company;
	}

	public AdvertiserPojo getAdvertiser_user() 
	{
		return advertiser_user;
	}

	public void setAdvertiser_user(AdvertiserPojo advertiser_user) 
	{
		this.advertiser_user = advertiser_user;
	}

	public AdvertiserPojo getAdvertiser_billing_user() 
	{
		return advertiser_billing_user;
	}

	public void setAdvertiser_billing_user(AdvertiserPojo advertiser_billing_user) 
	{
		this.advertiser_billing_user = advertiser_billing_user;
	}




	

	
	

	
	
}
