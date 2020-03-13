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
interface ServiceUnidad {
    int eliminarUnidad(int tn_idUnidad);
    int insertar(String ta_nombre);
    ArrayList<Unidad> listaUnidad();
    ArrayList<Unidad> listaUnidadFiltrado(String ta_ID);
    int actualizar(Unidad to_unidad);
}
