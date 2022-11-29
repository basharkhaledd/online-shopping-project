package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/signup-style.css\">\r\n");
      out.write("<title>Signup</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id='container'>\r\n");
      out.write("  <div class='signup'>\r\n");
      out.write("    \r\n");
      out.write("      <form action=\"signupAction.jsp\" method=\"POST\">\r\n");
      out.write("          <input type=\"text\" name=\"name\" placeholder=\"inter name\" required>\r\n");
      out.write("          <input type=\"email\" name=\"email\" placeholder=\"inter email\" required>\r\n");
      out.write("          <input type=\"number\" name=\"mobilenumber\" placeholder=\"inter mobile number\" required>\r\n");
      out.write("          <select name=\"securityquestion\">\r\n");
      out.write("              <option value=\"what was your first car?\">what was your first car?</option>\r\n");
      out.write("              <option value=\"what was your first car?\">what was your first car?</option>\r\n");
      out.write("              <option value=\"what was your first car?\">what was your first car?</option>\r\n");
      out.write("              <option value=\"what was your first car?\">what was your first car?</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <input type=\"text\" name=\"answer\" placeholder=\"inter answer\" required>\r\n");
      out.write("          <input type=\"password\" name=\"password\" placeholder=\"inter password\" required>\r\n");
      out.write("          <input type=\"submit\" vlaue=\"Signup\">\r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("      <h2><a href=\"\">Login</a></h2>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class='whysign'>\r\n");
      out.write("      ");
 
      String msg =request.getParameter("msg");
      if("valid".equals(msg))
      {
       
      out.write("\r\n");
      out.write("         <h1>Successfully Registered</h1>\r\n");
      out.write("     ");
} 
      out.write("\r\n");
      out.write("     \r\n");
      out.write("     ");
 
      if("invalid".equals(msg))
      {
       
      out.write("\r\n");
      out.write("      <h1>Some thing Went Wrong! Try Again !</h1>\r\n");
      out.write("     ");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h2>Online Shopping</h2>\r\n");
      out.write("    <p>The Online Shopping System is the application that allows the users to shop online without going to the shops to buy them.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
