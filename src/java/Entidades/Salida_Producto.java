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
public class Salida_Producto {
    
    private String Fecha_Salida;
    private String Departamento;
    private int Cantidad_Salida;
    private String Codigo_Producto;
    private String Responsable;

    public Salida_Producto() {
    }

    public Salida_Producto(String Fecha_Salida, String Departamento, int Cantidad_Salida, String Codigo_Producto, String Responsable) {
        this.Fecha_Salida = Fecha_Salida;
        this.Departamento = Departamento;
        this.Cantidad_Salida = Cantidad_Salida;
        this.Codigo_Producto = Codigo_Producto;
        this.Responsable = Responsable;
    }

    public String getFecha_Salida() {
        return Fecha_Salida;
    }

    public void setFecha_Salida(String Fecha_Salida) {
        this.Fecha_Salida = Fecha_Salida;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getCantidad_Salida() {
        return Cantidad_Salida;
    }

    public void setCantidad_Salida(int Cantidad_Salida) {
        this.Cantidad_Salida = Cantidad_Salida;
    }

    public String getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(String Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }
      
}
