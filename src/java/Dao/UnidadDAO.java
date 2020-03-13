/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Unidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Josep
 */
public class UnidadDAO {
    //Variables
    PreparedStatement ll_ps = null;
    int ln_r=0;
    private final Connection pl_connection;
    ResultSet ll_resultSet=null;
  
    
//Metodos
    public UnidadDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();
    }
     
    public int eliminarUnidad(int tn_idUnidad) throws SQLException{
        ll_ps=pl_connection.prepareStatement("delete from Unidad where Id_Unidad="+tn_idUnidad);
        ln_r=ll_ps.executeUpdate();
        return ln_r;
    }
    
    public int insertar(String ta_nombre) throws ClassNotFoundException, SQLException { 
        ll_ps= pl_connection.prepareStatement("insert into Unidad(Nombre_Unidad)values(?)");
        ll_ps.setString(1,ta_nombre);
        ln_r=ll_ps.executeUpdate();
        ll_ps.close(); 
        return ln_r;
    }
    
    public ArrayList<Unidad> listaUnidad() {
        ArrayList<Unidad> lo_unidades = new ArrayList<Unidad>();
        try {
            PreparedStatement ll_ps;
            ll_ps=pl_connection.prepareStatement("select * from Unidad");

            ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Unidad lo_unidad = new Unidad();
                lo_unidad.setNombreUnidad(ll_resultSet.getString("Nombre_Unidad"));
                lo_unidad.setIdUnidad(ll_resultSet.getInt("Id_Unidad"));
                
                lo_unidades.add(lo_unidad);
            }
            ll_ps.close();
            ll_resultSet.close();
            return lo_unidades;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
            
    public ArrayList<Unidad> listaUnidadFiltrado(String ta_Id) {
        ArrayList<Unidad> lo_unidades = new ArrayList<Unidad>();
        try {
        ll_ps=pl_connection.prepareStatement("select * from Unidad where Id_Unidad="+ta_Id);

            ll_resultSet = ll_ps.executeQuery();
            while(ll_resultSet.next()) {
                Unidad lo_unidad = new Unidad();
                lo_unidad.setNombreUnidad(ll_resultSet.getString("Nombre_Unidad"));
                lo_unidad.setIdUnidad(ll_resultSet.getInt("Id_Unidad"));

                lo_unidades.add(lo_unidad);
            }ll_ps.close();
            ll_resultSet.close();
            return lo_unidades;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
    public int actualizar(Unidad to_unidad) throws ClassNotFoundException, SQLException  {
        ll_ps= pl_connection.prepareStatement("update Unidad set "
                        + "Nombre_Unidad='"+to_unidad.getNombreUnidad()+"' "
                        + "where Id_Unidad='"+to_unidad. getIdUnidad()+"'");
        ln_r=ll_ps.executeUpdate();
        ll_ps.close();
   return ln_r;
  }
}
