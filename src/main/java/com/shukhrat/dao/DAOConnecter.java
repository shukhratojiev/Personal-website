package com.shukhrat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConnecter {
	
	String url = "jdbc:mysql://secondtry.cdsswqwyi9uc.us-east-1.rds.amazonaws.com:3306/tojiev2";             //  tojiev2
	String root = "root";                                                                              //   3306
	String password = "19021997";                                        //  secondtry.cdsswqwyi9uc.us-east-1.rds.amazonaws.com
	
    public Connection getConnection() {
	    
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,root,password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
}
