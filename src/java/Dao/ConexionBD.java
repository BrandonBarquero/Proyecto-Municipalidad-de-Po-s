/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Allan
 */
public class ConexionBD {
        private Connection pl_conection = null;
 
    public Connection getConnection() throws Exception {
        if (pl_conection == null) {
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 pl_conection= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
        }
        return pl_conection;
    }
    
}
