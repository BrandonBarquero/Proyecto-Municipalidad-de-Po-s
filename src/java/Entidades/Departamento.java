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
    
    private int IdDepartamento;
    private String NombreD;

    public Departamento() {
    }

    public Departamento(int IdDepartamento, String NombreD) {
        this.IdDepartamento = IdDepartamento;
        this.NombreD = NombreD;
    }

    public int getIdDepartamento() {
        return IdDepartamento;
    }

    public void setIdDepartamento(int IdDepartamento) {
        this.IdDepartamento = IdDepartamento;
    }

    public String getNombreD() {
        return NombreD;
    }

    public void setNombreD(String NombreD) {
        this.NombreD = NombreD;
    }
    
    
    
}
