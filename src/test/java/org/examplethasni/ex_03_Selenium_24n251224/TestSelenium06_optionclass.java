package org.examplethasni.ex_03_Selenium_24n251224;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium06_optionclass {
    @Test
    public void testSele06(){
        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments("--window-size=1280,720");
       // edgeOptions.addArguments("--window-size=800,600");
        //edgeOptions.addArguments("--incognito");
       // edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--headless");
//site for arguments list: https://peter.sh/experiments/chromium-command-line-switches/
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
    }
}
