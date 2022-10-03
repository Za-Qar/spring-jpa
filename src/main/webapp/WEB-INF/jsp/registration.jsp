<%--
  Created by IntelliJ IDEA.
  User: Zaid.Qarout
  Date: 03/10/2022
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registrations</h1>
    <%--@elvariable id="registration" type="Registration"--%>
    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    <spring:message code="name" />
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="2">

                    <input type="submit" value=<spring:message code="save" /> />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
