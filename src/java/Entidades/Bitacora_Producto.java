/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Allan
 */
public class Bitacora_Producto {
   private String Fecha_Accion,Tipo_Accion, Resposable,Codigo_Producto,Cantidad_Producto;

    public String getFecha_Accion() {
        return Fecha_Accion;
    }

    public void setFecha_Accion(String Fecha_Accion) {
        this.Fecha_Accion = Fecha_Accion;
    }

    public String getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(String Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public String getTipo_Accion() {
        return Tipo_Accion;
    }

    public void setTipo_Accion(String Tipo_Accion) {
        this.Tipo_Accion = Tipo_Accion;
    }

    public String getResposable() {
        return Resposable;
    }

    public void setResposable(String Resposable) {
        this.Resposable = Resposable;
    }

    public String getCantidad_Producto() {
        return Cantidad_Producto;
    }

    public void setCantidad_Producto(String Cantidad_Producto) {
        this.Cantidad_Producto = Cantidad_Producto;
    }

    public Bitacora_Producto() {
    }

    public Bitacora_Producto(String Fecha_Accion, String Tipo_Accion, String Resposable, String Codigo_Producto, String Cantidad_Producto) {
        this.Fecha_Accion = Fecha_Accion;
        this.Tipo_Accion = Tipo_Accion;
        this.Resposable = Resposable;
        this.Codigo_Producto = Codigo_Producto;
        this.Cantidad_Producto = Cantidad_Producto;
    }

  
    
    
    
}
