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
    <title>Employees</title>
</head>

<body>
<div class="container">

    <h2>Employees</h2>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">First name</th>
                <th scope="col">Last name</th>
                <th scope="col">ΑΦΜ</th>
                <th scope="col">Date of birth</th>
                <th scope="col">Actions</th>
            </tr>
        </thead>
        <tbody>
            <g:each var="employee" in="${res}" >
                <tr>
                    <th scope="row">${employee.id}</th>
                    <th scope="row">${employee.first_name}</th>
                    <td>${employee.last_name}</td>
                    <td>${employee.afm}</td>
                    <td>${employee.dob}</td>
                    <td>
                        <g:link controller="employee" action="index">
                            <button type="button" class="btn btn-primary">Edit</button>
                        </g:link>
                        <g:link controller="employee" action="index">
                            <button type="button" class="btn btn-primary">Delete</button>
                        </g:link>
                    </td>
                </tr>
            </g:each>
        </tbody>
    </table>








</div>

</body>
</html>