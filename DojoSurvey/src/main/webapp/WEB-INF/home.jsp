<%--
  Created by IntelliJ IDEA.
  User: jodhl
  Date: 1/5/2021
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/stylehome.css">

    <title>Title</title>
</head>
<body>
<form method ="POST" action="/login">
    <label for="fname">Your Name : </label><br>
    <input type="text" id="fname" name="name"><br><br>
    <label for="location">Dojo Location:</label><br>
    <select id="location" name="location">
        <option value="Nablus">Nablus</option>
        <option value="Ramallah">Ramallah</option>
        <option value="Jenin">Jenin</option>
    </select><br><br>
    <label for="Language">Dojo Location:</label><br>
    <select id="Language" name="Language">
        <option value="Java">Java</option>
        <option value="Python">Python</option>
        <option value="Mairen">Mairen</option>
    </select><br><br>
    <label for="comment">Comment (optional) </label><br>
    <input type="text" id="comment" name="comment"><br><br>
    <button>Button</button>
</form>
</body>
</html>
