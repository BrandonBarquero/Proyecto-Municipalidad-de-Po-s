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
         String lc_id=request.getParameter("Cedula");
         lu_ps=lu_con.prepareStatement("select * from Usuario where cedula="+lc_id);
         lu_rs=lu_ps.executeQuery();
         while(lu_rs.next()){%>
                <form name="modificarr" action="" method="post" autocomplete="off" onsubmit="return validarContrasena('Contrasena','password')">
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
                               <input name="correo" value="<%=lu_rs.getString("Correo")%>"  type="email" maxlength="50" pattern="[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Email</label>
                           </div>
                               
                           <div class="group-material">
                               <input name="telefono" value="<%=lu_rs.getString("Telefono")%>" type="text" maxlength="12" pattern="[0-9]{6,12}" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Teléfono</label>
                           </div>
                                
                           <div class="group-material">
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;">Rol</label>
                               <select id="Rol" name="Rol" value="<%=lu_rs.getString("Rol")%>" class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" required="" title="Elige el rol">
                                   <option value="" disabled="" selected="">Seleccione un rol</option>
                                   <option value="1">Administrador</option>
                                   <option value="2">Bodeguero</option>
                               </select>
                           </div>
                               <!--
                           <div class="group-material">
                               <input name="Rol" value="<%=lu_rs.getString("Rol")%>" type="text" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Rol</label>
                           </div>
                               -->
                           <div class="group-material">
                               <input name="Nombre" value="<%=lu_rs.getString("Nombre")%>" type="text" maxlength="70" pattern="[a-zA-ZÃ¡Ã©Ã­Ã³ÃºÃÃ‰ÃÃ“ÃšÃ±Ã‘ ]{1,70}" class="material-control tooltips-general" required="">
                               <span class="highlight"></span>
                               <span class="bar"></span>
                               <label>Nombre completo</label>
                           </div>
                    
                      
                           <div class="group-material">
                               <input name="Contrasena" value="<%=lu_rs.getString("Contrasena")%>" type="password" maxlength="200" pattern="[A-Z][A-Za-z0-9.-_,´+}{;:*%]{8,200}" class="material-control tooltips-general" required="">
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
            
            String lc_cedula=request.getParameter("cedula");
            String lc_correo=request.getParameter("correo");
            String lc_telefono=request.getParameter("telefono");
           
            String lc_Rol=request.getParameter("Rol");
            String lc_Nombre=request.getParameter("Nombre");
            String lc_Contrasena=request.getParameter("Contrasena");
            
            int ln_r;
            try{
                
                if(lc_cedula!=null&&lc_Contrasena!=null){
                
                 lu_ps= lu_con.prepareStatement("update Usuario set "
                         + "Nombre='"+lc_Nombre+
                         "' ,Correo='"+lc_correo+
                        "' ,Telefono='"+lc_telefono+
                        "' ,Rol='"+lc_Rol+
                         "' ,Contrasena='"+lc_Contrasena+
                         "' where Cedula="+lc_id+"");
                lu_ps.executeUpdate();
                response.sendRedirect("ListarUsuarios.jsp");
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            %>
            
    <script type="text/javascript">
    
    function validarContrasena(primero, segunda){
    var primera = document.getElementById('Contrasena').value;
    var segunda = document.getElementById('password').value;
 
    if(primera !== segunda){
        alert("La contraseñas no coinciden, vuelva a introducir la contraseña.");
        return false;
    }
    else{
        return true;
    }
    }
</script>