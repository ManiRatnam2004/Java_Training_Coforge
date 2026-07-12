package com.coforge.servlets;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {	

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("cid"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/coforge2db", "root", "root1234");

//            PreparedStatement ps = con.prepareStatement("SELECT * FROM customer WHERE cust_id=?");
//            ps.setInt(1, id);
//
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                request.setAttribute("id", rs.getInt("cust_id"));
//                request.setAttribute("name", rs.getString("cust_name"));
//                request.setAttribute("city", rs.getString("city"));
//            }
            
            PreparedStatement ps = con.prepareStatement(
            	    "SELECT * FROM customer WHERE cid=?"
            	);
            	ps.setInt(1, id);

            	ResultSet rs = ps.executeQuery();

            	if (rs.next()) {
            	    request.setAttribute("id", rs.getInt("cid"));
            	    request.setAttribute("name", rs.getString("cname"));
            	    request.setAttribute("city", rs.getString("city"));
            	}
            

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
        rd.forward(request, response);
    }
}