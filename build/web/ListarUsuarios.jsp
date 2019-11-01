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
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         
         lu_ps=lu_con.prepareStatement("select * from Usuario where Estado='Activo'");
         lu_rs=lu_ps.executeQuery();%>

    <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo PÃ¡gina-->

               <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Listar Usuarios</small></h1>
            </div>
        </div>
    
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/users.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección donde se muestran los usuarios registrados hasta la fecha actual
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                   <li><a href="InsertarUsuarios.jsp">Nuevo usuario</a></li>
                        <li class="active">listado de usuarios</li>
                    </ol>
                </div>
            </div>
        </div>

        <div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista de Usuarios</h3>

                                <br>

 <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>
                                <div class="table-responsive">
                                    <table id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Cédula</th>
                                                <th class="text-center">Email</th>
                                                <th class="text-center">Teléfono</th>
                                                <th class="text-center">Rol</th>

                                                <th class="text-center">Modificar Usuario</th>
                                                <th class="text-center">Eliminar Usuario</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%    while(lu_rs.next()){   %>
                 <tr>
                     <td><%=lu_rs.getString("Cedula")%> </td>
                     <td><%=lu_rs.getString("Nombre")%> </td> 
                     <td><%=lu_rs.getString("Correo")%> </td> 
                     <td><%=lu_rs.getString("telefono")%> </td> 
                     
                     
                     <% 
                         if(lu_rs.getInt("Rol")==1){%> <td>Administrador </td> <%}%>
                         
                          <% 
                         if(lu_rs.getInt("Rol")==2){%> <td>Bodeguero </td> <%}%>
                         
                         
                         
                         
                        
                         
                     
                     
                    
                     
                 
                     <td><a href="ModificarUsuario.jsp?Cedula=<%=lu_rs.getString("Cedula")%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                    <td><a href="DesactivarUsuario?Cedula=<%=lu_rs.getString("Cedula")%>"><button data-href="DesactivarUsuario?Cedula=<%=lu_rs.getString("Cedula")%>" data-placement="bottom" class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td> 
                     </tr>
                     
                     
                            <!--TR EXTRA-->                                  
          <tr style="align-items: center" class='noSearch hide'>
      <td colspan="5"></td>  
                
              </tr> 
                 
                     <% } %>
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