/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2020-04-13 13:58:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.SQL.PostgreSQL;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class installation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"/style.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Установка PostgreSQL</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/header.html", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<main role=\"main\" class=\"container\">\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write("  \t\t\t<!-- Меню бар для баз данных -->\r\n");
      out.write("    <div class=\"col-md-8 blog-main\" style=\"border-right: solid 1px red\">\r\n");
      out.write("\t    <div class=\"nav-scroller mb-2 pb-2 border-bottom\">\r\n");
      out.write("\t\t    <nav class=\"nav d-flex\">\r\n");
      out.write("\t\t      <a class=\"p-2 text-muted\" href=\"mainpostgresql.jsp\">PostgreSQL</a>\r\n");
      out.write("\t\t      <a class=\"p-2 text-muted\" href=\"#\">MySQL</a>\r\n");
      out.write("\t\t      <a class=\"p-2 text-muted\" href=\"#\">SAS</a>\r\n");
      out.write("\t\t    </nav>\r\n");
      out.write("\t \t</div>\r\n");
      out.write("    \r\n");
      out.write("      <h3 class=\"pb-3 mb-4 font-italic border-bottom\">\r\n");
      out.write("        Установка PostgreSQL\r\n");
      out.write("      </h3>\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- =========================================================================================================================================================== -->\r\n");
      out.write("\t\t<!-- Start article -->\r\n");
      out.write("<!-- =========================================================================================================================================================== -->\r\n");
      out.write("\t\t\r\n");
      out.write("<h1>Установка PostgreSQL 12 на Windows 10.</h1>\r\n");
      out.write("Инструкция от 05.03.2020\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<p><h4>1. Скачивание необходимого</h4> Переходим на официальный сайт PostgresSQL <a href=\"https://www.postgresql.org/\" target=\"_blank\">по ссылке</a> (откроется в другой вкладке).\r\n");
      out.write("Нажимаем Download в главном бар меню сверху слева</p>\r\n");
      out.write("<p><img style=\"width:50%; height:50%; box-shadow: 0 0 10px #5900AC\"  src=\"screenshots/download1.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p>Жмем на <b>Windows</b> как на картинке</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/windows2.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p>Нажимаем <b>Download the installer</b></p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/downloadtheinstaller3.png\"></p>\r\n");
      out.write("<p>и нас перебрасывает на сайт EnterpriseDB, где мы можем скачать интересующую нас версию PostgreSQL. 12 версия имеется пока только для 64 разрядной системы.\r\n");
      out.write("  Будем скачивать ее.\r\n");
      out.write("  Моя версия 191 MB.</p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><h4>2. Установка</h4><b>2.1</b> Запускаем скачанный файл.<br>\r\n");
      out.write("  <b>Внимание!</b> Если на компе не установлен Visual C++ Redistributable например, то инсталятор заметит это и будет вынужден автоматически его (не спрашивая тебя) установить (скриншота нет к сожалению).\r\n");
      out.write("  Это обязательный компонент. Дальше просто идем по шагам</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation1.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.2</b>\tВыбираем директорию для установки. Я оставляю как есть</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation2.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.3</b>\tДальше попадаем в окно выбора компонентов. Оставляем все как есть. \r\n");
      out.write("Если вы знаете что для чего нужно уже на этом шаге, то можете выбрать интересующие Вас компоненты. Я оставляю все как есть</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation3.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.4</b>\tДалее будет предложено выбрать директорию для хранения данных</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation4.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.5</b>\tДалее необходимо выдумать пароль. Выдумываем. Вводим</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation5.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.6</b>\tДалее будет предложено выбрать номер порта, который будет прослушивать сервер.\r\n");
      out.write("Оставляем как есть, то есть 5432</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation6.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.7</b>\tВыбираем локаль. Пока хз че такое. Почитаю, изучу и обновлю</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation7.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.8</b>\tНа этом шаге инсталятор показывает суммарно то что будет установлено. Смотрим внимательнейшим образом и жмем <b>Next</b> ежели удовлетворены</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation8.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.9</b>\tИнсталятор в последний раз предупреждает, что он готов установить и у Вас еще есть шанс отказаться от этой затеи</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation9.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.10</b> Начинается установка на Ваш компьютер</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation10.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p><b>2.11</b>\tЗавершение установки.<br>\r\n");
      out.write("Процесс установки PostgreSQL 12 завершен. Все выбранные нами компоненты на шаге 4 установлены.\r\n");
      out.write("Если не снять галочку</p>\r\n");
      out.write("<p><img style=\"width:100%; height:100%; box-shadow: 0 0 10px #5900AC\" src=\"screenshots/installation11.png\"></p>\r\n");
      out.write("\r\n");
      out.write("<p>то запуститься <b>Stack Builder</b> чтобы загрузить дополнительные компоненты. \r\n");
      out.write("Нам пока ничего такого не нужно и поэтому снимаем галочку и жмакаем <b>Finish</b></p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- =========================================================================================================================================================== -->\r\n");
      out.write("\t\t<!-- End article -->\r\n");
      out.write("<!-- =========================================================================================================================================================== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div><!-- /.blog-main -->\r\n");
      out.write("\r\n");
      out.write("    <aside class=\"col-md-4 blog-sidebar\">\r\n");
      out.write("      <div class=\"p-4 mb-3 bg-light rounded\">\r\n");
      out.write("        <h4 class=\"font-italic\">About</h4>\r\n");
      out.write("        <p class=\"mb-0\">Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"p-4\">\r\n");
      out.write("        <h4 class=\"font-italic\">Archives</h4>\r\n");
      out.write("        <ol class=\"list-unstyled mb-0\">\r\n");
      out.write("          <li><a href=\"#\">March 2014</a></li>\r\n");
      out.write("          <li><a href=\"#\">February 2014</a></li>\r\n");
      out.write("          <li><a href=\"#\">January 2014</a></li>\r\n");
      out.write("          <li><a href=\"#\">December 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">November 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">October 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">September 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">August 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">July 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">June 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">May 2013</a></li>\r\n");
      out.write("          <li><a href=\"#\">April 2013</a></li>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.html", out, false);
      out.write("\r\n");
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
