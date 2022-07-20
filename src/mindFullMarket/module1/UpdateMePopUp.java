package mindFullMarket.module1;

import mindFullMarket.utility.MyLibrary;

public class UpdateMePopUp extends ParentModule1 {

	public void testValidateUser() {
		
		driver.get(sitedata.getProperty("url"));
		
		try {
			
			isElementPresent("ip_name_xpath").sendKeys("");
			
		}catch (Exception e) {
			
			System.out.println("Enter valid Name");
			
		}  
		

		try {
			
			isElementPresent("ip_emailpop_id").sendKeys("");
			
		}catch (Exception e) {
			
			System.out.println("Enter valid Email");
			
		}
		
		

		try {
			
			isElementPresent("btn_Updateme_xpath").click();
			
		}catch (Exception e) {
			
			System.out.println("Name or EmailAdress is not valid");
			
		}
		
		
		
		
		
		
		
		
		
	}	
	
}
