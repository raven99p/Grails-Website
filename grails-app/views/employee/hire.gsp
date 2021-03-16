<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 11:33 μ.μ.
--%>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">



<html>
<head>
    <title>Hire Form</title>
    <g:render template="/shared/navbar" />
</head>

<body>
<div class="container" style="width: 500px;">

    <h2>Hire an employee</h2>
    <g:form name="loginForm" controller="Employee" action="createEmployee">
        <div class="mb-3">
            <label class="form-label">First Name</label>
            <input name="first_name" class="form-control" required="true"  maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Last Name</label>
            <input name="last_name" class="form-control" required="true"  maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">ΑΦΜ</label>
            <input name="afm" class="form-control" required="true"  maxlength="9" ><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Date of birth</label>
            <input name="dob" class="form-control" required="true" placeholder="YYYY-MM-DD" pattern="\d{4}-\d{1,2}-\d{1,2}"  ><br/>
        </div>

        <div class="mb-3">
            <select name="dept_id" class="form-select" aria-label="Default select example">
                <g:each var="department" in="${allDeps}">
                    <option name="dept_id" value="${department.id}" selected>${department.d_name}</option>
                </g:each>
            </select>
        </div>


        <g:actionSubmit type="button" class="btn btn-primary" value="Hire" action="createEmployee"/>

    </g:form>
</div>
<g:render template="/shared/footer" />
</body>
</html>