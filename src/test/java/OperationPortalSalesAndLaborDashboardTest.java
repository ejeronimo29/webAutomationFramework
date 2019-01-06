import Util.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.DashboardsPage;
import pageobjects.LoginPage;
import pageobjects.SalesLaborDashboard.SalesLaborDashboardDaemonTabPage;
import pageobjects.SalesLaborDashboard.SalesLaborDashboardOrgTabPage;
import pageobjects.SalesLaborDashboard.SalesLaborDashboardPage;
import pageobjects.SalesLaborDashboard.SalesLaborDashboardScheduleTabPage;
import pageobjects.SitesPage;

public class OperationPortalSalesAndLaborDashboardTest
        extends ReadProperties
{
    private WebDriver driver;
    private String urlPage;
    private String user;
    private String pass;
    private String ChromeDriverPath;

    @BeforeTest
    public void Given()
            throws Exception
    {
        this.urlPage = getPropertiesValues().getProperty("urlOpsPortalTest03");
        this.user = getPropertiesValues().getProperty("user");
        this.pass = getPropertiesValues().getProperty("pass");
        this.ChromeDriverPath = getPropertiesValues().getProperty("ChromeDriverPath");

        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @Test
    public void searchJob5daysAgoDisplays10ResultsScheduleTab() throws Exception
    {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        SalesLaborDashboardPage salesLaborDashboardPage = dashboardsPage.goToSalesAndLaborDashboard();
        SalesLaborDashboardScheduleTabPage salesLaborDashboardScheduleTabPage = salesLaborDashboardPage.selectScheduleTab();
        salesLaborDashboardScheduleTabPage
                .navigatePrevDate(5)
                .inputJobSearch("1");
        Assert.assertEquals(salesLaborDashboardScheduleTabPage.getSizeOrgIdlst(),10);
        salesLaborDashboardScheduleTabPage.logout();
    }

    @Test
    public void searchJob11DisplaysAnyResultsScheduleTab() throws Exception
    {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        SalesLaborDashboardPage salesLaborDashboardPage = dashboardsPage.goToSalesAndLaborDashboard();
        SalesLaborDashboardScheduleTabPage salesLaborDashboardScheduleTabPage = salesLaborDashboardPage.selectScheduleTab();
        salesLaborDashboardScheduleTabPage
                .inputJobSearch("11");
        Assert.assertEquals(salesLaborDashboardScheduleTabPage.getSizeOrgNamelst(),2);
        salesLaborDashboardScheduleTabPage.logout();
    }

    @Test
    public void searchJob11DisplaysAnyResultsOrgTab() throws Exception
    {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        SalesLaborDashboardPage salesLaborDashboardPage = dashboardsPage.goToSalesAndLaborDashboard();
        SalesLaborDashboardOrgTabPage salesLaborDashboardOrgTabPage = salesLaborDashboardPage.selectOrgTab();
        salesLaborDashboardOrgTabPage
                .inputSearchAllOrg("11");
        Assert.assertEquals(salesLaborDashboardOrgTabPage.getSizeDatelst(),0);
        salesLaborDashboardOrgTabPage.logout();
    }

    @Test
    public void displaysAllResultsDaemonTab() throws Exception
    {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        SalesLaborDashboardPage salesLaborDashboardPage = dashboardsPage.goToSalesAndLaborDashboard();
        SalesLaborDashboardDaemonTabPage salesLaborDashboardDaemonTabPage = salesLaborDashboardPage.selectDaemonTab();
        Assert.assertEquals(salesLaborDashboardDaemonTabPage.getDaemonNamelst().size(),6);
        salesLaborDashboardDaemonTabPage.logout();
    }

    @Test
    public void verifyAllJobsWithAlertDaemonTab() throws Exception
    {
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        DashboardsPage dashboardsPage = sitesPage.selectDashboardLink();
        SalesLaborDashboardPage salesLaborDashboardPage = dashboardsPage.goToSalesAndLaborDashboard();
        SalesLaborDashboardDaemonTabPage salesLaborDashboardDaemonTabPage = salesLaborDashboardPage.selectDaemonTab();
        Assert.assertEquals(salesLaborDashboardDaemonTabPage.getDaemonNameWithAlertlst().size(),3);
        salesLaborDashboardDaemonTabPage.logout();
    }

    @AfterTest
    public void Then(){
        if(driver != null)driver.quit();
    }
}
