/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Usuario;

/**
 *
 * @author Allan
 */
interface ServiceLogin {
    public int validarLogin(Usuario to_usuario);
}
