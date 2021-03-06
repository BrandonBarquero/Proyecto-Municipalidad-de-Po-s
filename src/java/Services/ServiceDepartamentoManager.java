/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Departamento;
import java.util.ArrayList;

/**
 *
 * @author Manfred González C
 */
public interface ServiceDepartamentoManager extends ServiceDepartamento {
    
    public int eliminarDepartamento(int tn_idDepartamento);
     public int insertar(String ta_nombre);
     public ArrayList<Departamento> listaDepartamentos( );
     public ArrayList<Departamento> listaDepartamentosFiltrado(String ta_id);
     public int actualizar(Departamento to_departamento);
}
