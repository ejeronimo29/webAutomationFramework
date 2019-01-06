package Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManageQuery  extends ConnectionDatabase{
    Connection con = null;
    Statement st = null;
    ResultSet rst = null;

    public void insertDataIntegrityRecords() throws Exception{
        try{
            String sqlPath = getPropertiesValues().getProperty("sql_data_integrity_path");
            StringBuffer sql = readSQlFile(sqlPath);
            con = new  ConnectionDatabase().getOracleConnection();
            st = con.createStatement();
            st.executeQuery(sql.toString());
        }catch(SQLException ex){
            ex.printStackTrace();
            ex.getMessage();
        }
        con.close();
        st.close();
    }

    public int verifyDataIntegrityRecords() throws Exception{
        int count=0;
        try {
            String sqlPath = getPropertiesValues().getProperty("sql_verify_data_integrity_path");
            StringBuffer sql = readSQlFile(sqlPath);
            con = new  ConnectionDatabase().getOracleConnection();
            st = con.createStatement();
            rst = st.executeQuery(sql.toString());
            while (rst.next()) count++;
        }catch (SQLException ex){
            ex.printStackTrace();
            ex.getMessage();
        }
        con.close();
        rst.close();
        st.close();
        return count;
    }

    public void deleteDataIntegrityRecords() throws Exception{
        try {
            String sqlPath = getPropertiesValues().getProperty("sql_delete_data_integrity_path");
            StringBuffer sql = readSQlFile(sqlPath);
            con = new  ConnectionDatabase().getOracleConnection();
            st = con.createStatement();
            st.executeQuery(sql.toString());
        }catch (SQLException ex){
            ex.printStackTrace();
            ex.getMessage();
        }
        con.close();
        st.close();
    }



}
