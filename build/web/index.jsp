<%-- 
    Document   : index
    Created on : Aug 25, 2017, 9:24:55 AM
    Author     : hilink
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!heloooooooo1111 by HTML</h1>
        <h1><%out.println("hello world by scriplet, is not a good practice");%></h1>
        <h1>${el}</h1>
        <h1><c:out value="learning jstl way of printing"/></h1>
        <h1><c:out value="${el}"/></h1>
    </body>
</html>
