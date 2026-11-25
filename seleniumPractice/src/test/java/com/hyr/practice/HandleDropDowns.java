
package com.hyr.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        Thread.sleep(3000);

        // Find the dropdown
//        WebElement courseElement =
//                driver.findElement(By.id("course"));
//
//        // Create Select class object
//        Select courseNameDropdown = new Select(courseElement);
//
//        // Get all dropdown options
//        List<WebElement> courseNameDropdownOptions =
//                courseNameDropdown.getOptions();
//
//        // Print all dropdown options
//        for (WebElement option : courseNameDropdownOptions) {
//            System.out.println(option.getText());
//        }
//
//        // Select by Index
//        courseNameDropdown.selectByIndex(1);
//
//        Thread.sleep(3000);
//
//        // Select by Value
//        courseNameDropdown.selectByValue("net");
//
//        Thread.sleep(3000);
//
//        // Select by Visible Text
//        courseNameDropdown.selectByVisibleText("Javascript");
//
//        Thread.sleep(3000);
//
//        // Get selected option
//        String selectedText =
//                courseNameDropdown.getFirstSelectedOption().getText();
//
//        System.out.println("Selected Option: " + selectedText);
//
//        Thread.sleep(3000);

     // Find the second dropdown

     // Find IDE dropdown
     WebElement ideElement = driver.findElement(By.id("ide"));

     Select ideDropdown = new Select(ideElement);

     // Get all dropdown options
     List<WebElement> ideDropdownOptions = ideDropdown.getOptions();

     // Print all options
     for (WebElement option : ideDropdownOptions) {
         System.out.println(option.getText());
     }

     // Select by Index
     ideDropdown.selectByIndex(0); // Eclipse

     Thread.sleep(3000);

     // Select by Value
     ideDropdown.selectByValue("ij"); // IntelliJ IDEA

     Thread.sleep(3000);

     // Select by Visible Text
     ideDropdown.selectByVisibleText("NetBeans");

     Thread.sleep(3000);

     // Deselect by Visible Text
     ideDropdown.deselectByVisibleText("NetBeans");

     Thread.sleep(3000);

     // Get selected option
     String selectedIde =
             ideDropdown.getFirstSelectedOption().getText();

     System.out.println("Selected visible text: " + selectedIde);


        driver.quit();
    }
}
