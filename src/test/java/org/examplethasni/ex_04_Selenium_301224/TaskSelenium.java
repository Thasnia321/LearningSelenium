package org.examplethasni.ex_04_Selenium_301224;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskSelenium {

    @Test
    @Description("Task 30th Dec 2024 | Selenium projects")
    public void test_miniproj3(){
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
        WebElement appointmentbutton = driver.findElement(By.linkText("Make Appointment"));
        appointmentbutton.click();

        WebElement usernamefield = driver.findElement(By.id("txt-username"));
        usernamefield.sendKeys("John Doe");

        WebElement password_field = driver.findElement(By.id("txt-password"));
        password_field.sendKeys("ThisIsNotAPassword");

        WebElement loginbutton = driver.findElement(By.id("btn-login"));
        loginbutton.click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        Thread.sleep(15000);
        driver.quit();

    }
}
