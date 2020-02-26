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
public class Departamento {
    
    private int pn_IdDepartamento;
    private String pn_nombreDepartamento;

    public Departamento() {
    }

    public Departamento(int tn_idDepartamento, String ta_nombreDepartamento) {
        this.pn_IdDepartamento = tn_idDepartamento;
        this.pn_nombreDepartamento = ta_nombreDepartamento;
    }

    public int getIdDepartamento() {
        return pn_IdDepartamento;
    }

    public void setIdDepartamento(int tn_idDepartamento) {
        this.pn_IdDepartamento = tn_idDepartamento;
    }

    public String getNombreD() {
        return pn_nombreDepartamento;
    }

    public void setNombreD(String ta_nombreDepartamento) {
        this.pn_nombreDepartamento = ta_nombreDepartamento;
    }
    
    
    
}
