package org.examplethasni.ex_04_Selenium_301224;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium10_Miniproj2 {
    @Test
    public void test_Sel10() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial/");

        // <input
        // class="W(100%) Py(14px)
        // input-text" placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email" required="">
        WebElement bussinesemail = driver.findElement(By.id("page-v1-step1-email"));
        bussinesemail.sendKeys("blablabla");

        //<input
        // class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-903cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-gdpr-consent-checkbox">
        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        Thread.sleep(2000);

        //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit button--disabled-primary"
        // data-qa="page-su-submit"
        // disabled="disabled">
        // Create a Free Trial Account
        // </button>

        List<WebElement> button_List = driver.findElements(By.tagName("button"));//not good to use tagname as it gives multiple elements which may fail in future
        button_List.get(0).click();
        Thread.sleep(3000);
//<div>The email address you entered is incorrect.</div>
        WebElement errortext = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errortext.getText(), "The email address you entered is incorrect.");

        Thread.sleep(15000);
        driver.quit();
    }}