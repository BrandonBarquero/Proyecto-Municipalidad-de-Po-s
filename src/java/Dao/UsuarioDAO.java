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
    int ln_r=0;
    PreparedStatement ll_ps= null;
    private final Connection pl_connection;
   
    ResultSet ll_resultSet = null;
    public UsuarioDAO() throws Exception {
        this.pl_connection = new ConexionBD().getConnection();

    }
   public int insertar(Usuario to_usuario) throws ClassNotFoundException, SQLException  {
       
                ll_ps= pl_connection.prepareStatement("insert into Usuario(Cedula,Nombre,Correo,Telefono,Rol,Estado,Contrasena)values(?,?,?,?,?,?,?)");

                ll_ps.setString(1,to_usuario.getCedula());
                ll_ps.setString(2,to_usuario.getNombre());
                ll_ps.setString(3,to_usuario.getCorreo());
                ll_ps.setString(4,to_usuario.getTelefono());
                ll_ps.setString(5,to_usuario.getRol());
                ll_ps.setString(6,to_usuario.getEstado());
                ll_ps.setString(7,to_usuario.getContrasena());
                
                ln_r=ll_ps.executeUpdate();
                ll_ps.close(); 
      
                return ln_r;
   }
  public int actualizar(Usuario to_usuario) throws ClassNotFoundException, SQLException  {
          
            
                ll_ps= pl_connection.prepareStatement("update Usuario set Nombre='"+to_usuario.getNombre()+"' "
                        + ",Correo='"+to_usuario.getCorreo()+"'"
                                + " ,Telefono='"+to_usuario.getTelefono()+"' "
                                        + ",Rol='"+to_usuario.getRol()+"'"
                                                + ",Estado='"+to_usuario.getEstado()+"'  "
                                                        + "where Cedula='"+to_usuario.getCedula()+"'");
            ln_r= ll_ps.executeUpdate();
            ll_ps.close();
   return ln_r;
  }
  
  public String selecionarNombre(String ta_Cedula) throws SQLException{
           String la_nombre1=null;
           
             ll_ps= pl_connection.prepareStatement("select Nombre from Usuario where Cedula='"+ta_Cedula+"'");

           ResultSet ll_rs=ll_ps.executeQuery();
          while(ll_rs.next()){ 
           la_nombre1=  ll_rs.getString("Nombre");
          }ll_ps.close();
          return la_nombre1;

}
  
  
  public int contadorAdmins() throws SQLException{
           int ln_cont=0;
          
           ll_ps= pl_connection.prepareStatement("select * from Usuario where Rol='1' and Estado='Activo'");
           ResultSet ll_rs=ll_ps.executeQuery();
             while(ll_rs.next()){ 
                 ln_cont=ln_cont+1;
             }ll_ps.close();
             return ln_cont;
  
  }
  public int contadorBodeguero() throws SQLException{
           int ln_cont=0;
           
           ll_ps= pl_connection.prepareStatement("select * from Usuario where Rol='2' and Estado='Activo'");
           ResultSet ll_rs=ll_ps.executeQuery();
             while(ll_rs.next()){ 
                 ln_cont=ln_cont+1;
             }ll_ps.close();
             return ln_cont;
  
  }
  
  public ArrayList<Usuario> listaUsuarios( ) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
           
            ll_ps=pl_connection.prepareStatement("select * from Usuario where Estado='Activo'");

             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Usuario lo_usuario = new Usuario();
                lo_usuario.setCedula(ll_resultSet.getString("Cedula"));
                lo_usuario.setContrasena(ll_resultSet.getString("Contrasena"));
                lo_usuario.setNombre(ll_resultSet.getString("Nombre"));
                lo_usuario.setCorreo(ll_resultSet.getString("Correo"));
                lo_usuario.setRol(ll_resultSet.getString("Rol"));
                lo_usuario.setTelefono(ll_resultSet.getString("Telefono"));
                lo_usuario.setEstado(ll_resultSet.getString("Estado"));
                usuarios.add(lo_usuario);
            }
            ll_ps.close();
            ll_resultSet.close();
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
  
    public ArrayList<Usuario> listaUsuariosInactivos( ) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
          
            ll_ps=pl_connection.prepareStatement("select * from Usuario where Estado='Inactivo'");
             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Usuario lo_usuario = new Usuario();
                lo_usuario.setCedula(ll_resultSet.getString("Cedula"));
                lo_usuario.setContrasena(ll_resultSet.getString("Contrasena"));
                lo_usuario.setNombre(ll_resultSet.getString("Nombre"));
                lo_usuario.setCorreo(ll_resultSet.getString("Correo"));
                lo_usuario.setRol(ll_resultSet.getString("Rol"));
                lo_usuario.setTelefono(ll_resultSet.getString("Telefono"));
                lo_usuario.setEstado(ll_resultSet.getString("Estado"));
                usuarios.add(lo_usuario);
            }ll_ps.close();
            ll_resultSet.close();
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
  public ArrayList<Usuario> listaUsuariosFiltrado(String ta_Cedula) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            
            ll_ps=pl_connection.prepareStatement("select * from Usuario where Cedula="+ta_Cedula);

             ll_resultSet = ll_ps.executeQuery();
            while (ll_resultSet.next()) {
                Usuario lo_usuario = new Usuario();
                lo_usuario.setCedula(ll_resultSet.getString("Cedula"));
                lo_usuario.setContrasena(ll_resultSet.getString("Contrasena"));
                lo_usuario.setNombre(ll_resultSet.getString("Nombre"));
                lo_usuario.setCorreo(ll_resultSet.getString("Correo"));
                lo_usuario.setRol(ll_resultSet.getString("Rol"));
                lo_usuario.setTelefono(ll_resultSet.getString("Telefono"));
                lo_usuario.setEstado(ll_resultSet.getString("Estado"));
                usuarios.add(lo_usuario);
            }ll_ps.close();
            ll_resultSet.close();
            return usuarios;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }
   public int desactivarUsuario(int tn_Cedula) throws SQLException{

  ll_ps= pl_connection.prepareStatement("update Usuario set Estado='Inactivo' where Cedula="+tn_Cedula+"");
  int ln_r=ll_ps.executeUpdate();
  ll_ps.close();
        return ln_r;
  }
}

