package pageobjects.DataIntegrityDashboard;

import Util.UtilPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.Arrays;
import java.util.List;

public class DataIntegrityDashboardPage extends UtilPage{

    private final WebDriver driver;
    public DataIntegrityDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement dpDIAnalyst() {return driver.findElement(By.cssSelector("#search-data-integrity-analysts"));}
    private WebElement dpType() {return driver.findElement(By.cssSelector("#search-message-type"));}
    private WebElement btnDates(){return driver.findElement(By.id("search-message-date-range"));}
    private WebElement lnk1DayBefore(){return driver.findElement(By.cssSelector(".prev-days a:nth-child(1)"));}
    private WebElement lnk3DayBefore(){return driver.findElement(By.cssSelector(".prev-days a:nth-child(2)"));}
    private WebElement lnk5DayBefore(){return driver.findElement(By.cssSelector(".prev-days a:nth-child(3)"));}
    private WebElement lnk7DayBefore(){return driver.findElement(By.cssSelector(".prev-days a:nth-child(4)"));}
    private WebElement btnSearchButton(){return driver.findElement(By.id("search-submit"));}
    private WebElement btnAdvancedFilterButton(){return driver.findElement(By.id("advanced-search-submit"));}
    private WebElement dpSiteType(){return driver.findElement(By.cssSelector("#search-site-type"));}
    private WebElement dpSiteStatus(){return driver.findElement(By.cssSelector("#search-site-status"));}
    private WebElement dpOrganization(){return driver.findElement(By.cssSelector("#search-organization"));}
    private WebElement chkCloseHold(){return driver.findElement(By.id("CloseHold"));}
    private WebElement chkCloseRvw(){return driver.findElement(By.id("CloseRvw"));}
    private WebElement dpCountry(){return driver.findElement(By.id("search-country_ms"));}
    private List<WebElement> lstCountry(){return driver.findElements(By.cssSelector(".ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all .ui-multiselect-checkboxes.ui-helper-reset li [for*='search-country'] span"));}
    private WebElement dpState(){return driver.findElement(By.id("search-state_ms"));};
    private List<WebElement> lstState(){return driver.findElements(By.cssSelector(".ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all .ui-multiselect-checkboxes.ui-helper-reset li [for*='search-state'] span"));}
    private WebElement dpCity(){return driver.findElement(By.id("search-city_ms"));}
    private List<WebElement> lstCity(){return driver.findElements(By.cssSelector(".ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all .ui-multiselect-checkboxes.ui-helper-reset li [for*='search-city'] span"));}
    private WebElement dpZip(){return driver.findElement(By.id("search-zip_ms"));}
    private List<WebElement> lstZip(){return driver.findElements(By.cssSelector(".ui-multiselect-menu.ui-widget.ui-widget-content.ui-corner-all .ui-multiselect-checkboxes.ui-helper-reset li [for*='search-zip'] span"));}
    private WebElement btnCloseCountryPanel(){return driver.findElement(By.cssSelector("body>div:nth-child(3) a.ui-multiselect-close span"));}
    private WebElement btnCloseStatePanel(){return driver.findElement(By.cssSelector("body>div:nth-child(4) a.ui-multiselect-close span"));}
    private WebElement btnCloseCityPanel(){return driver.findElement(By.cssSelector("body>div:nth-child(5) a.ui-multiselect-close span"));}
    private WebElement btnCloseZipPanel(){return driver.findElement(By.cssSelector("body>div:nth-child(6) a.ui-multiselect-close span"));}

    // Messages Panel

