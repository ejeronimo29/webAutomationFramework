import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.DevicesPage;
import pageobjects.LoginPage;
import pageobjects.SitesPage;

import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OperationsPortalTests
{
    @Test
    public void successfulLoginGoesToMainPage()throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test01.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();
        Assert.assertEquals(driver.getCurrentUrl(),"https://operationsportal-test01.shoppertrak.com/operationsportal/diagnose/findSite.html");
        driver.close();
    }

    @Test
    public void searchForSiteBySiteIdGoesToSitePage() throws Exception {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test03.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();

        SitesPage sitesPage = new SitesPage(driver);
        sitesPage.enterSiteId("80009008").go();
        Assert.assertEquals(true,driver.findElement(By.id("siteDetails")).isDisplayed());
        driver.close();
    }
    @Test
    public void searchForSiteByDeviceIdGoesToSitePage()throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test03.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();

        SitesPage sitesPage = new SitesPage(driver);
        sitesPage.enterDeviceId("206743").go();
        Assert.assertEquals(true,driver.findElement(By.id("siteDetails")).isDisplayed());
        driver.close();
    }

    @Test
    public void searchForSiteByCustomerIdGoesToMainPage()throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test03.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();

        SitesPage sitesPage = new SitesPage(driver);
        sitesPage.selectOrgFromList("Test - ShopperTrak Physical Lab").selectSiteName().enterSiteNameCustomerId("0006").search();
        sitesPage.selectSiteLink();
        Assert.assertEquals("75285 - Test - ShopperTrak Physical Lab - Test Set 6 | Site Equipment - Operations Portal",driver.getTitle());
        driver.close();
    }
    @Test
    public void searchForSiteBySiteNameGoesToMainPage() throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test03.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();

        sitesPage.selectOrgFromList("Test - ShopperTrak Physical Lab").selectCustomerId().enterSiteNameCustomerId("Test Set 6").search();
        sitesPage.selectSiteLink();
        Assert.assertEquals("75285 - Test - ShopperTrak Physical Lab - Test Set 6 | Site Equipment - Operations Portal",driver.getTitle());
        driver.close();
    }

    @Test
    public void clickOnCalbrationZoningConfigTest() throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test02.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = new SitesPage(driver);
        DevicesPage devicesPage = new DevicesPage(driver);

        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();
        Assert.assertEquals(driver.getCurrentUrl(),"https://operationsportal-test02.shoppertrak.com/operationsportal/diagnose/findSite.html");
        sitesPage.enterSiteId("80009008").go();
        //devicesPage.clickShowOptionsLinkAndWaitToConnect().openCalibrationZoningConfigSection().syncOrbitClock();
        //devicesPage.clickShowOptionsLinkAndWaitToConnect().openSnapshotSection().takeDefaultSnapshot();
        devicesPage.clickShowOptionsLinkAndWaitToConnect().openSnapshotSection().openSnapshotOptions().selectImageType("Validate (q)").takeDefaultSnapshot();
        driver.close();
    }

    @Test

    public void syncClockIsSuccessful(String siteId) throws Exception
    {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://operationsportal-test02.shoppertrak.com");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = new SitesPage(driver);
        loginPage.enterUsername("qa_admin").enterPassword("Passw0rd").login();
        sitesPage.enterSiteId("80009008").go();

    }



}
