package Satyatest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class IndofastService2 {

  private static final IndofastService2 ScrollUtils = null;
private Object actions;

@Test
  public void AppiumTestTest() throws MalformedURLException, URISyntaxException, InterruptedException {
	  // Please Select the tool to Automate
	  UiAutomator2Options Options = new UiAutomator2Options();
	  
	  // Select the device 
	  Options.setDeviceName("Satyadev");
	  
	  // Download the APK from my laptop
	  Options.setApp("C://Users\\Satyadev Kumar\\eclipse-workspace\\Appium\\src\\test\\java\\app\\app-debug 20.apk");
	  
	  // Where is my globle appium running
	  AndroidDriver driver = new AndroidDriver(new URI("http://192.168.210.106:4723/").toURL(), Options);
	  
	  //Thread.sleep(1000);
	  // driver.wait(100);
	  // Wait time Applied to hold the script for while
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
      driver.findElement(By.id("android:id/text1")).click();
	  // User to click on Language Dropdown
    driver.findElement(By.className("android.widget.ImageView")).click();
      
      // User to select the Hindi language 
	  driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\'android:id/text1\' and @text='Hindi']")).click();
	  
	   // User to click on language dropdown
	  driver.findElement(By.className("android.widget.ImageView")).click();
	  
	  // user to click on English
	  driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\'android:id/text1\' and @text='English']")).click();
	  
	   //User to click on Mobile No.
	  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/mobile_number']")).click();
	  
	 //Please click on Exteranl NFC Device check box.
	  driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\'com.indofast.service.dev:id/chkNFC\']")).click();
	  
	  //User to provide Mobile no.
	  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/mobile_number']")).sendKeys("8052340544");
	  
	  //User to click on Login CTA
      driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.indofast.service.dev:id/login_btn\']")).click();
      
      //User to click on Otp Box.
     driver.findElement(By.id("com.indofast.service.dev:id/otp_code")).click();
     
     // User to provide the OTP
     driver.findElement(By.id("com.indofast.service.dev:id/otp_code")).sendKeys("4268");
     
     // User need to provide the Permission.
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.android.permissioncontroller:id/permission_allow_foreground_only_button\']")).click();
    // Assert.assertEquals(false, null);
     
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.android.permissioncontroller:id/permission_allow_foreground_only_button\']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.android.permissioncontroller:id/permission_allow_button\']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.android.permissioncontroller:id/permission_allow_button\']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.android.permissioncontroller:id/permission_allow_button\']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.android.permissioncontroller:id/permission_allow_all_button\']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.indofast.service.dev:id/grant_btn\']")).click();
     driver.findElement(By.id("android:id/button1")).click();
     
     //User to Provide VIN No. for search 
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\'com.indofast.service.dev:id/vehicle_vin_edit_text\']")).sendKeys("MD9RPSK22FP6R5088");
     
     
     //Ticketing 
     driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\'Ticket\']")).click();
     driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\'com.indofast.service.dev:id/btnCreateTicket\']")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'android:id/button2\']")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\'com.indofast.service.dev:id/vin\']")).sendKeys("MD9RPSK22FP6R5088");
     
     // Post Vin search
     driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\'com.indofast.service.dev:id/etSubject\']")).sendKeys("Battery Unlock");
     driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\'com.indofast.service.dev:id/etDescription\']")).sendKeys("Vin Battery lock");
     driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\'com.indofast.service.dev:id/lytAddImage\']")).click();
     driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\'android:id/text1\' and @text=\'Camera\']")).click();
     driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'Shutter\']")).click();
     driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\'Done\']")).click();
     // Scroll till priority 
     
    /* By elementToFind = By.xpath("((//android.widget.FrameLayout[@resource-id=\'com.indofast.service.dev:id/cardView\'])[1]");
     scrollUpUntilElementFound(driver, elementToFind, 5);   
     
  /* ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    		   "left", 100, "top", 100, "width", 200, "height", 200,
    		    "direction", "Up",
    		    "percent", 1
    		)); */
 // ((RemoteWebElement) driver.findElements(By.xpath("(//android.widget.TextView[@resource-id=\"com.indofast.service.dev:id/txtPriority\") and @text=\'High\']"))).click();
 //  driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(test(\"Priority\"))"));
//driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"com.indofast.service.dev:id/checkBox\"]")).click();
     
 //    new ScrollUtils().scrollSmall(driver, false);
     
  //   ScrollUtils.scrollSmall((AndroidDriver) driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\\\"com.indofast.service.dev:id/cardView\\\"])[1]/android.widget.LinearLayout")), true);

  //   driver.findElement(By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.indofast.service.dev:id/cardView\"])[1]/android.widget.LinearLayout")).click();

//     By target = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.indofast.service.dev:id/cardView\"])[1]/android.widget.LinearLayout");
//    // GestureHandle(driver, 5);
//     
//     
//

     
    driver.findElement(AppiumBy.androidUIAutomator("new UiScrolable(new Uiselector()).scrollIntoView(Text(\"new UiSelector().text(\"Priority\")"));
   
     
     //click on Create
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.indofast.service.dev:id/btnCreateTicket\']")).click();
     
     // for scroll 
    /* driver.findElement(By.AndroidUIAutomator(
    		    "new UiScrollable(new UiSelector().scrollable(true))" +
    		    ".scrollIntoView(new UiSelector().text(\"Your Text Here\"))"));
     driver.findElement(By.xpath("//android.widget.ScrollView[@resource-id=\'com.indofast.service.dev:id/scrollView\']")).s
*/
  
     
 /*    WebElement element = driver.findElement(By.id("com.example:id/btnTap"));
     TouchAction touch = new TouchAction(driver);
     touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform(); */
     
     //User to click on back CTA
     driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\'com.indofast.service.dev:id/btnBack\']")).click();
     
   //User to click on more CTA
   driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]")).click();
   
   
   // User to choose on Admin CTA
   driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\'com.indofast.service.dev:id/ll_admin']")).click();
   
   //Search agent by Name = ramesh
   driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\'com.indofast.service.dev:id/search_edittext\']")).sendKeys("malik");
    
   // User to click on Provision CTA
   driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.indofast.service.dev:id/key_fob_btn\']")).click();
   
   //User will get the error 
   driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'android:id/button1\']")).click();
   
   // User to click on Back CTA
  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'Indofast Service Dev\']")).click();
   
  //User to click on Assistance CTA
  driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\'Assistance\']")).click();
  
  //User to click on TAP to begin 
  driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\'com.indofast.service.dev:id/top\']")).click();
  
  //User to click on top 3dots
  driver.findElement(By.xpath("//android.widget.Button[@resource-id=\'com.indofast.service.dev:id/empty\']")).click();
  
 

  // User to click on connect to external device.
 // driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\'com.indofast.service.dev:id/content\'])[1]")).click();
 // Thread.sleep(5000);
  // User to trying to open left side bar menu
  driver.findElement(By.xpath("//android.widget.ImageButton")).click();
  //User to click on scan station 
  driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\'com.indofast.service.dev:id/scan_station_ll\']")).click();
  
  // User to click on click to  scan 
  
  driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\'com.indofast.service.dev:id/main\']/android.widget.LinearLayout[2]")).click();
  
  // try {
  // Navigate to the barcode scanner screen
  WebElement scanButton = driver.findElement(AppiumBy.accessibilityId("open-scanner-button"));
  scanButton.click();

  // Wait for scanner to open (you might need to add explicit waits here)
  Thread.sleep(3000);

  // Instead of using the camera, inject the barcode result directly (mocking)
  // This depends on app behavior: e.g., maybe the scanner sets a result TextView
  WebElement barcodeInputField = driver.findElement(AppiumBy.id("com.yourapp:id/barcode_input"));
  barcodeInputField.sendKeys("123456789012"); 
  // Mocked barcode

  // Tap submit or confirm
  WebElement confirmButton = driver.findElement(AppiumBy.id("com.yourapp:id/submit_button"));
  confirmButton.click();

  // Validate result or next screen
  WebElement resultText = driver.findElement(AppiumBy.id("com.yourapp:id/product_name"));
  System.out.println("Product Name: " + resultText.getText()); 
  

}

   

  
private Object TouchAction(AndroidDriver driver) {
	// TODO Auto-generated method stub
	return null;
}

private void scrollSmall(AndroidDriver driver, boolean b) {
	// TODO Auto-generated method stub
	
}

//private void GestureHandle(AndroidDriver driver, int i) {
	// TODO Auto-generated method stub
	
}


