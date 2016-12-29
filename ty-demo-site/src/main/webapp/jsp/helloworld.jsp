<%--
  Created by IntelliJ IDEA.
  User: guoguangnan
  Date: 16/10/14
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
</head>
<body>
<table border="1px">
  <tr>
    <td>ID信息</td>
    <td>Name信息</td>
  </tr>
  <c:forEach items="${list}" var="c" varStatus="i">
    <tr>
      <td>ID:${c.customerId}</td>
      <td> Name:${c.customerUsername}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
