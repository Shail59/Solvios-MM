package mindFullMarket.basePackage;


import java.io.FileInputStream;

/*
1. Initialize and load properties file(SiteData & ObjectStorage) 
2. Initialize webDriver and Launch Browser
3. Max. browser window
4. Define TimeUnit
5. Create Object of ExcellFileReader class
6.Define Logger
7. Create isElementPresent Method
*/


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import mindFullMarket.utility.ExcellFileReader;


public class BaseInit {

	
	public static WebDriver driver;
	public static Logger logs;
	public static Properties sitedata;
	public static Properties objectstorage;
	public static ExcellFileReader suit;
	public static ExcellFileReader module1;
	public static ExcellFileReader module2;
	
	
	public void startUp() throws Exception {
		
		sitedata = new Properties();
		FileInputStream fi = new FileInputStream("./src/mindFullMarket/propertiesData/SiteData.properties");
		sitedata.load(fi); 
		

		objectstorage = new Properties();
		FileInputStream fi1 = new FileInputStream("./src/mindFullMarket/propertiesData/ObjectStorage.properties");
		objectstorage.load(fi1);
		
		
		String browserVal = sitedata.getProperty("browser");
		
		if(browserVal.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "");
			//driver = new FirefoxDriver;
			
		}else if (browserVal.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium updated version\\Chrome_Deiver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else {
			
			System.out.println("No Browser Defined...");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		suit = new ExcellFileReader("./src/mindFullMarket/XLSfiles/TestSuit");
		module1 = new ExcellFileReader("./src/mindFullMarket/XLSfiles/Module1");
		module2 = new ExcellFileReader("./src/mindFullMarket/XLSfiles/Module2");

		
	}
		  
	public static WebElement isElementPresent(String propKey) {
		
		try {
			
			if (propKey.contains("xpath")) {
				
				return driver.findElement(By.xpath(objectstorage.getProperty(propKey)));
				
			}else if (propKey.contains("linkText")) {
				
				return driver.findElement(By.xpath(objectstorage.getProperty(propKey)));
				
			}else if (propKey.contains("id")) {
				
				return driver.findElement(By.xpath(objectstorage.getProperty(propKey)));
				
			}else if (propKey.contains("name")) {
				
				return driver.findElement(By.xpath(objectstorage.getProperty(propKey)));
				
			}else {
				
				System.out.println("No browser define in property file");
				
			}
			
			
		}catch (Exception e) {
			
			
		}
		
		return null;
		
	}
	
}
