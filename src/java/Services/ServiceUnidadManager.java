/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Unidad;
import java.util.ArrayList;

/**
 *
 * @author srami
 */
interface ServiceUnidadManager extends ServiceUnidad{
    public int eliminarUnidad(int tn_idUnidad);
    public int insertar(String ta_nombre);
    public ArrayList<Unidad> listaUnidad();
    public ArrayList<Unidad> listaUnidadFiltrado(String ta_ID);
    public int actualizar(Unidad to_unidad);
}
