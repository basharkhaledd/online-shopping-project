<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>

<%
    String email = request.getParameter("email");
    String mobilenumber = request.getParameter("mobilenumber");
    String securityquestion = request.getParameter("securityquestion");
    String answer = request.getParameter("answer");
    String newpassword = request.getParameter("newpassword");
    
    int check=0;
    
    try
    {
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from users where email='"+email+"' and mobilenumber='"+mobilenumber+"' and question='"+securityquestion+"'"
            + "and answer='"+answer+"'   ");
    if(rs.next()){
     check=1;
     st.executeUpdate("update users set password='"+newpassword+"' where email='"+email+"' ");
      response.sendRedirect("forgotPassword.jsp?msg=done");
    }
    if(check==0){
    response.sendRedirect("forgotPassword.jsp?msg=invalid");
    }
    }
    catch(Exception e){
       System.out.print(e);
    }
    
%>