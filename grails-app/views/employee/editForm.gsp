<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 2:34 μ.μ.
--%>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">



<html>
<head>
    <title>Αλλαγή στοιχείων υπαλλήλου</title>
    <g:render template="/shared/navbar"/>
</head>

<body>
<div class="container" style="width: 500px;">
    <h2>Φόρμα Αλλαγής στοιχείων</h2>
    <g:form name="loginForm" controller="Employee" action="updateEmployeeForm">
        <div class="mb-3">
            <label class="form-label">Κωδικός αριθμός</label>
            <input name="id" class="form-control" required="true" value=${employeeInformation.res.id} readonly><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Όνομα</label>
            <input name="first_name" class="form-control" required="true"
                   value=${employeeInformation.res.first_name} maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Επώνυμο</label>
            <input name="last_name" class="form-control" required="true" value=${employeeInformation.res.last_name} maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">ΑΦΜ</label>
            <input name="afm" class="form-control" required="true" value=${employeeInformation.res.afm} maxlength="9"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Ημερομηνία γέννησης</label>
            <input name="dob" class="form-control" required="true"
                   value=${employeeInformation.res.dob} pattern="(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Κωδικός αριθμός τμήματος</label>
            <select name="dept_id" class="form-select" aria-label="Default select example">
                <option name="dept_id" value="${employeeInformation.defaultDepartment.id}"
                        select="selected">${employeeInformation.defaultDepartment.d_name}</option>
                <g:each var="department" in="${employeeInformation.allDeps}">
                    <option name="dept_id" value="${department.id}">${department.d_name}</option>
                </g:each>

            </select>
        </div>


        <g:actionSubmit type="button" class="btn btn-primary" value="Αποθήκευση" action="updateEmployeeForm"/>

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