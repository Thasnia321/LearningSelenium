package org.examplethasni.ex_03_Selenium_24n251224;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Test
    @Description("Test basic commands")
    public void test_sele01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.manage().window().maximize();
      //  driver.manage().window().minimize();

        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
