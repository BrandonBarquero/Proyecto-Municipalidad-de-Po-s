<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar departamento</title>
    <meta charset="UTF-8">
</head>
<body>
      <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Insertar Departamento</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/department.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para insertar un nuevo departamento
                </div>
            </div>
        </div>

                <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                   <li><a href="ListarDepartamentosBodeguero.jsp">Lista Departamentos</a></li>
                        <li class="active">Insertar Departamentos</li>
                    </ol>
                </div>
            </div>
        </div>


        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar un nuevo departamento</div>
                <form name="ingreso" action="IngresoDepartamentoBodeguero" method="post" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                              

                               <div class="group-material">
                                <input name="nombre" type="text" class="material-control tooltips-general" placeholder="Nombre del departamento" required="" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,70}" data-toggle="tooltip" data-placement="top" title="Escriba el nombre del departamento">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre del Departamento</label>
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



      
           <!--Fin Cuerpo Página-->


         <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>