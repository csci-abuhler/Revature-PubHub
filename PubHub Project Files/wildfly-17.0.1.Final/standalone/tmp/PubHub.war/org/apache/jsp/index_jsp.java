/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: WildFly Full 17.0.1.Final (WildFly Core 9.0.2.Final) - 2.0.21.Final
 * Generated at: 2019-10-13 18:48:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JBWEB004248: JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      response.addHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\r\n");
      out.write("  ____                 _                  \r\n");
      out.write(" |  _ \\ _____   ____ _| |_ _   _ _ __ ___ \r\n");
      out.write(" | |_) / _ \\ \\ / / _` | __| | | | '__/ _ \\\r\n");
      out.write(" |  _ <  __/\\ V / (_| | |_| |_| | | |  __/\r\n");
      out.write(" |_| \\_\\___| \\_/ \\__,_|\\__|\\__,_|_|  \\___|\r\n");
      out.write(" \r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("<!--                     <img class=\"img-responsive\" src=\"resources/libraries/img/profile.png\" alt=\"\"> -->\r\n");
      out.write("                    <div class=\"intro-text\">\r\n");
      out.write("                        <span class=\"name\">PubHub</span>\r\n");
      out.write("                        <hr class=\"book-primary\">\r\n");
      out.write("                        <span class=\"skills\">Exchange Ideas.</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\t<section id=\"myCarousel\" class=\"carousel slide\">\r\n");
      out.write("        <!-- Indicators -->\r\n");
      out.write("        <ol class=\"carousel-indicators\">\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"\"></li>\r\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\" class=\"\"></li>            \r\n");
      out.write("        </ol>\r\n");
      out.write("\r\n");
      out.write("        <!-- Wrapper for Slides -->\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("            <div class=\"item active\">\r\n");
      out.write("                <!-- Set the first background image using inline CSS below. -->\r\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/imgs/ebook1.jpg');\"></div>\r\n");
      out.write("                <div class=\"carousel-caption\">\r\n");
      out.write("                    <h2>Educate.</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <!-- Set the second background image using inline CSS below. -->\r\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/imgs/ebook2.jpg');\"></div>\r\n");
      out.write("                <div class=\"carousel-caption\">\r\n");
      out.write("                    <h2>Inspire.</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"item\">\r\n");
      out.write("                <!-- Set the third background image using inline CSS below. -->\r\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/imgs/ebook3.jpg');\"></div>\r\n");
      out.write("                <div class=\"carousel-caption\">\r\n");
      out.write("                    <h2>Exchange ideas.</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Controls -->\r\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n");
      out.write("            <span class=\"icon-prev\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n");
      out.write("            <span class=\"icon-next\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("<!--     </div> -->\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
