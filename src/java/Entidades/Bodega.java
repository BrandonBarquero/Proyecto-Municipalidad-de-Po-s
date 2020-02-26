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
public class Bodega {
    
    private int pn_idBodega;
    private String pa_nombreBodega;

    public Bodega() {
    }

    public Bodega(int tn_idBodega, String ta_nombreBodega) {
        this.pn_idBodega = tn_idBodega;
        this.pa_nombreBodega = ta_nombreBodega;
    }

    public int getIdBodega() {
        return pn_idBodega;
    }

    public void setIdBodega(int tn_idBodega) {
        this.pn_idBodega = tn_idBodega;
    }

    public String getNombreBodega() {
        return pa_nombreBodega;
    }

    public void setNombreBodega(String ta_nombreBodega) {
        this.pa_nombreBodega = ta_nombreBodega;
    }
    
    
    
}
