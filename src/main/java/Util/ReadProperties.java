package Util;

import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties
{
    public static Properties getPropertiesValues()
            throws Exception
    {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Properties prop = new Properties();

        prop.load(new FileInputStream("src/main/resources/configuration.properties"));

        return prop;
    }
}
