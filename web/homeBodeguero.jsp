<%@page import="Dao.ProductoDAO"%>
<%@page import="Dao.UsuarioDAO"%>
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
          
          }
           int ln_x=0;
                int ln_x2=0;
                int ln_x3=0;
              UsuarioDAO daousuario= new UsuarioDAO();
              ProductoDAO daoproducto= new ProductoDAO();
              

               ln_x=daousuario.ContadorAdmins();
               ln_x2=daousuario.ContadorBodeguero();
               ln_x3=daoproducto.ContadorProductos();

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