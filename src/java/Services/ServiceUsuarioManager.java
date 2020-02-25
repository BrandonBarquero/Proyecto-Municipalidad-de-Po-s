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
interface ServiceUsuarioManager extends ServiceUsuario{
    public int insertar(Usuario usuario);
    public int actualizar(Usuario usuario);
    public String SelecionarNombre(String Cedula);
    public int ContadorAdmins();
    public int ContadorBodeguero();
    public ArrayList<Usuario> listaUsuarios( );
    public ArrayList<Usuario> listaUsuariosInactivos( );
    public ArrayList<Usuario> listaUsuariosFiltrado(String Cedula);
    public int Desactivar_Usuario(int Cedula);
}
