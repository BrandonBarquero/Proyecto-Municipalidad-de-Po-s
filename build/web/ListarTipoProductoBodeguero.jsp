<%@page import="Entidades.TipoProducto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Services.TipoProductoService"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>

     <%
              String la_Usuario2=(String) session.getAttribute("user2");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
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
 
           <jsp:include page="HeaderBodeguero.jsp"/>

         <!--Inicio Cuerpo Página-->
  
<div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Lista Tipo de Productos</small></h1>
            </div>
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
                      <li><a href="InsertarTipoProductoBodeguero.jsp">Insertar tipo de productos</a></li>
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
                           



                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                                <% for(int ln_x=0;ln_x<lo_tipoProducto.size();ln_x++){ %>
                                                 <td><%=lo_tipoProducto.get(ln_x).getNombreTipoProducto()%></td>
                                                  <td><%=lo_tipoProducto.get(ln_x).getIdTipoProducto()%></td>
                              

                                                
                                                <td> <a href="ModificarTipoProductoBodeguero.jsp?Id_Tipo_Producto=<%=lo_tipoProducto.get(ln_x).getIdTipoProducto()%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                
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