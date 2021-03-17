<%--
  Created by IntelliJ IDEA.
  User: paulinho ellul
  Date: 9/3/2021
  Time: 12:36 μ.μ.
--%>
<!doctype html>
<html>
<!-- Latest compiled and minified CSS -->

    <asset:stylesheet src="bootstrap.min.css"/>



<head>
    <title>Είδοσος</title>
</head>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Postem</a>
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
                    <a class="nav-link" href="#"></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"></a>
                </li>
            </ul>
            <span class="navbar-text">
                Δεν είστε συνδεδεμένος.
            </span>
        </div>
    </div>
</nav>

<body>
<div class="container" style="width: 500px;">
    <h2>Είσοδος</h2>
    <g:form name="loginForm" controller="logReg" action="varif">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Username</label>
            <input type="email" name="username" class="form-control" id="exampleInputEmail1"
                   aria-describedby="emailHelp" required="true" maxlength="50"><br/>

            <div id="emailHelp" class="form-text">Να θυμάστε πως ποτέ δεν θα σας ζητηθεί ο κωδικός.</div>
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input name="password" type="password" class="form-control" id="exampleInputPassword1" required="true"
                   maxlength="50"><br/>
        </div>

        <g:actionSubmit type="button" class="btn btn-primary" value="Είσοδος" action="varif"/>

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