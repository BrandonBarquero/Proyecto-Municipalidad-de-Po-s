/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Devoluciones;
import Entidades.SalidaProducto;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class DevolucionesDAO {
    private final Connection pl_connection;
    PreparedStatement ll_ps=null;
    ResultSet ll_resultSet = null;
     
     
     public DevolucionesDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();
    } 
     
       public int insertar(Devoluciones to_devoluciones) throws ClassNotFoundException, SQLException  {
       
                ll_ps= pl_connection.prepareStatement("insert into Devoluciones(Fecha_Devolucion,Motivo,Cantidad,Responsable,Codigo_Producto,Departamento)values(?,?,?,?,?,?)");

                ll_ps.setString(1,to_devoluciones.getFechaDevolucion());
                ll_ps.setString(2,to_devoluciones.getMotivo());
                ll_ps.setInt(3,to_devoluciones.getCantidad());
                ll_ps.setString(4,to_devoluciones.getResponsable());
                ll_ps.setString(5,to_devoluciones.getCodigoProducto());
                ll_ps.setString(6,to_devoluciones.getDepartamento());
                
                
               int ln_r=ll_ps.executeUpdate();
                ll_ps.close(); 
      
                return ln_r;
   }
       
        public ArrayList<Devoluciones> listaDevoluciones( ) {
        ArrayList<Devoluciones> Devoluciones = new ArrayList<Devoluciones>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Devoluciones");
             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Devoluciones lo_Devolucion = new Devoluciones();
                lo_Devolucion.setFechaDevolucion(ll_resultSet.getString("Fecha_Devolucion"));
                lo_Devolucion.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_Devolucion.setResponsable(ll_resultSet.getString("Responsable"));
                lo_Devolucion.setDepartamento(ll_resultSet.getString("Departamento"));
                lo_Devolucion.setMotivo(ll_resultSet.getString("Motivo"));
                lo_Devolucion.setCantidad(ll_resultSet.getInt("Cantidad"));
                Devoluciones.add(lo_Devolucion);
            }ll_ps.close();
            ll_resultSet.close();
            return Devoluciones;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
