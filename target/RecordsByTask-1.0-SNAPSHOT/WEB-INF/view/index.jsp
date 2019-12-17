<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>

<style type="text/css">
    A:link {
        font-size: 20px;
    }
    A:hover {
        font-size: 34px;
        font-weight: bold;
        color: black;
    }
</style>

<style type="text/css">
    .footer {
        border: 6px solid;
        border-color: darkslateblue;
        position: absolute;
        bottom: 5px;
        width: 96%;
        height: 98px;
        background: linen;
    }
    .header {
        border: 6px solid;
        border-color: darkslateblue;
        width: 98%;
        margin: 0 auto;
        padding: 10px;
        background: linen;
        height: 65px;
    }
</style>

<head>
    <title> records By Task </title>
</head>

<body>
<div class="header">
    <h1 align="center" style="color: darkslateblue">
        <em>
            Welcome
        </em>
    </h1>
</div>
<br>
<h2 align="center">
    <em>
        Please press next.
    </em>
</h2>

<div role="main" align="center">
    <a href="/view?page=0"> Next </a>
</div>

<div class="footer">
    <h3 align="center" style="color: darkslateblue">
        <em>
            This is project CRUD for records <br>
        </em>
    </h3>
</div>

</body>

</html>
