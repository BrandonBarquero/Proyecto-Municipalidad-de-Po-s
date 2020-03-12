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
 DepartamentoService lo_departamentoService = new DepartamentoService();
 ArrayList<Departamento> lo_departamento = lo_departamentoService.listaDepartamentos();
 
 String Inicio=request.getParameter("Inicio");
 String Final=request.getParameter("Final");
 
 SalidaProductoDAO lo_productoService = new SalidaProductoDAO();
  ArrayList<SalidaProducto> lo_producto = null;
  int saldo=0;
%>
    <script type="text/javascript">
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
                     <li><a href="FECHAS.jsp">Gráfica de Gastos</a></li>
                      <li class="active">Lista de Gastos</li>
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

  <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>
                                <div class="table-responsive">
                                    <form action="pdf">
                                        <input type="" name="Inicio" readonly="" value="<%=Inicio%>"  />
                                        <input type="" name="Final" readonly="" value="<%=Final%>"  />
                                        
                                        <input type="submit" value="Generar Reporte"  />
                                    </form>
                                    <table border="1">
                                        <%
  for(int x=0; x<lo_departamento.size();x++){
lo_producto=lo_productoService.listaSalidaProductosFiltrado(lo_departamento.get(x).getNombreD(),Inicio,Final);
 
 for(int t=0; t<lo_producto.size();t++){
 saldo+= lo_producto.get(t).getCantidadSalida()*Integer.valueOf(lo_producto.get(t).getPa_Precio());
 }
 %>
                <tbody>
                                           
                                            <tr>
                                                
                                                <td><%=lo_departamento.get(x).getNombreD()%></td>
                                                <td><%=saldo%></td>
                                            </tr>
                                        </tbody>                          
             <%                           
                                        
 saldo=0;
 }
                                        
                                        %>
                                      
                                    </table>

                                    
                                    
                                    
                                    
                                </div>
                            </div>
                        </div>

           <!--Fin Cuerpo PÃ¡gina-->

         <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>