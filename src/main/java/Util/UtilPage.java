package Util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilPage
{
    public void waitElementClickable(WebDriver driver,By element, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementClickable(WebDriver driver,WebElement element, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void selectElementDropDown(List<WebElement> lstElement, String cad)
    {
        for (WebElement elementSelect : lstElement) {
            if (elementSelect.getText().trim().equals(cad)) {
                elementSelect.click();
            }
        }
    }

    public int sizeLstWebElement(List<WebElement> lstWebElement){
        int size = 0;
        if(!lstWebElement.isEmpty() && lstWebElement!=null){ size = lstWebElement.size();}
        return size;
    }

    public void selectComboValue(WebElement element, String optionSelected) {
        try{
            element.click();
            Thread.sleep(1500);
            List<WebElement> lstElement = element.findElements(By.cssSelector("option"));

            for (WebElement elem : lstElement) {
                if(elem.getText().equals(optionSelected))
                    elem.click();
            }
        }catch (Exception e){
                System.out.println("Mostrar error");
        }
    }

    public void selectElmementOfList(List<WebElement> lstElement, String option) {
           for (WebElement elem : lstElement) {
                if(elem.getText().equals(option))
                    elem.click();
            }
    }


    public static void checkElement(WebElement element)
    {
        if (!element.isSelected()) {
            element.click();
        }
    }

    public static void unCheckElement(WebElement element)
    {
        if (element.isSelected()) {
            element.click();
        }
    }

    public static void typeText(WebElement element, String value)
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

    public void waitElementVisible(WebDriver driver,By element, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitListElements(WebDriver driver,By lstelement, int time)
{
    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(lstelement));
}

    public void waitSpinner(WebDriver driver, int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ui-spinner ui-widget ui-widget-content ui-corner-all")));
    }

    public void waitListElements(WebDriver driver,By lstelement, int time, int cant)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(lstelement,cant));
    }

    public boolean webelementAvailable(WebElement element){
        boolean result = false;
        if(element.isEnabled())result=true;
        return result;
    }



}
