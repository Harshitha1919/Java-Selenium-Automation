
package com.hyr.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicHTMLControls {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

        Thread.sleep(3000);

        // Handle Radio Button
        driver.findElement(By.id("femalerb")).click();

        Thread.sleep(3000);

        // Handle Checkbox
        driver.findElement(By.id("englishchbx")).click();

        Thread.sleep(3000);

        WebElement hindiChk =
                driver.findElement(By.id("hindichbx"));

        hindiChk.click(); // Check

        Thread.sleep(3000);

        if (hindiChk.isSelected()) {
            hindiChk.click(); // Uncheck
        }

        Thread.sleep(3000);

        // Handle Button
        driver.findElement(By.id("registerbtn")).click();

        System.out.println(
            driver.findElement(By.id("msg")).getText()
        );

        Thread.sleep(3000);

        // Handle Link
        driver.findElement(By.linkText(
            "Click here to navigate to the home page"
        )).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
