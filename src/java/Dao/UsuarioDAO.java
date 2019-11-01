/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Producto;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Allan
 */
public class UsuarioDAO {
       int r = 0;
    int r2 = 0;
    int r3 = 0;
      private final Connection connection;

    public UsuarioDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();
    }
   public int insertar(Usuario usuario) throws ClassNotFoundException, SQLException  {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
            
                PreparedStatement ps= con.prepareStatement("insert into Usuario(Nombre,Fecha_Creacion,Rol,Usuario_Login,Contrasena)values(?,?,?,?,?)");

              
                
              
                ps.setString(1,usuario.getNombre());
                ps.setString(2,usuario.getfechacreacion());
                ps.setString(3,usuario.getRol());
                ps.setString(4,usuario.getUsuario());
                ps.setString(5,usuario.getPassword());
                
                
                r=ps.executeUpdate();

      
                return r;
}
 public int eliminar(int id) throws ClassNotFoundException, SQLException  {
 
 
 
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
         PreparedStatement ps;
       
         
         ps=con.prepareStatement("delete from Usuario where Codigo= ?");
           ps.setInt(1, id);
         
        r2=ps.executeUpdate();
        return r2;
 
 
 
 
 
 
 }
  public int actualizar(Usuario usuario) throws ClassNotFoundException, SQLException  {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Inge","test","root");
         PreparedStatement ps;
  
                ps= con.prepareStatement("update Usuario set Nombre='?' ,Fecha_Creacion='?' ,Rol='?' ,Usuario_Login='?',Contrasena='?'  where Codigo= ?");
                ps.setString(1,usuario.getNombre());
                ps.setString(2,usuario.getfechacreacion());
                ps.setString(3,usuario.getRol());
                ps.setString(4,usuario.getUsuario());
                ps.setString(5,usuario.getPassword());
               ps.setString(5,usuario.getCodigo());
                
            r3= ps.executeUpdate();
   return r3;
  }

}

