package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.User;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

            User user = (User)session.getAttribute("user");
            if(user==null || !user.is_super()){
                response.sendRedirect("./Home");
            }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Dashboard</title>\r\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\r\n");
      out.write("        <meta name=\"description\" content=\"Developed By M Abdur Rokib Promy\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Admin, Bootstrap 3, Template, Theme, Responsive\">\r\n");
      out.write("        <!-- bootstrap 3.0.2 -->\r\n");
      out.write("        <link href=\"./admin/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- font Awesome -->\r\n");
      out.write("        <link href=\"./admin/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"./admin/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <!-- Morris chart -->\r\n");
      out.write("        <link href=\"./admin/css/morris/morris.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"./admin/css/jvectormap/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"./admin/css/datepicker/datepicker3.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"./admin/css/daterangepicker/daterangepicker-bs3.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href=\"./admin/css/iCheck/all.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!-- Theme style -->\r\n");
      out.write("        <link href=\"./admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"skin-black\">\r\n");
      out.write("        <!-- header logo: style can be found in header.less -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper row-offcanvas row-offcanvas-left\">\r\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./aside.jsp", out, false);
      out.write("\r\n");
      out.write("            <aside class=\"right-side\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Main content -->\r\n");
      out.write("                <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\" style=\"margin-bottom:5px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"sm-st clearfix\">\r\n");
      out.write("                                <span class=\"sm-st-icon st-red\"><i class=\"fa fa-check-square-o\"></i></span>\r\n");
      out.write("                                <div class=\"sm-st-info\">\r\n");
      out.write("                                    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                    Total Order\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"sm-st clearfix\">\r\n");
      out.write("                                <span class=\"sm-st-icon st-violet\"><i class=\"fa fa-book\"></i></span>\r\n");
      out.write("                                <div class=\"sm-st-info\">\r\n");
      out.write("                                    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numBook}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                    Total Book\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"sm-st clearfix\">\r\n");
      out.write("                                <span class=\"sm-st-icon st-blue\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                                <div class=\"sm-st-info\">\r\n");
      out.write("                                    <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                    Total User\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <div class=\"sm-st clearfix\">\r\n");
      out.write("                                <span class=\"sm-st-icon st-green\"><i class=\"fa fa-money\"></i></span>\r\n");
      out.write("                                <div class=\"sm-st-info\">\r\n");
      out.write("                                    <span>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${earning}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                    Earning\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- /.col -->\r\n");
      out.write("                    <!-- row end -->\r\n");
      out.write("                </section><!-- /.content -->\r\n");
      out.write("                <div class=\"footer-main\">\r\n");
      out.write("                    Copyright &copy Director, 2014\r\n");
      out.write("                </div>\r\n");
      out.write("            </aside><!-- /.right-side -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div><!-- ./wrapper -->\r\n");
      out.write("        <!-- jQuery 2.0.2 -->\r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"./admin/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery UI 1.10.3 -->\r\n");
      out.write("        <script src=\"./admin/js/jquery-ui-1.10.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"./admin/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!-- daterangepicker -->\r\n");
      out.write("        <script src=\"./admin/js/plugins/daterangepicker/daterangepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./admin/js/plugins/chart.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./admin/js/plugins/iCheck/icheck.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!-- calendar -->\r\n");
      out.write("        <script src=\"./admin/js/plugins/fullcalendar/fullcalendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"./admin/js/Director/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Director dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("        <script src=\"./admin/js/Director/dashboard.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $('input').on('ifChecked', function (event) {\r\n");
      out.write("                // var element = $(this).parent().find('input:checkbox:first');\r\n");
      out.write("                // element.parent().parent().parent().addClass('highlight');\r\n");
      out.write("                $(this).parents('li').addClass(\"task-done\");\r\n");
      out.write("                console.log('ok');\r\n");
      out.write("            });\r\n");
      out.write("            $('input').on('ifUnchecked', function (event) {\r\n");
      out.write("                // var element = $(this).parent().find('input:checkbox:first');\r\n");
      out.write("                // element.parent().parent().parent().removeClass('highlight');\r\n");
      out.write("                $(this).parents('li').removeClass(\"task-done\");\r\n");
      out.write("                console.log('not');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $('#noti-box').slimScroll({\r\n");
      out.write("                height: '400px',\r\n");
      out.write("                size: '5px',\r\n");
      out.write("                BorderRadius: '5px'\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('input[type=\"checkbox\"].flat-grey, input[type=\"radio\"].flat-grey').iCheck({\r\n");
      out.write("                checkboxClass: 'icheckbox_flat-grey',\r\n");
      out.write("                radioClass: 'iradio_flat-grey'\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
