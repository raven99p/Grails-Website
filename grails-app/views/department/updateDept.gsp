<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 11/3/2021
  Time: 2:41 μ.μ.
--%>


<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">



<html>
<head>
    <title>Edit Form</title>
    <g:render template="/shared/navbar" />
</head>

<body>
<div class="container" style="width: 500px;">
    <h2>Edit current department</h2>
    <g:form name="CreateDeptForm" controller="Department" action="updateDept">
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
    <g:render template="/shared/footer" />
<style>
body {background-image: url("https://images.unsplash.com/photo-1496307653780-42ee777d4833?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTJ8fHdoaXRlJTIwZGVza3RvcHxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80");
    background-repeat:no-repeat;
    background-size: cover;
}
</style>
</body>
</html>