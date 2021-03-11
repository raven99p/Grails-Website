<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 8/3/2021
  Time: 3:02 μ.μ.
--%>

<!doctype html>
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>




<head>

    <title>Departments</title>

</head>

<body>


<div class="container">
    <h2>Logged in as ${session["user"][0]}</h2>
    <h2>Department Names</h2>

    <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Actions</th>
            </tr>
            </thead>
            <tbody>
            <g:each var="department" in="${res}" >
                <tr>
                    <th scope="row">${department.id}</th>
                    <th scope="row">${department.d_name}</th>
                    <td>
                        <g:link controller="employee" action="getEmpByDept" params="[table:department.id]">
                            <button type="button" class="btn btn-primary">View</button>
                        </g:link>
                        <g:link controller="employee" action="updateDeptForm" params="[d_id:department.id, d_name:department.d_name]">
                            <button type="button" class="btn btn-primary">Edit</button>
                        </g:link>
                        <g:link controller="employee" action="deleteDept" params="[d_id:department.id]">
                            <button type="button" class="btn btn-primary">Delete</button>
                        </g:link>
                    </td>
                </tr>
            </g:each>
            </tbody>
        </table>




    <g:link controller="logReg" action="logout">
        <button type="button" class="btn btn-primary">Logout</button>
    </g:link>
    <g:link controller="employee" action="createEmployeeForm">
        <button type="button" class="btn btn-primary">Create new employee</button>
    </g:link>
    <g:link controller="employee" action="createDeptForm">
        <button type="button" class="btn btn-primary">Create new department</button>
    </g:link>

</div>
</body>
</html>