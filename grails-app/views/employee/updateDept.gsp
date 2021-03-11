<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 11/3/2021
  Time: 2:41 μ.μ.
--%>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
      integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
        integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
        crossorigin="anonymous"></script>



<html>
<head>
    <title>Edit Form</title>
    <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
            <span class="navbar-text">
                <h4>Logged in as: ${session["user"][0]}</h4>
                <g:link controller="logReg" action="logout">
                    <button type="button" class="btn btn-primary">Logout</button>
                </g:link>

            </span>
        </div>
    </nav>
</head>

<body>
<div class="container" style="width: 500px;">
    <h2>Edit current department</h2>
    <g:form name="CreateDeptForm" controller="employee" action="updateDept">
        <div class="mb-3">
            <label class="form-label">id</label>
            <input name="dept_id" class="form-control" required="true" value=${dept_id} readonly><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Name</label>
            <input name="d_name" class="form-control" required="true" value= ${d_name}><br/>
        </div>

        <g:actionSubmit type="button" class="btn btn-primary" value="Save" action="updateDept"/>
    </g:form>
</div>
</body>
</html>