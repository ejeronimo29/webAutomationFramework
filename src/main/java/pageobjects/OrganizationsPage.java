package pageobjects;

import javafx.scene.web.WebView;
import org.apache.xpath.operations.Or;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import javax.xml.ws.WebEndpoint;

public class OrganizationsPage {

    private final WebDriver driver;
    public OrganizationsPage(WebDriver driver) {this.driver = driver;}

    //web elements

    private WebElement logoutLink() { return driver.findElement(By.linkText("Log Out")); }
    private WebElement organizationSettingsLink()   { return driver.findElement(By.linkText("Organization Settings")); }
    private WebElement selectOrgDropdown() { return driver.findElement(By.id("orgSelect")); }
    private WebElement goButton()   { return driver.findElement(By.id("searchByIdButton")); }

    //Organization drill down page
    private WebElement changeOrganizationLink() { return driver.findElement(By.linkText("Change Organization")); }
    private WebElement adultChildThresholdLink()    { return driver.findElement(By.linkText("Adult / Child Threshold")); }
    private WebElement flashTrafficDataFileGeneratorLink() { return driver.findElement(By.linkText("Flash Traffic Data File Generator"));}
    private WebElement kpiOutboundApiSettingsLink() { return driver.findElement(By.linkText("KPI Outbound API Settings")); }
    private WebElement dataExtractApiSettingsLink() { return driver.findElement(By.linkText("Data Extract API Settings"));}
    private WebElement trafficReportApiSettings()   { return driver.findElement(By.linkText("Traffic Report API Settings")); }
    private WebElement trafficReportConfigurationLink() { return driver.findElement(By.linkText("Traffic Report Configuration")); }
    private WebElement loadSitesOperatinHoursLink() {return driver.findElement(By.linkText("Load Sites Operating Hours"));}
    private WebElement remedyAlertingEnabledCheckbox()  { return driver.findElement(By.id("enhancedMonitoring"));}
    private WebElement hierachyManagerLink()    { return driver.findElement(By.linkText("Hierarchy Manager")); }

    //Dashboards drill down
    private WebElement salesAmdLaborProcessLink()   { return driver.findElement(By.linkText("Sales and Labor Process")); }
    private WebElement fileJobViewLink()    { return driver.findElement(By.linkText("File Job View")); }
    private WebElement dataIntegrityLink()  { return driver.findElement(By.linkText("Data Integrity")); }
    private WebElement realtimeTrafficMonitorLink() { return driver.findElement(By.linkText("Realtime Traffic Monitor")); }

    //Adult/Child Threshold elements

    //Flash Traffic Data File Generator elements

    public Select flashEnabledDropdown() { return new Select(driver.findElement(By.id("flashEnabled"))); }
    public Select frequencyDropdown() { return new Select(driver.findElement(By.id("frequency"))); }
    public Select trafficTypeDropdown() {return new Select(driver.findElement(By.id("trafficType")));}
    public Select fileRolloverDropdown()   {return new Select(driver.findElement(By.id("fileRollover")));}
    public Select firstOrbitAtSiteDropdown()   {return new Select(driver.findElement(By.id("epZeroBase")));}
    public Select dataDeliveredAtDropdown()    {return new Select(driver.findElement(By.id("midnightStart")));}
    public Select timeSynchronizedWithDropdown()   {return new Select(driver.findElement(By.id("timeSyncLocation")));}
    public Select timeSyncFrequencyDropdown()  {return new Select(driver.findElement(By.id("timeSyncFrequency")));}
    private WebElement saveButton() {return driver.findElement(By.id("submitButton"));}
    private WebElement cancelButton()   {return driver.findElement(By.id("cancelButton"));}
    private WebElement updateSuccessfulLabel()  {return driver.findElement(By.xpath("//*[@id=\"flashParametersForm\"]/div[3]/div[1]/nobr"));}

    //methods

    public void selectOrganization(String orgName)
    {
        new Select(selectOrgDropdown()).selectByVisibleText(orgName);
        goButton().click();
    }

    public OrganizationsPage openFlashTrafficDataFileGeneratorSection()
    {
        flashTrafficDataFileGeneratorLink().click();
        return this;
    }

    //Flash Traffic Data File Generator methods

    public OrganizationsPage saveNewFlashConfiguration()
    {
        saveButton().click();
        new WebDriverWait(driver,20)
                .until(ExpectedConditions.textToBePresentInElement(updateSuccessfulLabel(),"Update successful"));
        return this;
    }

    public OrganizationsPage cancelChangesToFlashConfiguration()
    {
        cancelButton().click();
        return this;
    }
















}
