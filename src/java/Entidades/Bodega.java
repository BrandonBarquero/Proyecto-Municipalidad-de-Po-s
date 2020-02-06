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
    
    private int Id_Bodega;
    private String Nombre_Bodega;

    public Bodega() {
    }

    public Bodega(int Id_Bodega, String Nombre_Bodega) {
        this.Id_Bodega = Id_Bodega;
        this.Nombre_Bodega = Nombre_Bodega;
    }

    public int getId_Bodega() {
        return Id_Bodega;
    }

    public void setId_Bodega(int Id_Bodega) {
        this.Id_Bodega = Id_Bodega;
    }

    public String getNombre_Bodega() {
        return Nombre_Bodega;
    }

    public void setNombre_Bodega(String Nombre_Bodega) {
        this.Nombre_Bodega = Nombre_Bodega;
    }
    
    
    
}
