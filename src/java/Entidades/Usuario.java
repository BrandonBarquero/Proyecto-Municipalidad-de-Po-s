/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

public class Usuario {
        private String Cedula;
	private String Nombre;
	private String Correo;
        private String Telefono;
        private String Rol;
        private String Estado;
        private String Contrasena;

    public Usuario() {
    }

    public Usuario(String Cedula, String Nombre, String Correo, String Telefono, String Rol, String Estado, String Contrasena) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Rol = Rol;
        this.Estado = Estado;
        this.Contrasena = Contrasena;
    }
public Usuario(String Cedula, String Nombre, String Correo, String Telefono, String Rol, String Estado ) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Rol = Rol;
        this.Estado = Estado;
    
    }
    public Usuario(String Cedula, String Contrasena) {
        this.Cedula = Cedula;
        this.Contrasena = Contrasena;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
	
	
	
}