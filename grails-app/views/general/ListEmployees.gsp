<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 4:30 μ.μ.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

<head>
    <title>Υπάλληλοι</title>
    <g:render template="/shared/navbar"/>
</head>

<body>
<div class="container" style="width: 900px;">

    <h2>Υπάλληλοι τμήματος : ${d_name}</h2>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Κωδικός αριθμός</th>
            <th scope="col">Όνομα</th>
            <th scope="col">Επώνυμο</th>
            <th scope="col">ΑΦΜ</th>
            <th scope="col">Ημερομηνία γέννησης</th>
            <th scope="col">Επιλογές</th>
        </tr>
        </thead>
        <tbody>
        <g:each var="employee" in="${res}">
            <tr>
                <th scope="row">${employee.id}</th>
                <th scope="row">${employee.first_name}</th>
                <td>${employee.last_name}</td>
                <td>${employee.afm}</td>
                <td>${employee.greekDate}</td>
                <td>
                    <g:link controller="Employee" action="editEmpId" params="[id: employee.id]">
                        <button type="button" class="btn btn-primary">Διαχείρηση</button>
                    </g:link>
                    <g:link controller="Employee" action="deleteEmployee" params="[id: employee.id, dept_id: dept_id]">
                        <button type="button" class="btn btn-primary">Διαγραφή</button>
                    </g:link>
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>
    <g:link controller="General" action="showDepartments">
        <button type="button" class="btn btn-primary">Πίσω</button>
    </g:link>

</div>
<g:render template="/shared/footer"/>
<style>
body {
    background-image: url("https://images.unsplash.com/photo-1496307653780-42ee777d4833?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTJ8fHdoaXRlJTIwZGVza3RvcHxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80");
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
</body>
</html>