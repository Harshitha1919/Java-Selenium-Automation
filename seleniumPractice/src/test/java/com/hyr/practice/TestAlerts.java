
package com.hyr.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class TestAlerts {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        Thread.sleep(2000);

        // Alert Box - Accept
        System.out.println(driver.findElement(By.id("output")).getText());

        driver.findElement(By.id("alertBox")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

        System.out.println(driver.findElement(By.id("output")).getText());

        // Confirm Box - Accept
        System.out.println(driver.findElement(By.id("output")).getText());

        driver.findElement(By.id("confirmBox")).click();

        alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

        System.out.println(driver.findElement(By.id("output")).getText());

        // Confirm Box - Dismiss
        driver.findElement(By.id("confirmBox")).click();

        alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.dismiss();

        System.out.println(driver.findElement(By.id("output")).getText());

        // Prompt Box - Accept
        System.out.println(driver.findElement(By.id("output")).getText());

        driver.findElement(By.id("promptBox")).click();

        alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.sendKeys("HYR Tutorials");

        alert.accept();

        System.out.println(driver.findElement(By.id("output")).getText());

        // Prompt Box - Dismiss
        driver.findElement(By.id("promptBox")).click();

        alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.dismiss();

        System.out.println(driver.findElement(By.id("output")).getText());

        Thread.sleep(2000);

        // Close browser
        driver.quit();
    }
}
