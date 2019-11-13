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
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         String ln_id=request.getParameter("Codigo_Producto");
         lu_ps=lu_con.prepareStatement("select * from producto where Codigo_Producto="+ln_id);
         lu_rs=lu_ps.executeQuery();
         while(lu_rs.next()){%>
        <div class="container-fluid">
            <form name="modificarr"  autocomplete="off">
                
                
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Modificar Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <legend><strong>Modificar Producto</strong></legend><br>
  
                            <div>
                                <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Código </label>   
                                <input id="Codigo" name="Codigo" value="<%=lu_rs.getString("Codigo_Producto")%>" type="text" class="tooltips-general material-control" required="" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                
                            </div>
                            <div>
                                <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Codigo Presupuestario</label>
                                <input id="Codigo_P" name="Codigo_P" value="<%=lu_rs.getString("Codigo_Presupuestario")%>" type="text" class="tooltips-general material-control" required="" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                            </div>
                                
                                <br><br>

                            <div class="group-material">
                                <input id="Nombre" name="Nombre" value="<%=lu_rs.getString("Nombre")%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre</label>
                            </div>

                            <div class="group-material">
                                <input id="Unidad" name="Unidad" value="<%=lu_rs.getString("Unidad")%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Unidad</label>
                            </div>

                            <div class="group-material">
                                <input name="Descripcion" id="Descripcion" value="<%=lu_rs.getString("Descripcion")%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Descripción</label>
                            </div>

                            <div class="group-material">
                                <input id="Precio" name="Precio" value="<%=lu_rs.getString("Precio")%>" type="number" min="1" pattern="[0-9]{1,20}" maxlength="20" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Precio</label>
                            </div>


                            <div class="group-material">
                                <input id="Marca" name="Marca" value="<%=lu_rs.getString("marca")%>" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="" >
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Marca</label>
                            </div>


                            <div class="group-material">
                                <input id="Fecha" name="Fecha" value="<%=lu_rs.getString("Garantia")%>" type="date" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Fecha vencimiento de garantía</label>
                            </div>

                           <div class="group-material">
                               <input id="Entrada" name="Entrada" value="<%=lu_rs.getString("Fecha_Entrada")%>" type="date" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Fecha de entrada</label>
                            </div>

                            <div class="group-material">
                                <input id="Ubicacion" name="Ubicacion" value="<%=lu_rs.getString("Ubicacion")%>" type="text" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Ubicación</label>
                            </div>


                            <div class="group-material">
                                <input id="tipo" name="Tipo" value="<%=lu_rs.getString("Tipo_Producto")%>" type="text" class="tooltips-general material-control" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Tipo Producto</label>
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



 <% } %>



           <!--Fin Cuerpo PÃ¡gina-->


           <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>
<%
            String lc_Codigo_P=request.getParameter("Codigo_P");
            String lc_Codigo=request.getParameter("Codigo");
            String lc_Nombre=request.getParameter("Nombre");
            String lc_Unidad=request.getParameter("Unidad");
            String lc_Descripcion=request.getParameter("Descripcion");
            String lc_Precio=request.getParameter("Precio");
            String lc_marca=request.getParameter("Marca");
            String lc_fecha=request.getParameter("Fecha");
            String lc_entrada=request.getParameter("Entrada");
            String lc_ubicacion=request.getParameter("Ubicacion");
            String lc_tipo=request.getParameter("Tipo");
              
            
            int ln_r;
            try{
                
                if(lc_Codigo!=null&&lc_Codigo_P!=null){
                
                 lu_ps= lu_con.prepareStatement("update producto set "
                      + " Codigo_Presupuestario='"+lc_Codigo_P+
                        "' ,Nombre='"+lc_Nombre+
                        "' ,Unidad='"+lc_Unidad+
                        "' ,Descripcion='"+lc_Descripcion+
                        "' ,Precio='"+lc_Precio+        
                        "' ,marca='"+lc_marca+
                        "' ,Ubicacion='"+lc_ubicacion+

                        "' ,Tipo_Producto='"+lc_tipo
                      + "' where Codigo_Producto="+lc_Codigo+"");
                ln_r=lu_ps.executeUpdate();
                
           if(ln_r>=1){
               response.sendRedirect("ListarProductos.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
                }
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
%>