/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.EntradaProductos;
import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
interface ServiceProducto {
    int insertar(Producto to_producto);
    int insertar2(EntradaProductos to_producto);
    int eliminar(int tn_id);
    int actualizar(Producto to_producto);
    ArrayList<Producto> listaProductosActivos( );
    ArrayList<Producto> listaProductosInactivos( );
    ArrayList<Producto> listaProductosSalida();
    int activarProducto(int tn_codigoProducto);
    int desecharProducto(int tn_codigoProducto);
    ArrayList<Producto> listaUsuariosFiltrado(String ta_codigoProducto);
    int actualizarCantidad(String ta_Cantidad, String ta_codigoProducto);
    int contadorProductos();
    ArrayList<EntradaProductos> listarEntradaProductos();
//    ArrayList<Producto> consultar();
}
