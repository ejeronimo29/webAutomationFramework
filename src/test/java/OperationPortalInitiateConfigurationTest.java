import Util.ManageQuery;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.SitesPage;

import java.io.File;

public class OperationPortalInitiateConfigurationTest
        extends ManageQuery
{
    private WebDriver driver;
    private String urlPage;
    private String user;
    private String pass;
    private String ChromeDriverPath;
    private String screenPath;

    @BeforeTest
    public void Given()
            throws Exception
    {
            this.urlPage = getPropertiesValues().getProperty("urlOpsPortalTest03");
            this.user = getPropertiesValues().getProperty("user");
            this.pass = getPropertiesValues().getProperty("pass");
            this.ChromeDriverPath = getPropertiesValues().getProperty("ChromeDriverPath");

            System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
            this.driver = new ChromeDriver();
            this.driver.manage().window().maximize();
       }

    @Test
    public void initiateStereoConfiguration() throws Exception{
        driver.get(urlPage);
        LoginPage loginPage = new LoginPage(driver);
        SitesPage sitesPage = loginPage.enterUsername(user).enterPassword(pass).login();
        sitesPage.selectOrgFromList("Test - Shoppertrak Physical Lab")
                .enterSiteNameCustomerId("%");

     }


    @AfterMethod
    public void afterMethod(ITestResult result) throws Exception{
        String nameMethod = result.getMethod().getMethodName();
        if(!result.isSuccess()){
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(screenPath+nameMethod+".png"));
        }
    }

    @AfterTest
    public void Then() throws Exception {
        deleteDataIntegrityRecords();
         if(driver != null)driver.quit();

    }

}
