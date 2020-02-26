/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

public class Usuario {
        private String pa_Cedula;
	private String pa_Nombre;
	private String pa_Correo;
        private String pa_Telefono;
        private String pa_Rol;
        private String pa_Estado;
        private String pa_Contrasena;

    public Usuario() {
    }

    public Usuario(String ta_Cedula, String ta_Nombre, String ta_Correo, String ta_Telefono, String ta_Rol, String ta_Estado, String ta_Contrasena) {
        this.pa_Cedula = ta_Cedula;
        this.pa_Nombre = ta_Nombre;
        this.pa_Correo = ta_Correo;
        this.pa_Telefono = ta_Telefono;
        this.pa_Rol = ta_Rol;
        this.pa_Estado = ta_Estado;
        this.pa_Contrasena = ta_Contrasena;
    }
    public Usuario(String ta_Cedula, String ta_Nombre, String ta_Correo, String ta_Telefono, String ta_Rol, String ta_Estado ) {
        this.pa_Cedula = ta_Cedula;
        this.pa_Nombre = ta_Nombre;
        this.pa_Correo = ta_Correo;
        this.pa_Telefono = ta_Telefono;
        this.pa_Rol = ta_Rol;
        this.pa_Estado = ta_Estado;
    
    }
    public Usuario(String ta_Cedula, String ta_Contrasena) {
        this.pa_Cedula = ta_Cedula;
        this.pa_Contrasena = ta_Contrasena;
    }

    public String getCedula() {
        return pa_Cedula;
    }

    public void setCedula(String ta_Cedula) {
        this.pa_Cedula = ta_Cedula;
    }

    public String getNombre() {
        return pa_Nombre;
    }

    public void setNombre(String ta_Nombre) {
        this.pa_Nombre = ta_Nombre;
    }

    public String getCorreo() {
        return pa_Correo;
    }

    public void setCorreo(String ta_Correo) {
        this.pa_Correo = ta_Correo;
    }

    public String getTelefono() {
        return pa_Telefono;
    }

    public void setTelefono(String ta_Telefono) {
        this.pa_Telefono = ta_Telefono;
    }

    public String getRol() {
        return pa_Rol;
    }

    public void setRol(String ta_Rol) {
        this.pa_Rol = ta_Rol;
    }

    public String getEstado() {
        return pa_Estado;
    }

    public void setEstado(String ta_Estado) {
        this.pa_Estado = ta_Estado;
    }

    public String getContrasena() {
        return pa_Contrasena;
    }

    public void setContrasena(String ta_Contrasena) {
        this.pa_Contrasena = ta_Contrasena;
    }
	
	
	
}