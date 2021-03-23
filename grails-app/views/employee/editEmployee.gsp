<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 2:34 μ.μ.
--%>
<!-- Latest compiled and minified CSS -->
<asset:stylesheet src="bootstrap.min.css"/>



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
            <label class="form-label" for="employeeId" >Κωδικός αριθμός</label>
            <input id ="employeeId" name="employeeId" class="form-control" required="true"
                   value=${TotalInformation.employeeInformation.employeeId} readonly><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="firstName">Όνομα</label>
            <input id="firstName" name="firstName" class="form-control" required="true"
                   value=${TotalInformation.employeeInformation.firstName} maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="lastName">Επώνυμο</label>
            <input id="lastName" name="lastName" class="form-control" required="true"
                   value=${TotalInformation.employeeInformation.lastName} maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="afm">ΑΦΜ</label>
            <input id="afm" name="afm" class="form-control" required="true"
                   value=${TotalInformation.employeeInformation.afm} maxlength="9"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="dob">Ημερομηνία γέννησης</label>
            <input id="dob" name="dob" class="form-control" required="true"
                   value=${TotalInformation.employeeInformation.dob} pattern="(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label" for="departmentId">Κωδικός αριθμός τμήματος</label>
            <select id="departmentId" name="departmentId" class="form-select" aria-label="Default select example">
                <option name="departmentId" value="${TotalInformation.employeeInformation.departmentId}"
                        select="selected">${TotalInformation.defaultDepartment.departmentName}</option>
                <g:each var="department" in="${TotalInformation.allDepartments}">
                    <option name="dept_id" value="${department.departmentId}">${department.departmentName}</option>
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