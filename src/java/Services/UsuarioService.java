/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.UsuarioDAO;
import Entidades.Producto;
import Entidades.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class UsuarioService implements ServiceUsuarioManager{
     private final UsuarioDAO usuarioDAO;

    public UsuarioService() throws Exception {
        this.usuarioDAO = new UsuarioDAO();
    }

   
    @Override
    public int insertar(Usuario usuario) {
     
      
        try {
            return usuarioDAO.insertar(usuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
      
    }
   @Override
    public int actualizar(Usuario usuario) {
     
      
     
      
        try {
            return usuarioDAO.actualizar(usuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
   
        
      
    }
   
    public int eliminar(int id) {
        try {
            return usuarioDAO.eliminar(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
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
