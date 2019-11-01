/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
interface ServiceProductoManager extends ServiceProducto{
    public int insertar(Producto producto);
    public int actualizar(Producto producto);
    public int eliminar(int id);
//	    public ArrayList<Producto> consultar();
}
