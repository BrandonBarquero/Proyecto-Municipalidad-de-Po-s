/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Departamento;
import Entidades.Producto;
import Entidades.TipoProducto;
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
public class TipoProductoDAO {
       private final Connection pl_connection;
       PreparedStatement ll_ps=null;
       int ln_r=0;
       ResultSet ll_resultSet =null;
       

       
       
     public TipoProductoDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();

    }
        public int eliminarTipoProducto(int to_idTipoProducto) throws SQLException{
      ll_ps=pl_connection.prepareStatement("delete from Tipo_Producto where Id_Tipo_Producto="+to_idTipoProducto);
      ln_r=ll_ps.executeUpdate();
      ll_ps.close();
        return ln_r;
  }
      public int insertar(String ta_tipoProducto) throws ClassNotFoundException, SQLException  {
               
       ll_ps= pl_connection.prepareStatement("insert into Tipo_Producto(Nombre_Tipo_Producto)values(?)");
       ll_ps.setString(1,ta_tipoProducto);
       ln_r = ll_ps.executeUpdate();
       ll_ps.close();
       return ln_r;
}
        public ArrayList<TipoProducto> listaTipoProductos() {
        ArrayList<TipoProducto> tipoProductos = new ArrayList<TipoProducto>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Tipo_Producto");
             ll_resultSet = ll_ps.executeQuery();
             while (ll_resultSet.next()) {
                TipoProducto lo_tipoProducto = new TipoProducto();
                lo_tipoProducto.setIdTipoProducto(ll_resultSet.getInt("id_Tipo_Producto"));
                lo_tipoProducto.setNombreTipoProducto(ll_resultSet.getString("Nombre_tipo_Producto"));
                tipoProductos.add(lo_tipoProducto);
            }ll_ps.close();
            ll_resultSet.close();
            return tipoProductos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
    public ArrayList<TipoProducto> listaTipoProductosFiltrado(String ta_Nombre) {
        ArrayList<TipoProducto> tipoProductos = new ArrayList<TipoProducto>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Tipo_Producto where Id_Tipo_Producto="+ta_Nombre);
             ll_resultSet = ll_ps.executeQuery();
             while (ll_resultSet.next()) {
                TipoProducto lo_tipoProducto = new TipoProducto();
                lo_tipoProducto.setIdTipoProducto(ll_resultSet.getInt("id_Tipo_Producto"));
                lo_tipoProducto.setNombreTipoProducto(ll_resultSet.getString("Nombre_tipo_Producto"));
                tipoProductos.add(lo_tipoProducto);
            }ll_ps.close();
            ll_resultSet.close();
            return tipoProductos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
    public int actualizar(TipoProducto to_tipoProducto) throws ClassNotFoundException, SQLException  {

            ll_ps= pl_connection.prepareStatement("update Tipo_Producto set "
                        + "Nombre_Tipo_Producto='"+to_tipoProducto.getNombreTipoProducto()+"' "
                        + "where Id_Tipo_Producto='"+to_tipoProducto.getIdTipoProducto()+"'");
            ln_r= ll_ps.executeUpdate();
            ll_ps.close();
   return ln_r;
  }
  
}
