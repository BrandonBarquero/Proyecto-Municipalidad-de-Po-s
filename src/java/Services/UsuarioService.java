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

       @Override
    public String SelecionarNombre(String Cedula){
         try {
             return usuarioDAO.SelecionarNombre(Cedula);
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return "";
    }
       @Override
    public int ContadorAdmins(){
         try {
             return usuarioDAO.ContadorAdmins();
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }
       @Override
    public int ContadorBodeguero(){
         try {
             return usuarioDAO.ContadorBodeguero();
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
    public ArrayList<Usuario> listaUsuariosFiltrado(String Cedula){
        return usuarioDAO.listaUsuariosFiltrado(Cedula);
    }
       @Override
    public int Desactivar_Usuario(int Cedula){
         try {
             return usuarioDAO.Desactivar_Usuario(Cedula);
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, null, ex);
         }
         return 0;
    }



    

   
}
