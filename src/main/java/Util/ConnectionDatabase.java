package Util;

import oracle.jdbc.pool.OracleDataSource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;

public class ConnectionDatabase extends ReadProperties{

    private String host;
    private String db_service;
    private String db_user;
    private String db_password;
    private String db_driver;
    private String db_connection;

    public Connection getOracleConnection() throws Exception{

        host = getPropertiesValues().getProperty("hostDatabase3");
        db_service = getPropertiesValues().getProperty("db_service3");
        db_user = getPropertiesValues().getProperty("db_user");
        db_password = getPropertiesValues().getProperty("db_password");
        db_connection = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST="+host+")(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME="+db_service+")))";
        System.out.println(db_connection);

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection oracleConnection = null;
        OracleDataSource ods = new OracleDataSource();
        ods.setURL(db_connection);
        ods.setUser(db_user);
        ods.setPassword(db_password);
        oracleConnection = ods.getConnection();

        return oracleConnection;
    }

    public static StringBuffer readSQlFile(String path) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(path));
        String str;
        StringBuffer sb = new StringBuffer();
        while ((str =in.readLine())!= null){
            sb.append(str+"\n");
        }
        in.close();
        return sb;
    }
}
