<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Lista Tipos de Productos</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
          <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         
         lu_ps=lu_con.prepareStatement("select * from Tipo_Producto");
         lu_rs=lu_ps.executeQuery();%>
 
           <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo Página-->
  
<div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Lista Tipo de Productos</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation"><a href="InsertarProductos.jsp">Insertar Productos</a></li>
              <li role="presentation" ><a href="ListarProductos.jsp">Listar Productos</a></li>
              <li role="presentation"><a href="DesecharProducto.jsp">Listar Desechos</a></li>
              <li role="presentation"><a href="ListarSalidas.jsp">Listar Salidas</a></li>
              <li role="presentation" class="active"><a href="ListarTipoProducto.jsp">Tipos de Productos</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/list.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para mostrar los tipos productos que se encuentran actualmente
                </div>
            </div>
        </div>

             <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Lista tipo de productos</li>
                      <li><a href="InsertarTipoProducto.jsp">Insertar tipo de productos</a></li>
                    </ol>
                </div>
            </div>
        </div>

<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista tipo productos  </h3>

                                <br>

  <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>


                                <div class="table-responsive">
                                    <table id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre tipo de producto</th>
                                                <th class="text-center">Identificador tipo de producto </th>
 
                                                <th class="text-center">Modificar</th>
                                                <th class="text-center">Eliminar</th>



                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <%    while(lu_rs.next()){   %>
                                                <td><%=lu_rs.getString("Nombre_Tipo_Producto")%></td>
                                                <td><%=lu_rs.getString("Id_Tipo_Producto")%></td>
                              

                                                
                                                <td> <a href="ModificarTipoProducto.jsp?Id_Tipo_Producto=<%=lu_rs.getString("Id_Tipo_Producto")%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                <td> <a href="EliminarTipoProducto?Id_Tipo_Producto=<%=lu_rs.getString("Id_Tipo_Producto")%>"><button data-href="EliminarTipoProducto?Id_Tipo_Producto=<%=lu_rs.getString("Id_Tipo_Producto")%>"  data-placement="bottom"    class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td>  
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



           <!--Fin Cuerpo Página-->


         <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>