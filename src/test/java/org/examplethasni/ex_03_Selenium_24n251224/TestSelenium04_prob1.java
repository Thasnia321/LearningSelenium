package org.examplethasni.ex_03_Selenium_24n251224;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium04_prob1 {

    @Test
    @Description("Veirfy the CURA Healthcare Service text exists in the page")
    public void testSele02() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is visible");
            Assert.assertTrue(true);
        }
        else {

            throw new Exception("CURA Healthcare Service not visible");
        }
    }


}
