package com.coforge.Day5_08_07_26_JDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/empdb";
		String uname="root";
		String pwd="root1234";
		Connection con = DriverManager.getConnection(url, uname, pwd);
		
		String query="update employeesalary set salary= ? where emp_name=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setDouble(1, 50000);
		ps.setString(2, "Ajay");
		
		int noOfRows=ps.executeUpdate();
		System.out.println(noOfRows+" rows got updated");
	}

}