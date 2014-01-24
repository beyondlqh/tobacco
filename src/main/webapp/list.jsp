<%@ page language="java"
         import="com.iotsec.tobacco.javabean.Record,java.util.ArrayList"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List Product</title>
    <script type="text/javascript">
    </script>
</head>

<%
    ArrayList<Record> list = (ArrayList<Record>) request
            .getAttribute("list");
%>
<body>
<center>
    <div id="header_index">
        <h1>
            <a href="Home.html" title="返回首页">返回首页</a>
            <a href="add.jsp" title="新增商品">新增商品</a>
        </h1>
    </div>
    <table>
        <tr>
            <td>序号</td>
            <td>产品编号</td>
            <td>产品名称</td>
            <td>生产厂家</td>
            <td>生产日期</td>
            <td>产品批号</td>
            <td>加密序号</td>
        </tr>
        <%
            if (list == null) {
        %>
        <tr>
            <td>未查到该商品</td>
        </tr>
        <%
        } else {
            String[] color = {"silver", "orange"};
            for (int i = 0; i < list.size(); i++) {
                Record record = list.get(i);
        %>
        <tr bgcolor="<%=color[(i + 1) % 2]%>">
            <td><%=record.getId()%>
            </td>
            <td><%=record.getPID()%>
            </td>
            <td><%=record.getName()%>
            </td>
            <td><%=record.getFactory()%>
            </td>
            <td><%=record.getDate()%>
            </td>
            <td><%=record.getBatch()%>
            </td>
            <td><%=record.getCryptoFlag()%>
            </td>
            <td><a
                    href="detail?id=<%=record.getPID()%>&flag=<%=record.getCryptoFlag().equals("DES") ? "00"
							: (record.getCryptoFlag().equals("DESede")?"01":"02")%>">二维码</a></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</center>
</body>
</html>