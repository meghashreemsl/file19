package com.wolken.wolkenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wolken.wolkenapp.dao.FestivalDAO;
import com.wolken.wolkenapp.dao.FestivalDAOImpl;
public class Festivals {
	public static void main(String[] args) throws SQLException {
		
		//right click on the project >go to properties >java build path>libraries >add jar file(program files(86)>connection j> mysql jar file) select the path> apply 
		// another way to add jar file ..create a folder in the project folder as lib add the jar file and give the path and apply
		/*JDBC 
		 * 1. load and register the driver (particular DB server)
		 * 2. Establish the connection with DB server
		 * 3. create a statement / platform
		 * 4. execute the Query
		 * 5. close the connection
		 */
		//Connection con=null;    // Connection and statement are made  global so that while closing these two , it can be accesssed
		//Statement statement=null;
		
		
		/*try {
			 Class.forName("com.mysql.cj.jdbc.Driver");      //load and register the driver
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Msk@9620507639"); // establish the connection //url should contain schema name , user and password of mysql
		     //statement = con.createStatement();                              // create the platform
			// statement.execute("insert into festival_table values(7,' Holi','oct',2)");             // insert the data for the schema name in the mysql,primary key has to be changed once the program runs , the data exists already 
			 //statement.execute("insert into festival_table values(8,' Navarathri','oct',9)");
			// statement.executeUpdate("insert into festival_table values(11,' Deepavali','Nov',3)");
		     
		     PreparedStatement preparedStatements = con.prepareStatement("insert into festival_table( values(?,?,?,?)");
		     preparedStatements.setInt(1, 2);
		     preparedStatements.setString(2, "diwali");
		     preparedStatements.setString(3, "Nov");
		     preparedStatements.setInt(4, 3);
		     //System.out.println(festival_id+" "+festival_name+" "+festival_month+" "+no_of_days);
		    // preparedStatements.executeUpdate();
		     
		     
		     ResultSet rs= statement.executeQuery("select * from festival_table");
			 while(rs.next()) {
				 int festivalId=rs.getInt("festival_id");
				 String festivalName=rs.getString("festival_name");
				 String festivalMonth=rs.getString("festival_month");
				 int noOfDays=rs.getInt("no_of_days");
				 System.out.println(festivalId+" "+festivalName+" "+festivalMonth+"noOfDays");
			 }
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {    // close the connection
			if(con!=null) {
				try {
				con.close();
			}
				catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
		if(statement !=null) {
			try {
				statement.close();
			}
			catch(SQLException e) {
			e.printStackTrace();
			}
		}*/
		
		// try with resource
		
		FestivalDAO festivalDAO = new FestivalDAOImpl();
		festivalDAO.insert();
		
		      }
	    }

	


