
package com.hyr.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class locatersPractice {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://github.com/login");

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.id("login_field")));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.name("password")));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.className("header-logo")));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.linkText("Forgot password?")));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.partialLinkText("Create an")));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.tagName("h1")));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(By.xpath(
            "//label[contains(text(), 'Username or email address')]"
        )));

        Thread.sleep(3000);

        highlight(driver, driver.findElement(
            By.cssSelector("input[name='commit']")
        ));

        Thread.sleep(3000);

        driver.quit();
    }

    public static void highlight(WebDriver driver, WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].style.border='3px solid red'",
            element
        );
    }
}
