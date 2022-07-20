package mindFullMarket.module1;

import mindFullMarket.utility.MyLibrary;

public class ValidateSignIN extends ParentModule1 {
	
	public void testUpdateme() {
		
		driver.get(sitedata.getProperty("url"));
		MyLibrary.signIn("jigesh@sjainfosolutions.com", "aakash104");
		
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
	
	
	
}
