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
interface ServiceProducto {
    int insertar(Producto producto);
    int insertar2(Entrada_Productos producto);
    int eliminar(int id);
    int actualizar(Producto producto);
    ArrayList<Producto> listaProductosActivos( );
    ArrayList<Producto> listaProductosInactivos( );
    ArrayList<Producto> ListaProductosSalida();
    int Activar_Producto(int Codigo_Producto) ;
    int Desechar_Producto(int Codigo_Producto);
    ArrayList<Producto> listaUsuariosFiltrado(String Codigo_Producto);
    int Actualizar_Cantidad(String Cantidad,String Codigo_Producto);
    int ContadorProductos();
    ArrayList<Entrada_Productos> listarEntradaProductos();
//    ArrayList<Producto> consultar();
}
