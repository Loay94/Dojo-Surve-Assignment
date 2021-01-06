<%--
  Created by IntelliJ IDEA.
  User: jodhl
  Date: 1/5/2021
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/styledisplay.css">
    <title>Title</title>
</head>
<body>
<h1> Submitted Info</h1>
<h2> Name:     <c:out value="${name}"/> </h2>
<h2> location: <c:out value="${location}"/> </h2>
<h2> Language: <c:out value="${Language}"/> </h2>
<h2> comment:  <c:out value="${comment}"/> </h2>
<form action="/">
    <button>Go back!</button>
</form>
</body>
</html>
