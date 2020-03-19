<%@page import="Services.TipoProductoService"%>
<%@page import="Entidades.TipoProducto"%>
<%@page import="Dao.TipoProductoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Producto"%>
<%@page import="Entidades.Producto"%>
<%@page import="Dao.ProductoDAO"%>
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
             TipoProductoService lo_tipoProductoService = new TipoProductoService();
             ArrayList<TipoProducto> lo_tipoProducto = lo_tipoProductoService.listaTipoProductos();
          
          %>
 
               <%
              String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
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
                                    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
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
                                                <% for(int ln_x=0;ln_x<lo_tipoProducto.size();ln_x++){ %>
                                                <td><%=lo_tipoProducto.get(ln_x).getNombreTipoProducto()%></td>
                                                <td><%=lo_tipoProducto.get(ln_x).getIdTipoProducto()%></td>
                              

                                                
                                                <td> <a href="ModificarTipoProducto.jsp?Id_Tipo_Producto=<%=lo_tipoProducto.get(ln_x).getIdTipoProducto()%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                <td> <a href="EliminarTipoProducto?Id_Tipo_Producto=<%=lo_tipoProducto.get(ln_x).getIdTipoProducto()%>&Nombre=<%=lo_tipoProducto.get(ln_x).getNombreTipoProducto()%>"><button data-href="EliminarTipoProducto?Id_Tipo_Producto=<%=lo_tipoProducto.get(ln_x).getIdTipoProducto()%>&Nombre=<%=lo_tipoProducto.get(ln_x).getNombreTipoProducto()%>"  data-placement="bottom"    class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td>  
                                            </tr>
                                                       <!--TR EXTRA-->                                  
             
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