package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "D:\\Mani Teja\\Udemy Selenium\\SeleniumTraining\\Prerequisites\\geckodriver.exe");
//		//Ctrl+Shift+O shortcut to import drivers
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
		//System.setProperty("webdriver.chrome.driver", "D:\\Mani Teja\\Udemy Selenium\\SeleniumTraining\\Prerequisites\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
		/*
		 * System.setProperty(
		 * "webdriver.ie.driver","D:\\Mani Teja\\Udemy Selenium\\SeleniumTraining\\Prerequisites\\IEDriverServer.exe"
		 * ); InternetExplorerDriver driver= new InternetExplorerDriver();
		 * driver.get("https://www.google.com");
		 */
		 
//		System.setProperty("webdriver.edge.driver","D:\\Mani Teja\\Udemy Selenium\\SeleniumTraining\\Prerequisites\\MicrosoftWebDriver.exe"); 
//		  EdgeDriver driver= new EdgeDriver();
//		  driver.get("https://www.google.com");

	}

}
