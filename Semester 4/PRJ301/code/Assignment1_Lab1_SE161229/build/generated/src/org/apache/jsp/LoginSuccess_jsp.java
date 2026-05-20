package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginSuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("    background: url('bgrdr2.png');\n");
      out.write("    background-size: cover;\n");
      out.write("    overflow-y: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#wrapper{\n");
      out.write("    min-height: 100vh;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#form-login{\n");
      out.write("    max-width: 800px;\n");
      out.write("    background: rgba(0, 0, 0, 0.8);\n");
      out.write("    /*background highlight*/\n");
      out.write("    flex-grow: 1;\n");
      out.write("    padding: 30px 30px 40px;\n");
      out.write("    box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-heading{\n");
      out.write("    font-size: 30px;\n");
      out.write("    color: #f5f5f5;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 0;\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-createacc{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Successfully!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("        <form action=\"\" id=\"form-login\">\n");
      out.write("            <h1 class=\"form-heading\">WELCOME TO THE WESTERN AMERICA!!!</h1>\n");
      out.write("            <div class=\"form-createacc\">Comeback Login Page ?\n");
      out.write("                <a href=\"LoginServlet\">Click here</a>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </div>     \n");
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
