/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author brandonbarquero
 */
public class Devoluciones {
    
        private String pa_fechaDevolucion;
	private String pa_Motivo;
	private int pn_Cantidad;
	private String pa_Responsable;
	private String pa_codigoProducto;
	private String pa_Departamento;

    public Devoluciones() {
    }

    public Devoluciones(String ta_fechaDevolucion, String ta_Motivo, int tn_Cantidad, String ta_Responsable, String ta_codigoProducto, String ta_Departamento) {
        this.pa_fechaDevolucion = ta_fechaDevolucion;
        this.pa_Motivo = ta_Motivo;
        this.pn_Cantidad = tn_Cantidad;
        this.pa_Responsable = ta_Responsable;
        this.pa_codigoProducto = ta_codigoProducto;
        this.pa_Departamento = ta_Departamento;
    }

    public String getFechaDevolucion() {
        return pa_fechaDevolucion;
    }

    public void setFechaDevolucion(String ta_fechaDevolucion) {
        this.pa_fechaDevolucion = ta_fechaDevolucion;
    }

    public String getMotivo() {
        return pa_Motivo;
    }

    public void setMotivo(String ta_Motivo) {
        this.pa_Motivo = ta_Motivo;
    }

    public int getCantidad() {
        return pn_Cantidad;
    }

    public void setCantidad(int tn_Cantidad) {
        this.pn_Cantidad = tn_Cantidad;
    }

    public String getResponsable() {
        return pa_Responsable;
    }

    public void setResponsable(String ta_Responsable) {
        this.pa_Responsable = ta_Responsable;
    }

    public String getCodigoProducto() {
        return pa_codigoProducto;
    }

    public void setCodigoProducto(String ta_codigoProducto) {
        this.pa_codigoProducto = ta_codigoProducto;
    }

    public String getDepartamento() {
        return pa_Departamento;
    }

    public void setDepartamento(String ta_Departamento) {
        this.pa_Departamento = ta_Departamento;
    }
        
        
    
}
