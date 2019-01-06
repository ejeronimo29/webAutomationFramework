package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.ws.WebEndpoint;
import java.util.ArrayList;
import java.util.List;

public class RealTimeTrafficDashboardPage {

    private final WebDriver driver;
    public RealTimeTrafficDashboardPage(WebDriver driver) {this.driver = driver;}

    private WebElement btnOneHour() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(1)"));}
    private WebElement btnTwoHour() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(2)"));}
    private WebElement btnSixHour() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(3)"));}
    private WebElement btnCopyToClipboard() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(8)"));}

    private WebElement chkAutoRefresh() {return driver.findElement(By.name("autoRefreshCb"));}
    private WebElement chkShowNonSuccessOnly() {return driver.findElement(By.name("showNonSuccessCb"));}

    private WebElement btnRealTimeTransactional() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(10)"));}
    private WebElement btnCheckAll() {return driver.findElement(By.cssSelector("body div.ui-multiselect-menu:nth-child(2) >div.ui-widget-header ul li:nth-child(1)"));}
    private WebElement btnUnCheckAll() {return driver.findElement(By.cssSelector("body div.ui-multiselect-menu:nth-child(2) >div.ui-widget-header ul li:nth-child(2)"));}
    private WebElement btnCloseMultiSelect() {return driver.findElement(By.cssSelector("body div.ui-multiselect-menu:nth-child(2) >div.ui-widget-header ul li:nth-child(3)"));}
    private WebElement chkRealTime() {return driver.findElement(By.cssSelector("body div.ui-multiselect-menu:nth-child(2) >ul.ui-multiselect-checkboxes li:nth-child(1) label input"));}
    private WebElement chkTransactional() {return driver.findElement(By.cssSelector("body div.ui-multiselect-menu:nth-child(2) >ul.ui-multiselect-checkboxes li:nth-child(2) label input"));}

    private WebElement btnDevice() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(11)"));}
    private WebElement btnOrgs() {return driver.findElement(By.cssSelector("#grid-master-org .pq-toolbar button:nth-child(12)"));}

    private List<WebElement> lstOrdId() {return driver.findElements(By.cssSelector("#grid-master-org .pq-cont-right .pq-cont>div:nth-child(2) table tbody tr td.pq-grid-cell:nth-child(1)"));}
    private List<WebElement> lstDetailDevice() {return driver.findElements(By.cssSelector("#device-stats .device-stat"));}

    private WebElement btnCloseSession(){return driver.findElement(By.cssSelector(".stHeaderSection.stHeaderRight div:nth-child(2)"));}

    public RealTimeTrafficDashboardPage selectDeviceOption(){
        btnDevice().click();
        return this;
    }
    public RealTimeTrafficDashboardPage selectOrgsOption(){
        btnOrgs().click();
        return this;
    }

    public List<String> getLstOrdId(){return convertLstWebElementToString(lstOrdId()); }
    public List<String> getLstDetailDevice(){return convertLstWebElementToString(lstDetailDevice()); }

    public RealTimeTrafficDashboardPage selectAllMultiSelectOption(String option){
        btnRealTimeTransactional().click();
        btnCheckAll().click();
        btnCloseMultiSelect();
        return this;
    }

    public RealTimeTrafficDashboardPage unSelectAllMultiSelectOption(String option){
        btnRealTimeTransactional().click();
        btnUnCheckAll().click();
        btnCloseMultiSelect();
        return this;
    }

    public RealTimeTrafficDashboardPage selectOneMultiSelectOption(String option){
        btnRealTimeTransactional().click();
        if(option.toUpperCase().equals("REAL-TIME")){
            checkElement(chkRealTime());
        }else if(option.toUpperCase().equals("TRANSACTIONAL")){
            checkElement(chkTransactional());
        }
        btnCloseMultiSelect();
        return this;
    }

    public RealTimeTrafficDashboardPage selectHour(int value){
        switch (value){
            case 1:
                btnOneHour().click();
                break;
            case 2:
                btnTwoHour().click();
                break;
            case 6:
                btnSixHour().click();
                break;
        }
         return this;
    }

    public RealTimeTrafficDashboardPage checkAutoRefresh(){
        checkElement(chkAutoRefresh());
        return this;
    }

    public RealTimeTrafficDashboardPage checShowNonSuccessOnly(){
        checkElement(chkShowNonSuccessOnly());
        return this;
    }

    public RealTimeTrafficDashboardPage selectCopyToClipboard(){
        btnCopyToClipboard().click();
        return this;
    }

    public void logout() {
        btnCloseSession().click();
    }

    /*************************************************************/

    // Util Methods

    public void waitElementClickable(By element, int time)
    {
        WebDriverWait wait = new WebDriverWait(this.driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementVisible(By element, int time)
    {
        WebDriverWait wait = new WebDriverWait(this.driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void selectElementDropDown(List<WebElement> lstElement, String cad)
    {
        for (WebElement elementSelect : lstElement) {
            if (elementSelect.getText().equals(cad)) {
                elementSelect.click();
            }
        }
    }

    public void checkElement(WebElement element)
    {
        if (!element.isSelected()) {
            element.click();
        }
    }

    public void unCheckElement(WebElement element)
    {
        if (element.isSelected()) {
            element.click();
        }
    }

    public void typeText(WebElement element, String value)
    {
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    public static List<String> convertLstWebElementToString(List<WebElement> lstWebElement){
        List<String> lstElements = new ArrayList<String>();
        for (WebElement element: lstWebElement ) {
            lstElements.add(element.getText());
        }
        return lstElements;
    }



}
