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
      out.write("        <!--        <title>Login Page</title>\n");
      out.write("                <meta charset=\"UTF-8\">\n");
      out.write("                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">-->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link href=\"CSS/LoginStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-wrapper\">\n");
      out.write("            <form action=\"MainController\" method=\"POST\" class=\"form\">\n");
      out.write("                <img src=\"img/loginIcon.jpg\" alt=\"\">\n");
      out.write("                <p>");
      out.print( request.getAttribute("ERROR"));
      out.write("</p>\n");
      out.write("                <h2>Welcome</h2>   \n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3 class=\"title\">Enter your detail</h3>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    User ID<input type=\"text\" name=\"UserID\" id=\"UserID\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    Password<input type=\"Password\" name=\"Password\"/>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"Login\" class=\"submit-btn\" />\n");
      out.write("                <div class=\"signup_link\">\n");
      out.write("                   Create a new account ? <a href=\"create.jsp\">Click here</a></br>\n");
      out.write("                </div>\n");
      out.write("            </form>  \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
