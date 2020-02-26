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
public class TipoProducto {
    
    private int pn_idTipoProducto;
    private String pa_nombreTipoProducto;

    public TipoProducto() {
    }

    public TipoProducto(int tn_idTipoProducto, String ta_nombreTipoProducto) {
        this.pn_idTipoProducto = tn_idTipoProducto;
        this.pa_nombreTipoProducto = ta_nombreTipoProducto;
    }

    public int getIdTipoProducto() {
        return pn_idTipoProducto;
    }

    public void setIdTipoProducto(int tn_idTipoProducto) {
        this.pn_idTipoProducto = tn_idTipoProducto;
    }

    public String getNombreTipoProducto() {
        return pa_nombreTipoProducto;
    }

    public void setNombreTipoProducto(String ta_nombreTipoProducto) {
        this.pa_nombreTipoProducto = ta_nombreTipoProducto;
    }
    
    
}
