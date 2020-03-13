/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.BodegaDAO;
import Dao.UnidadDAO;
import Entidades.Bodega;
import Entidades.Unidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author srami
 */
public class UnidadService implements ServiceUnidadManager{
    
    private final UnidadDAO po_daoUnidad;

    public UnidadService() throws Exception {
        this.po_daoUnidad = new UnidadDAO();
    }

    @Override
    public int eliminarUnidad(int tn_idUnidad) {
        
        try {
            return po_daoUnidad.eliminarUnidad(tn_idUnidad);
        } catch (SQLException ex) {
            Logger.getLogger(UnidadService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
    }

    @Override
    public int insertar(String ta_nombre) {
      
    try {
            return po_daoUnidad.insertar(ta_nombre);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UnidadService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UnidadService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }

    @Override
    public ArrayList<Unidad> listaUnidad() {
        return po_daoUnidad.listaUnidad();
        }
    

    public ArrayList<Unidad> listaUnidadFiltrado(String ta_ID) {
    
            return po_daoUnidad.listaUnidadFiltrado(ta_ID);
    }

    @Override
    public int actualizar(Unidad to_unidad) {
        
    try {
            return po_daoUnidad.actualizar(to_unidad);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UnidadService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UnidadService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }
    
}
