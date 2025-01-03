import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumConfig {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasni A\\OneDrive\\Documents\\Automation\\Drivers\\chromedriver.exe");

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(co);//launch chrome browser

        driver.get("https://www.facebook.com/");//navigate to given website
       // driver.findElement(By.className("_8esh")).click();//Locate web element and click on it
       // driver.findElement(By.name("login")).click();
      //  driver.findElement(By.linkText("Forgot password?")).click();
       // driver.findElement(By.partialLinkText("Forgot")).click();
       // driver.findElement(By.cssSelector("._8esh")).click();//css selector using class
      //  driver.findElement(By.className("."))
        //driver.findElement(By.cssSelector("#u_0_0_sE")).click(); // css selector using id
        driver.findElement(By.cssSelector("input[placeholder='Password']")).click(); // css selector using tagname

       //get title of current page
        String title = driver.getTitle();
        System.out.println(title);
        //get current url
        String currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);
        //get pagesource
        String pagesource= driver.getPageSource();
        System.out.println(pagesource);
        //close method
       // driver.close();
        //quite method
         driver.quit();



    }



}
