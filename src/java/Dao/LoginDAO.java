package Dao;






import Entidades.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allan
 */
public class LoginDAO {
    String lc_driver;
    String lc_url;
    String lc_usuariobasededatos;
    String lc_contrasenabasededatos;
    public LoginDAO(){
    lc_driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    lc_url="jdbc:sqlserver://localhost:1433;databaseName=inventario";
    lc_usuariobasededatos="test";
    lc_contrasenabasededatos="root";
    }
    public int loguear(Usuario usuario) throws SQLException{
    Connection lu_conn;
    PreparedStatement lu_pst = null;
    ResultSet lu_rs;
    int ln_cont=0;
    int ln_nivelautoridad=0;
    String sql="select Rol from Usuario where Cedula=? and Contrasena=? and Estado=?";
    
               
           
    try{
    Class.forName(this.lc_driver);
    lu_conn=DriverManager.getConnection(this.lc_url,this.lc_usuariobasededatos,this.lc_contrasenabasededatos);
    lu_pst=lu_conn.prepareStatement(sql);
    lu_pst.setString(1, usuario.getCedula());
    lu_pst.setString(2,usuario.getContrasena());
    lu_pst.setString(3,"Activo");
    lu_rs=lu_pst.executeQuery();
    while(lu_rs.next()){
    ln_nivelautoridad= lu_rs.getInt(1);
    }
    lu_conn.close();
    }catch(ClassNotFoundException |SQLException e){}
    return ln_nivelautoridad;
    }
    
    
    
}
