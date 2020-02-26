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
    PreparedStatement ll_ps = null;
    int ln_r=0;
    private final Connection pl_connection;
    ResultSet ll_resultSet=null;
  
    
        //Metodos
     public BodegaDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();
    }
     
      public int eliminarBodega(int tn_idBodega) throws SQLException{

        ll_ps=pl_connection.prepareStatement("delete from Bodega where Id_Bodega="+tn_idBodega);
        ln_r=ll_ps.executeUpdate();
        return ln_r;
  }
       public int insertar(String ta_nombre) throws ClassNotFoundException, SQLException {
           
        ll_ps= pl_connection.prepareStatement("insert into Bodega(Nombre_Bodega)values(?)");
        ll_ps.setString(1,ta_nombre);
        ln_r=ll_ps.executeUpdate();
        ll_ps.close(); 
        return ln_r;
   }
       public ArrayList<Bodega> listaBodegas() {
        ArrayList<Bodega> lo_bodegas = new ArrayList<Bodega>();
        try {
            PreparedStatement ll_ps;
            ll_ps=pl_connection.prepareStatement("select * from Bodega");

             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Bodega lo_bodega = new Bodega();
                lo_bodega.setNombreBodega(ll_resultSet.getString("Nombre_Bodega"));
                lo_bodega.setIdBodega(ll_resultSet.getInt("Id_Bodega"));
                
                lo_bodegas.add(lo_bodega);
            }
            ll_ps.close();
            ll_resultSet.close();
            return lo_bodegas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
            
    public ArrayList<Bodega> listaBodegasFiltrado(String ta_Id) {
        ArrayList<Bodega> lo_bodegas = new ArrayList<Bodega>();
        try {
        ll_ps=pl_connection.prepareStatement("select * from Bodega where Id_Bodega="+ta_Id);

            ll_resultSet = ll_ps.executeQuery();
            while(ll_resultSet.next()) {
                Bodega lo_bodega = new Bodega();
                lo_bodega.setNombreBodega(ll_resultSet.getString("Nombre_Bodega"));
                lo_bodega.setIdBodega(ll_resultSet.getInt("Id_Bodega"));

                lo_bodegas.add(lo_bodega);
            }ll_ps.close();
            ll_resultSet.close();
            return lo_bodegas;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
    public int actualizar(Bodega to_bodega) throws ClassNotFoundException, SQLException  {
        ll_ps= pl_connection.prepareStatement("update Bodega set "
                        + "Nombre_Bodega='"+to_bodega.getNombreBodega()+"' "
                        + "where Id_Bodega='"+to_bodega.getIdBodega()+"'");
        ln_r=ll_ps.executeUpdate();
        ll_ps.close();
   return ln_r;
  }
}
