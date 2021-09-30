<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 27, 2021, 7:20:01 PM
    Author     : owner-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calc</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
        <label>First</label>
        <input type="text" name="first" value="${first}">
        <br><br>
        <label>Second</label>
        <input type="text" name="second" value="${second}">
        <br><br>
        <input type="submit" name="plus" value="${plus}+">
        <input type="submit" name="minus" value="${minus}-">
        <input type="submit" name="times" value="${times}*">
        <input type="submit" name="divisor" value="${divisor}%">
        </form>
        <br>
        <p>Result: ${message}</p>
        <a href="/CPRG-352-Lab3/age">Age Calculator</a
    </body>
</html>
