<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 11/3/2021
  Time: 2:41 μ.μ.
--%>


<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">



<html>
<head>
    <title>Αλλαγή στοιχείων τμήματος</title>
    <g:render template="/shared/navbar"/>
</head>

<body>
<div class="container" style="width: 500px;">
    <h2>Φόρμα αλλαγής στοιχείων</h2>
    <g:form name="CreateDeptForm" controller="Department" action="updateDept">
        <div class="mb-3">
            <label class="form-label">Κωδικός αριθμός</label>
            <input name="departmentId" class="form-control" required="true" value=${departmentInformation.departmentId} readonly><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Όνομα</label>
            <input name="departmentName" class="form-control" required="true" value=${departmentInformation.departmentName} maxlength="10"><br/>
        </div>

        <g:actionSubmit type="button" class="btn btn-primary" value="Αποθήκευση" action="updateDept"/>
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