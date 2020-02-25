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
    
     int Eliminar_Departamento(int IdDepartamento);
      int insertar(String nombre);
      int actualizar(Departamento departamento);
      ArrayList<Departamento> listaDepartamentos( );
      ArrayList<Departamento> listaDepartamentosFiltrado( String id);
      
}
