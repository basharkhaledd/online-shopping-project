<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>

<%
    String email = session.getAttribute("email").toString();
    String address = request.getParameter("address");
    String city = request.getParameter("city");
    String state = request.getParameter("state");
    String country = request.getParameter("country");

    
    try
    {
       Connection con = ConnectionProvider.getCon();
       PreparedStatement ps = con.prepareStatement("update users set address='"+address+"' , city='"+city+"' ,state='"+state+"' ,country='"+country+"'  where email='"+email+"' " );
       ps.executeUpdate();
       response.sendRedirect("addChangeAddress.jsp?msg=valid");
    }  
 catch(Exception e){
       System.out.print(e);
            response.sendRedirect("addChangeAddress.jsp?msg=invalid");

    }
      
%>