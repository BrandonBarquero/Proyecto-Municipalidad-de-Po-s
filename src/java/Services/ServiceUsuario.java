/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Producto;
import Entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public interface ServiceUsuario {
    int insertar(Usuario to_usuario);
    String selecionarNombre(String ta_Cedula);
    int contadorAdmins();
    int contadorBodeguero();
    ArrayList<Usuario> listaUsuarios( );
    ArrayList<Usuario> listaUsuariosInactivos( );
    ArrayList<Usuario> listaUsuariosFiltrado(String ta_Cedula);
    int desactivarUsuario(int tn_Cedula);
//    ArrayList<Producto> consultar();
}
