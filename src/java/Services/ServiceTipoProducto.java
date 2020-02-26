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
 interface ServiceTipoProducto {
    
     int eliminarTipoProducto(int tn_idTipoProducto);
     int insertar(String ta_tipoProducto);
     ArrayList<TipoProducto> listaTipoProductos();
     ArrayList<TipoProducto> listaTipoProductosFiltrado(String ta_nombre);
     int actualizar(TipoProducto to_tipoProducto);
}
