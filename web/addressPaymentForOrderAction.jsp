<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>

<%
String email = session.getAttribute("email").toString();
String address = request.getParameter("address");
String city = request.getParameter("city");
String state = request.getParameter("state");
String country = request.getParameter("country");
String mobilenumber = request.getParameter("mobilenumber");
String paymentMethod = request.getParameter("paymentMethod");
String transactionID ="";
transactionID = request.getParameter("transactionID");
String status = "bill";


 try {
                        Connection con = ConnectionProvider.getCon();
                        PreparedStatement ps = con.prepareStatement("update users set address=? ,city=? , state=? ,country=? ,mobilenumber=? where email=?  ");
                        ps.setString(1, address);
                        ps.setString(2, city);
                        ps.setString(3, state);
                        ps.setString(4, country);
                        ps.setString(5, mobilenumber);
                        ps.setString(6, email);
                        ps.executeUpdate();

                        
                        PreparedStatement ps1 = con.prepareStatement("update cart set address=? ,city=? , state=? ,country=? ,moblienumber=? ,orderdate=now() ,deliverydate=DATE_ADD(orderdate,INTERVAL 7 DAY) , paymentmethod=? ,transactionid=? ,status=? where email=?");
                        ps1.setString(1, address);
                        ps1.setString(2, city);
                        ps1.setString(3, state);
                        ps1.setString(4, country);
                        ps1.setString(5, mobilenumber);
                        ps1.setString(6, paymentMethod);
                        ps1.setString(7, transactionID);
                        ps1.setString(8, status);
                        ps1.setString(9, email);
                        ps1.executeUpdate();
                        response.sendRedirect("bill.jsp");
                        
                        
                    } catch (Exception e) {
                        System.out.print(e);
                    }

%>