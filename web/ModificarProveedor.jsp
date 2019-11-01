<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Proveedor</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
         <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo PÃ¡gina-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Proveedor</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/supply.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para modificar el proveedor
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar proveedor</div>
                <form name="modificarr" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div>
                                   <label style="  top:-20px;font-size:17px;font-weight: 700; color:#333;font-weight: normal; ">Cédula Jurídica</label>
                                <input type="text" class="material-control tooltips-general input-check-user" readonly>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                           </div>
                           <br> <br>

                               <div class="group-material">
                                <input type="text" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre completo</label>
                            </div>
                                 <div class="group-material">
                                <input type="email" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Email</label>
                            </div>

                                      <div class="group-material">
                                <input type="text" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Teléfono</label>
                            </div>

                            <p class="text-center">
                                <button type="submit" data-placement="bottom" class="btn btn-primary modificar"><i class="zmdi zmdi-refresh"></i> &nbsp;&nbsp; Modificar</button>
                            </p> 
                       </div>
                   </div>
                </form>
            </div>
        </div>



      
           <!--Fin Cuerpo PÃ¡gina-->


          <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>