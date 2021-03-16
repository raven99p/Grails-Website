<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 4:30 μ.μ.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

<head>
    <title>Employees</title>
    <g:render template="/shared/navbar" />
</head>

<body>
<div class="container" style="width: 900px;">

    <h2>Employees of Department : ${dept_name}</h2>
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
        <g:each var="employee" in="${res}">
            <tr>
                <th scope="row">${employee.id}</th>
                <th scope="row">${employee.first_name}</th>
                <td>${employee.last_name}</td>
                <td>${employee.afm}</td>
                <td>${employee.dob}</td>
                <td>
                    <g:link controller="Employee" action="editEmpId" params="[id: employee.id]">
                        <button type="button" class="btn btn-primary">Edit</button>
                    </g:link>
                    <g:link controller="Employee" action="deleteEmployee" params="[id: employee.id, dept_id: dept_id]">
                        <button type="button" class="btn btn-primary">Delete</button>
                    </g:link>
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>
    <g:link controller="General" action="showDepartments">
        <button type="button" class="btn btn-primary">Back to Departments</button>
    </g:link>

</div>
<g:render template="/shared/footer" />
</body>
</html>