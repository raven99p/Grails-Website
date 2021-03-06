<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 3:02 μ.μ.
--%>

<!doctype html>
<html>
<!-- Latest compiled and minified CSS -->
<asset:stylesheet src="bootstrap.min.css"/>




<head>
    <title>τμήματα</title>
    <g:render template="/shared/navbar"/>

</head>

<body>

<div class="container" style="width: 650px;">
    <h2>Τμήματα</h2>
    <g:if test="${flash.message}">
        <div class="message" style="display: block">${flash.message}</div>
    </g:if>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Κωδικός αριθμός</th>
            <th scope="col">Όνομα</th>
            <th scope="col">Επιλογές</th>
        </tr>
        </thead>
        <tbody>
        <g:each var="department" in="${allDepartments}">
            <tr>
                <th scope="row">${department.departmentId}</th>
                <th scope="row">${department.departmentName}</th>
                <td>
                    <g:link controller="employee" action="showEmployees"
                            params="[departmentId: department.departmentId]">
                        <button type="button" class="btn btn-primary">Προβολή</button>
                    </g:link>

                    <g:link controller="Department" action="updateDeptForm"
                            params="[departmentId: department.departmentId, departmentName: department.departmentName]">
                        <button type="button" class="btn btn-primary">Διαχείρηση</button>
                    </g:link>

                    <g:link controller="Department" action="deleteDept"
                            params="[departmentId: department.departmentId]">
                        <button type="button" class="btn btn-primary">Διαγραφή</button>
                    </g:link>
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>




    <!--
    <g:link controller="Employee" action="createEmployeeForm" id="create_Employee">
        <button type="button" class="btn btn-primary">Create new employee</button>
    </g:link>
    <g:link controller="Department" action="createDeptForm">
        <button type="button" class="btn btn-primary">Create new department</button>
    </g:link>
    -->

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
