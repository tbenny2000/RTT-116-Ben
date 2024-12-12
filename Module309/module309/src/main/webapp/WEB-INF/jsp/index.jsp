<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring Boot</title>
</head>
<body>
    <h1> First Page </h1>
    <c:forEach var ="anything" begin="1" end="3">
        Item <c:out value="${anything}"/><p>
    </c:forEach>

    <table border="1">
        <tr>
            <td>Contact First Name</td>
            <td>Contact Last Name</td>
            <td>id</td>
            <td>Customer Name</td>
        </tr>

        <c:forEach var="names" items="${names}">
            <tr>
                <td>${names.contactFirstName}</td>
                <td>${names.contactLastName}</td>
                <td>${names.id}</td>
                <td>${names.customerName}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>