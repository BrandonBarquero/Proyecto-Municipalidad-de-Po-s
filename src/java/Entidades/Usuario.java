/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

public class Usuario {
        private String Codigo;
	private String usuario;
	private String password;
        private String rol;
        private String nombre;
        private String fechacreacion;
	
	//Constructor
	public Usuario(){
	}
        	public Usuario(String Codigo,String nombre, String rol, String fechacreacion,String usuario,String password){
		this.Codigo = Codigo;
                 this.usuario = usuario;
		this.password = password;
                this.rol = rol;
                this.nombre = nombre;
                this.fechacreacion = fechacreacion;
	}
	public Usuario(String nombre, String rol, String fechacreacion,String usuario,String password){
		this.usuario = usuario;
		this.password = password;
                this.rol = rol;
                this.nombre = nombre;
                this.fechacreacion = fechacreacion;
	}
public Usuario(String nombre, String rol,String usuario,String password){
		this.usuario = usuario;
		this.password = password;
                this.rol = rol;
                this.nombre = nombre;
                
	}
	public Usuario(String usuario, String password){
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    /**
     * @return the ultimafechalogin
     */
    public String getfechacreacion() {
        return fechacreacion;
    }

    /**
     * @param ultimafechalogin the ultimafechalogin to set
     */
    public void setfechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
	
}