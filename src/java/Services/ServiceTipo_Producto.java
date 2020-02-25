/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Tipo_Producto;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
 interface ServiceTipo_Producto {
    
     int Eliminar_Tipo_Producto(int Id_Tipo_Producto);
     int insertar(String tipo_Producto);
     ArrayList<Tipo_Producto> listaTipo_Productos();
     ArrayList<Tipo_Producto> listaTipo_ProductosFiltrado(String nombre);
     int actualizar(Tipo_Producto tipo_Producto);
}
