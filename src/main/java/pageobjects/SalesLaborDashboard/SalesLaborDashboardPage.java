package pageobjects.SalesLaborDashboard;

import Util.UtilPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesLaborDashboardPage extends UtilPage {

    private final WebDriver driver;
    public SalesLaborDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //TABS
    private WebElement scheduleTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(1)"));}
    private WebElement orgTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(2)"));}
    private WebElement daemonProcessesTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(3)"));}

    // Navigation tabs
    public SalesLaborDashboardScheduleTabPage selectScheduleTab(){
        scheduleTab().click();
        waitElementClickable(driver,By.id("jobSearchField"),3500);
        return new SalesLaborDashboardScheduleTabPage(this.driver);
    }

    public SalesLaborDashboardOrgTabPage selectOrgTab(){
        orgTab().click();
        waitElementClickable(driver,By.id("orgSelectField"),3500);
        return new SalesLaborDashboardOrgTabPage(this.driver);
    }

    public SalesLaborDashboardDaemonTabPage selectDaemonTab(){
        daemonProcessesTab().click();
        waitElementClickable(driver,By.id("refreshDeamonProcessesBtn"),3500);
        return new SalesLaborDashboardDaemonTabPage(this.driver);
    }

}

