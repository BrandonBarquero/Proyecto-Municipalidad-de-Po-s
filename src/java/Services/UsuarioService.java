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
import java.util.ArrayList;
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
    public int insertar(Usuario to_usuario) {
     
      
        try {
            return usuarioDAO.insertar(to_usuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
        
      
    }
   @Override
    public int actualizar(Usuario to_usuario) {
     
      
     
      
        try {
            return usuarioDAO.actualizar(to_usuario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

       @Override
    public String selecionarNombre(String to_cedula){
         try {
             return usuarioDAO.selecionarNombre(to_cedula);
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return "";
    }
       @Override
    public int contadorAdmins(){
         try {
             return usuarioDAO.contadorAdmins();
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }
       @Override
    public int contadorBodeguero(){
         try {
             return usuarioDAO.contadorBodeguero();
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }
    @Override
    public ArrayList<Usuario> listaUsuarios( ){
        return usuarioDAO.listaUsuarios();
    }
       @Override
    public ArrayList<Usuario> listaUsuariosInactivos( ){
        return usuarioDAO.listaUsuariosInactivos();
    }
       @Override
    public ArrayList<Usuario> listaUsuariosFiltrado(String ta_cedula){
        return usuarioDAO.listaUsuariosFiltrado(ta_cedula);
    }
       @Override
    public int desactivarUsuario(int tn_cedula){
         try {
             return usuarioDAO.desactivarUsuario(tn_cedula);
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }

   
}
