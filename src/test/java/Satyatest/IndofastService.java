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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class IndofastService {


    AndroidDriver driver;

    @Test
    public void AppiumTestTest() throws MalformedURLException, URISyntaxException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Satyadev");
        options.setApp("C://Users\\Satyadev Kumar\\eclipse-workspace\\Appium\\src\\test\\java\\app\\app-debug 20.apk");

        driver = new AndroidDriver(new URI("http://192.168.8.92:4723/").toURL(), options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // User to click on language drop down
        driver.findElement(By.id("android:id/text1")).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ImageView"))).click();
// User to select the Hindi language 
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Hindi']")).click();
        // script to wait untill drop down should be display
      // wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ImageView"))).click();
        driver.findElement((By.className("android.widget.ImageView"))).click();
       //User to select the english language
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='English']")).click();
        
        driver.findElement((By.className("android.widget.ImageView"))).click();
        //User to select the Tamil language

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Tamil']")).click();
        
        driver.findElement((By.className("android.widget.ImageView"))).click();
        //User to select the Kannada language

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Kannada']")).click();
        
        driver.findElement((By.className("android.widget.ImageView"))).click();
        //User to select the Telugu language

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Telugu']")).click();
        
        driver.findElement((By.className("android.widget.ImageView"))).click();
        //User to select the Malayalam language

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Malayalam']")).click();
        driver.findElement((By.className("android.widget.ImageView"))).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='English']")).click();

        //User should be able to login the Service APP with Valid credential
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/mobile_number']")).click();
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='com.indofast.service.dev:id/chkNFC']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/mobile_number']")).sendKeys("8052340544");
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.indofast.service.dev:id/login_btn']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.indofast.service.dev:id/otp_code"))).sendKeys("4268");
         //  driver.findElement(By.id("com.indofast.service.dev:id/otp_code")).sendKeys("4268");
        
        // Handle permission dialogs
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_button"));

        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_all_button"));
        clickIfPresent(By.id("com.indofast.service.dev:id/grant_btn"));
        clickIfPresent(By.id("android:id/button1"));

        //Assistance Page check
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/vehicle_vin_edit_text']")).sendKeys("MD9RPSK22FP6R5088");
// Verifying the ticket creation
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Ticket']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.indofast.service.dev:id/btnCreateTicket']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button2']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/vin']")).sendKeys("MD9RPSK22FP6R5088");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/etSubject']")).sendKeys("Battery Unlock");
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/etDescription']")).sendKeys("Vin Battery lock");

        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.indofast.service.dev:id/lytAddImage']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Camera']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc='Shutter']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc='Done']"))).click();

        // Scroll to priority
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"Priority\"))"));
        
        //Click on create ticket CTA

        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.indofast.service.dev:id/btnCreateTicket']")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.indofast.service.dev:id/btnBack']")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.indofast.service.dev:id/ll_admin']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/search_edittext']")).sendKeys("malik");
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.indofast.service.dev:id/key_fob_btn']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Indofast Service Dev']")).click();

        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Assistance']")).click();
       driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.indofast.service.dev:id/top']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.indofast.service.dev:id/empty']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.indofast.service.dev:id/title\" and @text=\"Language\"]")).click();
       driver.findElement(By.xpath("//android.widget.ImageView")).click();
       driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\'android:id/text1\' and @text=\'Hindi\']")).click();
       driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
       driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
       driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
       driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.indofast.service.dev:id/empty\"]")).click();
       //driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.indofast.service.dev:id/empty']")).click();
       driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.indofast.service.dev:id/title\" and @text=\"भाषा\"]")).click();
      driver.findElement(By.xpath("//android.widget.ImageView")).click();
      driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"English\"]")).click();
      driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
      driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
      driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
       
      // User to click on side bar menu
     driver.findElement(By.xpath("//android.widget.ImageButton")).click();
     
     //User to click on Assistance 
     
     driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.indofast.service.dev:id/ll_bg\"])[3]")).click();
     // User to click on side bar menu
     driver.findElement(By.xpath("//android.widget.ImageButton")).click();
     //User to click on Ticket
     driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.indofast.service.dev:id/ll_bg\"])[4]")).click();
     //User to click on one ticket
     driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.indofast.service.dev:id/rv_tickets\"]/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
     // Scroll the ticket 
  // Scroll to priority
     driver.findElement(AppiumBy.androidUIAutomator(
         "new UiScrollable(new UiSelector().scrollable(true))" +
         ".scrollIntoView(new UiSelector().text(\"Battery Details\"))"));
     
     //User to click on Close or Continue
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.indofast.service.dev:id/continue_btn\"]")).click();
     
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();
     // In search bar please send the vin no.
     driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.indofast.service.dev:id/vin\"]")).sendKeys("MD9RPSK22FP6R5088");
     
     
     //Click on top left Arrow
     driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
     driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.indofast.service.dev:id/imgBack\"]")).click();

     // User to click on side bar menu
     driver.findElement(By.xpath("//android.widget.ImageButton")).click();
     //User to click on OnboardBattery
    driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.indofast.service.dev:id/onboardBattery_ll\"]")).click();
    driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();
    driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.indofast.service.dev:id/vin\"]")).sendKeys("MD9RPSK22FP6R5088");
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();
     
     driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.indofast.service.dev:id/add_battery\"])[1]")).click();
     //User click on back button
     driver.pressKey(new KeyEvent(AndroidKey.BACK));
     
     driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.indofast.service.dev:id/btnBack\"]")).click();
     //User click on PrivacyPolicies
     
     driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.indofast.service.dev:id/privacyLay\"]")).click();
     driver.pressKey(new KeyEvent(AndroidKey.BACK));
     driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.indofast.service.dev:id/ll_bg\"])[2]")).click();
     
    
     //Notification
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.indofast.service.dev:id/notification\"]")).click();
     driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.indofast.service.dev:id/parentLayout\"])[1]")).click();
     driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"com.indofast.service.dev:id/individual_button\"]")).click();
     driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id=\"com.indofast.service.dev:id/group_button\"]")).click();
     driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.indofast.service.dev:id/notification_title\"]")).sendKeys("Automation");
     driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.indofast.service.dev:id/notification_description\"]")).sendKeys("Automation");
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.indofast.service.dev:id/send_btn\"]")).click();
     driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
     driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
     
     
  /*     // Scan Station Feature
     driver.findElement(By.xpath("//android.widget.ImageButton")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.indofast.service.dev:id/scan_station_ll']")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.indofast.service.dev:id/main']/android.widget.LinearLayout[2]")).click();

        // Mock barcode scanning
        WebElement scanButton = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("com.indofast.service.dev:id/scan_station")));
        scanButton.click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.indofast.service.dev:id/scan_station")).sendKeys("123456789012");
        driver.findElement(AppiumBy.id("com.indofast.service.dev:id/submit_button")).click();
        WebElement resultText = driver.findElement(AppiumBy.id("com.indofast.service.dev:id/scan_station"));
        System.out.println("scan_station: " + resultText.getText()); */
    }

    private void clickIfPresent(By locator) {
        try {
            WebElement el = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(locator));
            el.click();
        } catch (Exception ignored) {}
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit(); 
        } 
    }
}