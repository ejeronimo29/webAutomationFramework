package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.DataIntegrityDashboard.DataIntegrityDashboardPage;
import pageobjects.SalesLaborDashboard.SalesLaborDashboardPage;


public class DashboardsPage {

    private final WebDriver driver;
    public DashboardsPage(WebDriver driver) {this.driver = driver;}

    //web elements
    private WebElement salesAmdLaborProcessLink()   { return driver.findElement(By.linkText("Sales and Labor Process")); }
    private WebElement fileJobViewLink()    { return driver.findElement(By.linkText("File Job View")); }
    private WebElement dataIntegrityLink()  { return driver.findElement(By.linkText("Data Integrity")); }
    private WebElement realtimeTrafficMonitorLink() { return driver.findElement(By.linkText("Realtime Traffic Monitor")); }

    //methods
    public SalesLaborDashboardPage goToSalesAndLaborDashboard()
    {
        salesAmdLaborProcessLink().click();
        return new SalesLaborDashboardPage(driver);
    }

    public FileJobDashboardPage goToFileJobDashboard()
    {
        fileJobViewLink().click();
        return new FileJobDashboardPage(driver);
    }

    public DataIntegrityDashboardPage goToDataIntegrityDashboard()
    {
        dataIntegrityLink().click();
        return new DataIntegrityDashboardPage(driver);
    }

    public RealTimeTrafficDashboardPage goToRealTimeTrafficDashboard()
    {
        realtimeTrafficMonitorLink().click();
        return new RealTimeTrafficDashboardPage(driver);
    }



}
