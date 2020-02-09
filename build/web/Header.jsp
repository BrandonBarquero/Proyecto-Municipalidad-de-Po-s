<%-- 
    Document   : Header
    Created on : 31-oct-2019, 20:08:36
    Author     : barqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <title>Inicio</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
          <% String Usuario2=(String) session.getAttribute("user5");%>
	    <!--Inicio Barra lateral-->
    <div  style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);" class="navbar-lateral full-reset">
        <div class="visible-xs font-movile-menu mobile-menu-button" style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"></div>
        <div class="full-reset container-menu-movile custom-scroll-containers"  >
            <div class="logo full-reset all-tittles"  style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);">
                <i class="visible-xs zmdi zmdi-close pull-left mobile-menu-button" style="line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;"></i> 
                Municipalidad de Poás
            </div>
            <div class="full-reset" id="logo" style=" padding: 10px 0; color:#fff;"> <!--Color barra lateral-->
                <figure>
                    <img src="assets/img/muni.png" alt="Municipalidad" class="img-responsive center-box" style="width:40%;">
                </figure>
                <p class="text-center" style="padding-top: 15px; color: black; font-size: 20px">Sistema Inventario de Materiales</p>
            </div>
            <div class="full-reset nav-lateral-list-menu"  style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);">
                <ul class="list-unstyled"  style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);">
                    <li><a href="home.jsp" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-home zmdi-hc-fw" ></i>&nbsp;&nbsp; Inicio</a></li>
                    <li>
                        <div class="dropdown-menu-button" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-case zmdi-hc-fw"></i>&nbsp;&nbsp; Productos <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="InsertarProductos.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-shopping-cart-plus"></i>&nbsp;&nbsp; Insertar Productos</a></li>
                            <li><a href="ListarProductos.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Lista Productos</a></li>
                            <li><a href="DesecharProducto.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Lista Desechos</a></li>
                            <li><a href="ListarSalidas.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Lista Salidas</a></li>
                            <li><a href="ListarTipoProducto.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-collection-case-play"></i>&nbsp;&nbsp; Tipos de Producto</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-account-add zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de usuarios <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="InsertarUsuarios.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-face zmdi-hc-fw"></i>&nbsp;&nbsp; Insertar Usuarios</a></li>
                            <li><a href="ListarUsuarios.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-male-alt zmdi-hc-fw"></i>&nbsp;&nbsp; Listar Usuarios</a></li>
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-assignment-o zmdi-hc-fw"></i>&nbsp;&nbsp;Proveedores<i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="InsertarProveedor.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-plus-circle"></i>&nbsp;&nbsp; Insertar Proveedor</a></li>
                            <li><a href="ListarProveedores.jsp" style="color: black; font-size: 18px;"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Listar Proveedor</a></li>
                        </ul>
                    </li>
                   <li><a href="Bitacora.jsp" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-file-text zmdi-hc-fw" ></i>&nbsp;&nbsp; Bitacora</a></li>
                    <li><a href="Gastos.jsp" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-trending-up zmdi-hc-fw" ></i>&nbsp;&nbsp; Gastos</a></li>
                    <li><a href="ListarDepartamentos.jsp" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-city-alt zmdi-hc-fw" ></i>&nbsp;&nbsp; Departamentos</a></li>
                    <li><a href="ListarBodegas.jsp" style=" font-size: 18px; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);"><i class="zmdi zmdi-local-store zmdi-hc-fw" ></i>&nbsp;&nbsp; Bodegas</a></li>
               
                </ul>
            </div>
        </div>
    </div>
    <!--Fin Barra lateral-->



    <!--Inicio Barra Superior-->
    <div class="content-page-container full-reset custom-scroll-containers">
        <nav class="navbar-user-top full-reset" style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);">
            <ul class="list-unstyled full-reset" style="  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);">
                <figure>
                   <img src="assets/img/user.png" alt="user-picture" class="img-responsive img-circle center-box">
                </figure>
                
                <li style="color:#fff; cursor:default;">
                    <span class="all-tittles"><%=Usuario2%></span>
                </li>
                
                
                <li  class="tooltips-general exit-system-button" data-href="index.html" data-placement="bottom" title="Salir del sistema">
                    <i class="zmdi zmdi-power"></i>
                </li>
                <li  class="tooltips-general btn-help" data-placement="bottom" title="Ayuda">
                    <i class="zmdi zmdi-help-outline zmdi-hc-fw"></i>
                </li>
                <li class="mobile-menu-button visible-xs" style="float: left !important;">
                    <i class="zmdi zmdi-menu"></i>
                </li>
            </ul>
        </nav>
        <!--Fin Barra Superior-->
    </body>
</html>
