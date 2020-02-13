/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Producto;
import Entidades.Salida_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Salida_ProductoDAO {
       private final Connection connection;
     public Salida_ProductoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
     
       public ArrayList<Salida_Producto> listaSalida_Productos( ) {
        ArrayList<Salida_Producto> Salida_Productos = new ArrayList<Salida_Producto>();
        try {
            PreparedStatement ps;
            ps=connection.prepareStatement("select * from Salida_Producto");

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Salida_Producto Salida_Producto = new Salida_Producto();
                Salida_Producto.setFecha_Salida(resultSet.getString("Fecha_Salida"));
                Salida_Producto.setCodigo_Producto(resultSet.getString("Codigo_Producto"));
                Salida_Producto.setResponsable(resultSet.getString("Responsable"));
                Salida_Producto.setDepartamento(resultSet.getString("Departamento"));
                Salida_Producto.setCantidad_Salida(resultSet.getInt("Cantidad_Salida"));
                Salida_Productos.add(Salida_Producto);
            }
            return Salida_Productos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
     
        public int insertar(Salida_Producto dalida_producto) throws ClassNotFoundException, SQLException  {
               
              PreparedStatement lu_ps= connection.prepareStatement("insert into Salida_Producto(Fecha_Salida,Departamento,Cantidad_Salida,Codigo_Producto,Responsable)values(?,?,?,?,?)");


                
                lu_ps.setString(1,dalida_producto.getFecha_Salida());
                lu_ps.setString(2,dalida_producto.getDepartamento());
                lu_ps.setInt(3,dalida_producto.getCantidad_Salida());
                lu_ps.setString(4,dalida_producto.getCodigo_Producto());
                lu_ps.setString(5,dalida_producto.getResponsable());           
            
               int ln_r=lu_ps.executeUpdate();
           
      
                return ln_r;
}
     
}
