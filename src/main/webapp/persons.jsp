<%@page import="org.example.person.Person" %>
<%@page import="org.example.person.PersonGenerator" %>
<%@page import="org.example.sort.AgeSorter" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 09.02.2023
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>persons</title>
</head>
<body>

<h2>list of objects whose age is less than 21</h2>
<% PersonGenerator personGenerator = new PersonGenerator(); %>
<% personGenerator.generatePersona(); %>
<table>
<% for (Person person : AgeSorter.getPersonUnderLegalAge(PersonGenerator.getPersonList())) { %>
    <tr>
<td> <%= person.toString()  %> </td>
    </tr>
<% } %>
</table>
</body>
</html>
