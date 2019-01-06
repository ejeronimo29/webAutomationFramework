package pageobjects;

import com.sun.jna.platform.win32.Winspool;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.yaml.snakeyaml.events.Event;

public class DevicesPage
{
    private final WebDriver driver;
    public DevicesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //web elements
    private WebElement refreshLink()    {return driver.findElement(By.linkText("Refresh"));}
    private WebElement hideSiteInformationLink()    {return driver.findElement(By.linkText("Hide Site Information"));}
    private WebElement homeButton() {return driver.findElement(By.linkText("findSite.html"));}
    
    //Site Info
    private WebElement openCaseValueLabel() {return driver.findElement(By.xpath("//*[@id=\"siteHeader\"]/div[1]/span[4]"));}
    private WebElement orgLabel()   {return driver.findElement(By.xpath(""));}
    private WebElement reportingNameLabel() {return driver.findElement(By.xpath(""));}
    private WebElement idLabel()    {return driver.findElement(By.xpath(""));}
    private WebElement communicationLabel() {return driver.findElement(By.xpath(""));}
    private WebElement siteTypeLabel()  {return driver.findElement(By.id(""));}
    private WebElement timeZoneLabel()   {return driver.findElement(By.id(""));}
    private WebElement inStoreFlashLabel()  {return driver.findElement(By.id(""));}

    //device main
    private WebElement statusButton()   {return driver.findElement(By.id("deviceStatusCheckButton"));}
    private WebElement optionsLink()    {return driver.findElement(By.id("options_link_206743"));} //this needs the device id part
    private WebElement initiateConfigurationButton()  {return driver.findElement(By.xpath("//*[@id='deviceOptions_206743']/div[4]/div[1]/div[1]/button/span[1]"));} //this needs the device id part
    private WebElement analyzeScene()   {return driver.findElement(By.xpath("//*[@id=\"deviceOptions_206743\"]/div[4]/div[1]/button/span[1]"));} //this needs the device id part
    private WebElement calibZoneConfigButton()  {return driver.findElement(By.id("config_panel_+uniqueOrbitId"));} //this needs the device id part
    private WebElement deviceConnectionMessage()    {return driver.findElement(By.id("status_content_206743"));}
    private WebElement syncClockButton()  {return driver.findElement(By.xpath("//*[@id=\"button_206743\"]/span[2]"));}
    private WebElement getTimeButton()  {return driver.findElement(By.xpath(".//*[@id='button_206743'][2]"));} //.//*[@id='button_+uniqueOrbitId+'][2]
    private WebElement resetButton()    {return driver.findElement(By.xpath(""));}



    //Calibration,Zoning and Configuration
    private WebElement calibZoneConfigLink()    {return driver.findElement(By.linkText("Calibration, Zoning and Configuration"));}
    //private WebElement calibrateButton()    {return driver.findElement(B)}
    //private WebElement configureButton()    {return driver.findElement(B)}
    //btn_CalCopy=Xpath:.//*[@id='ui-id-1']/form/div[1]/div[2]/div/input[2]
    //btn_CalDelete=Xpath:.//*[@id='ui-id-1']/form/div[1]/div[2]/div/input[3]
    //btn_CalSend=Xpath:.//*[@id='ui-id-1']/form/div[1]/div[2]/div/button
    //btn_CalRetrieve=Xpath:.//*[@id='ui-id-1']/form/div[2]/div[2]/div/input
    //-----------

    //Snapshots
    private WebElement snapshotsLink()  {return driver.findElement(By.linkText("Snapshots"));}
    private WebElement takeSnapshotButton() {return driver.findElement(By.name("snapshot_button_206743"));}//this needs the device id part
    private WebElement showSnapshotOptionsLink()    {return driver.findElement(By.linkText("Show Snapshot Options"));}
    private WebElement viewSnapshotButton() {return driver.findElement(By.xpath("//*[@id='ui-id-5']/div[1]/div[2]/div/input[1]"));}
    //private WebElement deleteSnapshotOnNetworkButton()    {return driver.findElement(By.xpath())}
    private WebElement retrieveSnapshotButton() {return driver.findElement(By.xpath("//*[@id='ui-id-5']/div[2]/div[2]/div/input[1]"));}
    private WebElement deleteSnapshotOnDeviceButton()   {return driver.findElement(By.xpath("//*[@id='ui-id-5']/div[2]/div[2]/div/input[2]"));}
    private WebElement deleteScheduledSnapshotButton()  {return driver.findElement(By.xpath("//*[@id='ui-id-5']/div[3]/div[2]/div/input"));}
    private WebElement imageTypeDropdown() {return driver.findElement(By.name("snapshot_image_type"));}
    private WebElement snapshotCalendarIcon()   {return driver.findElement(By.xpath("//*[@id='snapshot_calendar_display']/img"));}

