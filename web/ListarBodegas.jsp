<%@page import="Services.BodegaService"%>
<%@page import="Entidades.Bodega"%>
<%@page import="Dao.BodegaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.DepartamentoDAO"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Lista de Bodegas</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
              <%
        BodegaService asd = new BodegaService();
        ArrayList<Bodega> a2=  asd.listaBodegas();%>
        
             <%
              String Usuario2=(String) session.getAttribute("user");
          
          if(Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
           
           %>
         <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo Página-->
  
<div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Listar Bodegas</small></h1>
            </div>
        </div>

        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/warehouse.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para listar las bodegas disponibles
                </div>
            </div>
        </div>

             <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Lista Bodegas</li>
                      <li><a href="InsertarBodega.jsp">Insertar Bodegas</a></li>
                    </ol>
                </div>
            </div>
        </div>

<div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista Bodegas  </h3>

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
                                                <th class="text-center">ID Bodega</th>

                                                <th class="text-center">Modificar</th>
                                                <th class="text-center">Eliminar</th>



                                            </tr>
                                        </thead>
                                        <tbody>
                                             <tr>
                                               <% for(int x=0;x<a2.size();x++){ %>
                                                <td><%=a2.get(x).getNombre_Bodega()%> </td>
                                               <td><%=a2.get(x).getId_Bodega()%> </td>
                                                

                                                
                                                <td> <a href="ModificarBodegas.jsp?Id_Bodega=<%=a2.get(x).getId_Bodega()%>"><button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                <td> <a href="EliminarBodega?Id_Bodega=<%=a2.get(x).getId_Bodega()%>"><button   data-href="EliminarBodega?Id_Bodega=<%=a2.get(x).getId_Bodega()%>" data-placement="bottom"   class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td>  
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