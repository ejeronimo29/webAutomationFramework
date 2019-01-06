import com.sun.xml.internal.ws.policy.AssertionSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.OrganizationsPage;
import pageobjects.SitesPage;
import pageobjects.UsersPage;

import java.net.URL;
import java.util.List;
import java.util.Set;

public class OperationsPortalProfileOtherTests //finish this test
{

    @Test
    public void editOrgSettingsIsSuccessful() throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444//wd/hub"),DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test01.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = new SitesPage(driver);
        OrganizationsPage organizationsPage = new OrganizationsPage(driver);
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();
        sitesPage.selectOrganizationsLink().selectOrganization("AT&T");
        //Make a change in Flash Trafic settings,save it
        organizationsPage.openFlashTrafficDataFileGeneratorSection();
        organizationsPage.flashEnabledDropdown().selectByVisibleText("uses");
        organizationsPage.frequencyDropdown().selectByVisibleText("60 minutes.");
        organizationsPage.trafficTypeDropdown().selectByVisibleText("summary (rollup)");
        organizationsPage.fileRolloverDropdown().selectByVisibleText("will");
        organizationsPage.firstOrbitAtSiteDropdown().selectByVisibleText("0");
        organizationsPage.dataDeliveredAtDropdown().selectByVisibleText("the midnight before the client started the program.");
        organizationsPage.timeSynchronizedWithDropdown().selectByVisibleText("the site.");
        organizationsPage.timeSyncFrequencyDropdown().selectByVisibleText("day.");
        organizationsPage.saveNewFlashConfiguration();
        organizationsPage.cancelChangesToFlashConfiguration();
        organizationsPage.openFlashTrafficDataFileGeneratorSection();
        //Verify the change persisted
        Assert.assertEquals("uses",organizationsPage.flashEnabledDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("60 minutes.",organizationsPage.frequencyDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("summary (rollup)",organizationsPage.trafficTypeDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("will",organizationsPage.fileRolloverDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("0",organizationsPage.firstOrbitAtSiteDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("the midnight before the client started the program.",organizationsPage.dataDeliveredAtDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("the site.",organizationsPage.timeSynchronizedWithDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("day.",organizationsPage.timeSyncFrequencyDropdown().getFirstSelectedOption().getText());
        //Make a change in Flash Trafic settings,save it
        organizationsPage.flashEnabledDropdown().selectByVisibleText("uses");
        organizationsPage.frequencyDropdown().selectByVisibleText("15 minutes.");
        organizationsPage.trafficTypeDropdown().selectByVisibleText("summary (rollup)");
        organizationsPage.fileRolloverDropdown().selectByVisibleText("will");
        organizationsPage.firstOrbitAtSiteDropdown().selectByVisibleText("1");
        organizationsPage.dataDeliveredAtDropdown().selectByVisibleText("the midnight before the client started the program.");
        organizationsPage.timeSynchronizedWithDropdown().selectByVisibleText("ShopperTrak.");
        organizationsPage.timeSyncFrequencyDropdown().selectByVisibleText("day.");
        organizationsPage.saveNewFlashConfiguration();
        organizationsPage.saveNewFlashConfiguration();
        organizationsPage.cancelChangesToFlashConfiguration();
        organizationsPage.openFlashTrafficDataFileGeneratorSection();
        //Verify the change persisted
        Assert.assertEquals("uses",organizationsPage.flashEnabledDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("15 minutes.",organizationsPage.frequencyDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("summary (rollup)",organizationsPage.trafficTypeDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("will",organizationsPage.fileRolloverDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("1",organizationsPage.firstOrbitAtSiteDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("the midnight before the client started the program.",organizationsPage.dataDeliveredAtDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("ShopperTrak.",organizationsPage.timeSynchronizedWithDropdown().getFirstSelectedOption().getText());
        Assert.assertEquals("day.",organizationsPage.timeSyncFrequencyDropdown().getFirstSelectedOption().getText());

        driver.close();
    }


    @Test
    public void setHeightThresholdIsSuccessful()throws Exception
    {
     WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
     driver.get("https://operationsportal-test01.shoppertrak.com");
     LoginPage loginPage = new LoginPage(driver);
     loginPage.enterUsername("qa_admin");
     loginPage.enterPassword("Passw0rd");
     loginPage.login();
     SitesPage sitesPage = new SitesPage(driver);
     sitesPage.selectOrganizationsLink();
     OrganizationsPage organizationsPage = new OrganizationsPage(driver);
     organizationsPage.selectOrganization("Aesop");

    }

    @Test
    public void editUserPermissionsIsSuccessful() throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test01.shoppertrak.com");
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = new SitesPage(driver);
        UsersPage usersPage = new UsersPage(driver);
        OrganizationsPage organizationsPage = new OrganizationsPage(driver);
        //login
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();
        //navigate to Users page
        sitesPage.selectUsersLink();
        //find user to edit
        usersPage.selectUser("qa_automation1");
        usersPage.find();
        driver.close();





    }





















}
