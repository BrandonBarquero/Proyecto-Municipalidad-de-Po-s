/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.TipoProductoDAO;
import Entidades.TipoProducto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class TipoProductoService implements ServiceTipoProductoManager{
    
    private final TipoProductoDAO lo_daoTipoProducto;

    public TipoProductoService() throws Exception {
        this.lo_daoTipoProducto = new TipoProductoDAO();
    }
    
    @Override 
    
    public int eliminarTipoProducto(int tn_idTipoProducto){
        try {
            return lo_daoTipoProducto.eliminarTipoProducto(tn_idTipoProducto);
        } catch (SQLException ex) {
            Logger.getLogger(TipoProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
        @Override 
   public int insertar(String ta_tipoProducto){
        try {
            return lo_daoTipoProducto.insertar(ta_tipoProducto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TipoProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   }
       @Override 
   public ArrayList<TipoProducto> listaTipoProductosFiltrado(String ta_nombre){
       return lo_daoTipoProducto.listaTipoProductosFiltrado(ta_nombre);
   }
       @Override 
   
   public ArrayList<TipoProducto> listaTipoProductos(){
       return lo_daoTipoProducto.listaTipoProductos();
   }
       @Override 
   
   public int actualizar(TipoProducto to_tipoProducto){
        try {
            lo_daoTipoProducto.actualizar(to_tipoProducto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TipoProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   }
}
