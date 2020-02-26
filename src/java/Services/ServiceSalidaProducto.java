/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.SalidaProducto;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
 interface ServiceSalidaProducto {
    
    ArrayList<SalidaProducto> listaSalidaProductos( );
    int insertar(SalidaProducto to_salidaProducto);
}
