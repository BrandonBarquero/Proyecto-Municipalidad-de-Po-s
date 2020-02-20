<%-- 
    Document   : Bitacora2
    Created on : 20-feb-2020, 14:50:35
    Author     : barqu
--%>

<%@page import="Entidades.Salida_Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.Salida_ProductoDAO"%>
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
        
           Salida_ProductoDAO asd = new Salida_ProductoDAO();
         ArrayList<Salida_Producto> asd2=  asd.listaSalida_Productos();
 
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
                      <li class="active">Salidas</li>
                           <li><a href="Bitacora3.jsp">Devoluciones</a></li>
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
                                                <th class="text-center">Departamento</th>
                                                <th class="text-center">Responsable</th>
                                                <th class="text-center">Fecha de Salida</th>
                                                <th class="text-center">Código de producto</th>
                                                <th class="text-center">Cantidad de salida</th>
                                              


                                            </tr>
                                        </thead>
                                        <tbody>
                                             <%   for(int x=0;x<asd2.size();x++){   %>
                                            <tr>
                                                <td><%=asd2.get(x).getDepartamento()%></td>
                                                <td><%=asd2.get(x).getResponsable()%></td>
                                                <td><%=asd2.get(x).getFecha_Salida()%></td>
                                                <td><%=asd2.get(x).getCodigo_Producto()%></td>
                                                <td><%=asd2.get(x).getCantidad_Salida()%></td>
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
