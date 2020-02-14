<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Producto"%>
<%@page import="Dao.ProductoDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Lista Productos</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
     <%String lc_Usuario2=(String) session.getAttribute("user");
          
          if(lc_Usuario2 == null){
           request.getRequestDispatcher("Error").forward(request, response);
          
          }
     
        ProductoDAO asd = new ProductoDAO();
        ArrayList<Producto> a2=  asd.listaProductosActivos();
     
     
     
     %>
    <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->



            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Listar Productos</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation"><a href="InsertarProductos.jsp">Insertar Productos</a></li>
              <li role="presentation" class="active"><a href="ListarProductos.jsp">Listar Productos</a></li>
              <li role="presentation"><a href="DesecharProducto.jsp">Listar Desechos</a></li>
              <li role="presentation"><a href="ListarSalidas.jsp">Listar Salidas</a></li>
              <li role="presentation"><a href="ListarTipoProducto.jsp">Tipos de Productos</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/list2.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para mostrar los productos que se encuentran actualmente registrados.
                </div>
            </div>
        </div>

<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista de Productos</h3>

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
                                                <th class="text-center">Código del Producto</th>
                                                <th class="text-center">Cantidad</th>

                                                <th class="text-center">Ver Detalles</th>
                                                <th class="text-center">Modificar Producto</th>
                                                <th class="text-center">Desechar Producto</th>
                                                <th class="text-center">Retirar Producto</th>
                                                <th class="text-center">Devolución</th>


                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr><% for(int x=0;x<a2.size();x++){ %>
                                                <td><%=a2.get(x).getNombre()%></td>                        
                                                <td><%=a2.get(x).getCodigo_Producto()%></td>
                                                <td><%=a2.get(x).getCantidad()%></td>
                  

                                                <td> <a href="DetalleProducto.jsp?Codigo_Producto=<%=a2.get(x).getCodigo_Producto()%>" /><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Detalles del producto"><i class="zmdi zmdi-file-text"></i></button></td>
                                                <td> <a href="ModificarProductos.jsp?Codigo_Producto=<%=a2.get(x).getCodigo_Producto()%>" /> <button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                <td> <a href="DesecharProducto?Codigo_Producto=<%=a2.get(x).getCodigo_Producto()%>" /><button data-href="DesecharProducto?Codigo_Producto=<%=a2.get(x).getCodigo_Producto()%>" data-placement="bottom" class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td>  
                                                <td> <a href="RetirarProducto.jsp?Cantidad=<%=a2.get(x).getCantidad()%>&Codigo_Producto=<%=a2.get(x).getCodigo_Producto()%>" /> <button type="submit" class="btn btn-warning tooltips-general" data-toggle="tooltip" data-placement="top" title=""><i class="zmdi zmdi-swap"></i></button></td>
                                                <td> <a href="Devolucion.jsp?Cantidad=<%=a2.get(x).getCantidad()%>&Codigo_Producto=<%=a2.get(x).getCodigo_Producto()%>" /> <button type="submit" class="btn btn-primary tooltips-general" data-toggle="tooltip" data-placement="top" title=""><i class="zmdi zmdi-time-restore"></i></button></td>
                                            </tr>
                     
          <!--TR EXTRA-->                                  
                                            <tr style="align-items: center" class='noSearch hide'>
                                                <td colspan="5"></td>  
                                            </tr> 
                                            <% }%>
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


