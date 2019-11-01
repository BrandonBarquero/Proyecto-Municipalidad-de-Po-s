/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Producto;
import Entidades.Usuario;

/**
 *
 * @author Allan
 */
public interface ServiceUsuario {
    int insertar(Usuario usuario);
    int eliminar(int id);
    int actualizar(Usuario usuario);
//    ArrayList<Producto> consultar();
}
