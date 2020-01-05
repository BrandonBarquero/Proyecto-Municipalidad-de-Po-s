/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Dao.LoginDAO;
import Entidades.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class Loginsv implements ServiceLoginManager{
       private final LoginDAO operaciones;

    public Loginsv() throws Exception {
        this.operaciones = new LoginDAO();
    }

       @Override
    public int validarLogin(Usuario usuario) {
           try {
               return operaciones.loguear(usuario);
           } catch (SQLException ex) {
               Logger.getLogger(Loginsv.class.getName()).log(Level.SEVERE, null, ex);
           }
           return 0;
    }

    
}
