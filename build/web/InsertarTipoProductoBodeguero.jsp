<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar Tipo de Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
       <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Insertar Tipo Producto</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/insert.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para insertar el tipo de producto
                </div>
            </div>
        </div>

                <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                   <li><a href="ListarTipoProductoBodeguero.jsp">Lista tipo de productos</a></li>
                        <li class="active">Insertar tipo de productos</li>
                    </ol>
                </div>
            </div>
        </div>


        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar un nuevo tipo de producto</div>
                <form name="ingreso" action="IngresoTipoProductoBodeguero" method="post" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">

                               <div class="group-material">
                                   <input name="nombre" type="text" class="material-control tooltips-general" placeholder="Tipo de Producto" required="" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ 0-9]{1,70}" data-toggle="tooltip" data-placement="top" title="Escribe el tipo de producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre tipo producto</label>
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
        </div>



      
           <!--Fin Cuerpo Página-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>