package org.examplethasni.ex_03_Selenium_24n251224;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {
    @Test
    public void testSele05() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();
        //these options are not there in get - otherwise same

        //diff between close and quit
        Thread.sleep(3000);
        driver.close(); // closes current tab , not the session

        Thread.sleep(5000);
        driver.quit(); // close the entire session
    }

}
