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

public class DataIntegrityGraphTrafficPage extends UtilPage{

    private final WebDriver driver;
    public DataIntegrityGraphTrafficPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement byTimeButton(){return driver.findElement(By.cssSelector(".view-data-options.nav-2nd-line.ui-buttonset label:nth-child(2)"));}
    private WebElement byOrbit(){return driver.findElement(By.cssSelector(".view-data-options.nav-2nd-line.ui-buttonset label:nth-child(4)"));}

    private WebElement currentData(){return driver.findElement(By.cssSelector(".view-original-data.nav-2nd-line.ui-buttonset label:nth-child(2)"));}
    private WebElement originalData(){return driver.findElement(By.cssSelector(".view-original-data.nav-2nd-line.ui-buttonset label:nth-child(4)"));}

    private WebElement btnPrevgraph(){return driver.findElement(By.cssSelector(".previous-graph.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-only"));}

    //Message Graph Panel Elements
    private List<WebElement> lstRecordMessageInfoGraph(){return driver.findElements(By.cssSelector(".divMessageRowAboveGraph tbody tr:nth-child(2) td"));}
    private WebElement panelGraph(){return driver.findElement(By.cssSelector("#enters_chart .highcharts-container"));}
    private List<WebElement> subMenuAllListElementGraph(){return driver.findElements(By.cssSelector(".context-menu-list.context-menu-root li"));}
    private List<WebElement> subMenuDisableListElementGraph(){return driver.findElements(By.cssSelector(".context-menu-list.context-menu-root li.disabled"));}

    private WebElement totalProperty() {return driver.findElement(By.cssSelector(".report-title.nav-left #areaMenu-button"));}
    private WebElement btnCloseMessage(){return driver.findElement(By.id("buttonCloseMessage"));}
    private WebElement btnReleaseMessage(){return driver.findElement(By.id("buttonReleaseMessage"));}
    private WebElement btnOpenCaseMessage(){return driver.findElement(By.cssSelector("#grid-master-messages .ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary:nth-child(3)"));}
    private WebElement btnSearchButton(){return driver.findElement(By.id("search-submit"));}
    private WebElement btnNextMessage(){return driver.findElement(By.id("buttonNextMessage"));}


    private WebElement btnCloseSession(){return driver.findElement(By.cssSelector(".stHeaderSection.stHeaderRight div:nth-child(2)"));}

    public boolean validateMessageInformationText(){
        waitListElements(driver,By.cssSelector(".divMessageRowAboveGraph tbody tr:nth-child(2) td"),3500);

        int cont=0;
        for (WebElement element:lstRecordMessageInfoGraph()) {
            if(element.getText()!= null)cont++;
        }
        if(cont==5)return true;

        return false;
    }

    public boolean closeMsgAvailable(){
        waitElementClickable(driver,By.id("buttonCloseMessage"),3500);
        return webelementAvailable(btnCloseMessage());
    }

    public boolean releaseMessageAvailable(){
        waitElementClickable(driver,By.id("buttonReleaseMessage"),3500);
        return webelementAvailable(btnReleaseMessage());
    }

    public boolean openCaseAvailable(){
        waitElementClickable(driver,By.cssSelector("#grid-master-messages .ui-corner-all.ui-button.ui-widget.ui-state-default.ui-button-text-icon-primary:nth-child(3)"),3500);
        return webelementAvailable(btnOpenCaseMessage());
    }

    // General Methods
    public DataIntegrityGraphTrafficPage doSearch()throws Exception{
        btnSearchButton().click();
        return this;
    }

    public boolean nextMessageAvailable(){
        waitElementClickable(driver,By.id("buttonNextMessage"),3500);
        return webelementAvailable(btnNextMessage());
    }

    public boolean groupBySiteAvailable(){

        if(driver.findElement(By.id("doGroupingCb")).isEnabled()){
            return true;
        }
        return false;
    }

    public boolean rightPanelsAvailable(){
        waitElementClickable(driver,By.id("grid-detail-site-info"),3500);
        waitElementClickable(driver,By.id("grid-detail-flags"),3500);
        waitElementClickable(driver,By.id("grid-detail-notes"),3500);
        waitElementClickable(driver,By.id("grid-detail-cases"),3500);
        return true;
    }

    public boolean subMenuElementsValidations(){
        waitElementClickable(driver,By.cssSelector("#enters_chart .highcharts-container"),7500);
        WebElement element = driver.findElement(By.cssSelector("#enters_chart .highcharts-container"));
        Actions clicker = new Actions(driver);
        clicker.contextClick(element).perform();

        List<WebElement> allElement = driver.findElements(By.cssSelector(".context-menu-list.context-menu-root li"));
        List<WebElement> disableElement = driver.findElements(By.cssSelector(".context-menu-list.context-menu-root li.disabled"));

        if(allElement.size()==11 && disableElement.size()==4){
            System.out.println("Entro");
            // if(disableElement.containsAll(Arrays.asList("Release Data","Copy Day","Restore Original Data")))
            if(disableElement.containsAll(Arrays.asList("Copy Day","Release Data","Manual Adjustment","Restore Original Data")))
                System.out.println("Valido");
            return true;
        }
        return false;
    }

