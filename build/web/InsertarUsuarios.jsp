<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar usuario</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->

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
                    Bienvenido a la sección para registrar nuevos usuarios al sistema, debes de llena todos los campos del siguiente formulario para registrar un usuario correctamente.
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
                <form name="ingreso" action="IngresoUsuario" method="post" autocomplete="off" onsubmit="return validarContrasena('Contrasena','password')">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           <div class="group-material">
                               <input id="Cedula" name="Cedula" type="text" class="material-control tooltips-general input-check-user" placeholder="Cédula" required="" maxlength="10" pattern="[0-9]{9,10}" data-toggle="tooltip" data-placement="top" title="Cédula sin guiones ni espacios (9 o 10 dígitos">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Cédula</label>
                           </div>
                           <div class="group-material">
                               <input id="correo" name="correo" type="email" class="material-control tooltips-general" required="" placeholder="E-mail"  maxlength="50" pattern="[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" data-toggle="tooltip" data-placement="top" title="Escriba el email">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Email</label>
                           </div>

                           <div class="group-material">
                               <input id="Telefono" name="Telefono" type="text" class="material-control tooltips-general" required="" placeholder="Teléfono"  maxlength="12" pattern="[0-9]{6,12}" data-toggle="tooltip" data-placement="top" title="Solo se permiten números">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Teléfono</label>
                           </div>

                           <div class="group-material">
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;">Rol</label>
                               <select id="Rol" name="Rol" class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" required="" title="Elige el rol">
                                   <option value="" disabled="" selected="">Seleccione un rol</option>
                                   <option value="1">Administrador</option>
                                   <option value="2">Bodeguero</option>
                               </select>
                           </div>
                           
                           <div class="group-material">
                               <input id="Estado" name="Estado" type="hidden" value="Activo" class="material-control tooltips-general" placeholder="Estado del usuario" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Estado del usuario">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Estado del usuario</label>
                           </div>
                           
                           <div class="group-material">
                               <input id="Nombre" name="Nombre" type="text" class="material-control tooltips-general" placeholder="Nombre completo" required="" maxlength="70" pattern="[a-zA-ZñÑáéíóúÁÉÍÓÚ\s]{1,70}" data-toggle="tooltip" data-placement="top" title="Escribe el nombre">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Nombre completo</label>
                           </div>
                    
                      
                           <div class="group-material">
                               <input id="Contrasena" name="Contrasena" type="password" class="material-control tooltips-general" placeholder="Contraseña" required="" maxlength="200" pattern="[A-Z][A-Za-z0-9.-_,´+}{;:*%]{8,200}" data-toggle="tooltip" data-placement="top" title="Primer letra mayúscula y 9 carácteres mínimo">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Contraseña</label>
                           </div>            
           
                          <div class="group-material">
                               <input id="password" type="password" class="material-control tooltips-general" placeholder="Repite la contraseña" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Repitir la contraseña">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Repetir contraseña</label>
                          </div>
                            <p class="text-center">
                                <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                              <button type="submit" onclick="confirmar();" data-placement="bottom" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar</button>
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

<script type="text/javascript">
    
    function confirmar(e) {
        if (!confirm('¿Desea agregar este usuario?')) e.preventDefault();
    };
    for (var i = 0, l = elems.length; i < l; i++) {
        elems[i].addEventListener('click', confirmIt, false);
    }
    
    function validarContrasena(primero, segunda){
    var primera = document.getElementById('Contrasena').value;
    var segunda = document.getElementById('password').value;
 
    if(primera !== segunda){
        alert("La contraseñas no coinciden, vuelva a introducir la contraseña.");
        return false;
    }
    else{
        return true;
    }
    }
</script>