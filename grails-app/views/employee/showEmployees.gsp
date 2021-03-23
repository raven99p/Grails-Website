<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 4:30 μ.μ.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<!-- Latest compiled and minified CSS -->
<asset:stylesheet src="bootstrap.min.css"/>


<head>
    <title>Υπάλληλοι</title>
    <g:render template="/shared/navbar"/>
</head>
<body>
<div class="container" style="width: 1000px;">

    <h2>Υπάλληλοι τμήματος : ${allEmployeesInformation.departmentName}</h2>
    <table class="table">
        <thead>
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
                <td>${employee.employeeId}</td>
                <td>${employee.firstName}</td>
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