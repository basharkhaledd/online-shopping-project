package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class changeSecurityQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/changeDetailsHeader.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<link rel=\"stylesheet\" href=\"css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("            <center><h2>Change Details<i class=\"fa fa-edit\"></i></h2></center>\r\n");
      out.write("             ");
 String email = session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("            <h2><a href=\"home.jsp\"><i class='fas fa-arrow-circle-left'>Back</i></a></h2>\r\n");
      out.write("             <h2><a href=\"changeDetails.jsp\">Your Profile(");
out.print(email);
      out.write(") <i class='fas fa-user-alt'></i></a></h2>\r\n");
      out.write("            <a href=\"changePassword.jsp\">Change Password <i class='fas fa-key'></i></a>\r\n");
      out.write("            <a href=\"addChangeAddress.jsp\">Add or change Address <i class='fas fa-map-marker-alt'></i></a>\r\n");
      out.write("            <a href=\"changeSecurityQuestion.jsp\">Change Security Question <i class=\"fa fa-repeat\"></i></a>\r\n");
      out.write("            <a href=\"changeMobileNumber.jsp\">Change Mobile Number <i class='fas fa-phone'></i></a>\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"css/changeDetails.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("<title>Change Security Question</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("     ");
 
        String msg = request.getParameter("msg");
       if("done".equals(msg)){
    
      out.write("\r\n");
      out.write("<h3 class=\"alert\">Your security Question successfully changed !</h3>\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write(" \r\n");
      out.write("    ");
 
       if("wrong".equals(msg)){
    
      out.write("\r\n");
      out.write("<h3 class=\"alert\">Your Password is wrong!</h3>\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <form action=\"changeSecurityQuestionAction.jsp\" method=\"post\"> \r\n");
      out.write("        \r\n");
      out.write("<h3>Select Your New Securtiy Question</h3>\r\n");
      out.write("<select class=\"input-style\" name=\"securityquestion\">\r\n");
      out.write("    <option value=\"what was your first car?\">what was your first car?</option>\r\n");
      out.write("    <option value=\"what is the name of your first pet?\">what is the name of your first pet?</option>\r\n");
      out.write("    <option value=\"what elementary school did you attend?\">what elementary school did you attend?</option>\r\n");
      out.write("    <option value=\"what is the name of the town where you were born?\">what is the name of the town where you were born?</option>\r\n");
      out.write("</select>\r\n");
      out.write(" <hr>\r\n");
      out.write(" \r\n");
      out.write(" <h3>Enter Your New Answer</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"text\" name=\"newanswer\" placeholder=\"inter answer\" required>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<h3>Enter Password (For Security)</h3>\r\n");
      out.write(" <input class=\"input-style\" type=\"password\" name=\"password\" placeholder=\"inter password\" required>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<button class=\"button\" type=\"submit\">Save<i class='far fa-arrow-alt-circle-right'></i> </button>\r\n");
      out.write("\r\n");
      out.write(" </form> \r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("<br><br><br>\r\n");
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
