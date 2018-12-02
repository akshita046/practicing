<%-- 
    Document   : display
    Created on : 30 Nov, 2018, 10:06:27 AM
    Author     : hi
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="500px" border="2">
            <tr><td>FirstName</td><td>LastName</td><td>Country</td><td>Description</td></tr>
        
        <%
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");   
             con = DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","akshita");
             String sql="select * from comments";
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while(rs.next()){
             %>
             <tr><td><%= rs.getString("fname") %></td><td><%= rs.getString("lname") %></td><td><%= rs.getString("country") %></td><td><%= rs.getString("description") %></td></tr>
             <%
                 }
        }
        catch (Exception e) {
            out.println(e);
        }
            %>
            </table>
    </body>
</html>
