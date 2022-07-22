package mindFullMarket.module3;

import java.util.concurrent.TimeUnit;

import mindFullMarket.utility.MyLibrary;

public class PaymentGateWay extends ParentModule3 {

	public static void paymentGateWay () throws Exception {
		
		driver.get(sitedata.getProperty("url"));
		
		MyLibrary.signIn("jigesh@sjainfosolutions.com", "aakash104");
		
		Thread.sleep(7000);		
		isElementPresent("lnk_newarrivalprod_xpath").click();		
		Thread.sleep(2000);
		isElementPresent("btn_submit1_id").click();
		
		driver.navigate().back();
		
		Thread.sleep(7000);
		
		isElementPresent("lnk_productonhomepage_xpath").click();		
		Thread.sleep(2000);		
		isElementPresent("dd_product_xpath").click();		
		isElementPresent("ip_qut_xpath").sendKeys("2");		
		isElementPresent("btn_submit_id").click();
		
		isElementPresent("btn_addtocart_class").click();
		isElementPresent("btn_procidtocheckout_id").click();
		
		
		boolean qut;
		
		try {
			
		 qut = isElementPresent("tt_qutcheck_xpath").isDisplayed();

			
		}catch (Exception e) {
			
			System.out.println("Element is not present");
		}
		
		if(qut=true) {
			
			System.out.println("successfully added 1 qut.");
			
		}else {
			
			System.out.println("1 qut is not displayed");
		
		} 
		
		
		boolean qut1;
		
		try {
			
			qut1 = isElementPresent("tt_qut_xpath").isDisplayed();

			
		}catch (Exception e) {
			
			System.out.println("Element is not present");
		}
		
		
		if(qut1=true) {
			
			System.out.println("successfully added 12 qut.");
			
		}else {
			
			System.out.println("12 qut is not displayed");
			
		}
		
		
		
	}

	
	
	
	
	
	
}
