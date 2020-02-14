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
           private final Connection connection;
     public DepartamentoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
       public int Eliminar_Departamento(int IdDepartamento) throws SQLException{
  PreparedStatement ps;
     ps=connection.prepareStatement("delete from Departamento where IdDepartamento="+IdDepartamento);
  int r=ps.executeUpdate();
        return r;
  }
          public int insertar(String nombre) throws ClassNotFoundException, SQLException  {
       
                PreparedStatement ps= connection.prepareStatement("insert into Departamento(NombreD)values(?)");

               
                ps.setString(1,nombre);

               int r=ps.executeUpdate();
                ps.close(); 
      
                return r;
   }
       public ArrayList<Departamento> listaDepartamentos( ) {
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        try {
            PreparedStatement ps;
            ps=connection.prepareStatement("select * from Departamento");

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Departamento departamento = new Departamento();
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
            PreparedStatement ps;
            ps=connection.prepareStatement("select * from Departamento where IdDepartamento="+id);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Departamento departamento = new Departamento();
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
         PreparedStatement lu_ps;
             int ln_r3;
                lu_ps= connection.prepareStatement("update Departamento set "
                        + "NombreD='"+departamento.getNombreD()+"' "
                        + "where IdDepartamento='"+departamento.getIdDepartamento()+"'");
            ln_r3= lu_ps.executeUpdate();
            lu_ps.close();
   return ln_r3;
  }
}