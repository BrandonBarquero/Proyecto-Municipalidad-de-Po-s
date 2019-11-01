<%@page import="java.util.Calendar"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Retirar Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <script>function cal() {
  try {
    var a = parseInt(document.f.disponible.value),
        b = parseInt(document.f.nuevo.value);
    if((a-b) >= 0){
            document.f.sum.value = a - b;
        }else
            alert("La resta es negativa");
    
  } catch (e) {
  }
}</script>
        
        <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         int ln_id=Integer.parseInt(request.getParameter("Codigo_Producto"));
        int ln_id2=Integer.parseInt(request.getParameter("Cantidad"));
                
         lu_ps=lu_con.prepareStatement("select * from Departamento");
         lu_rs=lu_ps.executeQuery();
        
        
         %>
        <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo Página-->
    
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
                    Bienvenido a la secci�n para retirar el producto
                </div>
            </div>
        </div>
          
        <div class="container-fluid">
            <form name="retiro" method="post" action="SalidaProductoBodeguero" autocomplete="off">
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Retirar Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <legend><strong>Retirar Producto</strong></legend><br>

                                <div>
                                       <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Cantidad disponible</label>
                                    <input onchange="cal();" id="disponible" name="disponible" readonly value="<%=ln_id2%>" type="number" class="tooltips-general material-control" required="">
                             
                            </div>
                                    
                                    <br><br>

                                           <div class="group-material">
                                <input onchange="cal();" id="nuevo" name="nuevo" type="number" class="tooltips-general material-control" required="">
                                <label>Cantidad a retirar</label>
                            </div>

                                                    <div class="group-material">
                                <input id="sum" name="sum" type="number" class="tooltips-general material-control" required="">
                                <label>Nueva cantidad disponible</label>
                            </div>

                                                           <div>
                             <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">C�digo de producto</label>               
                                <input id="codigo" name="codigo" readonly value="<%=ln_id%>" type="text" class="tooltips-general material-control" required="">

                            </div>
                                
                                <br><br>

                                                                    <div class="group-material">
                                <input id="res" name="res" type="text" class="tooltips-general material-control" required="">
                                <label>Responsable</label>
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
                  <div>
                        <label style=" top:-20px; font-size:17px;font-weight: 700; color:#333; font-weight: normal;">Fecha de Salida</label>
                 <input id="date" name="date" value="<%=lc_sAhora%>" readonly type="date" class="tooltips-general material-control" required="">
                              
                            </div>
                 
                 <br><br>

          


                            <div class="group-material">
                                <span>Departamento</span>
                                <select id="dep" name="dep" class="tooltips-general material-control" required="">
                                      <%    while(lu_rs.next()){   %>
                 <option  value="<%=lu_rs.getString("NombreD")%>"><%=lu_rs.getString("NombreD")%> </option>
                 
                     <% } %>
                                </select>
                            </div>
                       
                            <p class="text-center">
                                <button type="submit" class="btn btn-primary retirar"><i class="zmdi zmdi-format-valign-bottom"></i> &nbsp;&nbsp; Retirar Producto</button>
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