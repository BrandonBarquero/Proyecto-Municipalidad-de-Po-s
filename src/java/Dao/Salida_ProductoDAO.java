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
     
     
     
}
