package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UsersPage {

    private final WebDriver driver;
    public UsersPage(WebDriver driver) {this.driver = driver;}

    //web elements
    private WebElement enterUsernameInputbox()  { return driver.findElement(By.id("username-input")); }
    private WebElement findButton() { return driver.findElement(By.id("find-button")); }
    private WebElement userAdministrationCheckbox() { return driver.findElement(By.id("user-function-1-checkbox")); }
    private WebElement siteCommunicationCheckbox() { return driver.findElement(By.id("user-function-2-checkbox")); }
    private WebElement dataManagerCheckbox() { return driver.findElement(By.id("user-function-3-checkbox")); }
    private WebElement dataExtraxtApiSettingsCheckbox() { return driver.findElement(By.id("user-function-4-checkbox")); }
    private WebElement installationGroupCheckbox() { return driver.findElement(By.id("user-function-5-checkbox")); }
    private WebElement kpiOutboundApiSettingsCheckbox() { return driver.findElement(By.id("user-function-6-checkbox")); }
    private WebElement trafficReportApiSettingsCheckbox() { return driver.findElement(By.id("user-function-7-checkbox")); }
    private WebElement trafficReportConfigurationsCheckbox() { return driver.findElement(By.id("user-function-8-checkbox")); }
    private WebElement loadOperatingHoursCheckbox() { return driver.findElement(By.id("user-function-9-checkbox")); }
    private WebElement customerAccessCheckbox() { return driver.findElement(By.id("user-function-10-checkbox")); }
    private WebElement customerVideoAccessCheckbox() { return driver.findElement(By.id("user-function-16-checkbox")); }
    private WebElement advancedConfigurationUserCheckbox() { return driver.findElement(By.id("user-function-11-checkbox")); }
    private WebElement advancedSupportUserCheckbox() { return driver.findElement(By.id("user-function-14-checkbox")); }
    private WebElement dashboardsCheckbox() { return driver.findElement(By.id("user-function-12-checkbox")); }
    private WebElement editTrafficDataCheckbox() { return driver.findElement(By.id("user-function-13-checkbox")); }
    private WebElement hierarchyManagerCheckbox() { return driver.findElement(By.id("user-function-15-checkbox")); }
    private WebElement discardButton()  { return driver.findElement(By.id("user-admin-discard-button")); }
    private WebElement applyButton()    { return driver.findElement(By.id("user-admin-apply-button")); }

    //methods
    public UsersPage selectUser(String username)
    {
        enterUsernameInputbox().clear();
        enterUsernameInputbox().sendKeys(username);
        return this;
    }

    public UsersPage find()
    {
        findButton().click();
        return this;
    }

    //public UsersPage setUserAdministrationTrue()
    //{
      //  boolean selected = userAdministrationCheckbox().isSelected();
      //  if (selected = true) {

      //  } else
      //  return this;
   // }

    public UsersPage setUserAdministrationFalse()
    {
        userAdministrationCheckbox().click();
        return this;
    }















}
