<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Tipo Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
         <jsp:include page="HeaderBodeguero.jsp"/>

         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar tipo Producto</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/upgrade.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para modificar el tipo de producto
                </div>
            </div>
        </div>
      <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         String ln_id=request.getParameter("Id_Tipo_Producto");
         lu_ps=lu_con.prepareStatement("select * from Tipo_Producto where Id_Tipo_Producto="+ln_id);
         lu_rs=lu_ps.executeQuery();
         while(lu_rs.next()){%>

        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar el tipo de producto</div>
                <form name="modificarr" action="" method="post" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div>
                                   <label style="  top:-20px; font-size:17px;font-weight: 700;color:#333;font-weight: normal;">ID</label>
                                   <input name="id" value="<%=lu_rs.getString("Id_Tipo_Producto")%>" type="text" class="material-control tooltips-general input-check-user" required="" readonly="" maxlength="20" pattern="[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ]{1,20}" data-toggle="tooltip" data-placement="top">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                           </div>
                                <br><br>

                               <div class="group-material">
                                   <input name="nombre" value="<%=lu_rs.getString("Nombre_Tipo_Producto")%>" type="text" class="material-control tooltips-general" required="" maxlength="70" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ 0-9]{1,70}" data-toggle="tooltip" data-placement="top" >
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre tipo producto</label>
                            </div>
<% } %>
                            <p class="text-center">
                                <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
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
                
                 lu_ps= lu_con.prepareStatement("update Tipo_Producto set "
                         + "Nombre_Tipo_Producto='"+nombre
                      
                         
                                 + "' where Id_Tipo_Producto="+ln_id+"");
                lu_ps.executeUpdate();
                response.sendRedirect("ListarTipoProductoBodeguero.jsp");
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            %>