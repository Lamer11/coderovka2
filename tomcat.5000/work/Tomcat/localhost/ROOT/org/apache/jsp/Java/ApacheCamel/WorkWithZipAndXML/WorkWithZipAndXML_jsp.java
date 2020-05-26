/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2020-05-26 20:05:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Java.ApacheCamel.WorkWithZipAndXML;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WorkWithZipAndXML_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<!-- Для обеспечения правильной визуализации и сенсорного масштабирования для всех устройств -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n");
      out.write("<!-- Подключаем свои стили-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../style.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Работа с Zip и XML файлами</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../header.html", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<main role=\"main\" class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-8 blog-main\" style=\"border-right: solid 1px red\">\r\n");
      out.write("      <h3 class=\"pb-3 mb-4 font-italic border-bottom\">\r\n");
      out.write("        Работа с Zip и XML файлами\r\n");
      out.write("      </h3>\r\n");
      out.write("\r\n");
      out.write("    <h5>Сценарий 1</h5>\r\n");
      out.write("    <p>Архив формата <strong>.zip</strong>, который имеет в себе один <strong>.xml</strong> файл, \r\n");
      out.write("    прогнать через маршрут, распаковать и сохранить распакованный файл в другую папку.</p>\r\n");
      out.write("    <p>Для этого сценария будут использоваться:</p>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><strong><font color=\"#5900AC\">zazipovano.zip</font></strong> - архив, в котором запакован <strong><font color=\"#5900AC\">semelyanov.xml</font></strong> файл</li>\r\n");
      out.write("      <li>Путь к папке (А), где находится архив <strong><font color=\"#5900AC\">C:/Users/Sergey/Desktop/Camel/zips</font></strong></li>\r\n");
      out.write("      <li>Путь к папке (Б), куда архив будет перемещен/распакован/другое: \r\n");
      out.write("      <strong><font color=\"#5900AC\">C:/Users/Sergey/Desktop/Camel/unzips</font></strong></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <p>Названия путей приводятся для того, чтобы наглядно видеть в Java коде кто за что отвечает.<br>\r\n");
      out.write("    Дополнительное наименование папок с файлами как А и Б для удобства далее по тексту.</p>\r\n");
      out.write("    <p>Содержимое файла .xml следующее:<br>\r\n");
      out.write("    <div style=\"border: solid 1px; box-shadow: 0 0 7px #5900AC;\">\r\n");
      out.write("    <pre><code>&lt;persone&gt;\r\n");
      out.write("    &lt;name&gt;Sergey&lt;/name&gt;\r\n");
      out.write("    &lt;lastname&gt;Emelyanov&lt;/lastname&gt;\r\n");
      out.write("    &lt;old&gt;34&lt;/old&gt;\r\n");
      out.write("&lt;/persone&gt;\r\n");
      out.write("    </code></pre></p></div><br>\r\n");
      out.write("\r\n");
      out.write("    <p>1. Копировать архив из одной папки в другую</p>\r\n");
      out.write("<pre class=\"hljs\" style=\"display: block; overflow-x: auto; padding: 0.5em; background: rgb(240, 240, 240); color: rgb(68, 68, 68);\">from(<span class=\"hljs-string\" style=\"color: rgb(136, 0, 0);\">\"file://C:/Users/Sergey/Desktop/Camel/zips/?noop=true\"</span>)\r\n");
      out.write(".to(<span class=\"hljs-string\" style=\"color: rgb(136, 0, 0);\">\"file://C:/Users/Sergey/Desktop/Camel/unzips/\"</span>);</pre>\r\n");
      out.write("    <p>Это операция именно копирует файл из папки А в папку будет Б.<br>\r\n");
      out.write("      За это отвечает опция\r\n");
      out.write("      <span class=\"hljs-string\" style=\"color: rgb(136, 0, 0);\">?noop=true</span>, которая указывает Camel'у оставить файл в папке А как есть.\r\n");
      out.write("      Для того, чтобы переместить файл, то данную опцию не нужно указывать. То есть так:\r\n");
      out.write("      <pre class=\"hljs\" style=\"display: block; overflow-x: auto; padding: 0.5em; background: rgb(240, 240, 240); color: rgb(68, 68, 68);\">from(<span class=\"hljs-string\" style=\"color: rgb(136, 0, 0);\">\"file://C:/Users/Sergey/Desktop/Camel/zips/\"</span>)\r\n");
      out.write(".to(<span class=\"hljs-string\" style=\"color: rgb(136, 0, 0);\">\"file://C:/Users/Sergey/Desktop/Camel/unzips/\"</span>);</pre>\r\n");
      out.write("      но при этому в папке А автоматически создается каталог <strong>.camel</strong>, в которой перемещаемый файл будет находится. Эту тему изучим и опишим чуть позже.<br>\r\n");
      out.write("      Еще раз. В первом случае идет копирование файла, а во втором перемещение из А в Б, но при этому в А создается каталог .camel, в котором присутствует перемещаемый файл.\r\n");
      out.write("    </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    </div><!-- /.blog-main -->\r\n");
      out.write("\r\n");
      out.write("    <aside class=\"col-md-4 blog-sidebar\">\r\n");
      out.write("      <div class=\"p-4 mb-3 bg-light rounded\">\r\n");
      out.write("        <h4 class=\"font-italic\">О чем</h4>\r\n");
      out.write("        <p class=\"mb-0\">Apache Camel - <em>(кратко)</em> это java-фреймворк, с помощью которого можно интегрировать приложения просто и понятно.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"p-4\">\r\n");
      out.write("        <h4 class=\"font-italic\">Статьи</h4>\r\n");
      out.write("        <ol class=\"list-unstyled mb-0\">\r\n");
      out.write("          <li><a href=\"#\">Работа с zip и xml файлами</a></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"p-4\">\r\n");
      out.write("        <h4 class=\"font-italic\">Elsewhere</h4>\r\n");
      out.write("        <ol class=\"list-unstyled\">\r\n");
      out.write("          <li><a href=\"#\">GitHub</a></li>\r\n");
      out.write("          <li><a href=\"#\">Twitter</a></li>\r\n");
      out.write("          <li><a href=\"#\">Facebook</a></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      </div>\r\n");
      out.write("    </aside><!-- /.blog-sidebar -->\r\n");
      out.write("\r\n");
      out.write("  </div><!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("</main><!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../footer.html", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!-- Подключаем скрипты JavaScript прям перед закрывающимся тегом body. Так указано на сайте Bootstrap -->\r\n");
      out.write("<!-- Optional JavaScript -->\r\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
