/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Bitacora;
import Entidades.Bodega;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class BitacoraDAO {
    //Variables
    PreparedStatement ll_ps = null;
    int ln_r=0;
    private final Connection pl_connection;
    ResultSet ll_resultSet=null;
  
    
        //Metodos
     public BitacoraDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();
    }
     
     
     public int insertar(Bitacora bitacora) throws ClassNotFoundException, SQLException {
           
        ll_ps= pl_connection.prepareStatement("insert into Bitacora(Fecha_Accion,Tipo_Accion,Responsable,Nombre)values(?,?,?,?)");
        ll_ps.setString(1,bitacora.getFecha_Accion());
        ll_ps.setString(2,bitacora.getTipo_Accion());
        ll_ps.setString(3,bitacora.getResponsable());
        ll_ps.setString(4,bitacora.getNombre());
        ln_r=ll_ps.executeUpdate();
        ll_ps.close(); 
        return ln_r;
   }
      public ArrayList<Bitacora> listaBitacora() {
        ArrayList<Bitacora> lo_Bitacoras = new ArrayList<Bitacora>();
        try {
            PreparedStatement ll_ps;
            ll_ps=pl_connection.prepareStatement("select * from Bitacora where Tipo_Accion='Inicio de Sesion'");

             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Bitacora lo_Bitacora = new Bitacora();
                lo_Bitacora.setFecha_Accion(ll_resultSet.getString("Fecha_Accion"));
                lo_Bitacora.setNombre(ll_resultSet.getString("Nombre"));
                lo_Bitacora.setResponsable(ll_resultSet.getString("Responsable"));
                lo_Bitacora.setTipo_Accion(ll_resultSet.getString("Tipo_Accion"));
                
                lo_Bitacoras.add(lo_Bitacora);
            }
            ll_ps.close();
            ll_resultSet.close();
            return lo_Bitacoras;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
        public ArrayList<Bitacora> listaBitacoraEliminaciones() {
        ArrayList<Bitacora> lo_Bitacoras = new ArrayList<Bitacora>();
        try {
            PreparedStatement ll_ps;
            ll_ps=pl_connection.prepareStatement("select * from Bitacora where Tipo_Accion='EliminacionBodega' or Tipo_Accion='EliminacionUnidad' or Tipo_Accion='EliminacionTipoProducto'");

             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Bitacora lo_Bitacora = new Bitacora();
                lo_Bitacora.setFecha_Accion(ll_resultSet.getString("Fecha_Accion"));
                lo_Bitacora.setNombre(ll_resultSet.getString("Nombre"));
                lo_Bitacora.setResponsable(ll_resultSet.getString("Responsable"));
                lo_Bitacora.setTipo_Accion(ll_resultSet.getString("Tipo_Accion"));
                
                lo_Bitacoras.add(lo_Bitacora);
            }
            ll_ps.close();
            ll_resultSet.close();
            return lo_Bitacoras;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    } 
     
     
     
}
