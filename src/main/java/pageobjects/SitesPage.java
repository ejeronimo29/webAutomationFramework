package pageobjects;

import Util.UtilPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SitesPage extends UtilPage
{
    private final WebDriver driver;
    public SitesPage(WebDriver driver) { this.driver = driver; }

    //web elements
    private WebElement searchInput() {return driver.findElement(By.id("idSearch"));}
    private WebElement goButton()
    {
        return driver.findElement(By.id("searchByIdButton"));
    }
    private WebElement siteIdCheckbox()
    {
        return driver.findElement(By.id("siteButton"));
    }
    private WebElement deviceIdCheckbox()
    {
        return driver.findElement(By.id("deviceButton"));
    }
    private WebElement selectOrgList()
    {
        return driver.findElement(By.id("orgSelect"));
    }
    private WebElement searchText()
    {
        return driver.findElement(By.id("textSearch"));
    }
    private WebElement searchButton()
    {
        return driver.findElement(By.id("searchByTextButton"));
    }
    private WebElement siteNameCheckbox()
    {
        return driver.findElement(By.id("searchBySiteNameCheckbox"));
    }
    private WebElement customerIdCheckbox() { return driver.findElement(By.id("searchByCustomerIdCheckbox")); }
    private WebElement organizationsLink()  { return driver.findElement(By.linkText("Organizations")); }
    private WebElement dashboardsLink() { return driver.findElement(By.linkText("Dashboards")); }
    private WebElement usersLink()  { return driver.findElement(By.linkText("Users"));}
    private WebElement link()
    {
        return driver.findElement(By.xpath("//a[contains(@href,'75285')]"));
    }//this needs to be changed

    //methods
    public SitesPage enterSiteId(String searchInput)
    {
        searchInput().clear();
        searchInput().sendKeys(searchInput);
        return this;
    }

    public SitesPage enterDeviceId(String DeviceId)
    {
        deviceIdCheckbox().click();
        searchInput().clear();
        searchInput().sendKeys(DeviceId);
        return this;
    }

    public DevicesPage go()
    {
        goButton().click();
        return new DevicesPage(driver);
    }

    public SitesPage selectOrgFromList(String orgName)
    {
        selectComboValue(selectOrgList(),orgName);
        return this;
    }

    public SitesPage enterSiteNameCustomerId(String SiteNameCustomerId)
    {
        searchText().clear();
        searchText().sendKeys(SiteNameCustomerId);
        return this;
    }

    public SitesPage selectSiteName()
    {
        siteNameCheckbox().click();
        return this;
    }

    public SitesPage selectCustomerId()
    {
        customerIdCheckbox().click();
        return this;
    }

    public DevicesPage search()
    {
        searchButton().click();
        return new DevicesPage(driver);
    }

    public SitesPage selectSiteLink()
    {
        link().click();
        return this;
    }

    public OrganizationsPage selectOrganizationsLink()
    {
        organizationsLink().click();
        return new OrganizationsPage(driver);
    }

    public UsersPage  selectUsersLink()
    {
        usersLink().click();
        return new UsersPage(driver);
    }

    public DashboardsPage selectDashboardLink(){
        dashboardsLink().click();
        return new DashboardsPage(driver);
    }



}
