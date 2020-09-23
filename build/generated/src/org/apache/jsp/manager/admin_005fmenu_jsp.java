package org.apache.jsp.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\"/>\n");
      out.write("    <title>Admin Management</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"topbar-wrap white\">\n");
      out.write("    <div class=\"topbar-inner clearfix\">\n");
      out.write("        <div class=\"topbar-logo-wrap clearfix\">\n");
      out.write("            <ul class=\"navbar-list clearfix\">\n");
      out.write("                <li><a class=\"on\" href=\"admin_menu.jsp\">Home</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"top-info-wrap\">\n");
      out.write("            <ul class=\"top-info-list clearfix\">\n");
      out.write("                <li><a href=\"#\">Admin</a></li>\n");
      out.write("                <li><a href=\"#\">Log out</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container clearfix\">\n");
      out.write("    <div class=\"sidebar-wrap\">\n");
      out.write("        <div class=\"sidebar-title\">\n");
      out.write("            <h1>Optional</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-content\">\n");
      out.write("            <ul class=\"sidebar-list\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\"><i class=\"icon-font\">&#xe003;</i>Management</a>\n");
      out.write("                    <ul class=\"sub-menu\">\n");
      out.write("                        <li><a href=\"/ASD_ASS/manager/adminUserSearch\"><i class=\"icon-font\">&#xe008;</i>User</a></li>\n");
      out.write("                        <li><a href=\"design.html\"><i class=\"icon-font\">&#xe005;</i>##</a></li>\n");
      out.write("                        <li><a href=\"design.html\"><i class=\"icon-font\">&#xe006;</i>##</a></li>\n");
      out.write("                        <li><a href=\"design.html\"><i class=\"icon-font\">&#xe004;</i>##</a></li>\n");
      out.write("                        <li><a href=\"design.html\"><i class=\"icon-font\">&#xe012;</i>##</a></li>\n");
      out.write("                        <li><a href=\"design.html\"><i class=\"icon-font\">&#xe052;</i>##</a></li>\n");
      out.write("                        <li><a href=\"design.html\"><i class=\"icon-font\">&#xe033;</i>##</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
