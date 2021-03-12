<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 11:33 μ.μ.
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
    <title>Hire Form</title>
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

    <h2>Hire an employee</h2>
    <g:form name="loginForm" controller="Employee" action="createEmployee">
        <div class="mb-3">
            <label class="form-label">First Name</label>
            <input name="first_name" class="form-control" required="true"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Last Name</label>
            <input name="last_name" class="form-control" required="true"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">ΑΦΜ</label>
            <input name="afm" class="form-control" required="true"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Date of birth</label>
            <input name="dob" class="form-control" required="true" placeholder="YYYY-MM-DD"><br/>
        </div>

        <div class="mb-3">
            <select name="dept_id" class="form-select" aria-label="Default select example">
                <g:each var="department" in="${allDeps}">
                    <option name="dept_id" value="${department.id}" selected>${department.d_name}</option>
                </g:each>
            </select>
        </div>


        <g:actionSubmit type="button" class="btn btn-primary" value="Hire" action="createEmployee"/>

    </g:form>
</div>
</body>
</html>