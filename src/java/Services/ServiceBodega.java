/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Bodega;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
interface ServiceBodega {
    
    int eliminarBodega(int tn_idBodega);
    int insertar(String ta_nombre);
    ArrayList<Bodega> listaBodegas();
    ArrayList<Bodega> listaBodegasFiltrado(String ta_ID);
    int actualizar(Bodega to_bodega);
    
}
