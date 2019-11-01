<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Salida de Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
       

  <%String Usuario2=(String) session.getAttribute("user2");
          
          if(Usuario2 == null){
           request.getRequestDispatcher("Error").forward(request, response);
          
          }%>
         <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement ps;
         ResultSet rs;
         
         ps=con.prepareStatement("select * from producto where Estado='Activo' and Cantidad = '0'");
         rs=ps.executeQuery();%>

     <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo Página-->

            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Salida de Productos</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation" ><a href="ListarProductosBodeguero.jsp">Listar Productos</a></li>
              <li role="presentation" ><a href="DesecharProductoBodeguero.jsp">Listar Desechos</a></li>
              <li role="presentation" class="active"><a href="ListarSalidasBodeguero.jsp">Listar Salidas</a></li>
            </ul>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/output.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para mostrar los productos que han sido retirados 
                </div>
            </div>
        </div>


<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Productos Retirados</h3>
                                <br>

 <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>
                                <div class="table-responsive">
                                    <table id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">C�digo Presupuestario</th>
                                                <th class="text-center">Descripci�n</th>
                                                <th class="text-center">Ver Detalles</th>
                                                <th class="text-center">Devoluci�n</th>


                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr><%    while(rs.next()){   %>
                                                
                        <td><%=rs.getString("Nombre")%> </td>                        
                     <td><%=rs.getString("Codigo_Producto")%> </td>
                      <td><%=rs.getString("Descripcion")%> </td>
                  
                
                          
                                                <td><a href="DetalleProductoBodeguero.jsp?Codigo_Producto=<%=rs.getString("Codigo_Producto")%>"><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Detalles del producto"><i class="zmdi zmdi-file-text"></i></button></td>
                                                <td><a href="DevolucionBodeguero.jsp??Cantidad=<%=rs.getString("cantidad")%>&Codigo_Producto=<%=rs.getString("Codigo_Producto")%>"> <button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title=""><i class="zmdi zmdi-time-restore"></i></button></td>
                                            </tr>
                                                                   <!--TR EXTRA-->                                  
          <tr style="align-items: center" class='noSearch hide'>
      <td colspan="5"></td>  
                
              </tr> 
                                            <% }%>
                                        </tbody>


                                    </table>
                                </div>
                            </div>
                        </div>


           


           <!--Fin Cuerpo Página-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>