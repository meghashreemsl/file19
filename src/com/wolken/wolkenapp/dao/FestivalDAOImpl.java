package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wolken.wolkenapp.connection.Connect;

public class FestivalDAOImpl implements FestivalDAO {
public 	Connection con = Connect.getConnect();
	@Override
	public void insert() throws SQLException {
		
	
		//try (Connection con = Connect.getConnect()) {
			try (PreparedStatement preparedStatements = con.prepareStatement("insert into jdbc.festival_table values(?,?,?,?)");) {
	
				preparedStatements.setInt(1, 35);
				preparedStatements.setString(2, "holi");
				preparedStatements.setString(3, "nov");
				preparedStatements.setInt(4, 3);

				// System.out.println(festival_id+" "+festival_name+" "+festival_month+"
				// "+no_of_days);
				preparedStatements.executeUpdate();
			}
			try (Statement statement = con.createStatement()) {
				try (ResultSet rs = statement.executeQuery("select * from jdbc.festival_table")) {

					while (rs.next()) {
						int festivalId = rs.getInt("festival_id");
						String festivalName = rs.getString("festival_name");
						String festivalMonth = rs.getString("festival_month");
						int noOfDays = rs.getInt("no_of_days");
						System.out.println(festivalId + " " + festivalName + " " + festivalMonth + " "+noOfDays);
					}
					//rs.close();
				}
			}
			con.close(); 
			//Connect.closeConnection();	
			}
	}
//}