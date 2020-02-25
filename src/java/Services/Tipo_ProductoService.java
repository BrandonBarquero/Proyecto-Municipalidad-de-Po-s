/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.Tipo_ProductoDAO;
import Entidades.Tipo_Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class Tipo_ProductoService implements ServiceTipo_ProductoManager{
    
    private final Tipo_ProductoDAO daoTipo_producto;

    public Tipo_ProductoService() throws Exception {
        this.daoTipo_producto = new Tipo_ProductoDAO();
    }
    
    public int Eliminar_Tipo_Producto(int Id_Tipo_Producto){
        try {
            return daoTipo_producto.Eliminar_Tipo_Producto(Id_Tipo_Producto);
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
   public  int insertar(String tipo_Producto){
        try {
            return daoTipo_producto.insertar(tipo_Producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tipo_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   }
   public  ArrayList<Tipo_Producto> listaTipo_ProductosFiltrado(String nombre){
       return daoTipo_producto.listaTipo_ProductosFiltrado(nombre);
   }
   
   public  ArrayList<Tipo_Producto> listaTipo_Productos(){
       return daoTipo_producto.listaTipo_Productos();
   }
   
   public int actualizar(Tipo_Producto tipo_Producto){
        try {
            daoTipo_producto.actualizar(tipo_Producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tipo_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   }
}
