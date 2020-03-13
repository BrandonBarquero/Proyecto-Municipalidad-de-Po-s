/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Bitacora;
import Entidades.Bitacora_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Bitacora_ProductoDAO {
     //Variables
    PreparedStatement ll_ps = null;
    int ln_r=0;
    private final Connection pl_connection;
    ResultSet ll_resultSet=null;
  
    
        //Metodos
     public Bitacora_ProductoDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();
    }
     
     
     public int insertar(Bitacora_Producto bitacora) throws ClassNotFoundException, SQLException {
           
        ll_ps= pl_connection.prepareStatement("insert into Bitacora_Producto(Fecha_Accion,Tipo_Accion,Responsable,Codigo_Producto,Cantidad_Producto)values(?,?,?,?,?)");
        ll_ps.setString(1,bitacora.getFecha_Accion());
        ll_ps.setString(2,bitacora.getTipo_Accion());
        ll_ps.setString(3,bitacora.getResposable());
        ll_ps.setString(4,bitacora.getCodigo_Producto());
        ll_ps.setString(5,bitacora.getCantidad_Producto());
        ln_r=ll_ps.executeUpdate();
        ll_ps.close(); 
        return ln_r;
   }
      public ArrayList<Bitacora_Producto> listaBitacora() {
        ArrayList<Bitacora_Producto> lo_Bitacoras = new ArrayList<Bitacora_Producto>();
        try {
            PreparedStatement ll_ps;
            ll_ps=pl_connection.prepareStatement("select * from Bitacora_Producto where Tipo_Accion='Desechar' or Tipo_Accion='ActivarDesecho'");

             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Bitacora_Producto lo_Bitacora = new Bitacora_Producto();
                lo_Bitacora.setFecha_Accion(ll_resultSet.getString("Fecha_Accion"));
                lo_Bitacora.setTipo_Accion(ll_resultSet.getString("Tipo_Accion"));
                lo_Bitacora.setResposable(ll_resultSet.getString("Responsable"));
                lo_Bitacora.setCodigo_Producto(ll_resultSet.getString("Codigo_Producto"));
                lo_Bitacora.setCantidad_Producto(ll_resultSet.getString("Cantidad_Producto"));

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
