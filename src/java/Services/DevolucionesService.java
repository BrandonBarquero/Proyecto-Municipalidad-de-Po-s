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
    
    private final DevolucionesDAO po_daoDevolucion;

       public DevolucionesService() throws Exception {
        this.po_daoDevolucion = new DevolucionesDAO();
    }


    @Override
    
    public int insertar(Devoluciones to_devoluciones){
        try {
            return po_daoDevolucion.insertar(to_devoluciones);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DevolucionesService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DevolucionesService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
        @Override
      public ArrayList<Devoluciones> listaDevoluciones( ) {
          return po_daoDevolucion.listaDevoluciones();
      }
    
    
}
