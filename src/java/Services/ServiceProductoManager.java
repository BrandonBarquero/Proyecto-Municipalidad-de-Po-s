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
interface ServiceProductoManager extends ServiceProducto{
    public int insertar(Producto to_producto);
    public int insertar2(EntradaProductos to_producto);
    public int actualizar(Producto to_producto);
    public int eliminar(int tn_id);
    public ArrayList<Producto> listaProductosActivos( );
    public ArrayList<Producto> listaProductosInactivos( );
    public  ArrayList<Producto> listaProductosSalida();
    public int activarProducto(int tn_codigoProducto);
    public int desecharProducto(int tn_codigoProducto);
    public ArrayList<Producto> listaUsuariosFiltrado(String ta_codigoProducto);
    public int actualizarCantidad(String ta_Cantidad, String ta_codigoProducto);
    public int contadorProductos();
    public ArrayList<EntradaProductos> listarEntradaProductos();
//	    public ArrayList<Producto> consultar();
}
