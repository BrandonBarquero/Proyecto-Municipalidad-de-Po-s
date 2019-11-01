/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



public class Producto{
	
	private String nombre;
	private String descripcion;
	private String precio;
	private String cantidad;
	private String tipo;
	private String imagen;

    public Producto ( String nombre, String descripcion,String precio,String cantidad,String tipo,String imagen) {
    	this.tipo = tipo;
    	this.nombre = nombre;
    	this.descripcion=descripcion;
    	this.precio=precio;
    	this.cantidad=cantidad;
    	this.imagen=imagen;
    }

    public Producto () {
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

  
	public String gettipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad= cantidad;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getimagen() {
		return imagen;
	}

	public void setimagen(String imagen) {
		this.imagen = imagen;
	}

	
}