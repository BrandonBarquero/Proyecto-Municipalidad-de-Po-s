/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class ProductoDAO { 
    int r = 0;
    int r2 = 0;
    int r3 = 0;
      private final Connection connection;

    public ProductoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();
    }
   public int insertar(Producto producto) throws ClassNotFoundException, SQLException  {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
            
                PreparedStatement ps= con.prepareStatement("insert into producto(Nombre,Descripcion,Precio,cantidad,tipo)values(?,?,?,?,?)");

              
                
              
                ps.setString(1,producto.getNombre());
                ps.setString(2,producto.getDescripcion());
                ps.setString(3,producto.getPrecio());
                ps.setString(4,producto.getCantidad());
                ps.setString(5,producto.gettipo());
                           
             
                r=ps.executeUpdate();
           
      
                return r;
}
 public int eliminar(int id) throws ClassNotFoundException, SQLException  {
 
 
 
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
         PreparedStatement ps;
       
         
         ps=con.prepareStatement("delete from producto where Codigo_Producto= ?");
           ps.setInt(1, id);
         
        r2=ps.executeUpdate();
        return r2;
 
 
 
 
 
 
 }
  public int actualizar(Producto producto) throws ClassNotFoundException, SQLException  {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
         PreparedStatement ps;
  
                ps= con.prepareStatement("update producto set Nombre='?' ,Descripcion='?' ,Precio='?' ,cantidad='?',tipo='?'  where Codigo_Producto= ?");
                ps.setString(1,producto.getNombre());
                ps.setString(2,producto.getDescripcion());
                ps.setString(3,producto.getPrecio());
                ps.setString(4,producto.gettipo());
                ps.setString(5,producto.getCantidad());
             
            r3= ps.executeUpdate();
   return r3;
  }

}
