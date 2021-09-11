<%--
  Created by IntelliJ IDEA.
  User: junsik
  Date: 10/9/21
  Time: 8:31 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
  <head>
    <title>메인이닷</title>
    <tiles:insertAttribute name="loadFile"/>
  </head>
  <body>
    <div id="wrap">
      <div id="nav"><tiles:insertAttribute name="header"/></div>
      <div id="left"><tiles:insertAttribute name="left"/></div>
      <div id="body"><tiles:insertAttribute name="body"/></div>
      <div id="footer"><tiles:insertAttribute name="footer"/></div>
    </div>
  </body>
</html>
