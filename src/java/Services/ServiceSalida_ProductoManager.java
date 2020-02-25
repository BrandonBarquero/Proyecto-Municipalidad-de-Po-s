/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Salida_Producto;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
public interface ServiceSalida_ProductoManager extends ServiceSalida_Producto{
    
    public ArrayList<Salida_Producto> listaSalida_Productos( );
    public int insertar(Salida_Producto dalida_producto);
}
