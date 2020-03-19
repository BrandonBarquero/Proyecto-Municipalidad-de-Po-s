<%-- 
    Document   : Bitacora2
    Created on : 20-feb-2020, 14:50:35
    Author     : barqu
--%>

<%@page import="Entidades.Bitacora_Producto"%>
<%@page import="Dao.Bitacora_ProductoDAO"%>
<%@page import="Entidades.Bitacora"%>
<%@page import="Dao.BitacoraDAO"%>
<%@page import="Services.DevolucionesService"%>
<%@page import="Entidades.Devoluciones"%>
<%@page import="Dao.DevolucionesDAO"%>
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
           Bitacora_ProductoDAO lo_devolucionesService = new Bitacora_ProductoDAO();
         ArrayList<Bitacora_Producto> la_var = lo_devolucionesService.listaBitacora();
 
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
                      <li><a href="Bitacora.jsp">Entradas</a></li>
                      <li><a href="Bitacora2.jsp">Salidas</a></li>
                      <li><a href="Bitacora3.jsp">Devoluciones</a></li>
                      <li><a href="Bitacora4.jsp">Acceso al sistema</a></li>
                      <li class="active">Productos Desechos</a></li>
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
                                    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Fecha de Accion</th>
                                                <th class="text-center">Tipo de Accion</th>
                                                <th class="text-center">Responsable</th>
                                                <th class="text-center">Codigo del producto</th>
                                                
                                              


                                            </tr>
                                        </thead>
                                        <tbody>
                                             <%   for(int x=0;x<la_var.size();x++){   %>
                                            <tr>
                                                <td><%=la_var.get(x).getFecha_Accion()%></td>
                                                <td><%=la_var.get(x).getTipo_Accion()%></td>
                                                <td><%=la_var.get(x).getResposable()%></td>
                                                <td><%=la_var.get(x).getCodigo_Producto()%></td>
       
                                            </tr>
 <!--TR EXTRA-->                                  
                                         
<% } %>


                                    </table>
                                </div>
           <!--Fin Cuerpo PÃ¡gina-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>