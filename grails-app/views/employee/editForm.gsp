<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 10/3/2021
  Time: 2:34 μ.μ.
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
    <h2>This is the editing form of employee</h2>
    <g:form name="loginForm" controller="Employee" action="updateEmployeeForm">
        <div class="mb-3">
            <label class="form-label">id</label>
            <input name="id" class="form-control" required="true" value=${res.id[0]} readonly><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">First Name</label>
            <input name="first_name" class="form-control" required="true" value= ${res.first_name[0]} maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Last Name</label>
            <input name="last_name" class="form-control" required="true" value= ${res.last_name[0]} maxlength="50"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">ΑΦΜ</label>
            <input name="afm" class="form-control" required="true" value= ${res.afm[0]} maxlength="9"><br/>
        </div>

        <div class="mb-3">
            <label class="form-label">Date of birth</label>
            <input name="dob" class="form-control" required="true" value= ${res.dob[0]} pattern="\d{4}-\d{1,2}-\d{1,2}"><br/>
        </div>
        <!--
        <g:select class="form-select" size="3" aria-label="size 3 select example"
                  style="width:400px;height:300px;font-size: 20px"
                  name="dept_id"
                  from="${dep}"
                  value="${res.dept_id[0]}"
                  optionKey="id"
                  optionValue="d_name"
                  noSelection="${['1': 'Select One...']}"/>
        -->

        <div class="mb-3">
            <label class="form-label">Department Id</label>
            <select name="dept_id" class="form-select" aria-label="Default select example" >
                <option name="dept_id" value="${defaultDepartment.id[0]}" select="selected" >${defaultDepartment.d_name[0]}</option>
                <g:each var="department" in="${allDeps}">
                    <option name="dept_id" value="${department.id}" >${department.d_name}</option>
                </g:each>

            </select>
        </div>


        <g:actionSubmit type="button" class="btn btn-primary" value="Save" action="updateEmployeeForm"/>

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