<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html lang="es">
<head>
    <title>Inicio</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
           <%String Usuario2=(String) session.getAttribute("user2");
          
          if(Usuario2 == null){
           request.getRequestDispatcher("Error").forward(request, response);
          
          }%>
            <%
                int x=0;
                int x2=0;
                int x3=0;
                int x4=0;
                
                
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         
         
         PreparedStatement ps;
         ResultSet rs;
         
         PreparedStatement ps2;
         ResultSet rs2;
         
         PreparedStatement ps3;
         ResultSet rs3;
         
         PreparedStatement ps4;
         ResultSet rs4;
         
         ps=con.prepareStatement("select * from Usuario where Rol='1' and Estado='Activo'");
         rs=ps.executeQuery();
             while(rs.next()){ 
                 x=x+1;
             }
             
  ps2=con.prepareStatement("select * from Usuario where Rol='2' and Estado='Activo'");
         rs2=ps2.executeQuery();
             while(rs2.next()){ 
                 x2=x2+1;
             }
          ps3=con.prepareStatement("select * from Producto where Estado='Activo'");
         rs3=ps3.executeQuery();
             while(rs3.next()){ 
                 x3=x3+1;
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
                <div class="tile-num full-reset"><%=x%></div>
            </article>
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-accounts"></i></div>
                <div class="tile-name all-tittles"><a href="#">Bodegueros</a></div>
                <div class="tile-num full-reset"><%=x2%></div>
            </article>
             <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-truck"></i></div>
                <div class="tile-name all-tittles"><a href="#">Proveedores</a></div>
                <div class="tile-num full-reset">0</div>
            </article>
            <article class="tile">
                <div class="tile-icon full-reset"><i class="zmdi zmdi-mall"></i></div>
                <div class="tile-name all-tittles"><a href="ListarProductosBodeguero.jsp">Productos</a></div>
                <div class="tile-num full-reset"><%=x3%></div>
            </article>
        </section>
           <!--Fin Cuerpo Página-->

  <jsp:include page="Footer.jsp"/>
        
    </div>
</body>
</html>