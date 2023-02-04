<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: THIS PC
  Date: 2/3/2023
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>List Product</h1>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Category</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getCategory()}</td>
            <td>
                <a href="view/edit.jsp"><button>edit</button></a>
            </td>
            <td>
                <a href="view/delete.jsp"><button>delete</button></a>
            </td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="/ProductServlet?action=create"><button>Create new product</button></a>
</p>
</body>
</html>
