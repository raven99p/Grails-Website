<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 11/3/2021
  Time: 2:31 μ.μ.
--%>

<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">



<html>
<head>
    <title>Create Form</title>
    <g:render template="/shared/navbar" />
</head>

<body>
<div class="container" style="width: 500px;">
    <h2>Create a new department</h2>
    <g:form name="CreateDeptForm" controller="Department" action="createDept">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input name="d_name" class="form-control" required="true"><br/>
        </div>

        <g:actionSubmit type="button" class="btn btn-primary" value="Create" action="createDept"/>
    </g:form>
</div>
<g:render template="/shared/footer" />
</body>
</html>