package com.shukhrat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shukhrat.entity.Feedback;

@Component
public class FeedbackDao {

	DAOConnecter dao = new DAOConnecter();
	
	String add = "insert into feedbacks(firstname,lastname,email,country,message) values (?,?,?,?,?)";
	String getAll = "select * from feedbacks";

	public int addFeedback(Feedback feedback){
		System.out.println("addFeedback" + feedback);
		int affected = 0; 
		
		Connection con = dao.getConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(add);
			ps.setString(1, feedback.getName());
			ps.setString(2, feedback.getLastName());
			ps.setString(3, feedback.getEmail());
			ps.setString(4, feedback.getCountry());
			ps.setString(5, feedback.getMessage());
			
		    affected = ps.executeUpdate();	
		} catch(SQLException e) {
			System.out.println("Exception");
		}
				
	    return affected;
	}
	
	public List<Feedback> getFeedbacks() {
		List<Feedback> list = new ArrayList<>();
		Feedback feed;
		Connection con = dao.getConnection();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(getAll);
			
			while(rs.next()) {
				feed = new Feedback();
				feed.setName(rs.getString(1));
				feed.setLastName(rs.getString(2));
				feed.setEmail(rs.getString(3));
				feed.setCountry(rs.getString(4));
				feed.setMessage(rs.getString(5));
				list.add(feed);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
