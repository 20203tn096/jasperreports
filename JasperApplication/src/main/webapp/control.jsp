<%-- 
    Document   : control
    Created on : 1 jun 2022, 8:37:21
    Author     : CDS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<% String context = application.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Hola ${context}</h1>
<iframe src="./jasper/Informe.pdf" style="width:100%; height:700px;" frameborder="0"></iframe>
</body>
</html>
