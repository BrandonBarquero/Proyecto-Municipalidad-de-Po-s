<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar bodega</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	   <jsp:include page="Header.jsp"/>
           
           <%
              String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>

         <!--Inicio Cuerpo PÃ¡gina-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Insertar Bodega</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/warehouse.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para insertar una nueva bodega
                </div>
            </div>
        </div>

                <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                   <li><a href="ListarBodegas.jsp">Lista Bodegas</a></li>
                        <li class="active">Insertar Bodegas</li>
                    </ol>
                </div>
            </div>
        </div>


        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar una nueva bodega</div>
                <form name="ingreso" action="IngresoBodega" method="post" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               

                               <div class="group-material">
                                <input name="nombre" type="text" class="material-control tooltips-general" placeholder="Nombre de la bodega" required="" maxlength="70" pattern="[a-zA-ZñÑáéíóúÁÉÍÓÚ\s 0-9]{1,70}" data-toggle="tooltip" data-placement="top" title="Escriba el nombre de la bodega">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la bodega</label>
                            </div>

                            <p class="text-center">
                                <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                                <button type="submit" data-placement="bottom" class="btn btn-primary insertar"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar</button>
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