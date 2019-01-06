package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiteActionsPage
{
    private final WebDriver driver;

    public SiteActionsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //web elements
    private WebElement authorizeRegistrationButton()
    {
        return driver.findElement(By.id("authorizeRegistration"));
    }
    private WebElement retrieveTraffic()
    {
        return driver.findElement(By.id("button_process_all"));
    }
    private WebElement chooseDateRangeButton()
    {
        return driver.findElement(By.id("restoreRange"));
    }
    private WebElement restoreTrafficButton()
    {
        return driver.findElement(By.id("restoreTraffic"));
    }

    //methods
    // private WebElement releaseDataValue()
    //{
    //return driver.findElement
    //}


}
