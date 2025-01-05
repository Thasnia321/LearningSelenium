package org.examplethasni.ex_05_Selenium_311224_Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium11 {

    @Test
    @Description("XPATh - locator")
    public void test_locatorxpath() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //<a
        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">
        // Make Appointment
        // </a>
        WebElement appointmentbutton = driver.findElement(By.xpath("//a[@id=\'btn-make-appointment\']"));
        appointmentbutton.click();

       // <input
        // type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value=""
        // autocomplete="off">

        WebElement usernamefield = driver.findElement(By.xpath("//input[@id='txt-username']"));
        usernamefield.sendKeys("John Doe");

        WebElement password_field = driver.findElement(By.id("txt-password"));
        password_field.sendKeys("ThisIsNotAPassword");

        //List<WebElement> username_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        //username_input_box.get(1).sendKeys("John Doe");
        //List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        //password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement loginbutton = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        loginbutton.click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Thread.sleep(15000);
        driver.quit();

    }
}
