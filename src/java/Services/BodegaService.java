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
    
    private final BodegaDAO daoBodega;

    public BodegaService(BodegaDAO daoBodega) {
        this.daoBodega = daoBodega;
    }

    public BodegaService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int Eliminar_Bodega(int Id_Bodega) {
        
        try {
            return daoBodega.Eliminar_Bodega(Id_Bodega);
        } catch (SQLException ex) {
            Logger.getLogger(BodegaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
    }

    @Override
    public int insertar(String nombre) {
      
    try {
            return daoBodega.insertar(nombre);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }

    
    public ArrayList<Bodega> listaBodegas() {
        return daoBodega.listaBodegas();
        }
    

    public ArrayList<Bodega> listaBodegasFiltrado(String ID) {
    
            return daoBodega.listaBodegasFiltrado(ID);
    }

    @Override
    public int actualizar(Bodega bodega) {
        
    try {
            return daoBodega.actualizar(bodega);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0; 
    }
    
    
}
