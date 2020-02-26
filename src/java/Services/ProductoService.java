/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.ProductoDAO;
import Entidades.EntradaProductos;
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

    private final ProductoDAO lo_daoProducto;

    public ProductoService() throws Exception {
        this.lo_daoProducto = new ProductoDAO();
    }

   
    @Override
    public int insertar(Producto to_producto) {
     
      
        try {
            return lo_daoProducto.insertar(to_producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
      
    }
    
    @Override
        public ArrayList<Producto> listaProductosSalida( ){
        return lo_daoProducto.listaProductosSalida();
    }
    
 @Override
    public int actualizar(Producto to_producto) {
     
      
     
      
        try {
            return lo_daoProducto.actualizar(to_producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   
        
      
    }
       @Override
    public int eliminar(int tn_id) {
        try {
            return lo_daoProducto.eliminar(tn_id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    @Override  
    public int insertar2(EntradaProductos to_producto){       
        try {      
            return lo_daoProducto.insertar2(to_producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
        @Override
    public ArrayList<Producto> listaProductosActivos( ){
        return lo_daoProducto.listaProductosActivos();
    }
        @Override
    public ArrayList<Producto> listaProductosInactivos( ){
        return lo_daoProducto.listaProductosInactivos();
    }
        @Override
    public int activarProducto(int tn_codigoProducto) {
        try {
            return lo_daoProducto.activarProducto(tn_codigoProducto);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
        @Override
    public int desecharProducto(int tn_codigoProducto){
        try {
            return lo_daoProducto.desecharProducto(tn_codigoProducto);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
        @Override
    public ArrayList<Producto> listaUsuariosFiltrado(String ta_codigoProducto){
        return lo_daoProducto.listaUsuariosFiltrado(ta_codigoProducto);
    }
        @Override
    public int actualizarCantidad(String ta_Cantidad,String ta_codigoProducto){
        try {
            return lo_daoProducto.actualizarCantidad(ta_Cantidad, ta_codigoProducto);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
        @Override
    public int contadorProductos(){
        try {
            return lo_daoProducto.contadorProductos();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
     @Override
    public ArrayList<EntradaProductos> listarEntradaProductos( ){
        return lo_daoProducto.listarEntradaProductos();
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

