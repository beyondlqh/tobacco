<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 14-1-24
  Time: 上午8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         import="com.iotsec.tobacco.javabean.Record,java.util.ArrayList"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title></title>
</head>
<%
    ArrayList<Record> list = (ArrayList<Record>) request
            .getAttribute("list");
%>
<body>
<%
    if (list == null) {
%>
未查到该商品
<%
} else {
%>
<table>
<tr><td>生产商</td><td><%=list.get(0).getFactory()%></td></tr>
<tr><td>品名</td><td><%=list.get(0).getName()%></td></tr>
<tr><td>生产日期</td><td><%=list.get(0).getDate()%></td></tr>
</table>
<%
    }
%>

</body>
</html>
