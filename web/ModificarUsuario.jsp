<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Modificar Usuario</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo PÃ¡gina-->

             <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Modificar Usuario</small></h1>
            </div>
        </div>
     
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/users.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para modificar los datos del usuario
                </div>
            </div>
        </div>
        
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Modificar usuario</div>
                              <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         String ln_id=request.getParameter("Cedula");
         lu_ps=lu_con.prepareStatement("select * from Usuario where cedula="+ln_id);
         lu_rs=lu_ps.executeQuery();
         while(lu_rs.next()){%>
                <form name="modificarr" action="" method="post" autocomplete="off">
                    <div class="row">
           
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                               <div>
                                   <label style="  top:-20px;font-size:17px;font-weight: 700;color:#333;font-weight: normal; ">Cédula</label>
                                <input name="cedula" value="<%=lu_rs.getString("Cedula")%>" type="text" class="material-control tooltips-general input-check-user" required="" readonly="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                               
                           </div>
                                
                                <br><br>
                                 <div  class="group-material">
                                     <input name="correo" value="<%=lu_rs.getString("Correo")%>"  type="email" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Email</label>
                            </div>

                                      <div class="group-material">
                                          <input name="telefono" value="<%=lu_rs.getString("Telefono")%>" type="text" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Teléfono</label>
                            </div>

                                         <div class="group-material">
                                             <input name="Rol" value="<%=lu_rs.getString("Rol")%>" type="text" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Rol</label>
                            </div>

                      

                            <div class="group-material">
                                <input name="Nombre" value="<%=lu_rs.getString("Nombre")%>" type="text" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre completo</label>
                            </div>
                    
                      
                            <div class="group-material">
                                <input name="Contrasena" value="<%=lu_rs.getString("Contrasena")%>" type="password" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Contraseña</label>
                            </div>
                           <div class="group-material">
                               <input  type="password" class="material-control tooltips-general" required="">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Repetir contraseña</label>
                           </div> 
                            <p class="text-center">
                                <button type="submit" data-placement="bottom" class="btn btn-primary modificar"><i class="zmdi zmdi-refresh"></i> &nbsp;&nbsp; Modificar</button>
                            </p> 
                       </div>
                   </div>
                </form>
            </div><%  }
        %>
        </div>



           <!--Fin Cuerpo PÃ¡gina-->


          <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>
<%
            
            String cedula=request.getParameter("cedula");
            String correo=request.getParameter("correo");
            String telefono=request.getParameter("telefono");
           
            String Rol=request.getParameter("Rol");
            String Nombre=request.getParameter("Nombre");
            String Contrasena=request.getParameter("Contrasena");
            
            int ln_r;
            try{
                
                if(cedula!=null&&Contrasena!=null){
                
                 lu_ps= lu_con.prepareStatement("update Usuario set "
                         + "Nombre='"+Nombre+
                        "' ,Telefono='"+telefono+
                        "' ,Rol='"+Rol+
                         "' ,Contrasena='"+Contrasena+
                         "' where Cedula="+ln_id+"");
                lu_ps.executeUpdate();
                response.sendRedirect("ListarUsuarios.jsp");
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            %>