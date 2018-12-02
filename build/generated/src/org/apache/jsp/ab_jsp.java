package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact Form</title>\n");
      out.write("        <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-top: 6px;\n");
      out.write("    margin-bottom: 16px;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h3>Contact Form</h3>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form method=\"POST>\"\n");
      out.write("    <label for=\"fname\">First Name</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"firstname2\" placeholder=\"Your name..\">\n");
      out.write("\n");
      out.write("    <label for=\"lname\">Last Name</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"lastname2\" placeholder=\"Your last name..\">\n");
      out.write("\n");
      out.write("    <label for=\"country\">Country</label>\n");
      out.write("    <select id=\"country\" name=\"country2\">\n");
      out.write("      <option value=\"australia\">Australia</option>\n");
      out.write("      <option value=\"canada\">Canada</option>\n");
      out.write("      <option value=\"usa\">USA</option>\n");
      out.write("    </select>\n");
      out.write("\n");
      out.write("    <label for=\"subject\">how would you suggest I improve it?</label>\n");
      out.write("    <textarea id=\"subject\" name=\"subject2\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>\n");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"Submit\" formaction=\"contactForm\">\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
