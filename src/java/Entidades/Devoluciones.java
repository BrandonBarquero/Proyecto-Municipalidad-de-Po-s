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
    
        private String Fecha_Devolucion;
	private String Motivo;
	private int Cantidad;
	private String Responsable;
	private String Codigo_Producto;
	private String Departamento;

    public Devoluciones() {
    }

    public Devoluciones(String Fecha_Devolucion, String Motivo, int Cantidad, String Responsable, String Codigo_Producto, String Departamento) {
        this.Fecha_Devolucion = Fecha_Devolucion;
        this.Motivo = Motivo;
        this.Cantidad = Cantidad;
        this.Responsable = Responsable;
        this.Codigo_Producto = Codigo_Producto;
        this.Departamento = Departamento;
    }

    public String getFecha_Devolucion() {
        return Fecha_Devolucion;
    }

    public void setFecha_Devolucion(String Fecha_Devolucion) {
        this.Fecha_Devolucion = Fecha_Devolucion;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(String Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
        
        
    
}
