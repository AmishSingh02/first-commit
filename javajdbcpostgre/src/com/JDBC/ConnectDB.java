package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectDB {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		Class.forName("org.postgresql.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/capg","postgres","Amish@123");
		Statement st = con.createStatement();
		String query = "select * from products";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		
	} 
		
	
	


