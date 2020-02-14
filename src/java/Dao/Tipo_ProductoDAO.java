/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Departamento;
import Entidades.Producto;
import Entidades.Tipo_Producto;
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
public class Tipo_ProductoDAO {
       private final Connection connection;
     public Tipo_ProductoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
        public int Eliminar_Tipo_Producto(int Id_Tipo_Producto) throws SQLException{
  PreparedStatement ps;
      ps=connection.prepareStatement("delete from Tipo_Producto where Id_Tipo_Producto="+Id_Tipo_Producto);
  int r=ps.executeUpdate();
  ps.close();
        return r;
  }
      public int insertar(String tipo_Producto) throws ClassNotFoundException, SQLException  {
               
                PreparedStatement lu_ps= connection.prepareStatement("insert into Tipo_Producto(Nombre_Tipo_Producto)values(?)");

                lu_ps.setString(1,tipo_Producto);
               int ln_r = lu_ps.executeUpdate();
           lu_ps.close();
      
                return ln_r;
}
        public ArrayList<Tipo_Producto> listaTipo_Productos() {
        ArrayList<Tipo_Producto> tipo_productos = new ArrayList<Tipo_Producto>();
        try {
            PreparedStatement ps;
 
            ps=connection.prepareStatement("select * from Tipo_Producto");

            ResultSet resultSet = ps.executeQuery();
             while (resultSet.next()) {
                Tipo_Producto tipo_Producto = new Tipo_Producto();
                tipo_Producto.setId_Tipo_Producto(resultSet.getInt("id_Tipo_Producto"));
                tipo_Producto.setNombre_Tipo_Producto(resultSet.getString("Nombre_tipo_Producto"));
                tipo_productos.add(tipo_Producto);
            }ps.close();
            resultSet.close();
            return tipo_productos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
           public ArrayList<Tipo_Producto> listaTipo_ProductosFiltrado(String nombre) {
        ArrayList<Tipo_Producto> tipo_productos = new ArrayList<Tipo_Producto>();
        try {
            PreparedStatement ps;
 
            ps=connection.prepareStatement("select * from Tipo_Producto where="+nombre);

            ResultSet resultSet = ps.executeQuery();
             while (resultSet.next()) {
                Tipo_Producto tipo_Producto = new Tipo_Producto();
                tipo_Producto.setId_Tipo_Producto(resultSet.getInt("id_Tipo_Producto"));
                tipo_Producto.setNombre_Tipo_Producto(resultSet.getString("Nombre_tipo_Producto"));
                tipo_productos.add(tipo_Producto);
            }ps.close();
            resultSet.close();
            return tipo_productos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
             public int actualizar(Tipo_Producto tipo_Producto) throws ClassNotFoundException, SQLException  {
         PreparedStatement lu_ps;
             int ln_r3;
                lu_ps= connection.prepareStatement("update Tipo_Producto set "
                        + "Nombre_Tipo_Producto='"+tipo_Producto.getNombre_Tipo_Producto()+"' "
                        + "where Id_Tipo_Producto='"+tipo_Producto.getId_Tipo_Producto()+"'");
            ln_r3= lu_ps.executeUpdate();
            lu_ps.close();
   return ln_r3;
  }
  
}