/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.SalidaProductoDAO;
import Entidades.SalidaProducto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class SalidaProductoService implements ServiceSalidaProductoManager{
    
    private final SalidaProductoDAO lo_daoSalidaproducto;
    
   public SalidaProductoService() throws Exception {
        this.lo_daoSalidaproducto = new SalidaProductoDAO();
    }
        @Override
    public ArrayList<SalidaProducto> listaSalidaProductos( ){
        return lo_daoSalidaproducto.listaSalidaProductos();
    }
        @Override
    public int insertar(SalidaProducto to_salidaProducto){
        try {
            return lo_daoSalidaproducto.insertar(to_salidaProducto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalidaProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalidaProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
