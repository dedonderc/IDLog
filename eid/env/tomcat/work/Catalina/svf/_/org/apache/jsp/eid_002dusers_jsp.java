/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.25
 * Generated at: 2015-03-23 05:57:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;
import java.text.*;
import com.easypaygroup.snolf.*;

public final class eid_002dusers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/inc/conn.inc", Long.valueOf(1349431053000L));
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html> \r\n");
      out.write('\r');
      out.write('\n');


      response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
      response.setHeader("Pragma","no-cache"); //HTTP 1.0
      response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

      String lang = "nl";
      //Context initContext = new InitialContext();
      //Context envContext = (Context) initContext.lookup("java:/comp/env");
      //DataSource ds = (DataSource) envContext.lookup("jdbc/SVF_dev");
      //Connection conn = ds.getConnection();


      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\"> \r\n");
      out.write("        <style>\r\n");
      out.write("          .userbox {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            display: block;\r\n");
      out.write("            width: 750px;\r\n");
      out.write("            height: 150px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            opacity: 0.8;\r\n");
      out.write("            filter: Alpha(opacity=80);\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 22px;\r\n");
      out.write("            box-shadow: 10px 10px 5px #888888;\r\n");
      out.write("            margin-bottom: 50px;\r\n");
      out.write("            min-height: 40px;\r\n");
      out.write("          }\r\n");
      out.write("          .userbox ul {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("          }\r\n");
      out.write("          .warning {\r\n");
      out.write("            color: #f00;\r\n");
      out.write("          }\r\n");
      out.write("          .userbox ul li {\r\n");
      out.write("            display: block;\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 250px;\r\n");
      out.write("          }\r\n");
      out.write("          .userbox ul li a {\r\n");
      out.write("            color: #0c5c92;\r\n");
      out.write("            font-size: 8pt;\r\n");
      out.write("          }\r\n");
      out.write("          .userbox ul li a img {\r\n");
      out.write("            border: 0px;\r\n");
      out.write("            width: 16px;\r\n");
      out.write("            height: 16px;\r\n");
      out.write("          }\r\n");
      out.write("          fieldset {\r\n");
      out.write("            color: #0c5c92;  \r\n");
      out.write("          }\r\n");
      out.write("          legend {\r\n");
      out.write("            color: #555;\r\n");
      out.write("          }\r\n");
      out.write("          #scroll {\r\n");
      out.write("            overflow: auto;\r\n");
      out.write("            height: 100px; \r\n");
      out.write("          }\r\n");
      out.write("          #closeBox {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            right: 10px;\r\n");
      out.write("            font-size: 11pt;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/algemeen/scripts/jquery.js\"></script>       \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 
  String ssin = request.getParameter("ssin");
  String host = request.getParameter("host"); 
  String db = request.getParameter("db");
  String ssin2 = request.getParameter("ssin2");     
  Connection conn = null;  

      out.write("\r\n");
      out.write("  <div class=\"userbox\">\r\n");
      out.write("      <div id=\"closeBox\"><a href=\"#\" class=\"closeMe\">X</a></div>\r\n");
      out.write("      <fieldset>\r\n");
      out.write("        <legend>EasySVF users</legend>\r\n");
      out.write("        <div id=\"scroll\">\r\n");
      out.write("          <ul>\r\n");
 
try {

  String myURL = "jdbc:pervasive://" + host + ":1583/" + db;

	Class.forName("com.pervasive.jdbc.v2.Driver");
	conn =  DriverManager.getConnection(myURL,"Master","SQLslave");

  String sql = "Select * from MENU_GEB where RRN = '" + ssin + "'";
  PreparedStatement pstmt = conn.prepareStatement(sql);
  ResultSet rs = pstmt.executeQuery();
  boolean hasAccess = false;
  boolean isAdmin = false;
  while (rs.next()) {
    if (rs.getInt("TITEL") == 999) {
      isAdmin = true;
    }
  }
  if (ssin2 != null && !"0".equals(ssin2)) {
    if (!isAdmin) {
      ssin2 = "not_authorized";
    }
    sql = "Select * from MENU_GEB where RRN = '" + ssin2 + "'";
  } else {
    sql = "Select * from MENU_GEB where RRN = '" + ssin + "'";
  }
  isAdmin = false;
  pstmt = conn.prepareStatement(sql);
  rs = pstmt.executeQuery();
  while (rs.next()) {
    if (rs.getInt("TITEL") == 999) {
      isAdmin = true;
    }
    hasAccess = true;
    sql = "Select * from MENU_AUF where GEBR = '" + rs.getString("CODE") + "'";
    pstmt = conn.prepareStatement(sql);
    ResultSet rsAuf = pstmt.executeQuery();
    
    if (rsAuf.next()) {
      out.println("<li><a href='#' onclick='loginUser(\"" + rs.getString("CODE") + "\",\"" + rs.getString("PASWOORD") + "\")'><img src='algemeen/images/user_notavail.png'>" + rs.getString("CODE") + " - " + rs.getString("NAAM") + "</a></li>");                                                                                                                                                                                                                                             
    } else {
      out.println("<li><a href='#' onclick='loginUser(\"" + rs.getString("CODE") + "\",\"" + rs.getString("PASWOORD") + "\")'><img src='algemeen/images/user_avail.png'>" + rs.getString("CODE") + " - " + rs.getString("NAAM") + "</a></li>");
    }
  }    
  if (isAdmin) {
    sql = "Select * from MENU_GEB where RRN != '" + ssin + "' and RRN <> '00000000097' and CODE not like 'EASYINS%'";
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();
    while (rs.next()) {
      sql = "Select * from MENU_AUF where GEBR = '" + rs.getString("CODE") + "'";
      pstmt = conn.prepareStatement(sql);
      ResultSet rsAuf = pstmt.executeQuery();
      
      if (rsAuf.next()) {
        out.println("<li><a href='#' onclick='loginUser(\"" + rs.getString("CODE") + "\",\"" + rs.getString("PASWOORD") + "\")'><img src='algemeen/images/user_notavail.png'>" + rs.getString("CODE") + " - " + rs.getString("NAAM") + "</a></li>");                                                                                                                                                                                                                                             
      } else {
        out.println("<li><a href='#' onclick='loginUser(\"" + rs.getString("CODE") + "\",\"" + rs.getString("PASWOORD") + "\")'><img src='algemeen/images/user_avail.png'>" + rs.getString("CODE") + " - " + rs.getString("NAAM") + "</a></li>");
      }
    }  
  }   
  
  if (!hasAccess) {
    out.println("<li><span class='warning'>You are not authorized to use EASYSVF ! </span></li>");
  } else {
    sql = "Select * from MENU_GEB where RRN = '00000000097'";
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();
    while (rs.next()) {
      sql = "Select * from MENU_AUF where GEBR = '" + rs.getString("CODE") + "'";
      pstmt = conn.prepareStatement(sql);
      ResultSet rsAuf = pstmt.executeQuery();
      
      if (rsAuf.next()) {
        out.println("<li><a href='#' onclick='loginUser(\"" + rs.getString("CODE") + "\",\"" + rs.getString("PASWOORD") + "\")'><img src='algemeen/images/public_user_notavail.png'>" + rs.getString("CODE") + " - " + rs.getString("NAAM") + "</a></li>");                                                                                                                                                                                                                                             
      } else {
        out.println("<li><a href='#' onclick='loginUser(\"" + rs.getString("CODE") + "\",\"" + rs.getString("PASWOORD") + "\")'><img src='algemeen/images/public_user_avail.png'>" + rs.getString("CODE") + " - " + rs.getString("NAAM") + "</a></li>");
      }
    }  
  } 
} catch(Exception e){
  throw(e);
}
finally{
  conn.close();
}

      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </fieldset>\r\n");
      out.write("  </div>\r\n");
      out.write("     \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
