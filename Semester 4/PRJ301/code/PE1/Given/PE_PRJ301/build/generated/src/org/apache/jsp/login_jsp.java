package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body><form action=\"LoginController\" method=\"post\"></form>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("        <form action=\"LoginServlet\" id=\"form-login\" method=\"POST\">\n");
      out.write("            <h1 class=\"form-heading\">WELCOME</h1>\n");
      out.write("            <div class=\"form-below-heading\">Enter your details</div>\n");
      out.write("            <div class=\"form-userid\">User ID</div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <i class=\"fa-solid fa-user\"></i>               \n");
      out.write("                <input type=\"text\" class=\"form-input\" placeholder=\"Your userID\" name=\"UserID\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-password\">Password</div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <i class=\"fa-solid fa-lock\"></i>\n");
      out.write("                <input type=\"password\" class=\"form-input\" placeholder=\"Your password\" name=\"Password\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Login\" class=\"form-submit\">\n");
      out.write("            <div class=\"form-createacc\">Create new user account ?\n");
      out.write("                <a href=\"SignupServlet\">Click here</a>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </div> \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
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
