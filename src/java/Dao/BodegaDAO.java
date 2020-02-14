/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Bodega;
import Entidades.Departamento;
import Entidades.Devoluciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class BodegaDAO {
    //Variables
    PreparedStatement ps= null;
    private final Connection connection;
    
    
    
        //Metodos
     public BodegaDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();
    }
     
      public int Eliminar_Bodega(int Id_Bodega) throws SQLException{
  PreparedStatement ps;
    ps=connection.prepareStatement("delete from Bodega where Id_Bodega="+Id_Bodega);
  int r=ps.executeUpdate();
        return r;
  }
       public int insertar(String nombre) throws ClassNotFoundException, SQLException  {
       
                PreparedStatement ps= connection.prepareStatement("insert into Bodega(Nombre_Bodega)values(?)");

               
                ps.setString(1,nombre);

               int r=ps.executeUpdate();
                ps.close(); 
      
                return r;
   }
            public ArrayList<Bodega> listaBodegas( ) {
        ArrayList<Bodega> bodegas = new ArrayList<Bodega>();
        try {
            PreparedStatement ps;
            ps=connection.prepareStatement("select * from Bodega");

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Bodega bodega = new Bodega();
                bodega.setNombre_Bodega(resultSet.getString("Nombre_Bodega"));
                
                bodegas.add(bodega);
            }
            ps.close();
            resultSet.close();
            return bodegas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
            
              public ArrayList<Bodega> listaBodegasFiltrado(String ID ) {
        ArrayList<Bodega> bodegas = new ArrayList<Bodega>();
        try {
            PreparedStatement ps;
            ps=connection.prepareStatement("select * from Bodega where Id_Bodega="+ID);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Bodega bodega = new Bodega();
                bodega.setNombre_Bodega(resultSet.getString("Nombre_Bodega"));
                
                bodegas.add(bodega);
            }ps.close();
            resultSet.close();
            return bodegas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
         public int actualizar(Bodega bodega) throws ClassNotFoundException, SQLException  {
         PreparedStatement lu_ps;
             int ln_r3;
                lu_ps= connection.prepareStatement("update Bodega set "
                        + "Nombre_Bodega='"+bodega.getNombre_Bodega()+"' "
                        + "where Id_Bodega='"+bodega.getId_Bodega()+"'");
            ln_r3= lu_ps.executeUpdate();
            lu_ps.close();
   return ln_r3;
  }
}
