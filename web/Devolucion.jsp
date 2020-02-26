<%@page import="Services.DepartamentoService"%>
<%@page import="Entidades.Departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.DepartamentoDAO"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.Calendar"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Devolucion</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
        <jsp:include page="Header.jsp"/>

   <script>
       function cal(){
           try{
               var ln_a = parseInt(document.dev.cantidadActual.value),
               ln_b = parseInt(document.dev.cantidadIngreso.value);
               if((ln_a+ln_b) >= 0){
                   document.dev.cantidadFinal.value = ln_a + ln_b;
               }
           }catch (e) {
               
           }
       }
</script>
        
        <%
          String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
         String ln_id=request.getParameter("Codigo_Producto");
         String ln_id2=request.getParameter("Cantidad");
         DepartamentoService lo_departamentoService = new DepartamentoService();
         ArrayList<Departamento> la_var = lo_departamentoService.listaDepartamentos();
        
        
         %>

   

         <!--Inicio Cuerpo Página-->
    
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Devolver Producto</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/devolucion.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para realizar una devoluci�n del producto.
                </div>
            </div>
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
          
        <div class="container-fluid">
            <form name="dev"  action="EntradaProducto" method="post" autocomplete="off">
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Devolver Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           <legend><strong>Devolver Producto</strong></legend><br>


                           <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;">Motivo de devoluci�n</label>
                           <div class="group-material">

                               <p><textarea id="motivo" name="motivo" type="text" class="form-control rounded-0"  cols="40" rows="5" required=""></textarea></p>
                        
                           </div>

                           <div class="group-material">
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;"> Cantidad actual </label>
                               <input readonly="" class="tooltips-general material-control" value="<%=ln_id2%>" onchange="cal();" id="cantidadActual" name="cantidadActual" type="text"  required="" readonly>
                           </div>
                           <div class="group-material">
                               <input onchange="cal();"  class="tooltips-general material-control" id="cantidadIngreso" name="cantidadIngreso"  min="1" pattern="[0-9]{1,20}" name="cantidadIngreso" type="number" required="">
                               <label> Cantidad de ingreso </label>
                           </div>
                           <div class="group-material">
                               <input readonly="" class="tooltips-general material-control" id="cantidadFinal" name="cantidadFinal" type="text"  required="">
                               <label  style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;"> Cantidad final </label>
                           </div>
                             
                           <div class="group-material">
                               <input name="codigo" id="codigo" value="<%=ln_id%>" type="text" class="tooltips-general material-control" required="" readonly="">
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;"> C�digo de producto</label>
                           </div>
                               
                           <div class="group-material">
                               <input id="responsable" name="responsable" type="text" pattern="[A-Z a-z]{1,70}" maxlength="70" class="tooltips-general material-control" required="">
                               <label>Responsable</label>
                           </div>


                           <div>
                               <label style=" top:-20px; font-size:17px; font-weight: 700; color:#333; font-weight: normal;">Fecha de entrada</label>
                           <input id="date" name="date" value="<%=lc_sAhora%>" readonly type="text" class="tooltips-general material-control" required="">
                                
                           </div>
                           <br><br>

          


                           <div class="group-material">
                               <span>Departamento</span>
                               <select id="departamento" name="departamento" class="tooltips-general material-control" required="">
                                     <% for(int ln_x=0;ln_x<la_var.size();ln_x++){ %>
                 <option  value="<%=la_var.get(ln_x).getNombreD()%>"><%=la_var.get(ln_x).getNombreD()%> </option>
                 
                     <% } %>
                               </select>
                           </div>
                        
                            <p class="text-center">
                                <button type="submit" class="btn btn-primary devolucion"><i class="zmdi zmdi-upload"></i> &nbsp;&nbsp; Devolver Producto</button>
                            </p>
                       </div>
                   </div>
                </div>
            </form>
        </div>







           <!--Fin Cuerpo Página-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>
       
        <script>
       function getURLParameter(pu_sParam){
        var lu_url = window.location.search.substring(1);
        var lu_urlVariables = lu_url.split("&");
        for(var ln_i=0; ln_i<lu_urlVariables.length; ln_i++){
            var lu_parametro = lu_urlVariables[ln_i].split("=");
            if(lu_parametro[0] == pu_sParam){
                return lu_parametro[1];
            }
        }

        document.getElementById("cantidad").value = lu_parametro[1];

    }
  function getURLParameter2(pu_sParam){
        var lu_url = window.location.search.substring(1);
        var lu_urlVariables = lu_url.split("&");
        for(var ln_i=0; ln_i<lu_urlVariables.length; ln_i++){
            var lu_parametro = lu_urlVariables[0].split("=");
            if(lu_parametro[0] == pu_sParam){
                return lu_parametro[1];
            }
        }

        document.getElementById("txt_campo_2").value = lu_parametro[1];

    }
</script>

 <script>
     var lu_url = window.location.search.substring(1);
    getURLParameter(lu_url);
    getURLParameter2(lu_url);
</script>