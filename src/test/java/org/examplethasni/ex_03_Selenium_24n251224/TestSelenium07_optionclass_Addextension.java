package org.examplethasni.ex_03_Selenium_24n251224;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium07_optionclass_Addextension {
    @Test
    public void test_SELE07(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addExtensions(new File("src/test/java/org/examplethasni/ex_03_Selenium_24n251224/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
    }
}
