package org.examplethasni.ex_01_SeleniumBAsics;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    @Description("OPen vwo login page and print the title")
    public void test_Selenium01(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
    }
}