    //Recordings
    private WebElement recordingsLink() {return driver.findElement(By.linkText("Recordings"));}
    private WebElement scheduleDVRButton()  {return driver.findElement(By.name("dvr_button_206743"));}//this needs the device id part
    private WebElement showDVROptionsLink() {return driver.findElement(By.linkText("Show DVR Options"));}
    private WebElement viewRecordingButton()  {return driver.findElement(By.id("//*[@id=\'button_view_video_206743\'"));}//this needs the device id part
    private WebElement deleteRecordingButton()  {return driver.findElement(By.xpath("//*[@id='ui-id-7']/div[1]/div[2]/div/input[2]"));}
    private WebElement retrieverecordingButton()    {return driver.findElement(By.xpath("//*[@id='ui-id-7']/div[2]/div[2]/div/input[1]"));}
    private WebElement deleteRecordingFromDeviceButton()    {return driver.findElement(By.xpath("//*[@id='ui-id-7']/div[2]/div[2]/div/input[2]"));}
    private WebElement deleteScheduledRecordingButton()    {return driver.findElement(By.xpath("//*[@id='ui-id-7']/div[3]/div[2]/div/input"));}
    private WebElement recordingLengthDropdwon()    {return driver.findElement(By.id("dvr_duration"));}
    private WebElement dvrImageTypeDropdown()  {return driver.findElement(By.id("dvr_image_type"));}
    private WebElement recordingsCalendarIcon() {return  driver.findElement(By.xpath(""));}

    //Traffic on Device
    private WebElement trafficOnDeviceLink() {return driver.findElement(By.linkText("Traffic on Device"));}
    private WebElement showViewTrafficOptionsLink() {return driver.findElement(By.id("showViewOptions_+uniqueOrbitId"));}//this needs the device id part
    private WebElement viewTrafficButton() {return driver.findElement(By.xpath("//*[@id='viewTraffic_+uniqueOrbitId+']/div[2]/input"));}//this needs the device id part
    private WebElement showProcessTrafficOptionsLink() {return driver.findElement(By.id("showProcessOptions_206743"));}//this needs the device id part
    private WebElement processTrafficButton() {return driver.findElement(By.xpath("//*[@id='processTraffic_+uniqueOrbitId+']/div[2]/input"));}

    //Program


    //methods
    public DevicesPage clickShowOptionsLinkAndWaitToConnect()
    {
        optionsLink().click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(deviceConnectionMessage(),"Command Successful"));
        return this;
    }

    public DevicesPage syncOrbitClock()
    {
        syncClockButton().click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(deviceConnectionMessage(),"Sync clock complete"));
        return this;
    }

    public DevicesPage checkOrbitTime()
    {
        getTimeButton().click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(deviceConnectionMessage(),"Current time on the device is 01/19/2018 4:29:08 PM CST. Device clock is off by 1 seconds."));//use reg ex here
        return this;
    }

    public DevicesPage resetOrbit()
    {
        resetButton().click();
        return this;
    }

    public DevicesPage openCalibrationZoningConfigSection()
    {
        calibZoneConfigLink().click();
        return this;
    }

    public DevicesPage openSnapshotSection()
    {
        snapshotsLink().click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(takeSnapshotButton()));
        return this;
    }

    public DevicesPage takeDefaultSnapshot()
    {
        takeSnapshotButton().click();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(deviceConnectionMessage(),"Selected file(s) removed successfully."));
        return this;
    }

    public DevicesPage openSnapshotOptions()
    {
        showSnapshotOptionsLink().click();
        return this;
    }

    public DevicesPage selectImageType(String imageType)
    {
        imageTypeDropdown().sendKeys(imageType);
        return this;
        //options to select are: "Validate (q)","Configure (cD)", "Stereo (aA)"
    }
}
