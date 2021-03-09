<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 9/3/2021
  Time: 12:36 μ.μ.
--%>
<!doctype html>
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>




<head>
    <title>Login</title>
</head>

<body>
    <div class="container">
        <h2>Login here</h2>
        <g:form name="loginForm" controller="logReg" action="varif">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Username</label>
                <input type="email" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"><br/>
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>

            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input name="password " type="password" class="form-control" id="exampleInputPassword1"><br/>
            </div>

            <g:actionSubmit type="button" class="btn btn-primary" value="Save" action="varif"/>

        </g:form>
    </div>



</body>
</html>