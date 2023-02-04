<%--
  Created by IntelliJ IDEA.
  User: THIS PC
  Date: 2/3/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<body>
<p>
  <a href="/ProductServlet"><button>Back to home page</button></a>
</p>
<form action="/ProductServlet" method="post">
  <label>Id: </label>
  <input type="text" name="id" placeholder="id"><br>
    <label>Name: </label>
    <input type="text" name="name" placeholder="name"><br>
    <label>Price: </label>
    <input type="text" name="price" placeholder="0"><br>
    <label>Category</label>
    <input type="text" name="category" placeholder="category"><br>
</form>
</body>
</html>
