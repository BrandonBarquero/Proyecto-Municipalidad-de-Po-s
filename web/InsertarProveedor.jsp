<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar Proveedor</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
       <jsp:include page="Header.jsp"/>
     <%
              String Usuario2=(String) session.getAttribute("user");
          
          if(Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>

         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Insertar Proveedor</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/supply.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para insertar nuevos proveedores
                </div>
            </div>
        </div>

                <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nuevo proveedor</li>
                      <li><a href="ListarProveedores.jsp">Listado de proveedores</a></li>
                    </ol>
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar un nuevo proveedor</div>
                <form name="ingreso" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div class="group-material">
                                <input type="text" class="material-control tooltips-general input-check-user" placeholder="C�dula jur�dica" required="" maxlength="10" pattern="[0-9]{9,10}" data-toggle="tooltip" data-placement="top" title="Escriba la c�dula jur�dica del proveedor">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>C�dula Jur�dica</label>
                           </div>

                               <div class="group-material">
                                <input type="text" class="material-control tooltips-general" placeholder="Nombre completo" required="" maxlength="70" pattern="[a-zA-Z������������\s ]{1,70}" data-toggle="tooltip" data-placement="top" title="Escribe el nombre del proveedor">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre completo</label>
                            </div>
                                 <div class="group-material">
                                <input type="email" class="material-control tooltips-general" required="" placeholder="E-mail"  maxlength="50" pattern="[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" data-toggle="tooltip" data-placement="top" title="Escriba el correo electr�nico">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Email</label>
                            </div>

                                      <div class="group-material">
                                <input type="text" class="material-control tooltips-general" required="" placeholder="Tel�fono"  maxlength="12" pattern="[0-9]{6,12}" data-toggle="tooltip" data-placement="top" title="Escriba el tel�fono">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Tel�fono</label>
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