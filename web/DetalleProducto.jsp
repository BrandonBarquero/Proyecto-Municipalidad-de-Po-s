<%@page import="Services.ProductoService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Producto"%>
<%@page import="Dao.ProductoDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Detalle de Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
             <%
         String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
         String la_id=request.getParameter("Codigo_Producto");
         ProductoService lo_productoService = new ProductoService();
         ArrayList<Producto> la_var = lo_productoService.listaUsuariosFiltrado(la_id);

        %>
            <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo PÃ¡gina-->
    
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Detalle Producto</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/clipboard.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para ver el detalle del producto
                </div>
            </div>
        </div>
          
        <div class="container-fluid">
            <form autocomplete="off">
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Detalle Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <legend><strong>Detalle Producto</strong></legend><br>
                            <% for(int x=0;x<la_var.size();x++){ %>

                                <div >
                                     <label style=" top:-20px; font-size:17px;font-weight:700; color: black;  font-weight: normal;">Código Presupuestario</label>
                                    <input value="<%=la_var.get(x).getCodigoPresupuestario()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                            </div>

                              <div >
                                  <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Nombre</label>
                                <input value="<%=la_var.get(x).getNombre()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>

                                <div>
                                  <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Unidad</label>
                                <input value="<%=la_var.get(x).getUnidad()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                
                                <div>

                                 <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Descripción</label>
                                <input value="<%=la_var.get(x).getDescripcion()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>

                                <div>
                               <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Precio</label>
                                <input value="<%=la_var.get(x).getPrecio()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>
                                
                                <div>

                              <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Cantidad</label>
                                <input value="<%=la_var.get(x).getCantidad()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                
                                <div>

                            <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Marca</label>
                                <input value="<%=la_var.get(x).getMarca()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                            </div>
                                
                                <div>

                           <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Proveedor</label>
                                <input value="<%=la_var.get(x).getProveedor()%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>


                            <div>
                                  <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Fecha vencimiento de garantía</label>
                                <input value="<%=la_var.get(x).getFechaEntrada()%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>

                                <div>
                                   <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Fecha de entrada</label> 
                                <input value="<%=la_var.get(x).getFechaEntrada()%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                    <div>
                                          <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Ubicación</label>
                                <input value="<%=la_var.get(x).getUbicacion()%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>

                                       <div>
                                         <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Tipo de producto</label>  
                                <input  value="<%=la_var.get(x).getTipoProducto()%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                <br><br>

                <p class="text-center">
                  <a href="ListarProductos.jsp" class="btn btn-primary btn-lg active" role="button">Regresar</a>
                    </p> 
<% }%>
                              
                       </div>
                   </div>
                </div>
            </form>
        </div>







           <!--Fin Cuerpo PÃ¡gina-->


             <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>