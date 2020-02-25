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
    
    private final DepartamentoDAO daoDepartamento;

    public DepartamentoService(DepartamentoDAO daoDepartamento) {
        this.daoDepartamento = daoDepartamento;
    }

    public DepartamentoService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public int Eliminar_Departamento(int IdDepartamento){
        try {
            return daoDepartamento.Eliminar_Departamento(IdDepartamento);
        } catch (SQLException ex) {
            Logger.getLogger(BodegaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
        @Override
     public int insertar(String nombre){
        try {
            return daoDepartamento.insertar(nombre);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
     }
         @Override
     public ArrayList<Departamento> listaDepartamentos( ){
            return daoDepartamento.listaDepartamentos();
     }
         @Override
     public ArrayList<Departamento> listaDepartamentosFiltrado( String id){
        
            return daoDepartamento.listaDepartamentosFiltrado(id);
     }
         @Override
     public int actualizar(Departamento departamento){
        try {
            return daoDepartamento.actualizar(departamento);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
     }
    
}
