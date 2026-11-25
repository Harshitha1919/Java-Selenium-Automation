package com.hyr.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class NavigationMethods {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        // Search HYR Tutorials
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
        driver.findElement(By.name("q")).submit();
        Thread.sleep(3000);

        // Navigate to Facebook
     // Navigate to Facebook
     // Navigate to Facebook
        driver.navigate().to("https://www.facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement email = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.cssSelector("input[name='email']")
            )
        );

        System.out.println("Displayed: " + email.isDisplayed());
        System.out.println("Enabled: " + email.isEnabled());

        email.sendKeys("test@gmail.com");

        Thread.sleep(2000);

        System.out.println("Entered text: " + email.getDomProperty("value"));
        // Go back
        driver.navigate().back();
        Thread.sleep(3000);

        // Go forward
        driver.navigate().forward();
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}
