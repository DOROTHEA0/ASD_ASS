package org.apache.jsp.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/manager/admin_menu.jsp");
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
      out.write("                <li><a class=\"on\" href=\"index.html\">Home</a></li>\n");
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
      out.write("                        <li><a href=\"admin_user.jsp\"><i class=\"icon-font\">&#xe008;</i>User</a></li>\n");
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
      out.write("\n");
      out.write("    <div class=\"main-wrap\">\n");
      out.write("        <div class=\"crumb-wrap\">\n");
      out.write("            <div class=\"crumb-list\"><i class=\"icon-font\"></i><a href=\"index.html\">Home</a><span class=\"crumb-step\">&gt;</span><span class=\"crumb-name\">User Management</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"search-wrap\">\n");
      out.write("            <div class=\"search-content\">\n");
      out.write("                <form action=\"#\" method=\"post\">\n");
      out.write("                    <table class=\"search-tab\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th width=\"70\">Keywords:</th>\n");
      out.write("                            <td><input class=\"common-text\" placeholder=\"Enter Email\" name=\"keywords\" value=\"\" id=\"\" type=\"text\"></td>\n");
      out.write("                            <td><input class=\"btn btn-primary btn2\" name=\"sub\" value=\"Search\" type=\"submit\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"result-wrap\">\n");
      out.write("            <form name=\"myform\" id=\"myform\" method=\"post\">\n");
      out.write("                <div class=\"result-title\">\n");
      out.write("                    <div class=\"result-list\">\n");
      out.write("                        <a href=\"insert.html\"><i class=\"icon-font\"></i>Add User</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"result-content\">\n");
      out.write("                    <table class=\"result-tab\" width=\"100%\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>First Name</th>\n");
      out.write("                            <th>Last Name</th>\n");
      out.write("                            <th>Date of Birth</th>\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>Password</th>\n");
      out.write("                            <th>Is Admin</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"tc\"><input name=\"id[]\" value=\"59\" type=\"checkbox\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input name=\"ids[]\" value=\"59\" type=\"hidden\">\n");
      out.write("                                <input class=\"common-input sort-input\" name=\"ord[]\" value=\"0\" type=\"text\">\n");
      out.write("                            </td>\n");
      out.write("                            <td>59</td>\n");
      out.write("                            <td title=\"发哥经典\"><a target=\"_blank\" href=\"#\" title=\"发哥经典\">发哥经典</a> …\n");
      out.write("                            </td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>2</td>\n");
      out.write("                            <td>admin</td>\n");
      out.write("                            <td>2014-03-15 21:11:01</td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>\n");
      out.write("                                <a class=\"link-update\" href=\"#\">修改</a>\n");
      out.write("                                <a class=\"link-del\" href=\"#\">删除</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"tc\"><input name=\"id[]\" value=\"58\" type=\"checkbox\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input name=\"ids[]\" value=\"58\" type=\"hidden\">\n");
      out.write("                                <input class=\"common-input sort-input\" name=\"ord[]\" value=\"0\" type=\"text\">\n");
      out.write("                            </td>\n");
      out.write("                            <td>58</td>\n");
      out.write("                            <td title=\"黑色经典\"><a target=\"_blank\" href=\"#\" title=\"黑色经典\">黑色经典</a> …\n");
      out.write("                            </td>\n");
      out.write("                            <td>0</td>\n");
      out.write("                            <td>35</td>\n");
      out.write("                            <td>admin</td>\n");
      out.write("                            <td>2013-12-30 22:34:00</td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>\n");
      out.write("                                <a class=\"link-update\" href=\"#\">修改</a>\n");
      out.write("                                <a class=\"link-del\" href=\"#\">删除</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--/main-->\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
