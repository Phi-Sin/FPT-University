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
      out.write("    <style>\n");
      out.write("body{\n");
      out.write("    background: url(\"phonestore.jpg\");\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position-y: -70px;\n");
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
      out.write("    max-width: 400px;\n");
      out.write("    background: rgba(0, 0, 0, 0.8);\n");
      out.write("    /*background highlight*/\n");
      out.write("    flex-grow: 1;\n");
      out.write("    padding: 30px 30px 40px;\n");
      out.write("    box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);\n");
      out.write("    border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-heading{\n");
      out.write("    font-size: 30px;\n");
      out.write("    color: #f5f5f5;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 0;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-below-heading{\n");
      out.write("    font-size: 17px;\n");
      out.write("    color: #f5f5f5;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group{\n");
      out.write("    border-bottom: 1px solid #ffff;\n");
      out.write("    margin-top: 15px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    display: flex;\n");
      out.write("    border: 1px solid #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group i{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("    font-size: 14px;\n");
      out.write("    padding-left: 5px;\n");
      out.write("    padding-right: 5px;\n");
      out.write("    padding-top: 5px;\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-input{\n");
      out.write("    background: transparent;\n");
      out.write("    border: 0;\n");
      out.write("    outline: 0;\n");
      out.write("    color: #f5f5f5;\n");
      out.write("    flex-grow: 1;\n");
      out.write("    margin-top: 5px;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-input::placeholder{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-submit{\n");
      out.write("    background: transparent;\n");
      out.write("    border: 1px solid #f5f5f5;\n");
      out.write("    color: #ffff;\n");
      out.write("    width: 100%;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    padding: 15px 10px;\n");
      out.write("    transition: 0.25s ease-in-out;\n");
      out.write("    margin-top: 25px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-submit:hover{\n");
      out.write("    border: 1px solid #d63031;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-createacc{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-userid{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-password{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-createacc{\n");
      out.write("    color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write("::-webkit-scrollbar {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    overflow-y: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
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
      out.write("    </div>   \n");
      out.write("</body>\n");
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
