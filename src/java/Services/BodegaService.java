/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.BodegaDAO;
import Entidades.Bodega;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class BodegaService implements ServiceBodegaManager{
    
    private final BodegaDAO po_daoBodega;

    public BodegaService() throws Exception {
        this.po_daoBodega = new BodegaDAO();
    }

    @Override
    public int eliminarBodega(int tn_idBodega) {
        
        try {
            return po_daoBodega.eliminarBodega(tn_idBodega);
        } catch (SQLException ex) {
            Logger.getLogger(BodegaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
    }

    @Override
    public int insertar(String ta_nombre) {
      
    try {
            return po_daoBodega.insertar(ta_nombre);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }

      @Override
    public ArrayList<Bodega> listaBodegas() {
        return po_daoBodega.listaBodegas();
        }
    

    public ArrayList<Bodega> listaBodegasFiltrado(String ta_ID) {
    
            return po_daoBodega.listaBodegasFiltrado(ta_ID);
    }

    @Override
    public int actualizar(Bodega to_bodega) {
        
    try {
            return po_daoBodega.actualizar(to_bodega);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }
    
    
}
