package com.shukhrat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.shukhrat.entity.Subscribers;

@Component
public class SubscribeDAO {

	DAOConnecter dao = new DAOConnecter();
	
	String addSubscriber = "insert into subscribers(email) values(?)";
	
	public void subscribe(Subscribers subscribe) {
		
		Connection con = dao.getConnection();
		try {
			PreparedStatement pt = con.prepareStatement(addSubscriber);
			pt.setString(1, subscribe.getEmail());
			pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
