<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Desechar Producto</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
         <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         
         lu_ps=lu_con.prepareStatement("select * from producto where Estado='Desecho' and Cantidad != '0'");
         lu_rs=lu_ps.executeQuery();%>
       <jsp:include page="HeaderBodeguero.jsp"/>

     <%
              String Usuario2=(String) session.getAttribute("user2");
          
          if(Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>

  


         <!--Inicio Cuerpo Página-->

            <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Desechar Productos</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation" ><a href="ListarProductosBodeguero.jsp">Listar Productos</a></li>
              <li role="presentation" class="active"><a href="DesecharProductoBodeguero.jsp">Listar Desechos</a></li>
              <li role="presentation"><a href="ListarSalidasBodeguero.jsp">Listar Salidas</a></li>
            </ul>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/delete.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n donde se encuentran los productos desechados
                </div>
            </div>
        </div>


<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Productos Desechados</h3>

                                <br>

  <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>

                                <div class="table-responsive">
                                  <table class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">C�digo Presupuestario</th>
                                                <th class="text-center">Descripci�n</th>
                                                <th class="text-center">Ver detalles</th>
                                                <th class="text-center">Activar Producto</th>
                                               


                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr><%    while(lu_rs.next()){   %>
                                                
                        <td><%=lu_rs.getString("Nombre")%> </td>                        
                     <td><%=lu_rs.getString("Codigo_Producto")%> </td>
                      <td><%=lu_rs.getString("Descripcion")%> </td>
                  
                
                          
                   

                                                
                      <td><a href="DetalleProductoBodeguero.jsp?Codigo_Producto=<%=lu_rs.getString("Codigo_Producto")%>"><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Detalles del producto"><i class="zmdi zmdi-file-text"></i></button></td>
                      <td><a href="ActivarProductoBodeguero?Codigo_Producto=<%=lu_rs.getString("Codigo_Producto")%>"><button type="submit" class="btn btn-info tooltips-general" data-toggle="tooltip" data-placement="top" title="Activar producto"><i class="zmdi zmdi-refresh"></i></button></td>
   
         </tr><% }%>
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