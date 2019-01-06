import Util.ManageQuery;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.DashboardsPage;
import pageobjects.DataIntegrityDashboard.DataIntegrityDashboardPage;
import pageobjects.DataIntegrityDashboard.DataIntegrityGraphTrafficPage;
import pageobjects.LoginPage;
import pageobjects.SitesPage;

import java.io.File;
import java.net.URL;

public class OperationPortalDataIntegrityDashboard
        extends ManageQuery
{
    WebDriver driver;
    private String RemoteWebDriverUrl;
    private String urlPage;
    private String user;
    private String pass;
    private String screenPath;

    @BeforeTest
    public void Given() throws Exception{
        RemoteWebDriverUrl = getPropertiesValues().getProperty("RemoteWebDriverUrl");
        urlPage = getPropertiesValues().getProperty("urlOpsPortalTest03");
        user = getPropertiesValues().getProperty("user");
        pass = getPropertiesValues().getProperty("pass");
        screenPath = getPropertiesValues().getProperty("screenPath");

        driver = new RemoteWebDriver(new URL(RemoteWebDriverUrl), DesiredCapabilities.chrome());
        driver.manage().window().maximize();
    }


    @Test
    public void dataValidation() throws Exception{
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        dashboardsPage.goToDataIntegrityDashboard();
        DataIntegrityDashboardPage dataIntegrityDashboardPage = new DataIntegrityDashboardPage(driver);
        dataIntegrityDashboardPage.selectDIAnalyst("Analyst A").selectType("Baseline")
                .selectDaysBefore(1).displayAdvancedFilter()
                .selectSiteType("ALL").selectSiteStaus("P4")
                .checkCloseHold().checkCloseRvw()
                .doSearch();


    }

    @Test
    public void GraphTrafficData_getDataMessage() throws Exception{
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        dashboardsPage.goToDataIntegrityDashboard();
        DataIntegrityDashboardPage dataIntegrityDashboardPage = new DataIntegrityDashboardPage(driver);
        dataIntegrityDashboardPage.selectDIAnalyst("Analyst A").selectType("Baseline")
                .selectDaysBefore(1).displayAdvancedFilter()
                .selectSiteType("ALL").selectSiteStaus("P4")
                .checkCloseHold().checkCloseRvw()
                .doSearch()
                .checkTheFirstRecordGrid()
                .checkGraph();
        DataIntegrityGraphTrafficPage dataIntegrityGraphTrafficPage = new DataIntegrityGraphTrafficPage(driver);


        Assert.assertEquals(dataIntegrityGraphTrafficPage.validateMessageInformationText(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.closeMsgAvailable(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.releaseMessageAvailable(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.openCaseAvailable(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.nextMessageAvailable(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.groupBySiteAvailable(),false);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.rightPanelsAvailable(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.subMenuElementsValidations(),true);
        Assert.assertEquals(dataIntegrityGraphTrafficPage.calendarButtonAvailable(),true);
    }

    @Test
    public void simpleSearchDisplaysExpectedResults()
            throws Exception
    {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        dashboardsPage.goToDataIntegrityDashboard();
        DataIntegrityDashboardPage dataIntegrityDashboardPage = new DataIntegrityDashboardPage(driver);
        dataIntegrityDashboardPage
                .selectDIAnalyst("Any")
                .selectType("Night Counts")
                .selectDaysBefore(7)
                .doSearch();
        Assert.assertEquals(dataIntegrityDashboardPage.lstDeviceIdGrid().size(),0);
        dataIntegrityDashboardPage.logout();
    }

    @Test
    public void advancedSearchDisplaysExpectedResults() throws Exception {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        dashboardsPage.goToDataIntegrityDashboard();
        DataIntegrityDashboardPage dataIntegrityDashboardPage = new DataIntegrityDashboardPage(driver);
        dataIntegrityDashboardPage
                .selectDIAnalyst("Any")
                .selectType("High Counts")
                .selectDaysBefore(5)
                .displayAdvancedFilter()
                .selectSiteType("Mall")
                .selectSiteStaus("P0")
                .selectOrganization("ACP-Offenbachers")
                .checkCloseHold()
                .checkCloseRvw()
                .selectLocation("Argentina","Argentina","Argentina","0000")
                .doSearch();
        dataIntegrityDashboardPage.logout();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws Exception{
        String nameMethod = result.getMethod().getMethodName();
        if(!result.isSuccess()){
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(screenPath+nameMethod+".png"));
        }
    }

    @AfterTest
    public void Then() throws Exception {
        deleteDataIntegrityRecords();
        if(driver != null)driver.quit();

    }

}
