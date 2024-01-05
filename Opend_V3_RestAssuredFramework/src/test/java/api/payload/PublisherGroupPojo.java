package api.payload;

public class PublisherGroupPojo 
{

//	   public String ModuleKeys; 


	    public int group_id;
	    private String group_name;
	    public int publisher_id;
		  
	    private PublisherGroupPojo dashboard;
	    private PublisherGroupPojo profile;
	    private PublisherGroupPojo company_info;
	    private PublisherGroupPojo invoice;
	    private PublisherGroupPojo payments;
	    private PublisherGroupPojo manage_user;
	    private PublisherGroupPojo groups;
	    private PublisherGroupPojo suppression_list;
	    private PublisherGroupPojo help_support;
	    private PublisherGroupPojo sub_module1;
	    private PublisherGroupPojo sub_module2;

	    public String module_main;
	    public String module;
	    public boolean View;
	    public boolean Add;
	    public boolean Edit;
	    public boolean Delete;
	    public boolean Import;
	    public boolean Export;
	    
	    
	    
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
		public int getPublisher_id() 
		{
			return publisher_id;
		}
		public void setPublisher_id(int publisher_id) 
		{
			this.publisher_id = publisher_id;
		}
		public PublisherGroupPojo getDashboard() 
		{
			return dashboard;
		}
		public void setDashboard(PublisherGroupPojo dashboard) 
		{
			this.dashboard = dashboard;
		}
		public PublisherGroupPojo getProfile() 
		{
			return profile;
		}
		public void setProfile(PublisherGroupPojo profile) 
		{
			this.profile = profile;
		}
		public PublisherGroupPojo getCompany_info() 
		{
			return company_info;
		}
		public void setCompany_info(PublisherGroupPojo company_info) 
		{
			this.company_info = company_info;
		}
		public PublisherGroupPojo getInvoice()
		{
			return invoice;
		}
		public void setInvoice(PublisherGroupPojo invoice) 
		{
			this.invoice = invoice;
		}
		public PublisherGroupPojo getPayments() 
		{
			return payments;
		}
		public void setPayments(PublisherGroupPojo payments) 
		{
			this.payments = payments;
		}
		public PublisherGroupPojo getManage_user() 
		{
			return manage_user;
		}
		public void setManage_user(PublisherGroupPojo manage_user) 
		{
			this.manage_user = manage_user;
		}
		public PublisherGroupPojo getGroups() 
		{
			return groups;
		}
		public void setGroups(PublisherGroupPojo groups)
		{
			this.groups = groups;
		}
		
		public PublisherGroupPojo getSuppression_list() 
		{
			return suppression_list;
		}
		public void setSuppression_list(PublisherGroupPojo suppression_list) 
		{
			this.suppression_list = suppression_list;
		}
		public PublisherGroupPojo getHelp_support() 
		{
			return help_support;
		}
		public void setHelp_support(PublisherGroupPojo help_support)
		{
			this.help_support = help_support;
		}
		public PublisherGroupPojo getSub_module1() 
		{
			return sub_module1;
		}
		public void setSub_module1(PublisherGroupPojo sub_module1) 
		{
			this.sub_module1 = sub_module1;
		}
		public PublisherGroupPojo getSub_module2() 
		{
			return sub_module2;
		}
		public void setSub_module2(PublisherGroupPojo sub_module2)
		{
			this.sub_module2 = sub_module2;
		}
		public String getModule_main() 
		{
			return module_main;
		}
		public void setModule_main(String module_main)
		{
			this.module_main = module_main;
		}
		public String getModule()
		{
			return module;
		}
		public void setModule(String module) 
		{
			this.module = module;
		}
		public boolean getView()
		{
			return View;
		}
		public void setView(boolean view)
		{
			View = view;
		}
		public boolean getAdd()
		{
			return Add;
		}
		public void setAdd(boolean add) 
		{
			Add = add;
		}
		public boolean getEdit() {
			return Edit;
		}
		public void setEdit(boolean edit) 
		{
			Edit = edit;
		}
		public boolean getDelete() {
			return Delete;
		}
		public void setDelete(boolean delete)
		{
			Delete = delete;
		}
		public boolean getImport() {
			return Import;
		}
		public void setImport(boolean import1) 
		{
			Import = import1;
		}
		public boolean getExport() 
		{
			return Export;
		}
		public void setExport(boolean export) 
		{
			Export = export;
		}
		

	
	    
	    
	}
