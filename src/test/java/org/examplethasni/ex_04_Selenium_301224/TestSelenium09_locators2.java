package org.examplethasni.ex_04_Selenium_301224;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium09_locators2 {
    @Test
    public void test_sel09_locators() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //Click on the tsart a free trial link

        //<a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        // </a>

        WebElement freetrial_text = driver.findElement(By.linkText("Start a free trial"));
        freetrial_text.click();
        //to work with link text it should be a <a> tag, otherwise wont work

        //partial link text
        //WebElement freetrial_text_partial = driver.findElement(By.partialLinkText("free trial"));
       // freetrial_text_partial.click();

        //Start a free trial
        //a free trial
        //free trial
        //trial
        // Start
        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null










    }
}
