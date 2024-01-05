package api.payload;

public class PublisherPojo 
{
	
/*-----------------------------------------------publisher company information-------------------------------------*/
	
	private String business_name;
	private String website;
	private String vat;
	private String country;
	private String city;
	private String postal_code;
	private String address;
	private String ico_no;
	public int HoidL;
	private String dma_reg_no;
	private String time_zone;
	

	
	public int getHoidL() 
	{
		return HoidL;
	}
	
	public void setHoidl(int HoidL) 
	{
		this.HoidL = HoidL;
	}
	
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
	
	public String getIco_no() 
	{
		return ico_no;
	}
	
	public void setIco_no(String ico_no) 
	{
		this.ico_no = ico_no;
	}
	
	public String getDma_reg_no() 
	{
		return dma_reg_no;
	}
	
	public void setDma_reg_no(String dma_reg_no) 
	{
		this.dma_reg_no = dma_reg_no;
	}
	
	public String getTime_zone()
	{
		return time_zone;
	}
	
	public void setTime_zone(String time_zone) 
	{
		this.time_zone = time_zone;
	}
	
	
/*-----------------------------------------------publisher user information-------------------------------------*/	
	
	private String first_name;
	private String last_name;
	private String job_title;
	private String email_id;
	private String mobile;
	private int group_id;
	
	
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
	
	public int getGroup_id() 
	{
		return group_id;
	}
	
	public void setGroup_id(int getgroupid)
	{
		this.group_id = getgroupid;
	}
	
/*-----------------------------------------------publisher billing information-------------------------------------*/	
	
	private String countryid;
	private String bank;
	private String swift_sort;
	private String account_ibac;
	
	
	public String getCountryid() 
	{
		return countryid;
	}
	
	public void setCountryid(String countryid)
	{
		this.countryid = countryid;
	}
	
	public String getBank() 
	{
		return bank;
	}
	
	public void setBank(String bank) 
	{
		this.bank = bank;
	}
	
	public String getSwift_sort() 
	{
		return swift_sort;
	}
	
	public void setSwift_sort(String swift_sort) 
	{
		this.swift_sort = swift_sort;
	}
	
	public String getAccount_ibac()
	{
		return account_ibac;
	}
	
	public void setAccount_ibac(String account_ibac)
	{
		this.account_ibac = account_ibac;
	}
	
	
	
	private PublisherPojo publisher_company;
	private PublisherPojo publisher_user;
	private PublisherPojo publisher_billing_user;
	
	
	public PublisherPojo getPublisher_company() 
	{
		return publisher_company;
	}
	
	public void setPublisher_company(PublisherPojo publisher_company)
	{
		this.publisher_company = publisher_company;
	}
	
	public PublisherPojo getPublisher_user() 
	{
		return publisher_user;
	}
	
	public void setPublisher_user(PublisherPojo publisher_user) 
	{
		this.publisher_user = publisher_user;
	}
	
	public PublisherPojo getPublisher_billing_user()
	{
		return publisher_billing_user;
	}
	
	public void setPublisher_billing_user(PublisherPojo publisher_billing_user)
	{
		this.publisher_billing_user = publisher_billing_user;
	}
	

	
}
