<%@page import="Entidades.Entrada_Productos"%>
<%@page import="Dao.ProductoDAO"%>
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
        
           ProductoDAO asd = new ProductoDAO();
         ArrayList<Entrada_Productos> asd2=  asd.listarEntradaProductos();
 
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
                                                <th class="text-center">Código de producto</th>
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Cantidad</th>
                                                <th class="text-center">Fecha de entrada</th>
                                                <th class="text-center">Responsable</th>
                                              


                                            </tr>
                                        </thead>
                                        <tbody>
                                             <%   for(int x=0;x<asd2.size();x++){   %>
                                            <tr>
                                                <td><%=asd2.get(x).getCodigo_Producto()%></td>
                                                <td><%=asd2.get(x).getNombre()%></td>
                                                  <td><%=asd2.get(x).getCantidad()%></td>
                                                <td><%=asd2.get(x).getFecha_Entrada()%></td>
                                                <td><%=asd2.get(x).getResponsable()%></td>
                                            
                                            </tr>
 <!--TR EXTRA-->                                  
                                            <tr style="align-items: center" class='noSearch hide'>
                                                <td colspan="7"></td>  
                                            </tr>
<% } %>


                                    </table>


 <div class="container-fluid">
                        <section id="cd-timeline" class="cd-container">
                            <div class="cd-timeline-block">
                                <div class="cd-timeline-img">
                                    <img src="assets/img/user.png" alt="user-picture">
                                </div>
                                <div class="cd-timeline-content">
                                    <h4 class="text-center"><i class="zmdi zmdi-assignment-account"></i> Miguel Eduardo Murillo (Proveeduría)</h4>
                                    <p class="text-center">
                                        <i class="zmdi zmdi-file-text"></i> Movimiento: <em>Ingreso de producto (A205)</em>
                                    </p>
                                    <span class="cd-date"><i class="zmdi zmdi-calendar-note zmdi-hc-fw"></i> 10/07/2019</span>
                                </div>
                            </div>

                            <div class="cd-timeline-block">
                                <div class="cd-timeline-img">
                                    <img src="assets/img/user.png" alt="user-picture">
                                </div>
                                <div class="cd-timeline-content">
                     <h4 class="text-center"><i class="zmdi zmdi-assignment-account"></i> Carlos Murillo (Bodeguero)</h4>
                                    <p class="text-center">
             <i class="zmdi zmdi-file-text"></i> Movimiento: <em>Salida de producto (A205)</em>
                                    </p>
                                    <span class="cd-date"><i class="zmdi zmdi-calendar-note zmdi-hc-fw"></i> 12/07/2019</span>
                                </div>
                            </div>

                        </section>
                    </div>
                                </div>





           <!--Fin Cuerpo PÃ¡gina-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>