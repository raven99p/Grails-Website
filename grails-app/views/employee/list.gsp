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
    <h2>Department Names</h2>

    <g:form name="myForm" url="[controller:'employee',action:'getEmpByDept']">
        <div class="form-group">
            <g:select class="form-select" size="3" aria-label="size 3 select example" style="width:400px;height:300px;font-size: 20px"
                      name="table"
                      from="${res}"
                      value="${res.d_name}"
                      optionKey="id"
                      optionValue="d_name"
                      noSelection="${['1':'Select One...']}"
            />
        </div>
        <div class="form-group">
            <g:link uri="/">Home</g:link>
            <g:actionSubmit type="button" class="btn btn-primary" value="See employees" action="getEmpByDept" />
        </div>
    </g:form>
    <g:link controller="logReg" action="logout">
        <button type="button" class="btn btn-primary">Logout</button>
    </g:link>
    <g:link controller="employee" action="hireForm">
        <button type="button" class="btn btn-primary">Hire</button>
    </g:link>
</div>
</body>
</html>