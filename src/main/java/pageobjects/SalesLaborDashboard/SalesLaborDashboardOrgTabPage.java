package pageobjects.SalesLaborDashboard;

import Util.UtilPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SalesLaborDashboardOrgTabPage extends UtilPage {

    private final WebDriver driver;
    public SalesLaborDashboardOrgTabPage(WebDriver driver) {
        this.driver = driver;
    }

    //TABS
    private WebElement scheduleTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(1)"));}
    private WebElement daemonProcessesTab(){return driver.findElement(By.cssSelector(".tabs-menu li:nth-child(3)"));}

    // ORG TAB
    // Filter Buttons - Org tab
    private WebElement orgSelectField(){return driver.findElement(By.id("orgSelectField"));}
    private WebElement orgExceptionsChkBox(){return driver.findElement(By.id("orgExceptionsChkBox"));}
    private WebElement orgJobSearchField(){return driver.findElement(By.id("orgJobSearchField"));}
    private WebElement orgRefreshJobsBtn(){return driver.findElement(By.id("orgRefreshJobsBtn"));}
    private WebElement btnCloseSession(){return driver.findElement(By.cssSelector(".stHeaderSection.stHeaderRight div:nth-child(2)"));}

    private List<WebElement> lstDateGridResult(){return driver.findElements(By.cssSelector("#selectedOrgTable tbody tr.highlightWarningRow td:nth-child(1)"));}


    // Navigation tabs
    public SalesLaborDashboardScheduleTabPage selectScheduleTab(){
        scheduleTab().click();
        waitElementClickable(driver,By.id("jobSearchField"),3500);
        return new SalesLaborDashboardScheduleTabPage(this.driver);
    }

    public SalesLaborDashboardDaemonTabPage selectDaemonTab(){
        daemonProcessesTab().click();
        waitElementClickable(driver,By.id("refreshDeamonProcessesBtn"),3500);
        return new SalesLaborDashboardDaemonTabPage(this.driver);
    }

    // Methods for ORG TAB

    public SalesLaborDashboardOrgTabPage inputSearchOrgID(String searchValue){
        typeText(orgSelectField(),searchValue);
        return this;
    }

    public SalesLaborDashboardOrgTabPage unCheckExceptionsOnlyOrgs(){
        unCheckElement(orgExceptionsChkBox());
        return this;
    }

    public SalesLaborDashboardOrgTabPage checkExceptionsOnlyOrgs(){
        checkElement(orgExceptionsChkBox());
        return this;
    }

    public SalesLaborDashboardOrgTabPage inputSearchAllOrg(String searchValue){
        typeText(orgJobSearchField(),searchValue);
        return this;
    }

    public SalesLaborDashboardOrgTabPage refreshOrgResult(){
        orgRefreshJobsBtn().click();
        return this;
    }

    public List<String> getOrgDatelst(){
        waitElementClickable(driver,lstDateGridResult().get(0),1500);
        List<String> lstOrgDate = convertLstWebElementToString(lstDateGridResult());
        return lstOrgDate;
    }

    public int getSizeDatelst(){
        int sizeOrgDate = sizeLstWebElement(lstDateGridResult());
        return sizeOrgDate;
    }

    public void logout() {
        btnCloseSession().click();
    }



}

