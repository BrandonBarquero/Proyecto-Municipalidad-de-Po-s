/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.Salida_ProductoDAO;
import Entidades.Salida_Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manfred González C
 */
public class Salida_ProductoService implements ServiceSalida_ProductoManager{
    
    private final Salida_ProductoDAO daoSalida_producto;

   public Salida_ProductoService() throws Exception {
        this.daoSalida_producto = new Salida_ProductoDAO();
    }
    
    public ArrayList<Salida_Producto> listaSalida_Productos( ){
        return daoSalida_producto.listaSalida_Productos();
    }
    public int insertar(Salida_Producto dalida_producto){
        try {
            return daoSalida_producto.insertar(dalida_producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Salida_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Salida_ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
