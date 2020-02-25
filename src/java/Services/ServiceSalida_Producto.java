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
 interface ServiceSalida_Producto {
    
    ArrayList<Salida_Producto> listaSalida_Productos( );
    int insertar(Salida_Producto dalida_producto);
}
