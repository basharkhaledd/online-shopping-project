<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<%@include file="changeDetailsHeader.jsp" %> 
<%@include file="footer.jsp" %> 


 <html>
<head>
<link rel="stylesheet" href="css/changeDetails.css">
<title>Change Details</title>
<style>
hr
{width:70%;}</style>
</head>
<body>
 <%
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from users where email='"+email+"' ");
                        while (rs.next()) {

                %>
<h3>Name: <%=rs.getString("name")%></h3>
<hr>
 <h3>Email: <%=rs.getString("email")%></h3>
 <hr>
 <h3>Mobile Number: <%=rs.getString("mobilenumber")%></h3>
 <hr>
<h3>Security Question: <%=rs.getString("question")%></h3>
<hr>
      <br>
      <br>
      <br>
      <%
                        }
                    } catch (Exception e) {
                        System.out.print(e);
                    }
                %>

                
</body>
</html>