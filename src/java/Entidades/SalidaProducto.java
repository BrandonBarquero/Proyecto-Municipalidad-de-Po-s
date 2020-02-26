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

    public SalidaProducto() {
    }

    public SalidaProducto(String ta_fechaSalida, String ta_Departamento, int tn_cantidadSalida, String ta_codigoProducto, String ta_Responsable) {
        this.pa_fechaSalida = ta_fechaSalida;
        this.pa_Departamento = ta_Departamento;
        this.pn_cantidadSalida = tn_cantidadSalida;
        this.pa_codigoProducto = ta_codigoProducto;
        this.pa_Responsable = ta_Responsable;
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
