import Util.ManageQuery;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class OperationPortalDataIntegrityDashboardTest
        extends ManageQuery
{
    private WebDriver driver;
    private String urlPage;
    private String user;
    private String pass;
    private String ChromeDriverPath;
    private String screenPath;

    @BeforeTest
    public void Given()
            throws Exception
    {
        insertDataIntegrityRecords();

         if(verifyDataIntegrityRecords()>19){
            this.urlPage = getPropertiesValues().getProperty("urlOpsPortalTest03");
            this.user = getPropertiesValues().getProperty("user");
            this.pass = getPropertiesValues().getProperty("pass");
            this.ChromeDriverPath = getPropertiesValues().getProperty("ChromeDriverPath");

            System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
            this.driver = new ChromeDriver();
            this.driver.manage().window().maximize();
            this.screenPath = getPropertiesValues().getProperty("screenPath");
        }
    }

    @Test
    public void dataValidation() throws Exception{
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        dashboardsPage.goToDataIntegrityDashboard();
        DataIntegrityDashboardPage dataIntegrityDashboardPage = new DataIntegrityDashboardPage(driver);
        dataIntegrityDashboardPage.selectDIAnalyst("Analyst C").selectType("Baseline")
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
        dataIntegrityDashboardPage.selectDIAnalyst("Analyst C").selectType("Baseline")
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
       //  Assert.assertEquals(dataIntegrityDashboardPage.subMenuElementsValidations(),true);
       // Assert.assertEquals(dataIntegrityDashboardPage.calendarButtonAvailable(),true); // BUG OVERLAPING BUTTON CALENDAR
        Assert.assertEquals(dataIntegrityGraphTrafficPage.rememberChanges(),true);

    }

    @Test
    public void NextMessage() throws Exception{
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        dashboardsPage.goToDataIntegrityDashboard();
        DataIntegrityDashboardPage dataIntegrityDashboardPage = new DataIntegrityDashboardPage(driver);
        dataIntegrityDashboardPage.selectDIAnalyst("Any").selectType("Baseline")
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
        //  Assert.assertEquals(dataIntegrityDashboardPage.subMenuElementsValidations(),true);
        // Assert.assertEquals(dataIntegrityDashboardPage.calendarButtonAvailable(),true); // BUG OVERLAPING BUTTON CALENDAR
        Assert.assertEquals(dataIntegrityGraphTrafficPage.rememberChanges(),true);

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
