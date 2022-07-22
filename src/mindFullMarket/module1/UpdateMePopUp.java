package mindFullMarket.module1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mindFullMarket.utility.MyLibrary;


public class UpdateMePopUp extends ParentModule1 {
	
	@Test(dataProvider = "getTestData")

	public void testValidateUser(String name, String email) {
		
		driver.get(sitedata.getProperty("url"));
		
				
			isElementPresent("ip_name_xpath").sendKeys(name);
			
		
			isElementPresent("ip_emailpop_id").sendKeys(email);
			
		

		try {
			
			isElementPresent("btn_Updateme_xpath").click();
			
		}catch (Exception e) {
			
			System.out.println("Name or EmailAdress is not valid");
			
		}
		
		
	}	
	
	
	@DataProvider
	public Object[][] getTestData() {
		
		return MyLibrary.getTestDataFromXLSX(module1, "UpdateMePopUp");
		
		
	}
	
	
	
	
	
	
}
