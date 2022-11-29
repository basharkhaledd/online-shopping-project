package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class addToCartAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String email = session.getAttribute("email").toString();
    String product_id = request.getParameter("id");
    int quantity = 1;
    int product_price = 0;
    int product_total = 0;
    int cart_total = 0;

    int z = 0;

    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from product where id='" + product_id + "' ");
        while (rs.next()) {
            product_price = rs.getInt(4);
            product_total = product_price;
        }

        ResultSet rs1 = st.executeQuery("select * from cart where product_id='" + product_id + "' and email='" + email + "'"
                + "and address is NULL ");
        while (rs1.next()) {
            cart_total = rs1.getInt(5);
            cart_total = cart_total + product_total;
            quantity = rs1.getInt(3);
            quantity = quantity + 1;
            z = 1;
        }
        if (z == 1) {
            st.executeUpdate("update cart set total='" + cart_total + "' , quantity='" + quantity + "' where product_id='"+product_id+"' and email='" + email + "' and address is NULL   ");
            response.sendRedirect("home.jsp?msg=exist");
        }
        if (z == 0) {
            PreparedStatement ps = con.prepareStatement("insert into cart(email,product_id,quantity,price,total) values(?,?,?,?,?) ");
            ps.setString(1, email);
            ps.setString(2, product_id);
            ps.setInt(3, quantity);
            ps.setInt(4, product_price);
            ps.setInt(5, product_total);
            ps.executeUpdate();
            response.sendRedirect("home.jsp?msg=added");
        }

    } catch (SQLException e) {
        System.out.print(e);
        response.sendRedirect("home.jsp?msg=invalid");
    }

      out.write('\n');
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
