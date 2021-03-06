<%-- 
    Document   : ListarUnidadesBodeguero
    Created on : 12/03/2020, 08:37:47 PM
    Author     : srami
--%>

<%@page import="Entidades.Unidad"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Services.UnidadService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Lista de Unidades</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <%
        String la_Usuario2=(String) session.getAttribute("user2");
          
        if(la_Usuario2 == null){
        response.sendRedirect("Error.jsp");
        }
           
    %>
    <%
        UnidadService lo_unidadService = new UnidadService();
        ArrayList<Unidad> lu_var = lo_unidadService.listaUnidad();
    %>
    <jsp:include page="HeaderBodeguero.jsp"/>
    <!--Inicio Cuerpo PÃ¡gina-->
    <div class="container">
        <div class="page-header">
            <h1 class="all-tittles">SIM<small> Listar Unidades </small></h1>
        </div>
    </div>
    
    <div class="container-fluid"  style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/warehouse.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para listar las unidades que están disponibles
            </div>
        </div>
    </div>
    
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Lista Unidades</li>
                    <li><a href="InsertarUnidadBodeguero.jsp">Insertar Unidades</a></li>
                </ol>
            </div>
        </div>
    </div>
    
    <div class="row">
        <div class="col-xs-12">
            <h3 class="text-center all-tittles">Lista Unidades </h3>
            <br>
            <div class="md-form mt-0">
                <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
            </div>
            <br>
            <div class="table-responsive">
                                    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
                    <thead>
                        <tr class="success">
                            <th class="text-center">Nombre</th>
                            <th class="text-center">ID Unidad</th>
                            <th class="text-center">Modificar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <% for(int ln_x=0;ln_x<lu_var.size();ln_x++){ %>
                            <td><%=lu_var.get(ln_x).getNombreUnidad()%> </td>
                            <td><%=lu_var.get(ln_x).getIdUnidad()%> </td>
                            <td> <a href="ModificarUnidadesBodeguero.jsp?Id_Unidad=<%=lu_var.get(ln_x).getIdUnidad()%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
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
