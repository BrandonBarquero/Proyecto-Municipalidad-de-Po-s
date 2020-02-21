<%@page import="Entidades.Producto"%>
<%@page import="Dao.ProductoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.Tipo_ProductoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
          <jsp:include page="Header.jsp"/>

     <%
              String Usuario2=(String) session.getAttribute("user");
          
          if(Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
         <!--Inicio Cuerpo PÃ¡gina-->
    
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Producto</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/upgrade.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para modificar el producto
                </div>
            </div>
        </div> 
         <%
          String ln_id=request.getParameter("Codigo_Producto");
         ProductoDAO asd = new ProductoDAO();
        ArrayList<Producto> a2=  asd.listaUsuariosFiltrado(ln_id);
          
          %>
        <div class="container-fluid">
            <form name="modificarr" action="ModificarProducto"  autocomplete="off">
                
                
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Modificar Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <legend><strong>Modificar Producto</strong></legend><br>
  
                            <div>
                                <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Código </label>   
                                <input id="Codigo" name="Codigo" value="<%=a2.get(0).getCodigo_Producto()%>" type="text" class="tooltips-general material-control" required="" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                            <div>
                                <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Codigo Presupuestario</label>
                                <input id="Codigo_P" name="Codigo_P" value="<%=a2.get(0).getCodigo_Presupuestario()%>" type="text" class="tooltips-general material-control" required="" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                            </div>
                                
                                <br><br>

                            <div class="group-material">
                                <input id="Nombre" name="Nombre" value="<%=a2.get(0).getNombre()%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre</label>
                            </div>

                            <div class="group-material">
                                <input id="Unidad" name="Unidad" value="<%=a2.get(0).getUnidad()%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Unidad</label>
                            </div>

                            <div class="group-material">
                                <input name="Descripcion" id="Descripcion" value="<%=a2.get(0).getDescripcion()%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Descripción</label>
                            </div>

                            <div class="group-material">
                                <input id="Precio" name="Precio" value="<%=a2.get(0).getPrecio()%>" type="number" min="1" pattern="[0-9]{1,20}" maxlength="20" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Precio</label>
                            </div>


                            <div class="group-material">
                                <input id="Marca" name="Marca" value="<%=a2.get(0).getMarca()%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="" >
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Marca</label>
                            </div>


                            <div class="group-material">
                                <input id="Fecha" name="Fecha" value="<%=a2.get(0).getGarantia()%>" type="date" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Fecha vencimiento de garantía</label>
                            </div>

                           <div class="group-material">
                               <input id="Entrada" name="Entrada" value="<%=a2.get(0).getFecha_Entrada()%>" type="date" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Fecha de entrada</label>
                            </div>

                            <div class="group-material">
                                <input id="Ubicacion" name="Ubicacion" value="<%=a2.get(0).getUbicacion()%>" type="text" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Ubicación</label>
                            </div>


                            <div class="group-material">
                                <input id="tipo" name="Tipo" value="<%=a2.get(0).getTipo_Producto()%>" type="text" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Tipo Producto</label>
                            </div>
                                 <div class="group-material">
                                <input id="tipo" name="Proveedor" value="<%=a2.get(0).getProveedor()%>" type="text" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Proveedor</label>
                            </div>
<!--Falta agregar select de tipo producto y bodega -->
                        
                            <p class="text-center">
                              <button type="submit" data-placement="bottom" class="btn btn-primary modificar"><i class="zmdi zmdi-refresh"></i> &nbsp;&nbsp; Modificar</button>
                            </p> 
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
