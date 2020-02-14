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
    int r=0;
    private final Connection connection;
    ResultSet resultSet=null;
    Bodega bodega = new Bodega();
    
        //Metodos
     public BodegaDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();
    }
     
      public int Eliminar_Bodega(int Id_Bodega) throws SQLException{

        ps=connection.prepareStatement("delete from Bodega where Id_Bodega="+Id_Bodega);
        r=ps.executeUpdate();
        return r;
  }
       public int insertar(String nombre) throws ClassNotFoundException, SQLException {
           
        ps= connection.prepareStatement("insert into Bodega(Nombre_Bodega)values(?)");
        ps.setString(1,nombre);
        r=ps.executeUpdate();
        ps.close(); 
        return r;
   }
       public ArrayList<Bodega> listaBodegas() {
        ArrayList<Bodega> bodegas = new ArrayList<Bodega>();
        try {
            PreparedStatement ps;
            ps=connection.prepareStatement("select * from Bodega");

             resultSet = ps.executeQuery();
            while (resultSet.next()) {
               
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
        ps=connection.prepareStatement("select * from Bodega where Id_Bodega="+ID);

            resultSet = ps.executeQuery();
            while (resultSet.next()) {
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
        ps= connection.prepareStatement("update Bodega set "
                        + "Nombre_Bodega='"+bodega.getNombre_Bodega()+"' "
                        + "where Id_Bodega='"+bodega.getId_Bodega()+"'");
        r=ps.executeUpdate();
        ps.close();
   return r;
  }
}
