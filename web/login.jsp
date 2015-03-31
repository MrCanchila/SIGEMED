<%-- 
    Document   : login
    Created on : 30/03/2015, 11:32:12 PM
    Author     : julieth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SIGEMED .::. Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="x/ico" href="img/Favicon.ico">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
        <link rel="stylesheet" type="text/css" href="css/estilo.css"> 

        <script src="js/jquery-1.11.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row col-md-offset-1" id="ingresar" >
                <div class="col-md-6" id="izq">        
                    <img src="img/sesion.png" class="img-responsive">
                    <div class="izqsesion col-md-12 col-xs-6">

                    </div>
                </div>

                <div class="col-md-4 col-md-offset-1" id="frmingresar">
                    <div class="logosesion" style="margin-left: -20px;">
                        <img src="img/bar.png">
                    </div>
                    <br>
                    <form role="form" action="Sigemed" method="POST" name="frmsesion">
                        <div class="form-group">
                            <label for="txtUsuario">User</label>
                            <input type="text" class="form-control" name="txtUsuario" id="txtUsuario" placeholder="Usuario">
                        </div>
                        <div class="form-group">
                            <label for="txtPassword">Password</label>
                            <input type="password" class="form-control" name="txtPassword" id="txtPassword" placeholder="Contraseña">
                        </div>
                        <br>

                        <input type="hidden" name="rSesion"/>
                        <button type="submit" class="btn btn-primary" name="btnIniciarsesion">Login</button>
                    </form>
                    <%
                        if (request.getParameter("sal") != null) {

                    %>
                    <div class="row small confirmarOK">
                        <%=request.getParameter("sal")%>
                    </div>     
                    <%
                        }
                        // si es null el objeto, es decir, no se ha creado aun, no mostramos nada
                    %>
                    <br>
                    <div class="row small">
                        <a> Do Can not access?</a>
                    </div>

                    <div class="crearsesion">
                        <span>Do not have an account?</span>
                        <a href="createaccount.jsp">Create account</a>
                    </div>
                </div>
            </div>
        </div>
        <script>
            $().ready(function () {
                // validación del formulario
                $("#miFormulario").validate({
                    rules: {
                        inputEmail3: {required: true, email: true},
                        inputPassword3: {required: true}
                    }
                });
            });
        </script>
    </body>
</html>
