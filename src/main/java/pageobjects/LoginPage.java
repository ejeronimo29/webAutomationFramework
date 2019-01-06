package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{

    private final WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //web elements
    private WebElement usernameInput()
    {
        return driver.findElement(By.id("input_1"));
    }
    private WebElement passwordInput() {return driver.findElement(By.id("input_2"));}
    private WebElement loginButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"submit_row\"]/td/input"));
    }

    //methods
    public LoginPage enterUsername(String username)
    {
        usernameInput().clear();
        usernameInput().sendKeys(username);
        return this;

    }

    public LoginPage enterPassword(String password)
    {
        passwordInput().clear();
        passwordInput().sendKeys(password);
        return this;

    }

    public SitesPage login()
    {
        loginButton().click();
        return new SitesPage(driver);

    }


}
