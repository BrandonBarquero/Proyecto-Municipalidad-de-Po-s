/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Producto;
import Entidades.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class ProductoDAO { 
    private final Connection connection;
    PreparedStatement ps=null;
    int r;
    ResultSet resultSet=null;
    Producto producto = new Producto();


    public ProductoDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
   public int insertar(Producto lo_producto) throws ClassNotFoundException, SQLException  {
               
        ps= connection.prepareStatement("insert into producto(Codigo_Presupuestario,"
                    + "Nombre,Unidad,Descripcion,Precio,Cantidad,Estado,Marca,Fecha_Entrada,Ubicacion"
                    + ",Tipo_Producto,Garantia,Proveedor)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

                
                ps.setString(1,lo_producto.getCodigo_Presupuestario());
                ps.setString(2,lo_producto.getNombre());
                ps.setString(3,lo_producto.getUnidad());
                ps.setString(4,lo_producto.getDescripcion());
                ps.setString(5,lo_producto.getPrecio());           
                ps.setString(6,lo_producto.getCantidad());
                ps.setString(7,"Activo");
                ps.setString(8,lo_producto.getMarca());
                ps.setString(9,lo_producto.getFecha_Entrada());
                ps.setString(10,lo_producto.getUbicacion());
                ps.setString(11,lo_producto.getTipo_Producto());
                ps.setString(12,lo_producto.getGarantia());
                ps.setString(13,lo_producto.getProveedor());
                r=ps.executeUpdate();
                ps.close();
      
                return r;
}
 public int eliminar(int id) throws ClassNotFoundException, SQLException  {
 
         ps=connection.prepareStatement("delete from producto where Codigo_Producto= ?");
         ps.setInt(1, id);
         
        r=ps.executeUpdate();
        ps.close();
        return r;
 }
  public int actualizar(Producto lo_producto) throws ClassNotFoundException, SQLException  {
  
                ps= connection.prepareStatement("update producto set "
                        + "Codigo_Presupuestario='?' "
                        + ",Nombre='?' "
                        + ",Unidad='?' "
                        + ",Descripcion='?'"
                        + ",Precio='?'  "
                        + ",Cantidad='?'  "
                        + ",Marca='?'  "
                        + ",Ubicacion='?'  "
                        + ",Tipo_Producto='?'  "
                        + ",Garantia='?'  "
                        + ",Proveedor='?'  "
                        + "where getCodigo_Producto= ?");
                
                ps.setString(1,lo_producto.getCodigo_Presupuestario());
                ps.setString(2,lo_producto.getNombre());
                ps.setString(3,lo_producto.getUnidad());
                ps.setString(4,lo_producto.getDescripcion());
                ps.setString(5,lo_producto.getPrecio());           
                ps.setString(6,lo_producto.getCantidad());
                ps.setString(7,lo_producto.getMarca());
                ps.setString(8,lo_producto.getUbicacion());
                ps.setString(9,lo_producto.getTipo_Producto());
                ps.setString(10,lo_producto.getGarantia());
                ps.setString(11,lo_producto.getProveedor());
                ps.setString(12,lo_producto.getCodigo_Producto());
             
            r= ps.executeUpdate();
            ps.close();
   return r;
  }
  
  
  public ArrayList<Producto> listaProductosActivos( ) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            ps=connection.prepareStatement("select * from producto where Estado='Activo'");
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                producto.setCodigo_Presupuestario(resultSet.getString("Codigo_Presupuestario"));
                producto.setCodigo_Producto(resultSet.getString("Codigo_Producto"));
                producto.setNombre(resultSet.getString("Nombre"));
                producto.setUnidad(resultSet.getString("Unidad"));
                producto.setDescripcion(resultSet.getString("Descripcion"));
                producto.setPrecio(resultSet.getString("Precio"));
                producto.setCantidad(resultSet.getString("Cantidad"));
                producto.setMarca(resultSet.getString("Marca"));
                producto.setFecha_Entrada(resultSet.getString("Fecha_Entrada"));
                producto.setUbicacion(resultSet.getString("Ubicacion"));
                producto.setTipo_Producto(resultSet.getString("Tipo_Producto"));
                producto.setGarantia(resultSet.getString("Garantia"));
                producto.setProveedor(resultSet.getString("Proveedor"));
                productos.add(producto);
            }
            ps.close();
            resultSet.close();
            return productos;
        } catch (SQLException ex) {
            return null;
        }

    }
  
  public ArrayList<Producto> listaProductosInactivos( ) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            ps=connection.prepareStatement("select * from producto where Estado='Desecho' and Cantidad != '0'");
             resultSet = ps.executeQuery();
            while (resultSet.next()) {
                producto.setCodigo_Presupuestario(resultSet.getString("Codigo_Presupuestario"));
                producto.setCodigo_Producto(resultSet.getString("Codigo_Producto"));
                producto.setNombre(resultSet.getString("Nombre"));
                producto.setUnidad(resultSet.getString("Unidad"));
                producto.setDescripcion(resultSet.getString("Descripcion"));
                producto.setPrecio(resultSet.getString("Precio"));
                producto.setCantidad(resultSet.getString("Cantidad"));
                producto.setMarca(resultSet.getString("Marca"));
                producto.setFecha_Entrada(resultSet.getString("Fecha_Entrada"));
                producto.setUbicacion(resultSet.getString("Ubicacion"));
                producto.setTipo_Producto(resultSet.getString("Tipo_Producto"));
                producto.setGarantia(resultSet.getString("Garantia"));
                producto.setProveedor(resultSet.getString("Proveedor"));
                productos.add(producto);
            }
            ps.close();
            resultSet.close();
            return productos;
        } catch (SQLException ex) {
            return null;
        }

    }
  public int Activar_Producto(int Codigo_Producto) throws SQLException{
  ps= connection.prepareStatement("update producto set Estado='Activo' where Codigo_Producto="+Codigo_Producto+"");
   r=ps.executeUpdate();
  ps.close();
        return r;
  }
   public int Desechar_Producto(int Codigo_Producto) throws SQLException{
   ps= connection.prepareStatement("update producto set Estado='Desecho' where Codigo_Producto="+Codigo_Producto+"");
   r=ps.executeUpdate();
        return r;
  }
  public ArrayList<Producto> listaUsuariosFiltrado(String Codigo_Producto) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            ps=connection.prepareStatement("select * from producto where Codigo_Producto="+Codigo_Producto);

             resultSet = ps.executeQuery();
             while (resultSet.next()) {
                producto.setCodigo_Presupuestario(resultSet.getString("Codigo_Presupuestario"));
                producto.setCodigo_Producto(resultSet.getString("Codigo_Producto"));
                producto.setNombre(resultSet.getString("Nombre"));
                producto.setUnidad(resultSet.getString("Unidad"));
                producto.setDescripcion(resultSet.getString("Descripcion"));
                producto.setPrecio(resultSet.getString("Precio"));
                producto.setCantidad(resultSet.getString("Cantidad"));
                producto.setMarca(resultSet.getString("Marca"));
                producto.setFecha_Entrada(resultSet.getString("Fecha_Entrada"));
                producto.setUbicacion(resultSet.getString("Ubicacion"));
                producto.setTipo_Producto(resultSet.getString("Tipo_Producto"));
                producto.setGarantia(resultSet.getString("Garantia"));
                producto.setProveedor(resultSet.getString("Proveedor"));
                productos.add(producto);
            }
             ps.close();
             resultSet.close();
            return productos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
   public int Actualizar_Cantidad(String Cantidad,String Codigo_Producto) throws SQLException{
ps= connection.prepareStatement("update producto set Cantidad="+Cantidad+"where Codigo_Producto="+Codigo_Producto+"");
 r=ps.executeUpdate();
  ps.close();
        return r;
  }
     public int ContadorProductos() throws SQLException{
           int cont=0;
           ps= connection.prepareStatement("select * from Producto where Estado='Activo'");
           ResultSet rs=ps.executeQuery();
             while(rs.next()){ 
                 cont=cont+1;
             }
             ps.close();
             rs.close();
             return cont;
  
  }
     
  
     
     
     
}
