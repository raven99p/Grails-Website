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
    <title>AAAAAAAAAAAAAAAAAAA</title>
</head>

<body>
<div class="container">
    <h2>Department Names</h2>

    <g:form name="myForm" url="[controller:'employee',action:'getEmpByDept']">
        <g:select style="width:400px;height:300px;font-size: 20px"
                  name="table"
                  from="${res}"
                  value="${res.d_name}"
                  optionKey="id"
                  optionValue="d_name"
                  noSelection="${['1':'Select One...']}"
        />
        <g:link uri="/">Home</g:link>
        <g:actionSubmit type="button" class="btn btn-primary" value="See employees" action="getEmpByDept" />
    </g:form>
</div>



</body>
</html>