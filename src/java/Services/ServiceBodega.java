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
    
    int Eliminar_Bodega(int Id_Bodega);
    int insertar(String nombre);
    ArrayList<Bodega> listaBodegas();
    ArrayList<Bodega> listaBodegasFiltrado(String ID );
    int actualizar(Bodega bodega);
    
}
