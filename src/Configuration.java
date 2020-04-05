/**
 * 
 */
package com.base;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.utility.Wb_function;

/**
 * @author Imtiaz
 * Driver setting,
 * browser open,
 * Web page maximize
 * wait pack
 *  delete cookies 
 * browser close,  
 *
 */
public class Configuration extends Wb_function {
	
	@BeforeSuite
	public void beforesuite() {
		application_log.info("Started the suite");
		//System.out.println("Started the suite");
	}
	@AfterSuite
	public void aftersuite() {
		application_log.info("Ened the suite");
		//System.out.println("Ened the suite");
	}
	//@Parameters({"browser","url"})
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void browseropen(String browser_name ,String url) {
		application_log.info("Start the browser");
		//System.out.println("Start the browser");
		
	if(driver == null) {
		if(browser_name.equalsIgnoreCase("firefox")) {
			application_log.info(browser_name);
			//System.out.println(browser_name);
			//System.out.println(driver);
			//System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir"+"//DRIVER//geckodriver.exe"));
			System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Modular_driven_framework//DRIVER//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chromer.driver",System.getProperty("user.dir"+"//DRIVER//chromedriver.exe"));
			driver = new ChromeDriver();
		}
		else {
			application_log.info("Browser not open ");
			//System.out.println("Browser not open ");
		}
		
	
		
	//Maximize window using webdriver
	maximize();
	//delete All the  cookies
		
	cookies();
	//using implicit wait for page loading
	waitTillPageLoad(30);
	}
	else {
		throw new IllegalArgumentException("the browser type is undefined");
	}
	//Launch the site
	driver.get(url);
	application_log.info("Facebook webpage open successfully");
	//System.out.println("Facebook webpage open successfully");

}

	@AfterMethod
	public void closedriver() {
		//Close the current window using close() method
		application_log.info("Close the browser");
		//System.out.println("Close the browser");
	    driver.close();
		
	}
}