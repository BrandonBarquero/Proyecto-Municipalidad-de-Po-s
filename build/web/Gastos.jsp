<%@page import="Dao.SalidaProductoDAO"%>
<%@page import="Entidades.SalidaProducto"%>
<%@page import="Services.SalidaProductoService"%>
<%@page import="Entidades.Producto"%>
<%@page import="Services.ProductoService"%>
<%@page import="Entidades.Departamento"%>
<%@page import="Services.DepartamentoService"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
<html lang="es">
<head>
    <title>Gastos</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();

 DepartamentoService lo_departamentoService = new DepartamentoService();
 ArrayList<Departamento> lo_departamento = lo_departamentoService.listaDepartamentos();
 
 String Inicio=request.getParameter("Inicio");
 String Final=request.getParameter("Final");
 
 SalidaProductoDAO lo_productoService = new SalidaProductoDAO();
  ArrayList<SalidaProducto> lo_producto = null;
  int saldo=0;
 for(int x=0; x<lo_departamento.size();x++){
lo_producto=lo_productoService.listaSalidaProductosFiltrado(lo_departamento.get(x).getNombreD(),Inicio,Final);
 
 for(int t=0; t<lo_producto.size();t++){
 saldo+= lo_producto.get(t).getCantidadSalida()*Integer.valueOf(lo_producto.get(t).getPa_Precio());
 }
 map = new HashMap<Object,Object>(); map.put("label", lo_departamento.get(x).getNombreD()); map.put("y", saldo); list.add(map);
 saldo=0;
 }

 


 
String dataPoints = gsonObj.toJson(list);
%>
    <script type="text/javascript">
window.onload = function() { 
 
var chart = new CanvasJS.Chart("chartContainer", {
	title: {
		text: "Gastos por Departamento"
	},
	axisX: {
		title: "Departamentos"
	},
	axisY: {
		title:"Gastos en Colones"
	},
	data: [{
		type: "column",
		yValueFormatString: "¢#, Colones",
		dataPoints: <%out.print(dataPoints);%>
	}]
});
chart.render();
 
}
</script>
</head>
<body>
        <jsp:include page="Header.jsp"/>

     <%
              String la_Usuario2=(String) session.getAttribute("user");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
         <!--Inicio Cuerpo PÃ¡gina-->

            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Gastos por departamento</small></h1>
            </div>
        </div>
         
             <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Gráfica de Gastos</li>
                      <li><a href="FECHAS2.jsp">Lista de Gastos</a></li>
                    </ol>
                </div>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/expensive.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección donde se muestran los gastos generados por departamento
                </div>
            </div>
        </div>


<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Gastos por departamento</h3>

                                <br>

<br>
                                <div class="table-responsive">
 <div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
                                </div>
                            </div>
                        </div>

           <!--Fin Cuerpo PÃ¡gina-->

         <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>