    public boolean calendarButtonAvailable(){
        if(driver.findElement(By.cssSelector(".ui-button-icon-primary.ui-icon.double-arrows-left")).isEnabled()){
            waitElementClickable(driver,By.cssSelector(".ui-button-icon-primary.ui-icon.double-arrows-left"),4500);
            waitElementClickable(driver,By.cssSelector(".ui-button-icon-primary.ui-icon.ui-icon-arrowthick-1-w"),4500);
            waitElementClickable(driver,By.cssSelector(".chart-nav.nav-right .chart-nav-top .report-date.single-day-cal"),4500);
            waitElementClickable(driver,By.cssSelector(".ui-button-icon-secondary.ui-icon.ui-icon-arrowthick-1-e"),4500);
            waitElementClickable(driver,By.cssSelector(".ui-button-icon-secondary.ui-icon.double-arrows-right"),4500);

            driver.findElement(By.cssSelector(".chart-nav.nav-right .chart-nav-top .report-date.single-day-cal")).click();

            waitElementClickable(driver,By.cssSelector(".date-picker-wrapper.no-shortcuts.two-months.no-gap .drp_top-bar.normal #dateRangeInput"),4500);

            driver.findElement(By.cssSelector(".date-picker-wrapper.no-shortcuts.two-months.no-gap .drp_top-bar.normal #dateRangeInput")).sendKeys("4");
            driver.findElement(By.cssSelector(".date-picker-wrapper.no-shortcuts.two-months.no-gap .drp_top-bar.normal #dateRangeInput")).sendKeys(Keys.ENTER);
            return true;
        }
        return false;
    }

    public boolean rememberChanges() throws Exception{
        Thread.sleep(2000);
        waitSpinner(driver,3500);
        String totalPropertyOriginal = driver.findElement(By.cssSelector("#areaMenu-button .ui-selectmenu-text")).getText();
        String byTimeStatusOriginal = byTimeButton().getAttribute("aria-pressed").toString();
        String byOrbitStatusOriginal = byOrbit().getAttribute("aria-pressed").toString();
        String currentDataStatusOriginal = currentData().getAttribute("aria-pressed").toString();
        String originalDataStatusOriginal = originalData().getAttribute("aria-pressed").toString();
        String dayStatusOriginal="";
        List<WebElement> lstDayRanges = driver.findElements(By.cssSelector(".view-days.nav-2nd-line.ui-buttonset label"));

        for (WebElement element:lstDayRanges) {
            if(element.getAttribute("aria-pressed").toString().equals("true")) {
                dayStatusOriginal = element.findElement(By.cssSelector("span")).getText();
            }
        }
        waitElementVisible(driver,By.id("areaMenu-button"),1000);
        driver.findElement(By.id("areaMenu-button")).click();
        WebElement totalProperty = driver.findElement(By.id("areaMenu-menu"));
        selectILelementsValue(totalProperty,"2 - Main Entrance b");
        byOrbit().click();
        waitSpinner(driver,2500);
        originalData().click();
        // waitSpinner(driver,2500);
        // selectElmementOfListSpan(lstDayRanges,"49");
        waitSpinner(driver,2500);
        btnPrevgraph().click();
        waitSpinner(driver,3500);
        btnPrevgraph().click();
        waitSpinner(driver,3500);
        btnPrevgraph().click();
        waitSpinner(driver,3500);

        String totalPropertyPrev = totalProperty().getText();
        String byTimeStatusPrev = byTimeButton().getAttribute("aria-pressed").toString();
        String byOrbitStatusPrev = byOrbit().getAttribute("aria-pressed").toString();
        String currentDataStatusPrev = currentData().getAttribute("aria-pressed").toString();
        String originalDataStatusPrev = originalData().getAttribute("aria-pressed").toString();
        String dayStatusPrev="";
        for (WebElement element:lstDayRanges) {
            if(element.getAttribute("aria-pressed").toString().equals("true")) {
                dayStatusPrev = element.findElement(By.cssSelector("span")).getText();
            }
        }

        if(totalPropertyOriginal.equals(totalPropertyPrev) & byTimeStatusOriginal.equals(byTimeStatusPrev) &
                byOrbitStatusOriginal.equals(byOrbitStatusPrev) & currentDataStatusOriginal.equals(currentDataStatusPrev) &
                originalDataStatusOriginal.equals(originalDataStatusPrev) & dayStatusOriginal.equals(dayStatusPrev)
                ){
            return true;
        }
        return false;
    }



    public void logout() {
        btnCloseSession().click();
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


}
