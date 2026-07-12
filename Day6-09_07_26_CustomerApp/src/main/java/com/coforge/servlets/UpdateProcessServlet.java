package com.coforge.servlets;

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/UpdateProcessServlet")
public class UpdateProcessServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("cid"));
        String name = request.getParameter("cname");
        String city = request.getParameter("city");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/coforge2db", "root", "root1234");

            PreparedStatement ps = con.prepareStatement(
                "UPDATE customer SET cname=?, city=? WHERE cid=?");

            ps.setString(1, name);
            ps.setString(2, city);
            ps.setInt(3, id);

            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("CustomerDetailsServlet");
    }
}