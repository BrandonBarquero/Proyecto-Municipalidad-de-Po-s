/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.TipoProducto;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
public interface ServiceTipoProductoManager extends ServiceTipoProducto{
    
   public int eliminarTipoProducto(int tn_idTipoProducto);
   public  int insertar(String ta_tipoProducto);
   public  ArrayList<TipoProducto> listaTipoProductos();
   public  ArrayList<TipoProducto> listaTipoProductosFiltrado(String ta_nombre);
   public int actualizar(TipoProducto to_tipoProducto);
}
