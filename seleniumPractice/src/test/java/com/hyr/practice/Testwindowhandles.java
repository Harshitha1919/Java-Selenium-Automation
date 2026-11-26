
package com.hyr.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testwindowhandles {

    public static void main(String[] args) throws Exception {



        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        // Single window
        String parentwindowHandle = driver.getWindowHandle();

        System.out.println("Parent window handle " + parentwindowHandle);

        driver.findElement(By.id("newWindowBtn")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {

            if (!windowHandle.equals(parentwindowHandle)) {

                driver.switchTo().window(windowHandle);

                driver.manage().window().maximize();

                driver.findElement(By.id("firstName")).sendKeys("Yadagiri");

                Thread.sleep(3000);

                driver.close();
            }
        }
        driver.switchTo().window(parentwindowHandle);
        System.out.println("Parent window title " + driver.getTitle());

    

        driver.findElement(By.id("name")).sendKeys("HYR Tutorials");

        Thread.sleep(3000);

        driver.quit();
    }
}
