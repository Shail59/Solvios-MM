package mindFullMarket.utility;

import mindFullMarket.basePackage.BaseInit;

public class MyLibrary extends BaseInit {

	public static void signIn(String EmailAdd, String psw) {
		
		isElementPresent("lnk_Login_linkText").click();
		isElementPresent("ip_email_id").click();
		isElementPresent("ip_pass_id").click();
		isElementPresent("btn_signin_id").click();

	}
	
	

	public static void signOut() {
		
		isElementPresent("lnk_signOut_xpath").clear();
		
	}

	
}
