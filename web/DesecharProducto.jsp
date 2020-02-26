<%@page import="Services.ProductoService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Producto"%>
<%@page import="Dao.ProductoDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Desechar producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
     <%   String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
        
       ProductoService lo_productoService = new ProductoService();
        ArrayList<Producto> la_var = lo_productoService.listaProductosInactivos();

         
         %>
       <jsp:include page="Header.jsp"/>



  


         <!--Inicio Cuerpo PÃ¡gina-->

            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Desechar Productos</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation"><a href="InsertarProductos.jsp">Insertar Productos</a></li>
              <li role="presentation" ><a href="ListarProductos.jsp">Listar Productos</a></li>
              <li role="presentation" class="active"><a href="DesecharProducto.jsp">Listar Desechos</a></li>
              <li role="presentation"><a href="ListarSalidas.jsp">Listar Salidas</a></li>
              <li role="presentation"><a href="ListarTipoProducto.jsp">Tipos de Productos</a></li>
            </ul>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/delete.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección donde se encuentran los productos desechados
                </div>
            </div>
        </div>


<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Productos Desechados</h3>

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
                                                <th class="text-center">Descripción</th>
                                                <th class="text-center">Ver detalles</th>
                                                <th class="text-center">Activar Producto</th>
                                               


                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr> <% for(int x=0;x<la_var.size();x++){ %>
                                                
                        <td><%=la_var.get(x).getNombre()%> </td>                        
                     <td><%=la_var.get(x).getCodigoProducto()%> </td>
                      <td><%=la_var.get(x).getDescripcion()%> </td>
                  
                
                          
                   

                                                
                      <td><a href="DetalleProducto.jsp?Codigo_Producto=<%=la_var.get(x).getCodigoProducto()%>"><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Detalles del producto"><i class="zmdi zmdi-file-text"></i></button></td>
                      <td><a href="ActivarProducto?Codigo_Producto=<%=la_var.get(x).getCodigoProducto()%>"><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Activar producto"><i class="zmdi zmdi-refresh"></i></button></td>
   
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