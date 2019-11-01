<!DOCTYPE html>
<html lang="es">
<head>
    <title>Bitacora</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
</head>
<body>
  <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->
     <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM <small>Bitácora</small></h1>
            </div>
        </div>

                    <div class="container-fluid"  style="margin: 50px 0;">
                        <div class="row">
                            <div class="col-xs-12 col-sm-4 col-md-3">
                                <img src="assets/img/calendar.png" alt="users-sesion" class="img-responsive center-box" style="max-width: 120px;">
                            </div>
                            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                                Bienvenido al Área de bitacora, aquí se muestran los registros de los movimientos (Ingresar, Modificar, Retirar, Desechar, Devolución) de productos de la Municipalidad de Poás
                            </div>
                        </div>
                    </div>


                    <div class="container-fluid">
                        <section id="cd-timeline" class="cd-container">
                            <div class="cd-timeline-block">
                                <div class="cd-timeline-img">
                                    <img src="assets/img/user.png" alt="user-picture">
                                </div>
                                <div class="cd-timeline-content">
                                    <h4 class="text-center"><i class="zmdi zmdi-assignment-account"></i> Miguel Eduardo Murillo (Proveeduría)</h4>
                                    <p class="text-center">
                                        <i class="zmdi zmdi-file-text"></i> Movimiento: <em>Ingreso de producto (A205)</em>
                                    </p>
                                    <span class="cd-date"><i class="zmdi zmdi-calendar-note zmdi-hc-fw"></i> 10/07/2019</span>
                                </div>
                            </div>

                            <div class="cd-timeline-block">
                                <div class="cd-timeline-img">
                                    <img src="assets/img/user.png" alt="user-picture">
                                </div>
                                <div class="cd-timeline-content">
                     <h4 class="text-center"><i class="zmdi zmdi-assignment-account"></i> Carlos Murillo (Bodeguero)</h4>
                                    <p class="text-center">
             <i class="zmdi zmdi-file-text"></i> Movimiento: <em>Salida de producto (A205)</em>
                                    </p>
                                    <span class="cd-date"><i class="zmdi zmdi-calendar-note zmdi-hc-fw"></i> 12/07/2019</span>
                                </div>
                            </div>

                        </section>
                    </div>







           <!--Fin Cuerpo PÃ¡gina-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>