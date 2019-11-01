<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Departamento</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>  <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         String ln_id=request.getParameter("IdDepartamento");
         lu_ps=lu_con.prepareStatement("select * from Departamento where IdDepartamento="+ln_id);
         lu_rs=lu_ps.executeQuery();
         while(lu_rs.next()){%>
       <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo Página-->
   
            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Departamento</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/department.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para modificar los datos del departamento
                </div>
            </div>
        </div>

        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar Departamento</div>
                <form name="modificarr" action="" method="post" autocomplete="off">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           
                               <div>
                                   <label style="   top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal;">ID Departamento</label>  
                                   <input name="id" value="<%=lu_rs.getString("IdDepartamento")%>" type="text" class="material-control tooltips-general input-check-user" readonly >
                                <span class="highlight"></span>
                                <span class="bar"></span>
                              
                           </div>
                           
                           <br><br>

                               <div class="group-material">
                                   <input  value="<%=lu_rs.getString("NombreD")%>" name="nombre" type="text" class="material-control tooltips-general"  required="" >
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre del Departamento</label>
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
                
                 lu_ps= lu_con.prepareStatement("update Departamento set "
                         + "NombreD='"+nombre
                      
                         
                                 + "' where IdDepartamento="+ln_id+"");
                lu_ps.executeUpdate();
                response.sendRedirect("ListarDepartamentosBodeguero.jsp");
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            %>