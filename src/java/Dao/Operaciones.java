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
public class Operaciones {
    String Ic_driver;
    String Ic_url;
    String Ic_usuariobasededatos;
    String Ic_contrasenabasededatos;
    public Operaciones(){
    Ic_driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    Ic_url="jdbc:sqlserver://localhost:1433;databaseName=inventario";
    Ic_usuariobasededatos="test";
    Ic_contrasenabasededatos="root";
    }
    public int loguear(Usuario usuario) throws SQLException{
    Connection conn;
    PreparedStatement pst = null;
    ResultSet rs;
    int cont=0;
    int Ic_nivelautoridad=0;
    String sql="select Rol from Usuario where Cedula=? and Contrasena=? and Estado=?";
    
               
           
    try{
    Class.forName(this.Ic_driver);
    conn=DriverManager.getConnection(this.Ic_url,this.Ic_usuariobasededatos,this.Ic_contrasenabasededatos);
    pst=conn.prepareStatement(sql);
    pst.setString(1, usuario.getUsuario());
    pst.setString(2,usuario.getPassword());
    pst.setString(3,"Activo");
    rs=pst.executeQuery();
    while(rs.next()){
    Ic_nivelautoridad= rs.getInt(1);
    }
    conn.close();
    }catch(ClassNotFoundException |SQLException e){}
    return Ic_nivelautoridad;
    }
    
    
    
}
