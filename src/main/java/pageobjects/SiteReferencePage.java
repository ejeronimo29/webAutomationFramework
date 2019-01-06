package pageobjects;

import javafx.scene.web.WebView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import javax.xml.ws.WebEndpoint;


public class SiteReferencePage {

    private final WebDriver driver;
    public SiteReferencePage(WebDriver driver) {this.driver =  driver;}

    //web elements
    //Site Info
    private WebElement siteId() { return driver.findElement(By.id("site-id")); }
    private WebElement custId() { return driver.findElement(By.id("cust-id")); }
    private WebElement salesAndLaborId()  {return driver.findElement(By.id("snl-id")); }
    private WebElement externalSiteId() { return driver.findElement(By.id("external-site-id")); }
    private WebElement realTimeReportingOffRadiobutton()    { return driver.findElement(By.id("rt-off")); }
    private WebElement realTimeReporting1minRadiobutton()   { return driver.findElement(By.id("rt-1min")); }
    private WebElement realTimeReporting15minRadiobutton()   { return driver.findElement(By.id("rt-15min")); }
    private WebElement updateButton()   { return driver.findElement(By.xpath("//*[@id=\"site-form\"]/fieldset/div[2]/button"));}
    private WebElement siteName()   { return driver.findElement(By.id("site-name")); }
    private WebElement reportingName()   { return driver.findElement(By.id("report-name")); }
    private WebElement timeZoneDropdown()   {return driver.findElement(By.id("timezone")); }
    private WebElement effectiveDate()  { return driver.findElement(By.id("effc-date"));}
    private WebElement endDate() {return driver.findElement(By.id("end-date"));}
    private WebElement commTypeLabel() {return driver.findElement(By.id("comm-type"));}
    private WebElement syncFromRemedyButton() {return driver.findElement(By.id("site-sync-from-remedy"));}
    private WebElement siteMidnightHour() {return driver.findElement(By.id("site-midnight"));}
    private WebElement dailyAcquisitionTimeHour() {return driver.findElement(By.id("acq-hour"));}
    private WebElement dailyAcquisitionTimeMinute() {return driver.findElement(By.id("acq-min"));}
    private WebElement siteType() {return driver.findElement(By.id("site-type"));}
    private WebElement endIndicatorCheckbox() {return driver.findElement(By.id("end-ind"));}
    //Devices Info
    private WebElement refreshDevicesButton() {return driver.findElement(By.id("refresh-devices"));}
    private WebElement leadDevicesTable()  {return driver.findElement(By.id("lead-devices-table"));}
    private WebElement newDeviceButton()    {return driver.findElement(By.id("create-new-device"));}
    private WebElement orbitDevicesTable()  {return driver.findElement(By.id("orbit-devices-table"));}
    //Reporting Info
    private WebElement searchInputBox() {return driver.findElement(By.id("areaTreeSearch"));}
    private WebElement newAreaButton()  {return driver.findElement(By.id("createArea"));}

    //methods
    public SiteReferencePage syncFromRemedy()
    {
        syncFromRemedyButton().click();
        return this;
    }

    public SiteReferencePage clickUpdate()
    {
        updateButton().click();
        return this;
    }

    public SiteReferencePage endTheSite()
    {
        endIndicatorCheckbox().click();
        return this;
    }







}
