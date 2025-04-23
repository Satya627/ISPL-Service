package Satyatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class GetMytebs {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver",  "C:/Users/Satyadev Kumar/Downloads/chromedriver");
		
		WebDriver driver = new WebDriver();
		
		driver.get("https://sm-rbac-dashboard.azurewebsites.net/home/rbac-users");
		
		
		driver.findElement(By.id(null)).sendKeys("");
		
	}

}