    private WebElement btnCloseMessage(){return driver.findElement(By.id("buttonCloseMessage"));}
    private WebElement btnReleaseMessage(){return driver.findElement(By.id("buttonReleaseMessage"));}
    private WebElement btnOpenCaseMessage(){return driver.findElement(By.cssSelector("#grid-master-messages .ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary:nth-child(3)"));}
    private WebElement btnNextMessage(){return driver.findElement(By.id("buttonNextMessage"));}
    private WebElement btnCheckAll(){return driver.findElement(By.id("buttonCheckAll"));}
    private WebElement chkGroupBySite(){return driver.findElement(By.id("doGroupingCb"));}
    private WebElement chkGrap(){return driver.findElement(By.id("showGraphCb"));}
    private WebElement grTableResult(){return driver.findElement(By.cssSelector(".pq-header-outer.ui-widget-header span.pq-grid-header.ui-state-default:nth-child(2) table.pq-grid-header-table tbody tr.pq-grid-header-search"));}
    private WebElement txtSiteIdHeader(){return driver.findElement(By.cssSelector(".pq-header-outer.ui-widget-header span.pq-grid-header.ui-state-default:nth-child(2) table.pq-grid-header-table tbody tr.pq-grid-header-search td:nth-child(2)"));}
    private WebElement txtSiteNameHeader(){return driver.findElement(By.cssSelector(".pq-header-outer.ui-widget-header span.pq-grid-header.ui-state-default:nth-child(2) table.pq-grid-header-table tbody tr.pq-grid-header-search td:nth-child(3)"));}
    private List<WebElement> lstlinkDeviceIdGrid(){return driver.findElements(By.cssSelector("tbody tr td div a"));}

    private WebElement spinnerGridMessage(){return driver.findElement(By.cssSelector("#grid-master-messages .pq-loading div.pq-loading-mask.ui-state-highlight div"));}

    // Notes Panel Elements
    private WebElement btnAddNotes(){return driver.findElement(By.cssSelector("button.ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary:nth-child(1) .ui-button-icon-primary.ui-icon.ui-icon-plus"));}
    private WebElement btnUpdateNotes(){return driver.findElement(By.cssSelector("button.ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary .ui-button-icon-primary.ui-icon.ui-icon-pencil"));}
    private WebElement btnCloseNotes(){return driver.findElement(By.cssSelector("button.ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary:nth-child(3) .ui-button-icon-primary.ui-icon.ui-icon-minus"));}

    // Remedy Cases Panel Elements
    private WebElement btnRefresh(){return driver.findElement(By.cssSelector(".pq-toolbar .ui-button-icon-primary.ui-icon.ui-icon-refresh"));}
    private WebElement btnCloseSession(){return driver.findElement(By.cssSelector(".stHeaderSection.stHeaderRight div:nth-child(2)"));}


    //aria-pressed="true"

    // Methods

    public void selectTotalProperty(String value){

    }

    public DataIntegrityDashboardPage selectDIAnalyst(String value)throws Exception{
        waitElementClickable(driver,By.id("buttonCloseMessage"),5500);
        waitElementClickable(driver,By.id("buttonReleaseMessage"),5500);
        waitElementClickable(driver,By.cssSelector("button.ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary:nth-child(1) .ui-button-icon-primary.ui-icon.ui-icon-plus"),5500);

        selectComboValue(dpDIAnalyst(),value);

        return this;
    }

    public DataIntegrityDashboardPage selectType(String value) throws Exception{
        waitElementVisible(driver,By.id("buttonCloseMessage"),5500);
        selectComboValue(dpType(),value);
        return this;
    }

    public DataIntegrityDashboardPage selectDaysBefore(int value)
    {
        waitElementClickable(driver,By.id("search-message-date-range"),5500);
        btnDates().click();
        waitElementClickable(driver,By.cssSelector(".prev-days a:nth-child(1)"),5500);

        switch (value)
        {
            case 1: lnk1DayBefore().click();break;
            case 3: lnk3DayBefore().click();break;
            case 5: lnk5DayBefore().click();break;
            case 7: lnk7DayBefore().click();break;
        }
        return this;
    }

    public DataIntegrityDashboardPage displayAdvancedFilter(){
        waitElementVisible(driver,By.id("buttonCloseMessage"),5500);
        btnAdvancedFilterButton().click();
        return this;
    }

    public DataIntegrityDashboardPage selectSiteType(String value){
        waitElementClickable(driver,By.cssSelector("#search-site-type"),5500);
        selectComboValue(dpSiteType(),value);
        return this;
    }

    public DataIntegrityDashboardPage selectSiteStaus(String value){
        waitElementClickable(driver,By.cssSelector("#search-site-status"),5500);
        selectComboValue(dpSiteStatus(),value);
        return this;
    }

