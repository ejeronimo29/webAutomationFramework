package Util;

public class main
{
    public static void main(String[] args)
            throws Exception
    {
        ReadProperties readProperties = new ReadProperties();
        ReadProperties.getPropertiesValues().getProperty("user");

        System.out.println(ReadProperties.getPropertiesValues().getProperty("user"));
    }
}
