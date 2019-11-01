<!DOCTYPE html>
<html lang="es">
<head>
    <title>Lista Proveedores</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
         <jsp:include page="Header.jsp"/>


         <!--Inicio Cuerpo PÃ¡gina-->

               <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Listar Proveedores</small></h1>
            </div>
        </div>
    
<div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/supply.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para listar los proveedores actuales
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                   <li><a href="InsertarProveedor.jsp">Nuevo Proveedor</a></li>
                        <li class="active">listado de proveedores</li>
                    </ol>
                </div>
            </div>
        </div>

        <div class="row">
                            <div class="col-xs-12">
                                <h3 class="text-center all-tittles">Lista de Proveedores</h3>
<br>

 <div class="md-form mt-0">
  <input style="width: 25%; margin-left: 10px" id="searchTerm" onkeyup="doSearch()" class="form-control" type="text" placeholder="Buscar" aria-label="Search">
</div>

<br>
                                <div class="table-responsive">
                                    <table id="datos" class="table table-hover text-center">
                                        <thead>
                                            <tr class="success">
                                                <th class="text-center">Cédula Jurídica</th>
                                                <th class="text-center">Nombre</th>
                                                <th class="text-center">Email</th>
                                                <th class="text-center">Teléfono</th>

                                                <th class="text-center">Modificar Proveedor</th>
                                                <th class="text-center">Eliminar Proveedor</th>

                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Test</td>
                                                <td>Test</td>
                                                <td>Test</td>
                                                <td>Test</td>

                                          
                                                <td><a href="ModificarProveedor.jsp"> <button class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button></td>
                                                <td> <button data-href="" data-placement="bottom" class="btn btn-danger desechar"><i class="zmdi zmdi-delete"></i></button></td>  
                                          
                                            </tr>
                                            
                                                          <!--TR EXTRA-->                                  
          <tr style="align-items: center" class='noSearch hide'>
      <td colspan="5"></td>  
                
              </tr> 
              
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