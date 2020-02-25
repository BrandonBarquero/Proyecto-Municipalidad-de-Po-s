/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Entrada_Productos;
import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
interface ServiceProductoManager extends ServiceProducto{
    public int insertar(Producto producto);
    public int insertar2(Entrada_Productos producto);
    public int actualizar(Producto producto);
    public int eliminar(int id);
    public ArrayList<Producto> listaProductosActivos( );
    public ArrayList<Producto> listaProductosInactivos( );
    public int Activar_Producto(int Codigo_Producto) ;
    public int Desechar_Producto(int Codigo_Producto);
    public ArrayList<Producto> listaUsuariosFiltrado(String Codigo_Producto);
    public int Actualizar_Cantidad(String Cantidad,String Codigo_Producto);
    public int ContadorProductos();
    public ArrayList<Entrada_Productos> listarEntradaProductos();
//	    public ArrayList<Producto> consultar();
}
