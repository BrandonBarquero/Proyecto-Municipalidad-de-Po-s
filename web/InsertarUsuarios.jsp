<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar usuario</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo Página-->

               <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Insertar Usuarios</small></h1>
            </div>
        </div>
    
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/users.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para registrar nuevos usuarios al sistema, debes de llena todos los campos del siguiente formulario para registrar un usuario correctamente
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nuevo usuario</li>
                      <li><a href="ListarUsuarios.jsp">Lista de usuarios</a></li>
                    </ol>
                </div>
            </div>
        </div>
        
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Registrar un nuevo usuario</div>
                <form name="ingreso" action="IngresoUsuario" method="post" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div class="group-material">
                                <input name="Cedula" type="text" class="material-control tooltips-general input-check-user" placeholder="C�dula" required="" maxlength="20" pattern="[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ]{1,20}" data-toggle="tooltip" data-placement="top" title="Escriba su c�dula sin espacios, que servira para iniciar sesión">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>C�dula</label>
                           </div>
                                 <div class="group-material">
                                     <input name="correo" type="email" class="material-control tooltips-general" required="" placeholder="E-mail"  maxlength="50" data-toggle="tooltip" data-placement="top" title="Escriba el email">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Email</label>
                            </div>

                                      <div class="group-material">
                                          <input name="Telefono" type="text" class="material-control tooltips-general" required="" placeholder="Tel�fono"  maxlength="50" data-toggle="tooltip" data-placement="top" title="Escriba el teléfono">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Tel�fono</label>
                            </div>

                                   <div class="group-material">
                                <span>Rol</span>
                                <select name="Rol" class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" title="Elige el rol">
                                    <option value="" disabled="" selected="">Seleccione un rol</option>
                                    <option value="1">Administrador</option>
                                    <option value="2">Bodeguero</option>
                                </select>
                            </div>

                            <div class="group-material">
                                <input name="Nombre" type="text" class="material-control tooltips-general" placeholder="Nombre completo" required="" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,70}" data-toggle="tooltip" data-placement="top" title="Escribe el nombre">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre completo</label>
                            </div>
                    
                      
                            <div class="group-material">
                                <input name="Contrasena" type="password" class="material-control tooltips-general" placeholder="Contrase�a" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Escribe una contrase�a">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Contrase�a</label>
                            </div>            
           
                           <div class="group-material">
                                <input type="password" class="material-control tooltips-general" placeholder="Repite la contrase�a" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Repite la contrase�a">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Repetir contrase�a</label>
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


         <jsp:include page="Footer.jsp"/>a-->
    </div>
</body>
</html>