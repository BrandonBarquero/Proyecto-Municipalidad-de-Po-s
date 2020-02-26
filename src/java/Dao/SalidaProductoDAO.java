/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Producto;
import Entidades.SalidaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class SalidaProductoDAO {
       private final Connection pl_connection;
       PreparedStatement ll_ps=null;
       ResultSet ll_resultSet = null;
       int ln_r=0;
     public SalidaProductoDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();

    }
     
       public ArrayList<SalidaProducto> listaSalidaProductos( ) {
        ArrayList<SalidaProducto> SalidaProductos = new ArrayList<SalidaProducto>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Salida_Producto");
             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                SalidaProducto lo_salidaProducto = new SalidaProducto();
                lo_salidaProducto.setFechaSalida(ll_resultSet.getString("Fecha_Salida"));
                lo_salidaProducto.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_salidaProducto.setResponsable(ll_resultSet.getString("Responsable"));
                lo_salidaProducto.setDepartamento(ll_resultSet.getString("Departamento"));
                lo_salidaProducto.setCantidadSalida(ll_resultSet.getInt("Cantidad_Salida"));
                SalidaProductos.add(lo_salidaProducto);
            }ll_ps.close();
            ll_resultSet.close();
            return SalidaProductos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
     
        public int insertar(SalidaProducto to_salidaProducto) throws ClassNotFoundException, SQLException  {
               
        ll_ps= pl_connection.prepareStatement("insert into Salida_Producto(Fecha_Salida,Departamento,Cantidad_Salida,Codigo_Producto,Responsable)values(?,?,?,?,?)");
        ll_ps.setString(1,to_salidaProducto.getFechaSalida());
        ll_ps.setString(2,to_salidaProducto.getDepartamento());
        ll_ps.setInt(3,to_salidaProducto.getCantidadSalida());
        ll_ps.setString(4,to_salidaProducto.getCodigoProducto());
        ll_ps.setString(5,to_salidaProducto.getResponsable());           
        ln_r=ll_ps.executeUpdate();
        ll_ps.close();
        return ln_r;
}
     
}
