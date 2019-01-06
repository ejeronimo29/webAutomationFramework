import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.SiteInfoPage;
import pageobjects.SitesPage;

import java.net.URL;

public class OperationsPortalProfileKTests
{
    @Test //needs to run first
    public void registerSSCsiteIsSuccessful() throws Exception
    {

    }


    @Test

    public void searchBySiteIdgoesToSiteMainPageProfileK()throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test03.shoppertrak.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_automation");
        loginPage.enterPassword("passw0rd");
        loginPage.login();

        SitesPage sitesPage = new SitesPage(driver);
        sitesPage.enterSiteId("80009010");
        sitesPage.go();
        Assert.assertEquals("80009010 - Test - ShopperTrak Physical Lab - Test Set 47 | Site Equipment - Operations Portal",driver.getTitle());

        SiteInfoPage siteInfoPage = new SiteInfoPage(driver);
        //check Device Count
        //check Open Case
        siteInfoPage.verifyOrgValue("Test - ShopperTrak Physical Lab (5418)");
        siteInfoPage.verifyReportingName("0047 - Test Set 47");
        siteInfoPage.verifyOrgID("80009010");
        siteInfoPage.verifyCommunication("SSC");
        siteInfoPage.verifySiteType("Retail Store");
        //verify Time Zone
        siteInfoPage.verifyRemedyStatus("P4");
        siteInfoPage.verifyInStoreFlash("Not enabled");
        siteInfoPage.verifyRealTimeReporting("Enabled");
        siteInfoPage.verifyTrafficWatch("Not enabled");
        siteInfoPage.verifyRegistrationStatus("Registered");
        //LastCheckin is not null
        //Last Auth checking is not null
        //check MAC addresses of all IP devices
        //check serial numbers
        //check Orbit Types

        //driver.close();

    }

    @Test
    public void searchByDeviceIdgoesToSiteMainPageProfileK()throws Exception
    {


    }

    @Test
    public void searchByCustomerIdgoesToSiteMainPageProfileK()throws Exception
    {


    }

    @Test
    public void searchBySiteNameGoesToSiteMainPageProfileK()throws Exception
    {

    }

    @Test
    public void syncClockIsSuccessfulProfileK()throws Exception
    {


    }

    @Test
    public void takeImmediateSnapshotSuccessfullyProfileK() throws Exception
    {

    }


}
