<%@page import="Services.BodegaService"%>
<%@page import="Dao.BodegaDAO"%>
<%@page import="Entidades.Bodega"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>

     <%
              String la_Usuario2=(String) session.getAttribute("user2");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
<html lang="es">
<head>
    <title>Modificar Bodega</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
</head>
<body>
         <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Bodega</small></h1>
            </div>
        </div>
<%
          String ln_id=request.getParameter("Id_Bodega");
          BodegaService lo_bodegaService = new BodegaService();
          ArrayList<Bodega> lu_var = lo_bodegaService.listaBodegasFiltrado(ln_id);
          
          %>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/warehouse.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para modificar la informaci�n de la bodega
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar Bodega</div>
                <form action="ModificarBodegasBodeguero" name="modificarr" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div>
                                   <label style="   top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal;">ID Bodega</label>
                                   <input value="<%=lu_var.get(0).getIdBodega()%>" name="id" type="text" class="material-control tooltips-general input-check-user"  readonly>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                           </div>
                           <br><br>

                               <div class="group-material">
                                   <input value="<%=lu_var.get(0).getNombreBodega()%>" name="nombre" type="text" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ 0-9]{1,70}" class="material-control tooltips-general"  required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la Bodega</label>
                            </div>

                            <p class="text-center">
                                <button type="submit" data-placement="bottom" class="btn btn-primary modificar"><i class="zmdi zmdi-refresh"></i> &nbsp;&nbsp; Modificar</button>
                            </p> 
                       </div>
                   </div>
                </form>
            </div>
        </div>





      
           <!--Fin Cuerpo Página-->


          <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>
          