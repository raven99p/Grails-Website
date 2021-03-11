<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 2:34 μ.μ.
--%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>



<html>
<head>
    <title>Edit Form</title>
</head>
${res}
<body>
    <div class="container">
        <h2>This is the editing form of employee</h2>
        <g:form name="loginForm" controller="employee" action="updateEmployeeForm">
            <div class="mb-3">
                <label class="form-label">id</label>
                <input name="id" class="form-control" required="true" value=${res.id[0]} readonly><br/>
            </div>
            <div class="mb-3">
                <label class="form-label">First Name</label>
                <input name="first_name" class="form-control" required="true" value=${res.first_name[0]}><br/>
            </div>
            <div class="mb-3">
                <label class="form-label">Last Name</label>
                <input name="last_name" class="form-control" required="true" value=${res.last_name[0]}><br/>
            </div>
            <div class="mb-3">
                <label class="form-label">ΑΦΜ</label>
                <input name="afm" class="form-control" required="true" value=${res.afm[0]}><br/>
            </div>
            <div class="mb-3">
                <label class="form-label">Date of birth</label>
                <input name="dob" class="form-control" required="true" value=${res.dob[0]}><br/>
            </div>
            <g:select class="form-select" size="3" aria-label="size 3 select example" style="width:400px;height:300px;font-size: 20px"
                      name="dept_id"
                      from="${dep}"
                      value="${res.dept_id[0]}"
                      optionKey="id"
                      optionValue="d_name"
                      noSelection="${['1':'Select One...']}"
            />


            <g:actionSubmit type="button" class="btn btn-primary" value="Save" action="updateEmployeeForm" />
            <g:link controller="logReg" action="logout">
                <button type="button" class="btn btn-primary">Logout</button>
            </g:link>
        </g:form>
    </div>
</body>
</html>