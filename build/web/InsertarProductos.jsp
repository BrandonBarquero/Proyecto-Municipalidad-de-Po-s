<%@page import="Entidades.TipoProducto"%>
<%@page import="Services.TipoProductoService"%>
<%@page import="Entidades.Bodega"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Services.BodegaService"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Insertar producto</title>
    <meta charset=UTF-8? />
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
     <%
                 String la_Usuario2=(String) session.getAttribute("user");
                 String la_UsuarioNombre = (String) session.getAttribute("user5");
          
          if(la_Usuario2 == null){
           response.sendRedirect("Error.jsp");
          }
          
          %>
    
    <%
        BodegaService lo_bodegaService = new BodegaService();
        ArrayList<Bodega> lo_bodega = lo_bodegaService.listaBodegas();
        
        TipoProductoService lo_tipoProductoService = new TipoProductoService();
        ArrayList<TipoProducto> lo_tipoProducto = lo_tipoProductoService.listaTipoProductos();
        
       %>
         <jsp:include page="Header.jsp"/>

         <!--Inicio Cuerpo Página-->
    
        <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">SIM<small> Insertar Producto</small></h1>
            </div>
        </div>

            <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
              <li role="presentation" class="active"><a href="InsertarProductos.jsp">Insertar Productos</a></li>
              <li role="presentation"><a href="ListarProductos.jsp">Listar Productos</a></li>
              <li role="presentation"><a href="DesecharProducto.jsp">Listar Desechos</a></li>
              <li role="presentation"><a href="ListarSalidas.jsp">Listar Salidas</a></li>
              <li role="presentation"><a href="ListarTipoProducto.jsp">Tipos de Productos</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/insert.png" alt="pdf" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la secci�n para insertar nuevos productos, debera de llenar todos los campos para poder registrar el producto correctamente.
                </div>
            </div>
        </div>
          
        <div class="container-fluid">
            <form name="ingreso" action="IngresoProducto" method="post" autocomplete="off" onsubmit="return validarFecha('Garantia','Fecha')">
                <div class="container-flat-form">
                    <div class="title-flat-form title-flat-blue">Nuevo Producto</div>
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <legend><strong>Ingresar Producto</strong></legend><br>

                            <div class="group-material">
                                <input id="Presupuestario" name="Presupuestario" type="number" min="1" class="tooltips-general material-control" placeholder="Escriba aqu� el c�digo presupuestario del producto" pattern="[0-9]{1,20}" required="" maxlength="20" data-toggle="tooltip" data-placement="top" title="Solamente n�meros">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>C�digo Presupuestario</label>
                            </div>

                            <div class="group-material">
                                <input id="nombre" name="nombre" type="text" pattern="[a-zA-Z������������1234567890\s]{1,70}" class="tooltips-general material-control" placeholder="Escriba aqu� el nombre del producto" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Escribe el nombre del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre</label>
                            </div>

                            <div class="group-material">
                                <input id="Unidad" name="Unidad" type="text" pattern="[a-zA-Z������������\s]{1,70}" class="tooltips-general material-control" placeholder="Escriba aqu� la unidad del producto" required="" maxlength="6" data-toggle="tooltip" data-placement="top" title="Escribe la unidad o del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Unidad</label>
                            </div>

                            <div class="group-material">
                                <input id="Descripcion" name="Descripcion" type="text" pattern="[a-zA-Z������������1234567890\s]{1,70}" class="tooltips-general material-control" placeholder="Escriba aqu� la descripci�n del producto" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Escribe la descripci�n del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Descripci�n</label>
                            </div>

                            <div class="group-material">
                                <input id="Precio" name="Precio" type="number" class="tooltips-general material-control" min="1" placeholder="Escriba aqu� el precio del producto" pattern="[0-9]{1,20}" required="" maxlength="20" data-toggle="tooltip" data-placement="top" title="Solamente n�meros">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Precio</label>
                            </div>

                            <div class="group-material">
                                <input id="Cantidad" name="Cantidad" type="number" class="tooltips-general material-control" min="1" placeholder="Escribe aqu� la cantidad de producto" pattern="[0-9]{1,20}" required="" maxlength="20" data-toggle="tooltip" data-placement="top" title="Solamente n�meros">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Cantidad</label>
                            </div>

                            <div class="group-material">
                                <input id="Marca" name="Marca" type="text" pattern="[a-zA-Z������������1234567890\s]{1,70}" class="tooltips-general material-control" placeholder="Escribe aqu� la marca del producto" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Escriba la marca del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Marca</label>
                            </div>

                            <div class="group-material">
                                <input id="Proveedor" name="Proveedor" type="text" pattern="[a-zA-Z������������1234567890\s]{1,70}" class="tooltips-general material-control" placeholder="Escribe aqu� el proveedor del producto" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Escriba el proveedor del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Proveedor</label>
                            </div>


                            <div class="group-material">
                                <input id="Garantia" name="Garantia"  type="date" class="tooltips-general material-control" placeholder="Seleccione aqu� la fecha de vencimiento de garant�a del producto" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Escriba la fecha de vencimiento del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Fecha vencimiento de garant�a</label>
                            </div>
                            
                            
                        
                                 <input value="<%=la_UsuarioNombre%>" id="Responsable" name="Responsable"  type="hidden" class="tooltips-general material-control" >
                     
                        
                 <% Calendar lu_ahora = Calendar.getInstance();
