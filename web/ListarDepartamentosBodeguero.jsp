<%-- 
    Document   : ListarDepartamentosBodeguero
    Created on : 01-nov-2019, 3:53:09
    Author     : barqu
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
  <body>
           <%
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
         
         lu_ps=lu_con.prepareStatement("select * from Departamento");
         lu_rs=lu_ps.executeQuery();%>
         
         <jsp:include page="HeaderBodeguero.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->
  
<div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Listar Departamentos</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/department.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para listar los departamentos disponibles
                </div>
            </div>
        </div>

             <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Lista Departamentos</li>
                      <li><a href="InsertarDepartamentosBodeguero.jsp">Insertar Departamentos</a></li>
                    </ol>
                </div>
            </div>
        </div>

<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista Departamentos  </h3>

                                <br>


 <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>

                                <div class="table-responsive">
                                    <table  id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">ID departamento</th>

                                                <th class="text-center">Modificar</th>
                                              



                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <%    while(lu_rs.next()){   %>
                                                 <td><%=lu_rs.getString("NombreD")%></td>
                                                <td><%=lu_rs.getString("IdDepartamento")%></td>
                                               
                              

                                                
                                                <td> <a href="ModificarDepartamentoBodeguero.jsp?IdDepartamento=<%=lu_rs.getString("IdDepartamento")%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                              
                                            </tr>
                                                          <!--TR EXTRA-->                                  
          <tr style="align-items: center" class='noSearch hide'>
      <td colspan="5"></td>  
                
              </tr>    
                                            
                                            <% } %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>



           <!--Fin Cuerpo PÃ¡gina-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>
