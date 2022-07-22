package mindFullMarket.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

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
	
	
	
	public static  Object[][] getTestDataFromXLSX(ExcellFileReader data, String sheetName){
		
		int rows = data.totalRow(sheetName);
		int cols = data.totalColumn(sheetName);
		
		Object[][] myData = new Object [rows-1][cols];
		
		for(int row=1; row<rows; row++) {
			
			for (int col=0; col<cols; col++) {
				
			}
			
		}
		
		return myData;
		
	}
	
	
	
	
	public static boolean checkTestSuitExecutionMode(ExcellFileReader data, String sheetName, String moduleName) {
		
		int cols = data.totalColumn(sheetName);
		int rows = data.totalRow(sheetName);
		
		for (int row=1; row<rows; row++) {
			
			String mName = data.getData(sheetName, row, 0);
			
			if (mName.equalsIgnoreCase(moduleName)) {
				
				String exeMode = data.getData(sheetName, row, 2);
				
				if (exeMode.equalsIgnoreCase("Y"))
				
					return true;
				else
					return false;
			}
			
		}
		return false;
				
	}
	
	
	
	

	public static boolean checkTestCasesExecutionMode(ExcellFileReader data, String sheetName, String tcName) {
		
		int cols = data.totalColumn(sheetName);
		int rows = data.totalRow(sheetName);
		
		for (int row=1; row<rows; row++) {
			
			String testcaseName = data.getData(sheetName, row, 0);
			
			if (testcaseName.equalsIgnoreCase(tcName)) {  
				
				String exeMode = data.getData(sheetName, row, 2);
				
				if (exeMode.equalsIgnoreCase("Y"))
				
					return true;
				else
					return false;
			}
			
		}
		return false;
				
	}
	
	
	
	
	
	
	public static String getScreenshot(String imageName, WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\src\\mindFullMarket\\screenShorts"+imageName+System.currentTimeMillis()+".png";
				
		File destination = new File (path);			
		
		try {
			
			FileHandler.copy(scrFile, destination);
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return path;
	}
	
	
	
	
	
	
	
	
	
}
