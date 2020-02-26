/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.BodegaDAO;
import Dao.DepartamentoDAO;
import Entidades.Departamento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class DepartamentoService implements ServiceDepartamentoManager{
    
    private final DepartamentoDAO po_daoDepartamento;

   public DepartamentoService() throws Exception {
        this.po_daoDepartamento = new DepartamentoDAO();
    }

 
    
    @Override
    public int eliminarDepartamento(int tn_idDepartamento){
        try {
            return po_daoDepartamento.eliminarDepartamento(tn_idDepartamento);
        } catch (SQLException ex) {
            Logger.getLogger(BodegaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
        @Override
     public int insertar(String ta_nombre){
        try {
            return po_daoDepartamento.insertar(ta_nombre);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
     }
         @Override
     public ArrayList<Departamento> listaDepartamentos( ){
            return po_daoDepartamento.listaDepartamentos();
     }
         @Override
     public ArrayList<Departamento> listaDepartamentosFiltrado(String ta_id){
        
            return po_daoDepartamento.listaDepartamentosFiltrado(ta_id);
     }
         @Override
     public int actualizar(Departamento to_departamento){
        try {
            return po_daoDepartamento.actualizar(to_departamento);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
     }
    
}
