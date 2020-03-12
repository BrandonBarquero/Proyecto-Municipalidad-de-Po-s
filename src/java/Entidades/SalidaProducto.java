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
public class SalidaProducto {
    
    private String pa_fechaSalida;
    private String pa_Departamento;
    private int pn_cantidadSalida;
    private String pa_codigoProducto;
    private String pa_Responsable;
    private String pa_Precio;

    public SalidaProducto() {
    }

    public SalidaProducto(String pa_fechaSalida, String pa_Departamento, int pn_cantidadSalida, String pa_codigoProducto, String pa_Responsable, String pa_Precio) {
        this.pa_fechaSalida = pa_fechaSalida;
        this.pa_Departamento = pa_Departamento;
        this.pn_cantidadSalida = pn_cantidadSalida;
        this.pa_codigoProducto = pa_codigoProducto;
        this.pa_Responsable = pa_Responsable;
        this.pa_Precio = pa_Precio;
    }

    public String getPa_fechaSalida() {
        return pa_fechaSalida;
    }

    public void setPa_fechaSalida(String pa_fechaSalida) {
        this.pa_fechaSalida = pa_fechaSalida;
    }

    public String getPa_Departamento() {
        return pa_Departamento;
    }

    public void setPa_Departamento(String pa_Departamento) {
        this.pa_Departamento = pa_Departamento;
    }

    public int getPn_cantidadSalida() {
        return pn_cantidadSalida;
    }

    public void setPn_cantidadSalida(int pn_cantidadSalida) {
        this.pn_cantidadSalida = pn_cantidadSalida;
    }

    public String getPa_codigoProducto() {
        return pa_codigoProducto;
    }

    public void setPa_codigoProducto(String pa_codigoProducto) {
        this.pa_codigoProducto = pa_codigoProducto;
    }

    public String getPa_Responsable() {
        return pa_Responsable;
    }

    public void setPa_Responsable(String pa_Responsable) {
        this.pa_Responsable = pa_Responsable;
    }

    public String getPa_Precio() {
        return pa_Precio;
    }

    public void setPa_Precio(String pa_Precio) {
        this.pa_Precio = pa_Precio;
    }

 

    public String getFechaSalida() {
        return pa_fechaSalida;
    }

    public void setFechaSalida(String ta_fechaSalida) {
        this.pa_fechaSalida = ta_fechaSalida;
    }

    public String getDepartamento() {
        return pa_Departamento;
    }

    public void setDepartamento(String ta_Departamento) {
        this.pa_Departamento = ta_Departamento;
    }

    public int getCantidadSalida() {
        return pn_cantidadSalida;
    }

    public void setCantidadSalida(int tn_cantidadSalida) {
        this.pn_cantidadSalida = tn_cantidadSalida;
    }

    public String getCodigoProducto() {
        return pa_codigoProducto;
    }

    public void setCodigoProducto(String ta_codigoProducto) {
        this.pa_codigoProducto = ta_codigoProducto;
    }

    public String getResponsable() {
        return pa_Responsable;
    }

    public void setResponsable(String ta_Responsable) {
        this.pa_Responsable = ta_Responsable;
    }
      
}
