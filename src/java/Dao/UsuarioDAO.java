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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class UsuarioDAO {
    int r=0;
    PreparedStatement ps= null;
    private final Connection connection;
    Usuario usuario = new Usuario();
    ResultSet resultSet = null;
    public UsuarioDAO() throws Exception {
        this.connection = new ConexionBD().getConnection();

    }
   public int insertar(Usuario usuario) throws ClassNotFoundException, SQLException  {
       
                ps= connection.prepareStatement("insert into Usuario(Cedula,Nombre,Correo,Telefono,Rol,Estado,Contrasena)values(?,?,?,?,?,?,?)");

                ps.setString(1,usuario.getCedula());
                ps.setString(2,usuario.getNombre());
                ps.setString(3,usuario.getCorreo());
                ps.setString(4,usuario.getTelefono());
                ps.setString(5,usuario.getRol());
                ps.setString(6,usuario.getEstado());
                ps.setString(7,usuario.getContrasena());
                
                r=ps.executeUpdate();
                ps.close(); 
      
                return r;
   }
  public int actualizar(Usuario usuario) throws ClassNotFoundException, SQLException  {
          
            
                ps= connection.prepareStatement("update Usuario set Nombre='"+usuario.getNombre()+"' "
                        + ",Correo='"+usuario.getCorreo()+"'"
                                + " ,Telefono='"+usuario.getTelefono()+"' "
                                        + ",Rol='"+usuario.getRol()+"'"
                                                + ",Estado='"+usuario.getEstado()+"'  "
                                                        + "where Cedula='"+usuario.getCedula()+"'");
            r= ps.executeUpdate();
            ps.close();
   return r;
  }
  
  public String SelecionarNombre(String Cedula) throws SQLException{
           String nombre1=null;
           
             ps= connection.prepareStatement("select Nombre from Usuario where Cedula='"+Cedula+"'");

           ResultSet rs=ps.executeQuery();
          while(rs.next()){ 
           nombre1=  rs.getString("Nombre");
          }ps.close();
          return nombre1;

}
  
  
  public int ContadorAdmins() throws SQLException{
           int cont=0;
          
           ps= connection.prepareStatement("select * from Usuario where Rol='1' and Estado='Activo'");
           ResultSet rs=ps.executeQuery();
             while(rs.next()){ 
                 cont=cont+1;
             }ps.close();
             return cont;
  
  }
  public int ContadorBodeguero() throws SQLException{
           int cont=0;
           
           ps= connection.prepareStatement("select * from Usuario where Rol='2' and Estado='Activo'");
           ResultSet rs=ps.executeQuery();
             while(rs.next()){ 
                 cont=cont+1;
             }ps.close();
             return cont;
  
  }
  
  public ArrayList<Usuario> listaUsuarios( ) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
           
            ps=connection.prepareStatement("select * from Usuario where Estado='Activo'");

             resultSet = ps.executeQuery();
            while (resultSet.next()) {
                usuario.setCedula(resultSet.getString("Cedula"));
                usuario.setContrasena(resultSet.getString("Contrasena"));
                usuario.setNombre(resultSet.getString("Nombre"));
                usuario.setCorreo(resultSet.getString("Correo"));
                usuario.setRol(resultSet.getString("Rol"));
                usuario.setTelefono(resultSet.getString("Telefono"));
                usuario.setEstado(resultSet.getString("Estado"));
                usuarios.add(usuario);
            }
            ps.close();
            resultSet.close();
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
  
    public ArrayList<Usuario> listaUsuariosInactivos( ) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
          
            ps=connection.prepareStatement("select * from Usuario where Estado='Inactivo'");
             resultSet = ps.executeQuery();
            while (resultSet.next()) {
                usuario.setCedula(resultSet.getString("Cedula"));
                usuario.setContrasena(resultSet.getString("Contrasena"));
                usuario.setNombre(resultSet.getString("Nombre"));
                usuario.setCorreo(resultSet.getString("Correo"));
                usuario.setRol(resultSet.getString("Rol"));
                usuario.setTelefono(resultSet.getString("Telefono"));
                usuario.setEstado(resultSet.getString("Estado"));
                usuarios.add(usuario);
            }ps.close();
            resultSet.close();
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
  public ArrayList<Usuario> listaUsuariosFiltrado(String Cedula) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            
            ps=connection.prepareStatement("select * from Usuario where Cedula="+Cedula);

             resultSet = ps.executeQuery();
            while (resultSet.next()) {
               
                usuario.setCedula(resultSet.getString("Cedula"));
                usuario.setContrasena(resultSet.getString("Contrasena"));
                usuario.setNombre(resultSet.getString("Nombre"));
                usuario.setCorreo(resultSet.getString("Correo"));
                usuario.setRol(resultSet.getString("Rol"));
                usuario.setTelefono(resultSet.getString("Telefono"));
                usuario.setEstado(resultSet.getString("Estado"));
                usuarios.add(usuario);
            }ps.close();
            resultSet.close();
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
   public int Desactivar_Usuario(int Cedula) throws SQLException{

  ps= connection.prepareStatement("update Usuario set Estado='Inactivo' where Cedula="+Cedula+"");
  int r=ps.executeUpdate();
  ps.close();
        return r;
  }
}

