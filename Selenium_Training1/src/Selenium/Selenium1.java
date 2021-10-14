package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	    public static void main(String[] args) {
	    	WebDriver driver;
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver(); 
	    	 //Using get() method to open a webpage
	    	 
	    	driver.get("https://www.amazon.com/");
	    	 
			driver.manage().window().maximize();
		}
	}


