<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 12/3/2021
  Time: 2:33 μ.μ.
--%>

<asset:stylesheet src="bootstrap.min.css"/>



<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="http://localhost:8080/department/showDepartments">Postem</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText"
                aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#"></a>
                </li>
                <li class="nav-item">
                    <g:link controller="Employee" action="createEmployeeForm" id="create_Employee">
                        <button type="button" class="btn btn-link">Πρόσληψη νέου υπαλλήλου</button>
                    </g:link>
                </li>
                <li class="nav-item">
                    <g:link controller="Department" action="createDeptForm">
                        <button type="button" class="btn btn-link">Δημιουργία νέου τμήματος</button>
                    </g:link>
                </li>
            </ul>

        </div>

        <span class="navbar-text" style="float: right;">
            Συνδεδεμένος ως: ${session["user"]}

        </span>
        <g:link controller="authentication" action="logout" style="float: right;">
            <button type="button" class="btn btn-link">αποσύνδεση</button>
        </g:link>

    </div>
</nav>

</body>

</html>