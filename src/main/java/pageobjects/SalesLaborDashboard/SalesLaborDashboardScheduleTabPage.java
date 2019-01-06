package pageobjects.SalesLaborDashboard;

import Util.UtilPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SalesLaborDashboardScheduleTabPage extends UtilPage {

    private final WebDriver driver;
    public SalesLaborDashboardScheduleTabPage(WebDriver driver) {
        this.driver = driver;
    }

    //TABS
    private WebElement orgTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(2)"));}
    private WebElement daemonProcessesTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(3)"));}

    // SCHEDULE TAB
    //  Filter Buttons - Schedule tab
    private WebElement prevDateBtn(){return driver.findElement(By.id("prevDateBtn"));}
    private WebElement nextDateBtn(){return driver.findElement(By.id("nextDateBtn"));}
    private WebElement exceptionsChkBox(){return driver.findElement(By.id("exceptionsChkBox"));}
    private WebElement jobSearchField(){return driver.findElement(By.id("jobSearchField"));}
    private WebElement refreshJobsBtn(){return driver.findElement(By.id("refreshJobsBtn"));}
    private WebElement btnCloseSession(){return driver.findElement(By.cssSelector(".stHeaderSection.stHeaderRight div:nth-child(2)"));}

    // Grid Values - Schedule tab
    private List<WebElement> lstOrgIdGridResult(){return driver.findElements(By.cssSelector("#scheduledJobsTable tbody tr:not([style]) td:nth-child(2) a"));}
    private List<WebElement> lstOrgNameGridResult(){return driver.findElements(By.cssSelector("#scheduledJobsTable tbody tr:not([style]) td:nth-child(3) a"));}


    // Navigation tabs

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

    // METHODS SCHEDULE TAB
    public SalesLaborDashboardScheduleTabPage inputJobSearch(String searchValue) throws Exception{
        typeText(jobSearchField(),searchValue);
        return this;
    }

    public SalesLaborDashboardScheduleTabPage unCheckExceptionsOnly(){
        unCheckElement(exceptionsChkBox());
        return this;
    }

    public SalesLaborDashboardScheduleTabPage checkExceptionsOnly(){
        checkElement(exceptionsChkBox());
        return this;
    }

    public SalesLaborDashboardScheduleTabPage refreshJobResult(){
        refreshJobsBtn().click();
        return this;
    }

    public SalesLaborDashboardScheduleTabPage navigatePrevDate(int quantityOfDays){
        for(int i=0;i<quantityOfDays;i++){
            prevDateBtn().click();
        }
        return this;
    }

    public SalesLaborDashboardScheduleTabPage navigateNextDate(int quantityOfDays){
        for(int i=0;i<quantityOfDays;i++){
            nextDateBtn().click();
        }
        return this;
    }

    public int getSizeOrgIdlst(){
        int sizeOrgId = sizeLstWebElement(lstOrgIdGridResult());
        return sizeOrgId;
    }

    public int getSizeOrgNamelst(){
        int sizeOrgName = sizeLstWebElement(lstOrgNameGridResult());
        return sizeOrgName;
    }

    public void logout() {
        btnCloseSession().click();
    }

}

