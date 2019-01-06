package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import javax.swing.border.EmptyBorder;

public class SiteInfoPage
{
    private final WebDriver driver;

    public SiteInfoPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //-----------------Elements-----------------------------

    private WebElement homeButton()
    {
        return driver.findElement(By.linkText("Home"));
    }

    private WebElement logOutButton()
    {
        return driver.findElement(By.linkText("Log Out"));
    }

    private WebElement refreshButton()
    {
        return driver.findElement(By.linkText("Refresh"));
    }

    private WebElement openCaseValue()
    {
        return driver.findElement(By.xpath(""));//this changes ,if it is 0 its just text, more than zero it becomes a link
    }

    private WebElement orgValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[1]/div[1]/span[2]"));
    }

    private WebElement reportingNameValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[1]/div[2]/span[2]"));
    }

    private WebElement idValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[1]/div[1]/span[2]"));
    }

    private WebElement communicationValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[2]/div[1]/span[2]"));
    }

    private WebElement siteTypeValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[3]/div[1]/span[2]"));
    }

    private WebElement timeZoneValue()//this has dynamic portion for time piece - need to handle this
    {
        return driver.findElement(By.id("timezoneDisplay"));
    }

    private WebElement remedyStatusValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[1]/div[2]/span[2]"));
    }

    private WebElement inStoreFlashValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[2]/div[2]/span[2]"));
    }

    private WebElement realTimeReportingValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[3]/div[2]/span[2]"));
    }

    private WebElement trafficWatchValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[3]/div[1]/div[2]/span[2]"));
    }

    private WebElement registrationStatusValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[1]/div[3]/span[2]"));
    }

    private WebElement lastCheckinValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[2]/div[3]/span[2]"));
    }

    private WebElement lastAuthenticatedCheckinValue()
    {
        return driver.findElement(By.xpath("//*[@id=\"siteInfo\"]/div/div[2]/div[2]/div[3]/div[3]/span[2]"));
    }

    private WebElement trafficLink()
    {
        return driver.findElement(By.linkText("Traffic"));
    }

    private WebElement siteReferenceLink()
    {
        return driver.findElement(By.linkText("Site Reference"));
    }

    private WebElement siteActionsLink()
    {
        return driver.findElement(By.linkText("Site Actions"));
    }

    private WebElement videoLink()
    {
        return driver.findElement(By.linkText("Video"));
    }

    private WebElement dataManagerLink()
    {
        return driver.findElement(By.linkText("Data Manager"));
    }

    private WebElement siteCommunication()
    {
        return driver.findElement(By.linkText("Site Communication"));
    }
    //------------------METHODS-----------------------

    public void refreshPageUsingButton()
    {
        refreshButton().click();
    }

    public void  verifyOrgValue(String expectedOrgValue)
    {
        Assert.assertEquals(expectedOrgValue,orgValue().getText());
    }

    public void verifyReportingName(String expectedReportingName)
    {
        Assert.assertEquals(expectedReportingName,reportingNameValue().getText());
    }

    public void verifyOrgID(String orgID)
    {
        Assert.assertEquals(orgID,idValue().getText());
    }

    public void verifyCommunication(String communicationType)
    {
        Assert.assertEquals(communicationType,communicationValue().getText());
    }

    public void verifySiteType(String siteType)
    {
        Assert.assertEquals(siteType,siteTypeValue().getText());
    }

    //Timezone verification function

    public void verifyRemedyStatus(String remedyStatus)
    {
        Assert.assertEquals(remedyStatus,remedyStatusValue().getText());
    }

    public void verifyInStoreFlash(String inStoreFlash)
    {
        Assert.assertEquals(inStoreFlash,inStoreFlashValue().getText());
    }

    public void verifyRealTimeReporting(String realTimereporting)
    {
        Assert.assertEquals(realTimereporting,realTimeReportingValue().getText());
    }

    public void verifyTrafficWatch(String trafficWatch)
    {
        Assert.assertEquals(trafficWatch,trafficWatchValue().getText());
    }

    public void verifyRegistrationStatus(String registrationStatus)
    {
        Assert.assertEquals(registrationStatus,registrationStatusValue().getText());
    }
}
