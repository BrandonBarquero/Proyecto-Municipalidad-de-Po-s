/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.DevolucionesDAO;
import Entidades.Devoluciones;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class DevolucionesService implements ServiceDevolucionesManager{
    
    private final DevolucionesDAO daoDevolucion;

    public DevolucionesService(DevolucionesDAO daoDevolucion) {
        this.daoDevolucion = daoDevolucion;
    }

    public DevolucionesService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    
    public int insertar(Devoluciones devoluciones){
        try {
            return daoDevolucion.insertar(devoluciones);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DevolucionesService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DevolucionesService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
        @Override
      public ArrayList<Devoluciones> listaDevoluciones( ) {
          return daoDevolucion.listaDevoluciones();
      }
    
    
}
