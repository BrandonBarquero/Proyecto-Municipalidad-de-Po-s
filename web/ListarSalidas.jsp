<%@page import="Entidades.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Services.ProductoService"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Salida</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
       

     <%
              String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
           
         <%
            ProductoService lo_productoService = new ProductoService();
            ArrayList<Producto> lo_producto = lo_productoService.listaProductosSalida();
         %>

     <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo Página-->

            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Salida de Productos</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation"><a href="InsertarProductos.jsp">Insertar Productos</a></li>
              <li role="presentation" ><a href="ListarProductos.jsp">Listar Productos</a></li>
              <li role="presentation" ><a href="DesecharProducto.jsp">Listar Desechos</a></li>
              <li role="presentation" class="active"><a href="ListarSalidas.jsp">Listar Salidas</a></li>
              <li role="presentation"><a href="ListarTipoProducto.jsp">Tipos de Productos</a></li>
            </ul>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/output.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para mostrar los productos que han sido retirados 
                </div>
            </div>
        </div>


<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Productos Retirados</h3>
                                <br>

 <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>
                                <div class="table-responsive">
                                    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">C�digo del Producto</th>
                                                <th class="text-center">Descripci�n</th>
                                                <th class="text-center">Ver Detalles</th>
                                                <th class="text-center">Devoluci�n</th>


                                            </tr>
                                        </thead>
                                        <tbody>
                                       <tr><% for(int ln_x=0;ln_x<lo_producto.size();ln_x++){ %>
                                                
                             <td><%=lo_producto.get(ln_x).getNombre()%></td>                       
                         <td><%=lo_producto.get(ln_x).getCodigoProducto()%></td>
                            <td><%=lo_producto.get(ln_x).getDescripcion()%></td>
                  
                
                          
                                                <td><a href="DetalleProducto.jsp?Codigo_Producto=<%=lo_producto.get(ln_x).getCodigoProducto()%>"><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Detalles del producto"><i class="zmdi zmdi-file-text"></i></button></td>
                                                <td><a href="Devolucion.jsp?Cantidad=<%=lo_producto.get(ln_x).getCantidad()%>&Codigo_Producto=<%=lo_producto.get(ln_x).getCodigoProducto()%>"> <button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title=""><i class="zmdi zmdi-time-restore"></i></button></td>
                                            </tr>
       
                                            <% }%>
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