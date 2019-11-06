<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Detalle Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
             <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         int ln_id=Integer.parseInt(request.getParameter("Codigo_Producto"));
         lu_ps=lu_con.prepareStatement("select * from producto where Codigo_Producto="+ln_id);
         lu_rs=lu_ps.executeQuery();
        %>
            <jsp:include page="HeaderBodeguero.jsp"/>

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
                            <%  while(lu_rs.next()){ %>

                                <div >
                                     <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Código Presupuestario</label>
                                    <input value="<%=lu_rs.getString("Codigo_Presupuestario")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                            </div>

                              <div >
                                  <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Nombre</label>
                                <input value="<%=lu_rs.getString("Nombre")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>

                                <div>
                                  <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Unidad</label>
                                <input value="<%=lu_rs.getString("Unidad")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                
                                <div>

                                 <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Descripción</label>
                                <input value="<%=lu_rs.getString("Descripcion")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>

                                <div>
                               <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Precio</label>
                                <input value="<%=lu_rs.getString("Precio")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>
                                
                                <div>

                              <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Cantidad</label>
                                <input value="<%=lu_rs.getString("cantidad")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                
                                <div>

                            <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Marca</label>
                                <input value="<%=lu_rs.getString("marca")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                            </div>
                                
                                <div>

                           <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Proveedor</label>
                                <input value="<%=lu_rs.getString("Proveedor")%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>


                            <div>
                                  <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Fecha vencimiento de garantía</label>
                                <input value="<%=lu_rs.getString("Garantia")%>" type="text" class="tooltips-general material-control" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>

                                <div>
                                   <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Fecha de entrada</label> 
                                <input value="<%=lu_rs.getString("Fecha_Entrada")%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                    <div>
                                          <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Ubicación</label>
                                <input value="<%=lu_rs.getString("Ubicacion")%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                            </div>

                                       <div>
                                         <label style=" top:-20px; font-size:17px;font-weight: 700; color:black; font-weight: normal;">Tipo de producto</label>  
                                <input  value="<%=lu_rs.getString("Tipo_Producto")%>" type="text" class="tooltips-general material-control"  readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                                
                                              <br><br>

                <p class="text-center">
                  <a href="ListarProductosBodeguero.jsp" class="btn btn-primary btn-lg active" role="button">Regresar</a>
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