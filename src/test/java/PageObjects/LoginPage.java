package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{


    WebElement userNameElelemt = driver.findElement(By.id("username"));
    WebElement passwordElement = driver.findElement(By.id("password"));
    WebElement signOnElement = driver.findElement(By.id("submit"));


    public void signIn(String userName, String password) {
        try {
            userNameElelemt.sendKeys(userName);
            passwordElement.click();
            passwordElement.sendKeys(password);
            signOnElement.click();


        }catch (Exception e){

        }


    }
}
