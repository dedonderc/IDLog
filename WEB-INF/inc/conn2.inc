<%@page import="javax.naming.*,javax.sql.*, java.sql.*, java.text.*, com.easypaygroup.snolf.*" %>
<%

      response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
      response.setHeader("Pragma","no-cache"); //HTTP 1.0
      response.setDateHeader ("Expires", 0); //prevents caching at the proxy server

      String lang = "nl";
/*      Context initContext = new InitialContext();
      Context envContext = (Context) initContext.lookup("java:/comp/env");
      DataSource ds = (DataSource) envContext.lookup("jdbc/SVF_dev");
      Connection conn = ds.getConnection();
*/
%>
