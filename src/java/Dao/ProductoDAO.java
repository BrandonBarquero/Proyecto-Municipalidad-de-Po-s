/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Devoluciones;
import Entidades.EntradaProductos;
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
    private final Connection pl_connection;
    
    int ln_r;
    


    public ProductoDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();

    }
   public int insertar(Producto to_producto) throws ClassNotFoundException, SQLException  {
            PreparedStatement ll_ps=null;   
        ll_ps = pl_connection.prepareStatement("insert into producto(Codigo_Presupuestario,"
                    + "Nombre,Unidad,Descripcion,Precio,Cantidad,Estado,Marca,Fecha_Entrada,Ubicacion"
                    + ",Tipo_Producto,Garantia,Proveedor)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

                
                ll_ps.setString(1,to_producto.getCodigoPresupuestario());
                ll_ps.setString(2,to_producto.getNombre());
                ll_ps.setString(3,to_producto.getUnidad());
                ll_ps.setString(4,to_producto.getDescripcion());
                ll_ps.setString(5,to_producto.getPrecio());           
                ll_ps.setString(6,to_producto.getCantidad());
                ll_ps.setString(7,"Activo");
                ll_ps.setString(8,to_producto.getMarca());
                ll_ps.setString(9,to_producto.getFechaEntrada());
                ll_ps.setString(10,to_producto.getUbicacion());
                ll_ps.setString(11,to_producto.getTipoProducto());
                ll_ps.setString(12,to_producto.getGarantia());
                ll_ps.setString(13,to_producto.getProveedor());
                ln_r=ll_ps.executeUpdate();
                ll_ps.close();
      
                return ln_r;
}
   
 
 public int eliminar(int tn_id) throws ClassNotFoundException, SQLException  {
 PreparedStatement ll_ps=null;
         ll_ps=pl_connection.prepareStatement("delete from producto where Codigo_Producto= ?");
         ll_ps.setInt(1, tn_id);
         
        ln_r=ll_ps.executeUpdate();
        ll_ps.close();
        return ln_r;
 }
  public int actualizar(Producto to_producto) throws ClassNotFoundException, SQLException  {
  PreparedStatement ll_ps=null;
                ll_ps = pl_connection.prepareStatement("update producto set "
                        + "Codigo_Presupuestario='"+to_producto.getCodigoPresupuestario()+"' "
                        + ",Nombre='"+to_producto.getNombre()+"' "
                        + ",Unidad='"+to_producto.getUnidad()+"' "
                        + ",Descripcion='"+to_producto.getDescripcion()+"'"
                        + ",Precio='"+to_producto.getPrecio()+"'  "    
                        + ",Marca='"+to_producto.getMarca()+"'  "
                        + ",Ubicacion='"+to_producto.getUbicacion()+"'  "
                        + ",Tipo_Producto='"+to_producto.getTipoProducto()+"'  "
                        + ",Garantia='"+to_producto.getGarantia()+"'  "
                        + ",Proveedor='"+to_producto.getProveedor()+"'  "
                        + "where Codigo_Producto= "+to_producto.getCodigoProducto()+"");            
             
            ln_r= ll_ps.executeUpdate();
            ll_ps.close();
   return ln_r;
  }
         ResultSet ll_resultSet = null;
          PreparedStatement ll_ps=null;
          
      public ArrayList<EntradaProductos> listarEntradaProductos( ) {
        ArrayList<EntradaProductos> entrada = new ArrayList<EntradaProductos>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from Entrada_Producto");
             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                EntradaProductos lo_entradas = new EntradaProductos();
                lo_entradas.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_entradas.setNombre(ll_resultSet.getString("nombre"));
                lo_entradas.setCantidad(ll_resultSet.getString("Cantidad"));
                lo_entradas.setFechaEntrada(ll_resultSet.getString("Fecha"));
                lo_entradas.setResponsable(ll_resultSet.getString("Responsable"));
                entrada.add(lo_entradas);
            }ll_ps.close();
            ll_resultSet.close();
            return entrada;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
  
  
  public ArrayList<Producto> listaProductosActivos( ) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {PreparedStatement ll_ps=null;
            ll_ps=pl_connection.prepareStatement("select * from producto where Estado='Activo'");
                   ResultSet ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Producto lo_producto = new Producto();
                lo_producto.setCodigoPresupuestario(ll_resultSet.getString("Codigo_Presupuestario"));
                lo_producto.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_producto.setNombre(ll_resultSet.getString("Nombre"));
                lo_producto.setUnidad(ll_resultSet.getString("Unidad"));
                lo_producto.setDescripcion(ll_resultSet.getString("Descripcion"));
                lo_producto.setPrecio(ll_resultSet.getString("Precio"));
                lo_producto.setCantidad(ll_resultSet.getString("Cantidad"));
                lo_producto.setMarca(ll_resultSet.getString("Marca"));
                lo_producto.setFechaEntrada(ll_resultSet.getString("Fecha_Entrada"));
                lo_producto.setUbicacion(ll_resultSet.getString("Ubicacion"));
                lo_producto.setTipoProducto(ll_resultSet.getString("Tipo_Producto"));
                lo_producto.setGarantia(ll_resultSet.getString("Garantia"));
                lo_producto.setProveedor(ll_resultSet.getString("Proveedor"));
                productos.add(lo_producto);
            }
            ll_ps.close();
            ll_resultSet.close();
            return productos;
        } catch (SQLException ex) {
            return null;
        }

    }
  
  public ArrayList<Producto> listaProductosInactivos( ) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {PreparedStatement ll_ps=null;
            ll_ps=pl_connection.prepareStatement("select * from producto where Estado='Desecho' and Cantidad != '0'");
            ResultSet ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Producto lo_producto = new Producto();
                lo_producto.setCodigoPresupuestario(ll_resultSet.getString("Codigo_Presupuestario"));
                lo_producto.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_producto.setNombre(ll_resultSet.getString("Nombre"));
                lo_producto.setUnidad(ll_resultSet.getString("Unidad"));
                lo_producto.setDescripcion(ll_resultSet.getString("Descripcion"));
                lo_producto.setPrecio(ll_resultSet.getString("Precio"));
                lo_producto.setCantidad(ll_resultSet.getString("Cantidad"));
                lo_producto.setMarca(ll_resultSet.getString("Marca"));
                lo_producto.setFechaEntrada(ll_resultSet.getString("Fecha_Entrada"));
                lo_producto.setUbicacion(ll_resultSet.getString("Ubicacion"));
                lo_producto.setTipoProducto(ll_resultSet.getString("Tipo_Producto"));
                lo_producto.setGarantia(ll_resultSet.getString("Garantia"));
                lo_producto.setProveedor(ll_resultSet.getString("Proveedor"));
                productos.add(lo_producto);
            }
            ll_ps.close();
            ll_resultSet.close();
            return productos;
        } catch (SQLException ex) {
            return null;
        }

    }
  
   public ArrayList<Producto> listaProductosSalida( ) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {PreparedStatement ll_ps=null;
            ll_ps=pl_connection.prepareStatement("select * from producto where Estado='Activo' and Cantidad = '0'");
            ResultSet ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Producto lo_producto = new Producto();
                lo_producto.setCodigoPresupuestario(ll_resultSet.getString("Codigo_Presupuestario"));
                lo_producto.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_producto.setNombre(ll_resultSet.getString("Nombre"));
                lo_producto.setUnidad(ll_resultSet.getString("Unidad"));
                lo_producto.setDescripcion(ll_resultSet.getString("Descripcion"));
                lo_producto.setPrecio(ll_resultSet.getString("Precio"));
                lo_producto.setCantidad(ll_resultSet.getString("Cantidad"));
                lo_producto.setMarca(ll_resultSet.getString("Marca"));
                lo_producto.setFechaEntrada(ll_resultSet.getString("Fecha_Entrada"));
                lo_producto.setUbicacion(ll_resultSet.getString("Ubicacion"));
                lo_producto.setTipoProducto(ll_resultSet.getString("Tipo_Producto"));
                lo_producto.setGarantia(ll_resultSet.getString("Garantia"));
                lo_producto.setProveedor(ll_resultSet.getString("Proveedor"));
                productos.add(lo_producto);
            }
            ll_ps.close();
            ll_resultSet.close();
            return productos;
        } catch (SQLException ex) {
            return null;
        }

    }
  
  public int activarProducto(int tn_codigoProducto) throws SQLException{PreparedStatement ll_ps=null;
  ll_ps= pl_connection.prepareStatement("update producto set Estado='Activo' where Codigo_Producto="+tn_codigoProducto+"");
   ln_r=ll_ps.executeUpdate();
  ll_ps.close();
        return ln_r;
  }
   public int desecharProducto(int tn_codigoProducto) throws SQLException{PreparedStatement ll_ps=null;
   ll_ps= pl_connection.prepareStatement("update producto set Estado='Desecho' where Codigo_Producto="+tn_codigoProducto+"");
   ln_r=ll_ps.executeUpdate();
        return ln_r;
  }
  public ArrayList<Producto> listaUsuariosFiltrado(String ta_codigoProducto) {PreparedStatement ll_ps=null;
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            ll_ps=pl_connection.prepareStatement("select * from producto where Codigo_Producto="+ta_codigoProducto);

            ResultSet ll_resultSet = ll_ps.executeQuery();
             while (ll_resultSet.next()) {
                Producto lo_producto = new Producto();
                lo_producto.setCodigoPresupuestario(ll_resultSet.getString("Codigo_Presupuestario"));
                lo_producto.setCodigoProducto(ll_resultSet.getString("Codigo_Producto"));
                lo_producto.setNombre(ll_resultSet.getString("Nombre"));
                lo_producto.setUnidad(ll_resultSet.getString("Unidad"));
                lo_producto.setDescripcion(ll_resultSet.getString("Descripcion"));
                lo_producto.setPrecio(ll_resultSet.getString("Precio"));
                lo_producto.setCantidad(ll_resultSet.getString("Cantidad"));
                lo_producto.setMarca(ll_resultSet.getString("Marca"));
                lo_producto.setFechaEntrada(ll_resultSet.getString("Fecha_Entrada"));
                lo_producto.setUbicacion(ll_resultSet.getString("Ubicacion"));
                lo_producto.setTipoProducto(ll_resultSet.getString("Tipo_Producto"));
                lo_producto.setGarantia(ll_resultSet.getString("Garantia"));
                lo_producto.setProveedor(ll_resultSet.getString("Proveedor"));
                productos.add(lo_producto);
            }
             ll_ps.close();
             ll_resultSet.close();
            return productos;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
   public int actualizarCantidad(String ta_Cantidad,String ta_codigoProducto) throws SQLException{PreparedStatement ll_ps=null;
    ll_ps= pl_connection.prepareStatement("update producto set Cantidad="+ta_Cantidad+"where Codigo_Producto="+ta_codigoProducto+"");
    ln_r=ll_ps.executeUpdate();
    ll_ps.close();
        return ln_r;
  }
     public int contadorProductos() throws SQLException{PreparedStatement ll_ps=null;
           int ln_cont=0;
           ll_ps= pl_connection.prepareStatement("select * from Producto where Estado='Activo'");
           ResultSet ll_resultSet=ll_ps.executeQuery();
             while(ll_resultSet.next()){ 
                 ln_cont=ln_cont+1;
             }
             ll_ps.close();
             ll_resultSet.close();
             return ln_cont;
  
  }

  
     
  
     
     public int insertar2(EntradaProductos to_producto2) throws ClassNotFoundException, SQLException  {
            PreparedStatement ll_ps=null;   
        ll_ps= pl_connection.prepareStatement("insert into Entrada_Producto(Codigo_Producto,"
                    + "nombre,Cantidad,Fecha,Responsable)values(?,?,?,?,?)");

                
                ll_ps.setString(1,to_producto2.getCodigoProducto());
                ll_ps.setString(2,to_producto2.getNombre());
                ll_ps.setString(3,to_producto2.getCantidad());
                ll_ps.setString(4,to_producto2.getFechaEntrada());
                ll_ps.setString(5,to_producto2.getResponsable());           
                ln_r=ll_ps.executeUpdate();
                ll_ps.close();
      
                return ln_r;
}
     
}
