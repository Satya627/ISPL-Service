package Satyatest;


		import org.openqa.selenium.WebDriver;

import io.appium.java_client.chromium.ChromiumDriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import java.io.File;
		import java.io.IOException;
import java.net.URI;

		public class ScreenshotExample {
		    private static final String FileUtils = null;
			private static final Capabilities Options = null;

			public static void main(String[] args) throws IOException {
		        WebDriver driver = new ChromiumDriver(new URI("http://192.168.8.39:4723").toURL(), Options);
		        driver.get("https://example.com");

		        // Take screenshot
		        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        File destFile = new File("screenshots/example.png");
		        FileUtils.copyFile(srcFile, destFile)args;

		        driver.quit();
		    }
		
		
	}


