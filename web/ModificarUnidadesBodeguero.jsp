<%-- 
    Document   : ModificarUnidadesBodeguero
    Created on : 12/03/2020, 08:38:24 PM
    Author     : srami
--%>

<%@page import="Entidades.Unidad"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Services.UnidadService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

     <%
              String la_Usuario2=(String) session.getAttribute("user2");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
<html lang="es">
<head>
    <title>Modificar Unidad</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
</head>
<body>
         <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Unidad </small></h1>
            </div>
        </div>
<%
          String ln_id=request.getParameter("Id_Unidad");
          UnidadService lo_bodegaService = new UnidadService();
          ArrayList<Unidad> lu_var = lo_bodegaService.listaUnidadFiltrado(ln_id);
          
          %>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/warehouse.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para modificar la información de la unidad
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar Unidad</div>
                <form action="ModificarUnidadesBodeguero" name="modificarr" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div>
                                   <label style="   top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal;">ID Unidad</label>
                                   <input value="<%=lu_var.get(0).getIdUnidad()%>" name="id" type="text" class="material-control tooltips-general input-check-user"  readonly>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                           </div>
                           <br><br>

                               <div class="group-material">
                                   <input value="<%=lu_var.get(0).getNombreUnidad()%>" name="nombre" type="text" maxlength="70" pattern="[a-zA-ZÃ¡Ã©Ã­Ã³ÃºÃÃÃÃÃÃ±Ã 0-9]{1,70}" class="material-control tooltips-general"  required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la Unidad</label>
                            </div>

                            <p class="text-center">
                                <button type="submit" data-placement="bottom" class="btn btn-primary modificar"><i class="zmdi zmdi-refresh"></i> &nbsp;&nbsp; Modificar</button>
                            </p> 
                       </div>
                   </div>
                </form>
            </div>
        </div>

           <!--Fin Cuerpo PÃ¡gina-->


          <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>
          