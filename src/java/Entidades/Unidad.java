/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author josep
 */
public class Unidad {
    
    private int pn_idUnidad;
    private String pa_nombreUnidad;

    public Unidad() {
    }

    public Unidad(int tn_idUnidad, String ta_nombreUnidad) {
        this.pn_idUnidad = tn_idUnidad;
        this.pa_nombreUnidad = ta_nombreUnidad;
    }

    public int getIdUnidad() {
        return pn_idUnidad;
    }

    public void setIdUnidad(int tn_idUnidad) {
        this.pn_idUnidad = tn_idUnidad;
    }

    public String getNombreUnidad() {
        return pa_nombreUnidad;
    }

    public void setNombreUnidad(String ta_nombreUnidad) {
        this.pa_nombreUnidad = ta_nombreUnidad;
    }
}