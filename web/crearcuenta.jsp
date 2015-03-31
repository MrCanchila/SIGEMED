<%-- 
    Document   : crearcuenta
    Created on : 30/03/2015, 04:29:02 PM
    Author     : julieth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SIGEMED .::. Crear cuenta</title>
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
            <div class="row">
                <div class="col-md-offset-1 cuerpocuenta">
                    <div class="cabezacreacuenta"> 
                        <img src="img/bar.png">
                    </div>
                    <div class="titulocuenta">
                        <h2>Crear una Cuenta</h2>
                    </div>
                    <div class="col-md-6">
                        <form name="frmcrearregistro" action="Sigemed" method="POST">
                            <div class="form-group">
                                <label for="txtNombre1">Nombres</label>
                                <div class="form-inline">
                                    <input type="text" class="form-control" id="txtNombre1" name="txtNombre1" placeholder="Cristian" tabindex="1">
                                    <input type="text" class="form-control" id="txtNombre2" name="txtNombre2" placeholder="David" tabindex="2">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="txtApellido1">Apellidos</label>
                                <div class="form-inline">
                                    <input type="text" class="form-control" id="txtApellido1" name="txtApellido1" placeholder="Mendez" tabindex="3">
                                    <input type="text" class="form-control" id="txtApellido2" name="txtApellido2" placeholder="Suarez" tabindex="4">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="txtDocumento">Identificación</label>
                                <div class="form-inline">
                                    <input type="number" class="form-control" id="txtDocumento" name="txtDocumento" placeholder="Tipo" tabindex="5">
                                    <input type="number" class="form-control" id="txtCedula" name="txtCedula" placeholder="Cedula" tabindex="6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="txtCorreo">Correo</label>
                                <div class="form-inline">
                                    <input type="email" class="form-control" id="txtCorreo" name="txtCorreo" placeholder="miejemplo@misena.edu" tabindex="7">
                                </div>                  
                            </div>
                            <input type="hidden" name="oRegper" size="40" value="" />
                            <button type="submit" class="btn btn-primary" name="RegistrarP" >Crear cuenta</button>
                        </form>
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

