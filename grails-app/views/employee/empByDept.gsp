<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 4:30 μ.μ.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

<head>
    <title>AAAAAAAAAAAAAAAAAAA</title>
</head>

<body>
<div class="container">
    <h2>Employee Names</h2>
    <g:select style="width:400px;height:300px;font-size: 20px" name="employee_names" from="${first_name}"
              value="${first_name}" />
    <g:link uri="/">Home</g:link>


    <g:link controller="employee" action="index">
        <button type="button" class="btn btn-primary">Go to Departments</button>
    </g:link>
</div>

</body>
</html>