package mindFullMarket.module1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mindFullMarket.utility.MyLibrary;

public class ValidateSignIN extends ParentModule1 {
	
	@Test(dataProvider = "getTestData")
	
	public void testUpdateme(String email, String pass) {
		
		driver.get(sitedata.getProperty("url"));
		MyLibrary.signIn(email, pass);
		
		boolean checkReasult;
		
		try {
			
			checkReasult = isElementPresent("lnk_jigeshshah_class").isDisplayed();
			checkReasult = isElementPresent("btn_signout_xpath").isDisplayed();
			
		}catch (Exception e) {
			
			checkReasult = false;
			
		}
		
		if (checkReasult) {
			
			System.out.println("Use is logged in successfully");
			MyLibrary.signOut();
			
		}else {
			
			System.out.println("Invalid Email Address or Passward");
			
		}
		
		
	}
	
	
	@DataProvider
	
	public Object[][] getTestData() {
		
		return MyLibrary.getTestDataFromXLSX(module1, "ValidateSignIn");
		
		
	}
	
	
	
	
	
	
	
	
}
