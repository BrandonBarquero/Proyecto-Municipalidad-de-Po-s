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
interface ServiceBodegaManager extends ServiceBodega{
    
    public int eliminarBodega(int tn_idBodega);
    public int insertar(String ta_nombre);
    public ArrayList<Bodega> listaBodegas();
    public ArrayList<Bodega> listaBodegasFiltrado(String ta_ID);
    public int actualizar(Bodega to_bodega);
}
