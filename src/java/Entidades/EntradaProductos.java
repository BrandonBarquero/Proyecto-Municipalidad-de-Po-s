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
public class EntradaProductos {
    
    	private String pa_codigoProducto;
	private String pa_Nombre;
	private String pa_Cantidad;
        private String pa_fechaEntrada;
        private String pa_Responsable;

    public EntradaProductos() {
    }

    public EntradaProductos(String ta_codigoProducto, String ta_Nombre, String ta_Cantidad, String ta_fechaEntrada, String ta_Responsable) {
        this.pa_codigoProducto = ta_codigoProducto;
        this.pa_Nombre = ta_Nombre;
        this.pa_Cantidad = ta_Cantidad;
        this.pa_fechaEntrada = ta_fechaEntrada;
        this.pa_Responsable = ta_Responsable;
    }

    public String getCodigoProducto() {
        return pa_codigoProducto;
    }

    public void setCodigoProducto(String ta_codigoProducto) {
        this.pa_codigoProducto = ta_codigoProducto;
    }

    public String getNombre() {
        return pa_Nombre;
    }

    public void setNombre(String ta_Nombre) {
        this.pa_Nombre = ta_Nombre;
    }

    public String getCantidad() {
        return pa_Cantidad;
    }

    public void setCantidad(String ta_Cantidad) {
        this.pa_Cantidad = ta_Cantidad;
    }

    public String getFechaEntrada() {
        return pa_fechaEntrada;
    }

    public void setFechaEntrada(String ta_fechaEntrada) {
        this.pa_fechaEntrada = ta_fechaEntrada;
    }

    public String getResponsable() {
        return pa_Responsable;
    }

    public void setResponsable(String ta_Responsable) {
        this.pa_Responsable = ta_Responsable;
    }
        
        

}
