To use ChatGPT Canvas (where I can provide you a clean and editable script), you'll need to [log in to ChatGPT](https://chat.openai.com/). Once logged in, you'll be able to view and edit scripts directly in the canvas.

For now, here’s the **updated version of your script** with all the fixes and improvements:

---

### ✅ Cleaned-up & Corrected `AppiumTestTest` Script (Java + Appium + TestNG)

```java
package Satyatest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Satyatest.IndofastService {

	
    AndroidDriver driver;

    @Test
    
    public void AppiumTestTest() throws MalformedURLException, URISyntaxException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Satyadev");
        options.setApp("C://Users\\Satyadev Kumar\\eclipse-workspace\\Appium\\src\\test\\java\\app\\app-debug 20.apk");

        driver = new AndroidDriver(new URI("http://192.168.210.106:4723/").toURL(), options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("android:id/text1")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ImageView"))).click();

        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Hindi']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ImageView"))).click();
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='English']")).click();

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/mobile_number']")).click();
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='com.indofast.service.dev:id/chkNFC']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/mobile_number']")).sendKeys("8052340544");
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.indofast.service.dev:id/login_btn']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.indofast.service.dev:id/otp_code"))).sendKeys("4268");

        // Handle permission dialogs
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        clickIfPresent(By.id("com.android.permissioncontroller:id/permission_allow_all_button"));
        clickIfPresent(By.id("com.indofast.service.dev:id/grant_btn"));
        clickIfPresent(By.id("android:id/button1"));

        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.indofast.service.dev:id/vehicle_vin_edit_text']")).sendKeys("MD9RPSK22FP6R5088");

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
        driver.findElement(By.xpath("//android.widget.ImageButton")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.indofast.service.dev:id/scan_station_ll']")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.indofast.service.dev:id/main']/android.widget.LinearLayout[2]")).click();

        // Mock barcode scanning
        WebElement scanButton = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("open-scanner-button")));
        scanButton.click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.yourapp:id/barcode_input")).sendKeys("123456789012");
        driver.findElement(AppiumBy.id("com.yourapp:id/submit_button")).click();
        WebElement resultText = driver.findElement(AppiumBy.id("com.yourapp:id/product_name"));
        System.out.println("Product Name: " + resultText.getText());
    }

    private void clickIfPresent(By locator) {
        try {
            WebElement el = new WebDriverWait(driver, Duration.ofSeconds(5))
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
