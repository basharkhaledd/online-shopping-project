package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class ordersReceived_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/adminHeader.jsp");
    _jspx_dependants.add("/admin/../footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("        ");
String email =session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("            <center><h2>Online shopping (BTech Days)</h2></center>\r\n");
      out.write("            <a href=\"addNewProduct.jsp\">Add New Product <i class='fas fa-plus-square'></i></a>\r\n");
      out.write("            <a href=\"allProductEditProduct.jsp\">All Products & Edit Products <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"messagesReceived.jsp\">Messages Received <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"ordersReceived.jsp\">Orders Received <i class=\"fas fa-archive\"></i></a>\r\n");
      out.write("            <a href=\"cancelOrders.jsp\">Cancel Orders <i class='fas fa-window-close'></i></a>\r\n");
      out.write("            <a href=\"deliveredOrders.jsp\">Delivered Orders <i class='fas fa-dolly'></i></a>\r\n");
      out.write("            <a href=\"../logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write(" \r\n");
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Bashar qawasmi</p>\r\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/ordersReceived-style.css\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<style>\r\n");
      out.write(".th-style\r\n");
      out.write("{ width: 25%;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">Orders Received <i class=\"fas fa-archive\"></i></div>\r\n");
      out.write("\r\n");

String msg = request.getParameter("msg");
if("cancel".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Order Cancel Successfully!</h3>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");

if("delivered".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Successfully Updated!</h3>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");

if("invalid".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Some thing went wrong! Try Again!</h3>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table id=\"customers\">\r\n");
      out.write("          <tr>\r\n");
      out.write("          <th>Mobile Number</th>\r\n");
      out.write("            <th scope=\"col\">Product Name</th>\r\n");
      out.write("            <th scope=\"col\">Quantity</th>\r\n");
      out.write("            <th scope=\"col\">Sub Total $</th>\r\n");
      out.write("            <th>Address</th>\r\n");
      out.write("            <th>City</th>\r\n");
      out.write("            <th>State</th>\r\n");
      out.write("            <th>Country</th>\r\n");
      out.write("            <th scope=\"col\">Order Date</th>\r\n");
      out.write("             <th scope=\"col\">Expected Delivery Date</th>\r\n");
      out.write("             <th scope=\"col\">Payment Method</th>\r\n");
      out.write("              <th scope=\"col\">T-ID</th>\r\n");
      out.write("              <th scope=\"col\">Status</th>\r\n");
      out.write("              <th scope=\"col\">Cancel order <i class='fas fa-window-close'></i></th>\r\n");
      out.write("              <th scope=\"col\">Order Delivered <i class='fas fa-dolly'></i></i></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        \r\n");
      out.write("        ");

            int sno=0;
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from cart inner join product where cart.product_id=product.id and cart.orderdate is not NULL and cart.status='processing'  ");
                        while (rs.next()) {
                         sno=sno+1;
                
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("               <td>");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(17));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(5));
      out.write(" $</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(8));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(9));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(11));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(12));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(13));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(14));
      out.write("</td>\r\n");
      out.write("               <td>");
      out.print(rs.getString(15));
      out.write("</td>\r\n");
      out.write("               <td><a href=\"cancelOrdersAction.jsp?id   =");
      out.print(rs.getString(2));
      out.write("&email=");
      out.print(rs.getString(1));
      out.write("\">Cancel <i class='fas fa-window-close'></i></a></td>\r\n");
      out.write("               <td><a href=\"deliveredOrdersAction.jsp?id=");
      out.print(rs.getString(2));
      out.write("&email=");
      out.print(rs.getString(1));
      out.write("\">Delivered <i class='fas fa-dolly'></i></i></a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("         ");

                        }
                    } catch (Exception e) {
                        System.out.print(e);
                    }
                
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
