<%-- 
    Document   : index
    Created on : 25/03/2015, 01:09:03 PM
    Author     : Mr.Canchila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>SIGEMED .::. Inicio</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" type="x/ico" href="img/Favicon.ico">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
        <link rel="stylesheet" type="text/css" href="css/style.css"> 


        <script src="js/jquery-1.11.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row" id="head">
                <div class="col-xs-4 col-md-4" id="logo">
                    <img src="img/bar.png">
                </div>

                <div class="colxs-6 col-md-6" id="menu">
                    <ul  id="submenu">
                        <li><a href="index.jsp">Inicio</a></li>
                        <li><a href="#footer">Quiénes somos</a></li>
                        <li><a href="crearcuenta.jsp" >Crear Cuenta</a></li>
                        <li><a href="iniciarsesion.jsp">Iniciar Sesión</a></li>
                        <li><a href="#footer">Contacto</a></li>
                    </ul>          
                </div>

                <div class="colxs-2 col-md-2" id="idioma">                 
                    <div class="dropdown" id="desplegable">
                        <div class="dropdown-toggle" id="menudesplegable" data-toggle="dropdown" aria-expanded="true">
                            Idioma
                            <span class="caret"></span>
                        </div>
                        <ul class="dropdown-menu" aria-labelledby="menudesplegable">
                            <li><a href="home.jsp">Ingles</a></li>
                            <li><a href="index.jsp">Español</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="row" id="slider"> 
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    </ol>
                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <div class="item active">
                            <img src="img/slider1.jpg" alt="...">
                        </div>
                        <div class="item">
                            <img src="img/slider2.jpg" alt="...">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">   
                <div class="col-md-12 datos">
                    <div class="col-xs-4 col-md-4">
                        <center>
                            <div class="circulo img-circle" style="width: 100px; height: 100px; margin-top: -50px;">
                                <span class="glyphicon glyphicon-plus-sign icon"></span>
                            </div>
                        </center>
                        <h5 class="text-center"><strong>SIGEMED</strong></h5> 
                        <p class="text-center">
                            Es una útil herramienta 
                            para controlar, asignar y 
                            gestionar los equipo médicos 
                            domiciliarios utilizados por 
                            pacientes de las EPS clientes.
                        </p>
                    </div>
                    <div class="col-xs-4 col-md-4">
                        <center>
                            <div class="circulo img-circle" style="width: 120px; height: 120px; margin-top: -80px;">
                                <span class="glyphicon glyphicon-education icon edu"></span>
                            </div>
                        </center>
                        <h5 class="text-center text-uppercase"><strong> Proyecto Formativo </strong></h5>
                        <address class="text-center">
                            ADSI<br>
                            Ficha: 626740<br>
                            Angelica Maria Alvarez Rojas<br>
                            Arnulfo Miguel Canchila Hernández<br>
                        </address>
                    </div>
                    <div class="col-xs-4 col-md-4">
                        <center>
                            <div class="circulo img-circle" style="width: 110px; height: 110px; margin-top: -50px;">
                                <span class="glyphicon glyphicon-briefcase icon"></span>
                            </div>
                        </center>
                        <h5 class="text-center"><strong>CONTACTENOS</strong></h5>
                        <address class="text-center">
                            https:/sigemed.com/<br>
                            contacto@sigemed.com<br>
                            <abbr title="Phone">Movil:</abbr> 313745689<br>
                            <abbr title="Phone">Teléfono:</abbr> 2081356
                        </address>             
                    </div>
                </div>
            </div>
            <div class="row misionvision">
                <div class="col-md-6 mision">
                    <section>
                         <h3 class="text-center">Misión</h3>
                         <p class="text-center"></p>
                    </section>
                </div>
                <div class="col-md-6 vision">
                    <section>
                        <h3 class="text-center">Visión</h3>
                        <p class="text-center"></p>
                    </section>                    
                </div>
            </div>
            <div class="row" id="footer">
                <div class="col-xs-6 col-md-6" id="footerder">
                    <img src="img/logofooter.png"> Derechos Reservados 2014, Bogotá D.C (Colombia)
                </div>
                <div class="col-xs-6 col-md-6" id="footerizq">
                    <span><img src="img/logofooterface.png"></span>
                    <span><img src="img/logofootergo.png"></span>
                    <span><img src="img/logofooterhtml5.png"></span>
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