int ln_anyo = lu_ahora.get(Calendar.YEAR);
int ln_mes = lu_ahora.get(Calendar.MONTH) +1;
int ln_dia = lu_ahora.get(Calendar.DAY_OF_MONTH);
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
                           
                                    <input type="hidden" value="<%=lc_sAhora%>" required="" id="Fecha" name="Fecha" type="date" class="tooltips-general material-control" placeholder="Fecha entrada del producto" required="" maxlength="70" data-toggle="tooltip" data-placement="top" title="Escribe la fecha de entrada del producto">
                         
                            <div class="group-material">
                                <span>Ubicaci�n</span>
                                <select id="Ubicacion" name="Ubicacion" class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" title="Elige la ubicaci�n del producto">
                                <option value="" disabled="" selected="">Selecciona una bodega</option>
                              <% for(int ln_x=0;ln_x<lo_bodega.size();ln_x++){ %>
                                    <option  value="<%=lo_bodega.get(ln_x).getNombreBodega()%>"><%=lo_bodega.get(ln_x).getNombreBodega()%> </option>
                                            <% } %>
                                </select>
                            </div>

                                <div class="group-material">
                                <span>Tipo Producto</span>
                                <select id="Tipo" name="Tipo" class="tooltips-general material-control" data-toggle="tooltip" data-placement="top" title="Elige la ubicaci�n del producto">
                                <option value="" disabled="" selected="">Selecciona un tipo Producto</option>
                                   <% for(int ln_x=0;ln_x<lo_tipoProducto.size();ln_x++){ %>
                                     <option  value="<%=lo_tipoProducto.get(ln_x).getNombreTipoProducto()%>"><%=lo_tipoProducto.get(ln_x).getNombreTipoProducto()%> </option>
                                           <% } %>
                                </select>
                            </div>
                        
                            <p class="text-center">
                                <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                                <button type="submit" onclick="confirmar();" data-placement="bottom" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar</button>
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

<script type="text/javascript">
    
    function confirmar(e) {
        if (!confirm('�Desea agregar este producto?')) e.preventDefault();
    };
    for (var ln_i = 0, l = elems.length; ln_i < l; ln_i++) {
        elems[ln_i].addEventListener('click', confirmIt, false);
    }
    
    function validarFecha(pu_primero, pu_segunda){
    var lu_primera = document.getElementById('Garantia').value;
    var lu_segunda = document.getElementById('Fecha').value;
 
    if(lu_primera < lu_segunda){
        alert("La fecha de entrada es mayor a la fecha de la garantia");
        return false;
    }//else if(primera === segunda) {
       // alert("La fecha de garantia no puede ser igual a la fecha de entrada del producto");
        //return false;
    //}
    else{
        return true;
    }
    }
</script>