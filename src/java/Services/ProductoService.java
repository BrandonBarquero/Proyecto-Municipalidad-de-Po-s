/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.ProductoDAO;
import Entidades.Entrada_Productos;
import Entidades.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */


public class ProductoService implements ServiceProductoManager {

    private final ProductoDAO daoProducto;

    public ProductoService() throws Exception {
        this.daoProducto = new ProductoDAO();
    }

   
    @Override
    public int insertar(Producto producto) {
     
      
        try {
            return daoProducto.insertar(producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
      
    }
 @Override
    public int actualizar(Producto producto) {
     
      
     
      
        try {
            return daoProducto.actualizar(producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   
        
      
    }
       @Override
    public int eliminar(int id) {
        try {
            return daoProducto.eliminar(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    @Override  
    public int insertar2(Entrada_Productos producto){       
        try {      
            return daoProducto.insertar2(producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
        @Override
    public ArrayList<Producto> listaProductosActivos( ){
        return daoProducto.listaProductosActivos();
    }
        @Override
    public ArrayList<Producto> listaProductosInactivos( ){
        return daoProducto.listaProductosInactivos();
    }
        @Override
    public int Activar_Producto(int Codigo_Producto) {
        try {
            return daoProducto.Activar_Producto(Codigo_Producto);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
        @Override
    public int Desechar_Producto(int Codigo_Producto){
        try {
            return daoProducto.Desechar_Producto(Codigo_Producto);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
        @Override
    public ArrayList<Producto> listaUsuariosFiltrado(String Codigo_Producto){
        return daoProducto.listaUsuariosFiltrado(Codigo_Producto);
    }
        @Override
    public int Actualizar_Cantidad(String Cantidad,String Codigo_Producto){
        try {
            return daoProducto.Actualizar_Cantidad(Cantidad, Codigo_Producto);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
        @Override
    public int ContadorProductos(){
        try {
            return daoProducto.ContadorProductos();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
//
//    public boolean actualizar(Producto producto) {
//        return daoProducto.actualizar(producto);
//    }
//
//    public ArrayList<Producto> consultar() {
//        return daoProducto.listaProductos();
//    }

}

