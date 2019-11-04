/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class ConexionBD {
    private Connection pu_conection = null;
 
    public Connection getConnection() throws Exception {
        if (pu_conection == null) {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conection= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
        }
        return pu_conection;
    }
}
