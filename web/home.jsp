<%-- 
    Document   : home
    Created on : 30/03/2015, 10:33:30 PM
    Author     : Mr.Canchila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>SIGEMED .::. Home</title>
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
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="#footer">About Us</a></li>
                        <li><a href="crearcuenta.jsp" >Create account</a></li>
                        <li><a href="iniciarsesion.jsp">Login</a></li>
                        <li><a href="#footer">Contact</a></li>
                    </ul>          
                </div>

                <div class="colxs-2 col-md-2" id="idioma">                 
                    <div class="dropdown" id="desplegable">
                        <div class="dropdown-toggle" id="menudesplegable" data-toggle="dropdown" aria-expanded="true">
                            Language
                        </div>
                        <ul class="dropdown-menu" aria-labelledby="menudesplegable">
                            <li><a href="home.jsp">English</a></li>
                            <li><a href="index.jsp">Spanish</a></li>
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
                            It is a useful tool
                            for controlling, allocate and manage 
                            medical equipment  
                            the home medical equipment used by patients in the EPS.
                        </p>
                    </div>
                    <div class="col-xs-4 col-md-4">
                        <center>
                            <div class="circulo img-circle" style="width: 120px; height: 120px; margin-top: -80px;">
                                <span class="glyphicon glyphicon-education icon edu"></span>
                            </div>
                        </center>
                        <h5 class="text-center text-uppercase"><strong> TRAINING PROJECT </strong></h5>
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
                        <h5 class="text-center"><strong>CONTACT US</strong></h5>
                        <address class="text-center">
                            https:/sigemed.com/<br>
                            contacto@sigemed.com<br>
                            <abbr title="Phone">Mobile:</abbr> 313745689<br>
                            <abbr title="Phone">Phone:</abbr> 2081356
                        </address>             
                    </div>
                </div>
            </div>
            <div class="row misionvision">
                <div class="col-md-6 mision">
                    <section>
                        <h3 class="text-center">Mision</h3>
                        <p class="text-center"></p>
                    </section>
                </div>
                <div class="col-md-6 vision">
                    <section>
                        <h3 class="text-center">Vision</h3>
                        <p class="text-center"></p>
                    </section>
                </div>
            </div>
            <div class="row" id="footer">
                <div class="col-xs-6 col-md-6" id="footerder">
                    <img src="img/logofooter.png"> Copyright 2014 - Sigemed, Bogotá D.C (Colombia)
                </div>
                <div class="col-xs-6 col-md-6" id="footerizq">
                    <span><img src="img/logofooterface.png"></span>
                    <span><img src="img/logofootergo.png"></span>
                    <span><img src="img/logofooterhtml5.png"></span>
                </div>
            </div>
        </div>

    </body>
</html>
