<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 11/3/2021
  Time: 2:31 μ.μ.
--%>

<!-- Latest compiled and minified CSS -->
<asset:stylesheet src="bootstrap.min.css"/>



<html>
<head>
    <title>Δημιουργία τμήματος</title>
    <g:render template="/shared/navbar"/>
</head>

<body>
<div class="container" style="width: 500px;">
    <h2>Φόρμα δημιουργίας τμήματος</h2>
    <g:form name="CreateDeptForm" controller="Department" action="createDept">
        <div class="mb-3">
            <label class="form-label" for="deaprtmentName">Όνομα</label>
            <input id="deaprtmentName" name="departmentName" class="form-control" required="true" maxlength="10"><br/>
        </div>

        <g:actionSubmit type="button" class="btn btn-primary" value="Create" action="createDept"/>
    </g:form>
</div>
<g:render template="/shared/footer"/>
<style>
body {
    background-image: url("https://images.unsplash.com/photo-1496307653780-42ee777d4833?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTJ8fHdoaXRlJTIwZGVza3RvcHxlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80");
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
</body>
</html>