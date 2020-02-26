<%-- 
    Document   : HeaderBodeguero
    Created on : 31-oct-2019, 23:46:55
    Author     : barqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

     <%
              String la_Usuario2=(String) session.getAttribute("user2");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
<html>
    <head>
      <title>Inicio</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
             <% String lc_Usuario2=(String) session.getAttribute("user6");%>
       <!--Inicio Barra lateral-->
    <div class="navbar-lateral full-reset">
        <div class="visible-xs font-movile-menu mobile-menu-button"></div>
        <div class="full-reset container-menu-movile custom-scroll-containers">
            <div class="logo full-reset all-tittles">
                <i class="visible-xs zmdi zmdi-close pull-left mobile-menu-button" style="line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;"></i> 
                Municipalidad de Poás
            </div>
      <div class="full-reset" id="logo" style=" padding: 10px 0; color:#fff;"> <!--Color barra lateral-->
                <figure>
                    <img src="assets/img/muni.png" alt="Municipalidad" class="img-responsive center-box" style="width:40%;">
                </figure>
                <p class="text-center" style="padding-top: 15px;">Sistema Inventario de Materiales</p>
            </div>
            <div class="full-reset nav-lateral-list-menu">
                <ul class="list-unstyled">
                    <li><a href="homeBodeguero.jsp"><i class="zmdi zmdi-home zmdi-hc-fw"></i>&nbsp;&nbsp; Inicio</a></li>
                    <li>
                        <div class="dropdown-menu-button"><i class="zmdi zmdi-case zmdi-hc-fw"></i>&nbsp;&nbsp; Productos <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ListarProductosBodeguero.jsp"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Lista Productos</a></li>
                            <li><a href="DesecharProductoBodeguero.jsp"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Lista Desechos</a></li>
                            <li><a href="ListarSalidasBodeguero.jsp"><i class="zmdi zmdi-file-text"></i>&nbsp;&nbsp; Lista Salidas</a></li>
                        </ul>
                      <li><a href="ListarDepartamentosBodeguero.jsp"><i class="zmdi zmdi-city-alt"></i>&nbsp;&nbsp; Departamentos</a></li>
                       <li><a href="ListarBodegasBodeguero.jsp"><i class="zmdi zmdi-local-store"></i>&nbsp;&nbsp; Bodegas</a></li>
                        <li><a href="ListarTipoProductoBodeguero.jsp"><i class="zmdi zmdi-collection-case-play"></i>&nbsp;&nbsp; Tipos de productos</a></li>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--Fin Barra lateral-->



    <!--Inicio Barra Superior-->
    <div class="content-page-container full-reset custom-scroll-containers">
        <nav class="navbar-user-top full-reset">
            <ul class="list-unstyled full-reset">
                <figure>
                   <img src="assets/img/user.png" alt="user-picture" class="img-responsive img-circle center-box">
                </figure>
                   <li style="color:#fff; cursor:default;">
                    <span class="all-tittles"><%=lc_Usuario2%></span>
                </li>
                <li  class="tooltips-general exit-system-button" data-href="CerrarSesion" data-placement="bottom" title="Salir del sistema">
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
