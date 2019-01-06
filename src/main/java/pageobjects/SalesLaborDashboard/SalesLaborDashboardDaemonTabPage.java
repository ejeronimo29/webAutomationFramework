package pageobjects.SalesLaborDashboard;

import Util.UtilPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SalesLaborDashboardDaemonTabPage extends UtilPage {

    private final WebDriver driver;
    public SalesLaborDashboardDaemonTabPage(WebDriver driver) {
        this.driver = driver;
    }

    //TABS
    private WebElement scheduleTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(1)"));}
    private WebElement orgTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(2)"));}

    //DAEMON PROCESSES TAB
    private WebElement orgRefreshDaemonBtn(){return driver.findElement(By.id("refreshDeamonProcessesBtn"));}
    private List<WebElement> lstNameGridResult(){return driver.findElements(By.cssSelector("#processHeartbeatTable tbody tr td:nth-child(1)"));}
    private List<WebElement> lstNameWithAlertColorGridResult(){return driver.findElements(By.cssSelector("#processHeartbeatTable tbody tr.highlightAlertRow td:nth-child(1)"));}

    private WebElement btnCloseSession(){return driver.findElement(By.cssSelector(".stHeaderSection.stHeaderRight div:nth-child(2)"));}

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

    // METHODS DAEMON PROCESSES

    public SalesLaborDashboardDaemonTabPage refreshDaemonResult(){
        orgRefreshDaemonBtn().click();
        return this;
    }

    public List<String> getDaemonNamelst(){
        waitElementClickable(driver,lstNameGridResult().get(0),1500);
        List<String> lstDaemonName = convertLstWebElementToString(lstNameGridResult());
        return lstDaemonName;
    }

    public List<String> getDaemonNameWithAlertlst(){
        waitElementClickable(driver,lstNameWithAlertColorGridResult().get(0),1500);
        List<String> lstDaemonNameWithAlert = convertLstWebElementToString(lstNameWithAlertColorGridResult());
        return lstDaemonNameWithAlert;
    }

    public void logout() {
        btnCloseSession().click();
    }


}