/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Departamento;
import Entidades.Producto;
import Entidades.TipoProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class DepartamentoDAO {
    //variables
    PreparedStatement ll_ps;
    private final Connection pl_connection;
    int ln_r=0;
    ResultSet ll_resultSet=null;    
    
    
    
    
     public DepartamentoDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();

    }
     //metodos
    public int eliminarDepartamento(int tn_IdDepartamento) throws SQLException{
     ll_ps=pl_connection.prepareStatement("delete from Departamento where IdDepartamento="+tn_IdDepartamento);
     ln_r=ll_ps.executeUpdate();
     return ln_r;
  }
    public int insertar(String ta_nombre) throws ClassNotFoundException, SQLException  {
        
         ll_ps= pl_connection.prepareStatement("insert into Departamento(NombreD)values(?)");
         ll_ps.setString(1,ta_nombre);
         ln_r=ll_ps.executeUpdate();
         ll_ps.close(); 
         return ln_r;
   }
    public ArrayList<Departamento> listaDepartamentos( ) {
        ArrayList<Departamento> lo_departamentos = new ArrayList<Departamento>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Departamento");
            ll_resultSet = ll_ps.executeQuery();
            while(ll_resultSet.next()) {
                Departamento lo_departamento = new Departamento();
                lo_departamento.setNombreD(ll_resultSet.getString("NombreD"));
                lo_departamento.setIdDepartamento(ll_resultSet.getInt("IdDepartamento"));
                lo_departamentos.add(lo_departamento);
            }ll_ps.close();
            ll_resultSet.close();
            return lo_departamentos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }   
    public ArrayList<Departamento> listaDepartamentosFiltrado(String ta_id) {
        ArrayList<Departamento> lo_departamentos = new ArrayList<Departamento>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Departamento where IdDepartamento="+ta_id);
            ll_resultSet = ll_ps.executeQuery();
            while(ll_resultSet.next()) {
                Departamento lo_departamento = new Departamento();
                lo_departamento.setNombreD(ll_resultSet.getString("NombreD"));
                lo_departamento.setIdDepartamento(ll_resultSet.getInt("IdDepartamento"));
                lo_departamentos.add(lo_departamento);
            }ll_ps.close();
            ll_resultSet.close();
            return lo_departamentos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }  
    public int actualizar(Departamento to_departamento) throws ClassNotFoundException, SQLException  {
 
         ll_ps= pl_connection.prepareStatement("update Departamento set "
                        + "NombreD='"+to_departamento.getNombreD()+"' "
                        + "where IdDepartamento='"+to_departamento.getIdDepartamento()+"'");
            ln_r= ll_ps.executeUpdate();
            ll_ps.close();
   return ln_r;
  }
}
