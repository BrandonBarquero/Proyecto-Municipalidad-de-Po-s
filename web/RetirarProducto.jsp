<%@page import="Services.DepartamentoService"%>
<%@page import="Entidades.Departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.DepartamentoDAO"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Retirar Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <script>
         function cal() {
            try {
                var ln_a = parseInt(document.retiro.disponible.value),
                ln_b = parseInt(document.retiro.cantidadRetirar.value);
                if((ln_a-ln_b) >= 0){
                    document.retiro.suma.value = ln_a - ln_b;
                }else{
                    document.retiro.suma.value ="Valor negativo";
                    alert("No se puede retirar mas partes de los que existen disponibles.");
                }    
            } catch (e) {
                
            }
        }
</script>

     <%
              String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
        
        <%
  
         int ln_id=Integer.parseInt(request.getParameter("Codigo_Producto"));
         int ln_id2=Integer.parseInt(request.getParameter("Cantidad"));
                
        DepartamentoService lo_departamentoService = new DepartamentoService();
        ArrayList<Departamento> lu_var = lo_departamentoService.listaDepartamentos();
        
        
         %>
        <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->
    
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Retirar Producto</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/trolley.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para retirar el producto
                </div>
            </div>
        </div>
          
        <div class="container-fluid">
            <form name="retiro" method="post" action="SalidaProducto" autocomplete="off">
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Retirar Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <legend><strong>Retirar Producto</strong></legend><br>
                            
                               <div>
                                <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Código de producto</label>               
                                <input readonly="" value="<%=ln_id%>" readonly="" id="codigoProducto" name="codigoProducto" type="text" class="tooltips-general material-control" required="">
                            </div>
                            <br><br>
                            
                              <div class="group-material">
                                <input id="responsable" name="responsable" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                                <label>Responsable</label>
                            </div>
                                
                                  <div class="group-material">
                                <span>Departamento</span>
                                <select id="departamento" name="departamento" class="tooltips-general material-control" required="">
                                        <% for(int ln_x=0;ln_x<lu_var.size();ln_x++){ %>
                 <option  value="<%=lu_var.get(ln_x).getNombreD()%>"> <%=lu_var.get(ln_x).getNombreD()%></option>
                 
                     <% } %>
                                </select>
 </div>
                            <div>
                                <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Cantidad disponible</label>
                                <input readonly="" onchange="cal();" id="disponible" name="disponible" readonly value="<%=ln_id2%>" type="text" class="tooltips-general material-control" required="">
                            </div>
                                    
                            <br><br>

                            <div class="group-material">
                                <input onchange="cal();" id="cantidadRetirar" name="cantidadRetirar" min="1" pattern="[0-9]{1,20}" type="number" class="tooltips-general material-control" required="">
                                <label>Cantidad a retirar</label>
                            </div>

                            <div class="group-material">
                                <input readonly="" id="suma" name="suma" type="text" class="tooltips-general material-control" required="" readonly="">
                                <label  style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Nueva cantidad disponible</label>
                            </div>
            
                             <% Calendar ahora = Calendar.getInstance();
int ln_anyo = ahora.get(Calendar.YEAR);
int ln_mes = ahora.get(Calendar.MONTH) +1;
int ln_dia = ahora.get(Calendar.DAY_OF_MONTH);
String lc_sAhora = "";
if (ln_mes < 10) {
lc_sAhora = ln_anyo + "-0" + ln_mes;
} else {
lc_sAhora = ln_anyo + "-" + ln_mes;
}
if (ln_dia < 10) {
lc_sAhora += "-0" + ln_dia;
} else {
lc_sAhora += "-"+ln_dia;
} %>
                            
                                 <input type="hidden" id="date" name="date" value="<%=lc_sAhora%>" readonly type="date" class="tooltips-general material-control" required="">
                        
                 <br><br>

          


                      
                           
                       
                            <p class="text-center">
                                <button type="submit" class="btn btn-primary retirar"><i class="zmdi zmdi-format-valign-bottom"></i> &nbsp;&nbsp; Retirar Producto</button>
                            </p>
                       </div>
                   </div>
                </div>
            </form>
        </div>







           <!--Fin Cuerpo PÃ¡gina-->


         <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>