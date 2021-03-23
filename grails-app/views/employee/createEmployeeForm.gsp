<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 11:33 μ.μ.
--%>
<!-- Latest compiled and minified CSS -->
<asset:stylesheet src="bootstrap.min.css"/>



<html>
<head>
    <title>Πρόσληψη</title>
    <g:render template="/shared/navbar"/>
</head>

<body>
<div class="container" style="width: 500px;">

    <h2>Φόρμα Πρόσληψης</h2>
    <g:form name="loginForm" controller="employee" action="createEmployee">
        <div class="mb-3">
            <label class="form-label" for="firstName">Όνομα</label>
            <input id="firstName" name="firstName" class="form-control" required="true" maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="lastName">Επώνυμο</label>
            <input id="lastName" name="lastName" class="form-control" required="true" maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="afm">ΑΦΜ</label>
            <input id="afm" name="afm" class="form-control" required="true" maxlength="9"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="dob">Ημερομηνία γέννησης</label>
            <input id="dob" name="dob" class="form-control" required="true" placeholder="DD-MM-YYYY"
                   pattern="(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="departmentId">Κωδικός τμήματος</label>
            <select id="departmentId" name="departmentId" class="form-select" aria-label="Default select example">
                <g:each var="department" in="${allDepartments}">
                    <option name="departmentId" value="${department.departmentId}"
                            selected>${department.departmentName}</option>
                </g:each>
            </select>
        </div>


        <g:actionSubmit type="button" class="btn btn-primary" value="Hire" action="createEmployee"/>

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