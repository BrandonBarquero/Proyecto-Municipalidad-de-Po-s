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
    int insertar(Usuario usuario);
    String SelecionarNombre(String Cedula);
    int ContadorAdmins();
    int ContadorBodeguero();
    ArrayList<Usuario> listaUsuarios( );
    ArrayList<Usuario> listaUsuariosInactivos( );
    ArrayList<Usuario> listaUsuariosFiltrado(String Cedula);
    int Desactivar_Usuario(int Cedula);
//    ArrayList<Producto> consultar();
}
