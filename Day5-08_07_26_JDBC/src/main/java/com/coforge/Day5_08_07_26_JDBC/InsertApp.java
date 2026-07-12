package com.coforge.Day5_08_07_26_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class InsertApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/empdb";
		String uname="root";
		String pwd="root1234";
		Connection con = DriverManager.getConnection(url, uname, pwd);
		
		String query="insert into employeesalary values (? ,? ,? ,? ,?)";
		PreparedStatement ps=con.prepareStatement(query);//Pre compiled statement
		ps.setInt(1, 123);
		ps.setString(2, "Ajay");
		ps.setString(3,"IT");
		ps.setDouble(4, 70000.0);
		ps.setDate(5, java.sql.Date.valueOf( LocalDate.now()));
		
		ps.executeUpdate();

	}

}