    public DataIntegrityDashboardPage selectOrganization(String value){
        waitElementClickable(driver,By.cssSelector("#search-organization"),5500);
        new Select(dpOrganization()).selectByVisibleText(value);
        return this;
    }

    public DataIntegrityDashboardPage checkCloseHold(){
        checkElement(chkCloseHold());
        return this;
    }

    public DataIntegrityDashboardPage checkCloseRvw(){
        checkElement(chkCloseRvw());
        return this;
    }

    public DataIntegrityDashboardPage checkGraph(){
        checkElement(chkGrap());
        return this;
    }

    public DataIntegrityDashboardPage selectLocation(String country,String state,String city, String zip)throws Exception{
        waitElementClickable(driver,By.id("search-country_ms"),3500);
        dpCountry().click();
        selectElementDropDown(lstCountry(),country);
        btnCloseCountryPanel().click();
        waitElementClickable(driver,By.id("search-state_ms"),3500);
        dpState().click();
        selectElementDropDown(lstState(),state);
        btnCloseStatePanel().click();
        waitElementClickable(driver,By.id("search-city_ms"),3500);
        dpCity().click();
        selectElementDropDown(lstCity(),city);
        btnCloseCityPanel().click();
        waitElementClickable(driver,By.id("search-zip_ms"),3500);
        dpZip().click();
        selectElementDropDown(lstZip(),zip);
        btnCloseZipPanel().click();
        return this;
    }

    // Methods Messages Panel
    public DataIntegrityDashboardPage selectCloseMsgs(){
        btnCloseMessage().click();
        return this;
    }

    public DataIntegrityDashboardPage selectReleaseMsgs(){
        btnReleaseMessage().click();
        return this;
    }

    public DataIntegrityDashboardPage selectOpenCaseMsgs(){
        btnOpenCaseMessage().click();
        return this;
    }

    public DataIntegrityDashboardPage selectCheckAllMsgs(){
        btnCheckAll().click();
        return this;
    }

    public DataIntegrityDashboardPage unCheckGroupBySite(){
        unCheckElement(chkGroupBySite());
        return this;
    }

    public DataIntegrityDashboardPage setSiteIdMessageGrid(String value){
        typeText(txtSiteIdHeader(),value);
        return this;
    }

    public DataIntegrityDashboardPage setSiteNameGrid(String value){
        typeText(txtSiteNameHeader(),value);
        return this;
    }

    public List<String> lstDeviceIdGrid(){
        return convertLstWebElementToString(lstlinkDeviceIdGrid());
    }

    public DataIntegrityDashboardPage checkTheFirstRecordGrid(){
        try {
            waitListElements(driver, By.cssSelector("tbody tr td div input:not([class])"), 4000, 0);
            Thread.sleep(1000);
            List<WebElement> lstCheckDeviceGrid = driver.findElements(By.cssSelector("tbody tr td div input:not([class])"));
            for (WebElement element : lstCheckDeviceGrid) {
                checkElement(element);
                break;
            }
        }catch (Exception e){

        }
        return this;
    }



















    public void selectElmementOfListSpan(List<WebElement> lstElement, String option) {
        System.out.println("CANDTIDAD " + lstElement.size());
        for (WebElement elem : lstElement) {
            WebElement txtVal = elem.findElement(By.cssSelector("span"));
            System.out.println(txtVal.getText());
            // String txtValue = elem.findElement(By.cssSelector("span")).getText();
            if(txtVal.getText().equals(option)){
                System.out.println("SI ENTROOOO");
                elem.findElement(By.cssSelector("span")).click();
            }

        }
    }

    public void selectILelementsValue(WebElement element, String optionSelected) {
        try{
            element.click();
            Thread.sleep(1500);
            List<WebElement> lstElement = element.findElements(By.cssSelector("li"));

            for (WebElement elem : lstElement) {
                if(elem.getText().equals(optionSelected))
                    elem.click();
            }
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }


    // General Methods
    public DataIntegrityDashboardPage doSearch()throws Exception{
        btnSearchButton().click();
        return this;
    }

    public void logout() {
        btnCloseSession().click();
    }




}
