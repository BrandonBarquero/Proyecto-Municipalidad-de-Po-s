/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Devoluciones;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Allan
 */
public class DevolucionesDAO {
     private final Connection connection;
      PreparedStatement ps=null;
     
     
     
     public DevolucionesDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();
    } 
     
       public int insertar(Devoluciones devoluciones) throws ClassNotFoundException, SQLException  {
       
                ps= connection.prepareStatement("insert into Devoluciones(Fecha_Devolucion,Motivo,Cantidad,Responsable,Codigo_Producto,Departamento)values(?,?,?,?,?,?)");

                ps.setString(1,devoluciones.getFecha_Devolucion());
                ps.setString(2,devoluciones.getMotivo());
                ps.setInt(3,devoluciones.getCantidad());
                ps.setString(4,devoluciones.getResponsable());
                ps.setString(5,devoluciones.getCodigo_Producto());
                ps.setString(6,devoluciones.getDepartamento());
                
                
               int r=ps.executeUpdate();
                ps.close(); 
      
                return r;
   }
}
