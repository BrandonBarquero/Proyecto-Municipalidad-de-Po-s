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
interface ServiceUsuarioManager extends ServiceUsuario{
    public int insertar(Usuario usuario);
    public int actualizar(Usuario usuario);
    public int eliminar(int id);
//	    public ArrayList<Producto> consultar();
}
