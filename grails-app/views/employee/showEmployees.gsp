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
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

<script src="/assets/jquery-3.3.1.min.js"></script>
<script src="/assets/popper.min.js"></script>
<script src="/assets/bootstrap.js"></script>
<script src="/assets/bootstrap-confirmation.min.js"></script>

<head>
    <title>Υπάλληλοι</title>
    <g:render template="/shared/navbar"/>
</head>

<body>
<div class="container" style="width: 900px;">

    <h2>Υπάλληλοι τμήματος : ${allEmployeesInformation.departmentName}</h2>
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
        <g:each var="employee" in="${allEmployeesInformation.allEmployeesofDepartment}">
            <tr>
                <th scope="row">${employee.employeeId}</th>
                <th>${employee.firstName}</th>
                <td>${employee.lastName}</td>
                <td>${employee.afm}</td>
                <td>${employee.dob}</td>
                <td>
                    <g:link controller="employee" action="editEmployee" params="[employeeId: employee.employeeId]">
                        <button type="button" class="btn btn-primary">Διαχείρηση</button>
                    </g:link>
                    <g:link controller="employee" action="deleteEmployee"
                            params="[employeeId: employee.employeeId, departmentId: employee.departmentId]">
                        <button type="button" class="btn btn-primary" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');">Διαγραφή</button>
                        


                    </g:link>
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>
    <g:link controller="department" action="showDepartments">
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