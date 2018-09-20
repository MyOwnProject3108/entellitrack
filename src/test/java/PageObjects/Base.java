package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;

    public void initialise(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiyyaz.Shaik\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

    }

    public WebDriver getDriver()

    {
        return  driver;
    }

    public void closeBrowser()

    {
        driver.quit();
    }

    public void verifyURLText(String text){
        boolean textPresent = driver.getCurrentUrl().contains(text);
        Assert.assertTrue(textPresent);

    }



    public void navigateToNewAppealPage(){
        driver.navigate().to("https://ca-acms-dev.entellitrak.com/etk-ca-acms-dev/tracking.base.create.request.do?dataObjectKey=object.apl");

    }

    public  void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }




}
