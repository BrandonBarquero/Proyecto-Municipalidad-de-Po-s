/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Departamento;
import Entidades.Producto;
import Entidades.Tipo_Producto;
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
    PreparedStatement ps;
    private final Connection connection;
    int r=0;
    ResultSet resultSet=null;    
    Departamento departamento = new Departamento();
    
    
    
     public DepartamentoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
     //metodos
    public int Eliminar_Departamento(int IdDepartamento) throws SQLException{
     ps=connection.prepareStatement("delete from Departamento where IdDepartamento="+IdDepartamento);
     r=ps.executeUpdate();
     return r;
  }
    public int insertar(String nombre) throws ClassNotFoundException, SQLException  {
        
         ps= connection.prepareStatement("insert into Departamento(NombreD)values(?)");
         ps.setString(1,nombre);
         r=ps.executeUpdate();
         ps.close(); 
         return r;
   }
    public ArrayList<Departamento> listaDepartamentos( ) {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        try {
            ps=connection.prepareStatement("select * from Departamento");
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
            departamento.setNombreD(resultSet.getString("NombreD"));
            departamentos.add(departamento);
            }ps.close();
            resultSet.close();
            return departamentos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }   
    public ArrayList<Departamento> listaDepartamentosFiltrado( String id) {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        try {
            ps=connection.prepareStatement("select * from Departamento where IdDepartamento="+id);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                departamento.setNombreD(resultSet.getString("NombreD"));
                departamentos.add(departamento);
            }ps.close();
            resultSet.close();
            return departamentos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }  
    public int actualizar(Departamento departamento) throws ClassNotFoundException, SQLException  {
 
         ps= connection.prepareStatement("update Departamento set "
                        + "NombreD='"+departamento.getNombreD()+"' "
                        + "where IdDepartamento='"+departamento.getIdDepartamento()+"'");
            r= ps.executeUpdate();
            ps.close();
   return r;
  }
}
