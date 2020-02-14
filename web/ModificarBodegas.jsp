<%@page import="Entidades.Bodega"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.BodegaDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Bodega</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
         <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Bodega</small></h1>
            </div>
        </div> String ln_id=request.getParameter("Id_Bodega");
 <%
          String ln_id=request.getParameter("Codigo_Producto");
         BodegaDAO asd = new BodegaDAO();
        ArrayList<Bodega> a2=  asd.listaBodegasFiltrado(ln_id);
          
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
                <form name="modificarr" action="ModificarBodegas" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div>
                                   <label style="   top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal;">ID Bodega</label>
                                   <input value="<%=a2.get(0).getId_Bodega()%>" name="id" type="text" class="material-control tooltips-general input-check-user"  readonly>
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                           </div>
                           <br><br>

                               <div class="group-material">
                                   <input value="<%=a2.get(0).getNombre_Bodega()%>" name="nombre" type="text" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ 0-9]{1,70}" class="material-control tooltips-general"  required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la Bodega</label>
                            </div>
<% } %>
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
            <%
            String id=request.getParameter("id");
            String nombre=request.getParameter("nombre");
      
            
            int r;
            try{
                
                if(id!=null&&nombre!=null){
                
                 lu_ps= lu_con.prepareStatement("update Bodega set "
                         + "Nombre_Bodega='"+nombre
                      
                         
                                 + "' where Id_Bodega="+id+"");
                lu_ps.executeUpdate();
                response.sendRedirect("ListarBodegas.jsp");
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            %>