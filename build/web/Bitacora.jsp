<%@page import="Services.ProductoService"%>
<%@page import="Entidades.EntradaProductos"%>
<%@page import="Dao.ProductoDAO"%>
<%@page import="Entidades.SalidaProducto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.SalidaProductoDAO"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Bitacora</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
</head>
<body>
  <jsp:include page="Header.jsp"/>
  
  <%
           String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           ProductoService lo_productoService = new ProductoService();
         ArrayList<EntradaProductos> lo_var = lo_productoService.listarEntradaProductos();
 
        %>


         <!--Inicio Cuerpo PÃ¡gina-->
     <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM <small>Bitácora</small></h1>
            </div>
        </div>

                    <div class="container-fluid"  style="margin: 50px 0;">
                        <div class="row">
                            <div class="col-xs-12 col-sm-4 col-md-3">
                                <img src="assets/img/calendar.png" alt="users-sesion" class="img-responsive center-box" style="max-width: 120px;">
                            </div>
                            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                                Bienvenido al Área de bitacora, aquí se muestran los registros de los movimientos de productos de la Municipalidad de Poás
                            </div>
                        </div>
                    </div>
         
             <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Entradas</li>
                      <li><a href="Bitacora2.jsp">Salidas</a></li>
                      <li><a href="Bitacora3.jsp">Devoluciones</a></li>
                      <li><a href="Bitacora4.jsp">Acceso al sistema</a></li>
                      <li><a href="Bitacora5.jsp">Productos Desechos</a></li>
                      <li><a href="Bitacora6.jsp">Eliminaciones</a></li>
                    </ol>
                </div>
            </div>
        </div>
         
                   <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>
         
         <br>


                   

       <div class="table-responsive">
                                    <table id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Código presupuestario</th>
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Cantidad</th>
                                                <th class="text-center">Fecha de entrada</th>
                                                <th class="text-center">Responsable</th>
                                              


                                            </tr>
                                        </thead>
                                        <tbody>
                                             <%   for(int x=0;x<lo_var.size();x++){   %>
                                            <tr>
                                                <td><%=lo_var.get(x).getCodigoProducto()%></td>
                                                <td><%=lo_var.get(x).getNombre()%></td>
                                                  <td><%=lo_var.get(x).getCantidad()%></td>
                                                <td><%=lo_var.get(x).getFechaEntrada()%></td>
                                                <td><%=lo_var.get(x).getResponsable()%></td>
                                            
                                            </tr>
 <!--TR EXTRA-->                                  
                                            <tr style="align-items: center" class='noSearch hide'>
                                                <td colspan="7"></td>  
                                            </tr>
<% } %>


                                    </table>
                                </div>

           <!--Fin Cuerpo PÃ¡gina-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>