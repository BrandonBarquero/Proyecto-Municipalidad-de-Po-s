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
public class Bitacora {
    private String Fecha_Accion,Responsable,Tipo_Accion,Nombre;

    public Bitacora(String Fecha_Accion, String Responsable, String Tipo_Accion, String Nombre) {
        this.Fecha_Accion = Fecha_Accion;
        this.Responsable = Responsable;
        this.Tipo_Accion = Tipo_Accion;
        this.Nombre = Nombre;
    }

    public Bitacora() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    

    public String getFecha_Accion() {
        return Fecha_Accion;
    }

    public void setFecha_Accion(String Fecha_Accion) {
        this.Fecha_Accion = Fecha_Accion;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getTipo_Accion() {
        return Tipo_Accion;
    }

    public void setTipo_Accion(String Tipo_Accion) {
        this.Tipo_Accion = Tipo_Accion;
    }
    
    
    
}
