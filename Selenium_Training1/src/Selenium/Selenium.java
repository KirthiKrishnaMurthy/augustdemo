package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[] args) {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	}

}
