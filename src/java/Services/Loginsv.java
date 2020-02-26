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
       private final LoginDAO pu_operaciones;

    public Loginsv() throws Exception {
        this.pu_operaciones = new LoginDAO();
    }

       @Override
    public int validarLogin(Usuario po_usuario) {
           try {
               return pu_operaciones.loguear(po_usuario);
           } catch (SQLException ex) {
               Logger.getLogger(Loginsv.class.getName()).log(Level.SEVERE, null, ex);
           }
           return 0;
    }

    
}
