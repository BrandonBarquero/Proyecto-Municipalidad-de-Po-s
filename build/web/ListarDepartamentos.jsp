<%@page import="Entidades.Departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.DepartamentoDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Lista Departamentos</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
         <%
        DepartamentoDAO asd = new DepartamentoDAO();
        ArrayList<Departamento> a2=  asd.listaDepartamentos();%>
         
         <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo Página-->
  
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
                    Bienvenido a la secci�n para listar los departamentos disponibles
                </div>
            </div>
        </div>

             <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Lista Departamentos</li>
                      <li><a href="InsertarDepartamentos.jsp">Insertar Departamentos</a></li>
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
                                    <table id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">ID departamento</th>

                                                <th class="text-center">Modificar</th>
                                                <th class="text-center">Eliminar</th>



                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                               <% for(int x=0;x<a2.size();x++){ %>
                                                 <td><%=a2.get(x).getNombreD()%></td>
                                                <td><%=a2.get(x).getIdDepartamento()%></td>
                                               
                              

                                                
                                                <td> <a href="ModificarDepartamento.jsp?IdDepartamento=<%=a2.get(x).getIdDepartamento()%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                <td> <a href="EliminarDepartamento?IdDepartamento=<%=a2.get(x).getIdDepartamento()%>"><button data-href="EliminarDepartamento?IdDepartamento=<%=a2.get(x).getIdDepartamento()%>" data-placement="bottom"   class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td>  
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



           <!--Fin Cuerpo Página-->


        <jsp:include page="Footer.jsp"/>
    </div>
</body>
</html>