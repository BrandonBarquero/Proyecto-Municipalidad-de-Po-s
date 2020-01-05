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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class ProductoDAO { 
    int ln_r = 0;
    int ln_r2 = 0;
    int ln_r3 = 0;
      private final Connection connection;

    public ProductoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
   public int insertar(Producto lo_producto) throws ClassNotFoundException, SQLException  {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
            
                PreparedStatement lu_ps= lu_con.prepareStatement("insert into producto(Nombre,Descripcion,Precio,cantidad,tipo)values(?,?,?,?,?)");

              
                
              
                lu_ps.setString(1,lo_producto.getNombre());
                lu_ps.setString(2,lo_producto.getDescripcion());
                lu_ps.setString(3,lo_producto.getPrecio());
                lu_ps.setString(4,lo_producto.getCantidad());
                lu_ps.setString(5,lo_producto.gettipo());
                           
             
                ln_r=lu_ps.executeUpdate();
           
      
                return ln_r;
}
 public int eliminar(int id) throws ClassNotFoundException, SQLException  {
 
 
 
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
         PreparedStatement lu_ps;
       
         
         lu_ps=lu_con.prepareStatement("delete from producto where Codigo_Producto= ?");
           lu_ps.setInt(1, id);
         
        ln_r2=lu_ps.executeUpdate();
        return ln_r2;
 
 
 
 
 
 
 }
  public int actualizar(Producto producto) throws ClassNotFoundException, SQLException  {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
         PreparedStatement lu_ps;
  
                lu_ps= lu_con.prepareStatement("update producto set Nombre='?' ,Descripcion='?' ,Precio='?' ,cantidad='?',tipo='?'  where Codigo_Producto= ?");
                lu_ps.setString(1,producto.getNombre());
                lu_ps.setString(2,producto.getDescripcion());
                lu_ps.setString(3,producto.getPrecio());
                lu_ps.setString(4,producto.gettipo());
                lu_ps.setString(5,producto.getCantidad());
             
            ln_r3= lu_ps.executeUpdate();
   return ln_r3;
  }
 public int ContadorProductos() throws SQLException{
           int cont=0;
           PreparedStatement ps= null;
           ps= connection.prepareStatement("select * from Producto where Estado='Activo'");
           ResultSet rs=ps.executeQuery();
             while(rs.next()){ 
                 cont=cont+1;
             }
             return cont;
  
  }
}
