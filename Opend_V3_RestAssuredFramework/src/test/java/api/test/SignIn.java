package api.test;


import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.HashMap;

public class SignIn 
{

	public static String token;
	
	
	@Test(priority = 1)
	public void signin()
	{
		HashMap<String,String> data = new HashMap<String,String>();
		data.put("email", "admin@opend.com");
		data.put("password", "1234");
		data.put("browser", "chrome");
		data.put("os", "ubuntu");
		data.put("device", "dell");
		data.put("login_type", "1");
		
		
		Response response =given()
		
		.contentType("application/json")
		   .body(data)
		
		.when()
		   .post("https://v3opend-api.tech-active.com/auth/login");
		
		JSONObject json=new JSONObject(response.asString());
	    token = json.getJSONObject("data").getString("access_token");
	    System.out.println(token);
	}
	
	
	
}
