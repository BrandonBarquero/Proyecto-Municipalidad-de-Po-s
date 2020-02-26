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
 interface ServiceDepartamento {
    
     int eliminarDepartamento(int tn_idDepartamento);
      int insertar(String ta_nombre);
      int actualizar(Departamento to_departamento);
      ArrayList<Departamento> listaDepartamentos( );
      ArrayList<Departamento> listaDepartamentosFiltrado(String ta_id);
      
}
