<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 3:02 μ.μ.
--%>

<!doctype html>
<html>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">




<head>


    <g:render template="/shared/navbar" />




</head>

<body>


<div class="container" style="width: 650px;">
    <h2>Departments</h2>

    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <g:each var="department" in="${res}">
            <tr>
                <th scope="row">${department.id}</th>
                <th scope="row">${department.d_name}</th>
                <td>
                    <g:link controller="General" action="showEmployees" params="[department_id: department.id]">
                        <button type="button" class="btn btn-primary">View</button>
                    </g:link>

                    <g:link controller="Department" action="updateDeptForm"
                            params="[d_id: department.id, d_name: department.d_name]">
                        <button type="button" class="btn btn-primary">Edit</button>
                    </g:link>

                    <g:link controller="Department" action="deleteDept" params="[d_id: department.id]">
                        <button type="button" class="btn btn-primary">Delete</button>
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
    <g:render template="/shared/footer" />
</body>
</html>