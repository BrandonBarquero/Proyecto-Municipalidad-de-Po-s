/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Devoluciones;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
 interface ServiceDevoluciones {
    
     int insertar(Devoluciones to_devoluciones);
     ArrayList<Devoluciones> listaDevoluciones( );
}
