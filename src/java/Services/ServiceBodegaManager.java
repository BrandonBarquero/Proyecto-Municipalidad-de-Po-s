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
    
    public int Eliminar_Bodega(int Id_Bodega);
    public int insertar(String nombre);
    public ArrayList<Bodega> listaBodegas();
    public ArrayList<Bodega> listaBodegasFiltrado(String ID );
    public int actualizar(Bodega bodega);
}
