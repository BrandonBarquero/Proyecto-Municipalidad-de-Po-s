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
    public int insertar(Usuario to_usuario);
    public int actualizar(Usuario to_usuario);
    public String selecionarNombre(String ta_Cedula);
    public int contadorAdmins();
    public int contadorBodeguero();
    public ArrayList<Usuario> listaUsuarios( );
    public ArrayList<Usuario> listaUsuariosInactivos( );
    public ArrayList<Usuario> listaUsuariosFiltrado(String ta_Cedula);
    public int desactivarUsuario(int tn_Cedula);
}
