package api.test;

import org.testng.annotations.BeforeClass;

import api.payload.SuppressionPojo;

public class SuppressionTest
{

	SuppressionPojo addAdvertiserSuppression;
	
	
	@BeforeClass
	public void suppressionSetup()
	{
		addAdvertiserSuppression=new SuppressionPojo();
		addAdvertiserSuppression.setFile("/home/active30/Downloads/HR(mails-50).csv");
		addAdvertiserSuppression.setSuppression_list_name("advertiser suppression");
		addAdvertiserSuppression.setAdvertiser_id(1);
		addAdvertiserSuppression.setAdvertiser_user_id(1);
		addAdvertiserSuppression.setUpload_type(1);
		addAdvertiserSuppression.setMap_column("email");
		
	}
	
}
