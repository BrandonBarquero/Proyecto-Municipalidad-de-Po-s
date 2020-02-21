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

             <%
              String Usuario2=(String) session.getAttribute("user");
          
          if(Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
         <!--Inicio Cuerpo Página-->

             <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Usuario</small></h1>
            </div>
        </div>
     <%
     UsuarioDAO usuariodao=new UsuarioDAO();
      String Cedula=request.getParameter("Cedula");
     ArrayList<Usuario> ListaUsuarios=  usuariodao.listaUsuariosFiltrado(Cedula);
     
     %>
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/users.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para modificar los datos del usuario
                </div>
            </div>
        </div>
        
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar usuario</div>
 
                <form name="ModificarUsuario" action="ModificarUsuario" method="post" autocomplete="off" onsubmit="return validarContrasena('Contrasena','password')">
                    <div class="row">
           
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           <div>
                               <label style="  top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal; ">C�dula</label>
                               <input name="Cedula" value="<%=ListaUsuarios.get(0).getCedula()%>" type="text" class="material-control tooltips-general input-check-user" required="" readonly="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                           </div>
                               <br><br>
                                <div class="group-material">
                               <input name="Nombre" value="<%=ListaUsuarios.get(0).getNombre()%>" type="text" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,70}" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Nombre completo</label>
                           </div>
                           <div  class="group-material">
                               <input name="Correo" value="<%=ListaUsuarios.get(0).getCorreo()%>"  type="email" maxlength="50" pattern="[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Email</label>
                           </div>
                               
                           <div class="group-material">
                               <input name="Telefono" value="<%=ListaUsuarios.get(0).getTelefono()%>" type="text" maxlength="12" pattern="[0-9]{6,12}" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Tel�fono</label>
                           </div>
                                
                           <div class="group-material">
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;">Rol</label>
                               <select id="Rol" name="Rol"  class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" required="" title="Elige el rol">
                                   <option value="" disabled="" selected="">Seleccione un rol</option>
                                   <option value="1">Administrador</option>
                                   <option value="2">Bodeguero</option>
                               </select>
                           </div>
                                   
                                    <div class="group-material">
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;">Estado</label>
                               <select id="Estado" name="Estado"  class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" required="" title="Elige el rol">
                                   <option value="" disabled="" selected="">Seleccione un rol</option>
                                   <option value="Activo">Activo</option>
                                   <option value="Inactivo">Inactivo</option>
                               </select>
                           </div>
                       

                            <p class="text-center">
                                <button class="btn btn-success" type="submit" d><i ></i>Modificar</button>
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
