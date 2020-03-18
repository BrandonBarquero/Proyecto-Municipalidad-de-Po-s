<%@page import="Services.UsuarioService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Usuario"%>
<%@page import="Dao.UsuarioDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Listar Usuarios</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<%
       UsuarioService lo_daousuario=new UsuarioService();
       ArrayList<Usuario> lo_ListaUsuarios = lo_daousuario.listaUsuariosInactivos();
%>

     <%
              String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
    <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo PÃ¡gina-->

               <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Listar Usuarios Inactivos</small></h1>
            </div>
        </div>
    
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/users.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección donde se muestran los usuarios inactivos
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                   <li><a href="InsertarUsuarios.jsp">Nuevo Usuario</a></li>
                   <li><a href="ListarUsuarios.jsp">Lista de Usuarios</a></li>
                        <li class="active">Lista de Usuarios Inactivos</li>
                    </ol>
                </div>
            </div>
        </div>

        <div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista de Usuarios Inactivos</h3>

                                <br>

 <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>
                                <div class="table-responsive">
                                    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Cédula</th>
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Email</th>
                                                <th class="text-center">Teléfono</th>
                                                <th class="text-center">Rol</th>

                                                <th class="text-center">Modificar Usuario</th>
                                           

                                            </tr>
                                        </thead>
                                        <tbody>
               <%    for(int ln_x=0;ln_x<lo_ListaUsuarios.size();ln_x++){   %>
                 <tr>
                     <td><%=lo_ListaUsuarios.get(ln_x).getCedula()%> </td>
                     <td><%=lo_ListaUsuarios.get(ln_x).getNombre()%> </td>
                     <td><%=lo_ListaUsuarios.get(ln_x).getCorreo()%> </td>
                     <td><%=lo_ListaUsuarios.get(ln_x).getTelefono()%> </td>
   
                     <% 
                         if(lo_ListaUsuarios.get(ln_x).getRol().equals("1")){%> <td>Administrador </td> <%}%>
                         
                          <% 
                         if(lo_ListaUsuarios.get(ln_x).getRol().equals("2")){%> <td>Bodeguero </td> <%}%>

                     <td><a href="ModificarUsuario.jsp?Cedula=<%=lo_ListaUsuarios.get(ln_x).getCedula()%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>              
                     </tr>
                     <% } %>
                     
                            <!--TR EXTRA-->                                  
     
                    
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>



           <!--Fin Cuerpo PÃ¡gina-->


         <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>