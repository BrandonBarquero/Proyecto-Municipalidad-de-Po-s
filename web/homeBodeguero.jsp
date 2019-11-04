<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html lang="es">
<head>
    <title>Inicio</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
           <%String lc_Usuario2=(String) session.getAttribute("user2");
          
          if(lc_Usuario2 == null){
           request.getRequestDispatcher("Error").forward(request, response);
          
          }%>
            <%
                int ln_x=0;
                int ln_x2=0;
                int ln_x3=0;
                int ln_x4=0;
                
                
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lc_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         
         
         PreparedStatement lc_ps;
         ResultSet lc_rs;
         
         PreparedStatement lc_ps2;
         ResultSet lc_rs2;
         
         PreparedStatement lc_ps3;
         ResultSet lc_rs3;
         
         PreparedStatement lc_ps4;
         ResultSet lc_rs4;
         
         lc_ps=lc_con.prepareStatement("select * from Usuario where Rol='1' and Estado='Activo'");
         lc_rs=lc_ps.executeQuery();
             while(lc_rs.next()){ 
                 ln_x=ln_x+1;
             }
             
  lc_ps2=lc_con.prepareStatement("select * from Usuario where Rol='2' and Estado='Activo'");
         lc_rs2=lc_ps2.executeQuery();
             while(lc_rs2.next()){ 
                 ln_x2=ln_x2+1;
             }
          lc_ps3=lc_con.prepareStatement("select * from Producto where Estado='Activo'");
         lc_rs3=lc_ps3.executeQuery();
             while(lc_rs3.next()){ 
                 ln_x3=ln_x3+1;
             }
         
         %>
    
	   
  <jsp:include page="HeaderBodeguero.jsp"/>

         <!--Inicio Cuerpo Página-->
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM <small>Inicio</small></h1>
            </div>
        </div>

          <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/inventory.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido al Sistema de Inventario de Materiales
                </div>
            </div>
        </div>


        <section class="full-reset text-center" style="padding: 40px 0;">
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-face"></i></div>
                <div class="tile-name all-tittles"><a href="#">Administradores</a></div>
                <div class="tile-num full-reset"><%=ln_x%></div>
            </article>
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-accounts"></i></div>
                <div class="tile-name all-tittles"><a href="#">Bodegueros</a></div>
                <div class="tile-num full-reset"><%=ln_x2%></div>
            </article>
             <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-truck"></i></div>
                <div class="tile-name all-tittles"><a href="#">Proveedores</a></div>
                <div class="tile-num full-reset">0</div>
            </article>
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-mall"></i></div>
                <div class="tile-name all-tittles"><a href="ListarProductosBodeguero.jsp">Productos</a></div>
                <div class="tile-num full-reset"><%=ln_x3%></div>
            </article>
        </section>
           <!--Fin Cuerpo Página-->

  <jsp:include page="Footer.jsp"/>
        
    </div>
</body>
</html>