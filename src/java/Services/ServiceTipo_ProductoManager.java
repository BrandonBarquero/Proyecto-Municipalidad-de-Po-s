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
public interface ServiceTipo_ProductoManager extends ServiceTipo_Producto{
    
   public int Eliminar_Tipo_Producto(int Id_Tipo_Producto);
   public  int insertar(String tipo_Producto);
   public  ArrayList<Tipo_Producto> listaTipo_Productos();
   public  ArrayList<Tipo_Producto> listaTipo_ProductosFiltrado(String nombre);
   public int actualizar(Tipo_Producto tipo_Producto);
}
