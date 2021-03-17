<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 3:02 μ.μ.
--%>

<!doctype html>
<html>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">




<head>
    <title>τμήματα</title>
    <g:render template="/shared/navbar"/>

</head>

<body>

<div class="container" style="width: 650px;">
    <h2>Τμήματα</h2>

    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Κωδικός αριθμός</th>
            <th scope="col">Όνομα</th>
            <th scope="col">Επιλογές</th>
        </tr>
        </thead>
        <tbody>
        <g:each var="department" in="${res}">
            <tr>
                <th scope="row">${department.id}</th>
                <th scope="row">${department.d_name}</th>
                <td>
                    <g:link controller="General" action="showEmployees" params="[dept_id: department.id]">
                        <button type="button" class="btn btn-primary">Προβολή</button>
                    </g:link>

                    <g:link controller="Department" action="updateDeptForm"
                            params="[d_id: department.id, d_name: department.d_name]">
                        <button type="button" class="btn btn-primary">Διαχείρηση</button>
                    </g:link>

                    <g:link controller="Department" action="deleteDept" params="[d_id: department.id]">
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