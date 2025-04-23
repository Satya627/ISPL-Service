package Satyatest;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

public class ScrollUtils {

	    public static void scrollSmall(AppiumDriver driver, boolean scrollUp) {
	        int screenHeight = driver.manage().window().getSize().getHeight();
	        int screenWidth = driver.manage().window().getSize().getWidth();

	        int x = screenWidth / 2;
	        int startY = scrollUp ? (int) (screenHeight * 0.5) : (int) (screenHeight * 0.3);
	        int endY = scrollUp ? (int) (screenHeight * 0.3) : (int) (screenHeight * 0.5);

	        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	        Sequence swipe = new Sequence(finger, 1);

	        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, startY));
	        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	        swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), x, endY));
	        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	        driver.perform(Collections.singletonList(swipe));
	        
	    }
	}


