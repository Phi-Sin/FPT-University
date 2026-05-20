package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Our Team</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("        <noscript><link rel=\"stylesheet\" href=\"assets/css/noscript.css\" /></noscript>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"is-preload\">\r\n");
      out.write("        <!-- Wrapper -->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <header id=\"header\">\r\n");
      out.write("    <div class=\"inner\">\r\n");
      out.write("        <!-- Logo -->\r\n");
      out.write("        <a href=\"./Home\" class=\"logo\">\r\n");
      out.write("            <span class=\"fa fa-book\"></span>\r\n");
      out.write("            <span class=\"title\">IIBOOK</span>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Nav -->\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#menu\">Menu</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- Menu -->\r\n");
      out.write("<nav id=\"menu\">\r\n");
      out.write("    <h2><a href=\"./User\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user==null? \"Menu\": (\"Welcome \")}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"./Home\">Home</a></li>\r\n");
      out.write("        \r\n");
      out.write("        <li><a href=\"./Book?id=0\">Bookshelf</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"./Cart\">Cart</a></li>\r\n");
      out.write("\r\n");
      out.write("            ");
 
                if(session.getAttribute("user")==null){ 
            
      out.write("\r\n");
      out.write("            <li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("            \r\n");
      out.write("        <li><a href=\"Login?origin=./about.jsp\"><i class=\"fa fa-sign-in\"></i>Login</a></li>\r\n");
      out.write("            ");
 } else{ 
      out.write("\r\n");
      out.write("        <li><a href=\"./Order\">Order History</a></li>\r\n");
      out.write("        \r\n");
      out.write("        <li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("        \r\n");
      out.write("        <li><a href=\"Logout\"><i class=\"fa fa-sign-out\"></i>Logout</a></li>\r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("            <!-- Main -->\r\n");
      out.write("            <div id=\"main\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                    <h1>About Us</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"image main\">\r\n");
      out.write("                        <img src=\"images/banner-image-1-1920x500.jpg\" class=\"img-fluid\" alt=\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <p>\"I AM THE LINK OF MY SERVER\"<br>\r\n");
      out.write("                        \"IMVU IS MY BODY, AND <span style=\"text-decoration: line-through\">RIGHTING</span> WRITING IS MY BLOOD\"<br>\r\n");
      out.write("                        \"I HAVE CREATED OVER A THOUSAND ADS\"<br>\r\n");
      out.write("                        \"UNKNOWN TO WIN, NOR KNOWN TO LOSE\"<br>\r\n");
      out.write("                        \"HAVE WITHSTOOD FEMALE NARUTO TO CREATE MANY QUIZNO'S SUBS\"<br>\r\n");
      out.write("                        \"YET THOSE DOUBLE-CLICKS WILL NEVER HOLD ANYTHING\"<br>\r\n");
      out.write("                        \"SO, AS I PAY BILLS\"<br>\r\n");
      out.write("                        <strong>\"UNLIMITED AD WORKS\"</strong><br>\r\n");
      out.write("                        \"AS YOU CAN SEE, WHAT STANDS BEFORE YOU ARE UNLIMITED ADS, THE PINNACLE OF GETTING WEBSITES MONEY\"<br>\r\n");
      out.write("                        \"WELL WHAT ARE YOU WAITING FOR?\"</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer id=\"footer\">\r\n");
      out.write("                <div class=\"inner\">\r\n");
      out.write("                    <section>\r\n");
      out.write("                        <h2>Contact Info</h2>\r\n");
      out.write("                        <ul class=\"alt\">\r\n");
      out.write("                            <li><span class=\"fa fa-github\"></span> <a href=\"https://github.com/nekon0/IIBOOK\">Our Project</a></li>\r\n");
      out.write("                            <li><span class=\"fa fa-map-pin\"></span> <a href=\"https://goo.gl/maps/ojwCjTqRteiA4B9U7\"> DE336, FBT University</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <ul class=\"copyright\">\r\n");
      out.write("                        <li> HLV </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Scripts -->\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
