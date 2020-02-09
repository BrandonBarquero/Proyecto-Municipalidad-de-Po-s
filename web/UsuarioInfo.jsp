<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Usuario"%>
<%@page import="Dao.UsuarioDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Usuario</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo PÃ¡gina-->

             <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Información del Usuario</small></h1>
            </div>
        </div>
  
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/users.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección donde se muestra la información del usuario y cambio de contraseña
                </div>
            </div>
        </div>
        
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Usuario</div>
 
               <form name="" action="" method="post" autocomplete="off" onsubmit="return validarContrasena('Contrasena','password')">
                    <div class="row">
           
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           
                              <h1 class="all-tittles"><small>Información de usuario</small></h1>
                                      <br>
                           <div>
                               <label style="  top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal; ">Cédula</label>
                               <input name="Cedula" value="" type="text" class="material-control tooltips-general input-check-user" required="" readonly="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                           </div>
                               <br><br>
                                   <div>
                               <label style="  top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal; ">Nombre</label>
                               <input name="Nombre" value="" type="text" class="material-control tooltips-general input-check-user" required="" readonly="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                           </div>
                               <br><br>
                               <div>
                               <label style="  top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal; ">Correo Electrónico</label>
                               <input name="correo" value="" type="text" class="material-control tooltips-general input-check-user" required="" readonly="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                           </div>
                               <br><br>
                               
                                <div>
                               <label style="  top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal; ">Teléfono</label>
                               <input name="Telefono" value="" type="text" class="material-control tooltips-general input-check-user" required="" readonly="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                           </div>
                               
                               <br><br>         
                                      <h1 class="all-tittles"><small>Cambio de contraseña</small></h1>
                                      <br>
                                  <div class="group-material">
                          
                            <input id="Contrasena" name="Contrasena"  type="password" class="material-control tooltips-general" placeholder="Contraseña" maxlength="200" data-toggle="tooltip" data-placement="top" title="Escribe una contraseña" required="">
                            <span class="highlight"></span>
                            <span class="bar"></span>
                              <label>Contraseña</label>   

                        </div>
                         
                                 <div class="group-material">
                            
                            <input id="password" name="a" type="password" class="material-control tooltips-general" placeholder="Repite la contraseña" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Repite la contraseña">
                            <span class="highlight"></span>
                            <span class="bar"></span>
                             <label>Confirme Contraseña</label>   
                        </div>
                               <br>

                            <p class="text-center">
                                <button type="submit" data-placement="bottom" class="btn btn-primary modificar"><i class="zmdi zmdi-refresh"></i> &nbsp;&nbsp; Cambiar Contraseña</button>
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