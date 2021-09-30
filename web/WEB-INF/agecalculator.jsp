<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2021, 5:46:24 PM
    Author     : owner-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calc</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
        <label>Enter your age:</label>
        <input type="text" name="age" value="${age}">
        <br><br>
        <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <br>
        <a href="/CPRG-352-Lab3/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
