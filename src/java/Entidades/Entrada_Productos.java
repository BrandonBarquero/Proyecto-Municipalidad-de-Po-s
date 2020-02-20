/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author barqu
 */
public class Entrada_Productos {
    
    	private String Codigo_Producto;
	private String Nombre;
	private String Cantidad;
        private String Fecha_Entrada;
        private String Responsable;

    public Entrada_Productos() {
    }

    public Entrada_Productos(String Codigo_Producto, String Nombre, String Cantidad, String Fecha_Entrada, String Responsable) {
        this.Codigo_Producto = Codigo_Producto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Fecha_Entrada = Fecha_Entrada;
        this.Responsable = Responsable;
    }

    public String getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(String Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFecha_Entrada() {
        return Fecha_Entrada;
    }

    public void setFecha_Entrada(String Fecha_Entrada) {
        this.Fecha_Entrada = Fecha_Entrada;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }
        
        

}
