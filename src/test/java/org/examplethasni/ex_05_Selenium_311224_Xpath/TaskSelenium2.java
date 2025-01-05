package org.examplethasni.ex_05_Selenium_311224_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskSelenium2 {
    @Test
    public void test_sele12() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement username1 = driver.findElement(By.xpath("//input[@id='username']")); // using xpath
        username1.sendKeys("augtest_040823@idrive.com"); //By.xpath("//input[@id='username']"));//*[@id="username"]


        WebElement pass1 = driver.findElement(By.xpath("//input[contains(@id,'password')]")); // using xpath function - contains
        pass1.sendKeys("123456");

        WebElement signbutton = driver.findElement(By.xpath("//button[text()='Sign in']"));//using xpath function text
        signbutton.click();


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement msg = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));

        Assert.assertEquals(msg.getText(),"Your free trial has expired");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        driver.quit();

    }
}
