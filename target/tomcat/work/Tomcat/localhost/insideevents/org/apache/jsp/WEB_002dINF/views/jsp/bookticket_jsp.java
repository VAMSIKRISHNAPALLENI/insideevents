/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-12 10:23:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookticket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>INSIDE EVENTS</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"description\" content=\"HTML5 website template\">\r\n");
      out.write("  <meta name=\"keywords\" content=\"global, template, html, sass, jquery\">\r\n");
      out.write("  <meta name=\"author\" content=\"Bucky Maler\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"assets/css/main.css\">\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("function printdiv()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar contents = document.getElementById(\"print\").innerHTML;\r\n");
      out.write("            var frame1 = document.createElement('iframe');\r\n");
      out.write("            frame1.name = \"frame1\";\r\n");
      out.write("            frame1.style.position = \"absolute\";\r\n");
      out.write("            frame1.style.top = \"-1000000px\";\r\n");
      out.write("            document.body.appendChild(frame1);\r\n");
      out.write("            var frameDoc = (frame1.contentWindow) ? frame1.contentWindow : (frame1.contentDocument.document) ? frame1.contentDocument.document : frame1.contentDocument;\r\n");
      out.write("            frameDoc.document.open();\r\n");
      out.write("            frameDoc.document.write('<html><head><title>EVENT TICKET</title>');\r\n");
      out.write("            frameDoc.document.write('</head><body>');\r\n");
      out.write("            frameDoc.document.write(contents);\r\n");
      out.write("            frameDoc.document.write('</body></html>');\r\n");
      out.write("            frameDoc.document.close();\r\n");
      out.write("            setTimeout(function () {\r\n");
      out.write("                window.frames[\"frame1\"].focus();\r\n");
      out.write("                window.frames[\"frame1\"].print();\r\n");
      out.write("                document.body.removeChild(frame1);\r\n");
      out.write("            }, 500);\r\n");
      out.write("            return false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- notification for small viewports and landscape oriented smartphones -->\r\n");
      out.write("<div class=\"device-notification\">\r\n");
      out.write("  <a class=\"device-notification--logo\" href=\"#0\">\r\n");
      out.write("    <img src=\"assets/img/logo.png\" alt=\"Global\">\r\n");
      out.write("    <p>INSIDE EVENTS</p>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"perspective effect-rotate-left\">\r\n");
      out.write("  <div class=\"container\"><div class=\"outer-nav--return\"></div>\r\n");
      out.write("    <div id=\"viewport\" class=\"l-viewport\">\r\n");
      out.write("      <div class=\"l-wrapper\">\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("          <a class=\"header--logo\" href=\"index\">\r\n");
      out.write("            <img src=\"assets/img/logo.png\" alt=\"Global\">\r\n");
      out.write("            <p>INSIDE EVENTS</p>\r\n");
      out.write("          </a>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("        </header>\r\n");
      out.write("      \r\n");
      out.write("        <ul class=\"l-main-content main-content\">\r\n");
      out.write(" <div class=\"intro\">\r\n");
      out.write("             <div id=\"print\" class=\"work-request\">\r\n");
      out.write("<h2><table  width=\"120%\" align=\"center\" height=\"50%\">\r\n");
      out.write("<tr><th>NAME:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th colspan=\"2\"> </th>\r\n");
      out.write("  </tr>\r\n");
      out.write("<tr><th>Mobile Number:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>E-mail:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>EventName:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ eventname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>Place:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${place}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>From Date:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>TO Date:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>Cost:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cost}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>Tax:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tax}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("<tr><th>TOTAL:</th><th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${total}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</th></tr>\r\n");
      out.write("\r\n");
      out.write("</table></h2>\r\n");
      out.write("<input type=\"button\" value=\"Print Ticket\" onclick=\"printdiv()\" style=\"color: #000000;\r\n");
      out.write("background: #993399; \" />         \r\n");
      out.write("       \r\n");
      out.write("         </div>   \r\n");
      out.write("               \r\n");
      out.write("           </div>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("<script>window.jQuery || document.write('<script src=\"assets/js/vendor/jquery-2.2.4.min.js\"><\\/script>')</script>\r\n");
      out.write("<script src=\"assets/js/functions-min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
