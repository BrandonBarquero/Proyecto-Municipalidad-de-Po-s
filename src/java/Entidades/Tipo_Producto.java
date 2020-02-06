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
public class Tipo_Producto {
    
    private int Id_Tipo_Producto;
    private String Nombre_Tipo_Producto;

    public Tipo_Producto() {
    }

    public Tipo_Producto(int Id_Tipo_Producto, String Nombre_Tipo_Producto) {
        this.Id_Tipo_Producto = Id_Tipo_Producto;
        this.Nombre_Tipo_Producto = Nombre_Tipo_Producto;
    }

    public int getId_Tipo_Producto() {
        return Id_Tipo_Producto;
    }

    public void setId_Tipo_Producto(int Id_Tipo_Producto) {
        this.Id_Tipo_Producto = Id_Tipo_Producto;
    }

    public String getNombre_Tipo_Producto() {
        return Nombre_Tipo_Producto;
    }

    public void setNombre_Tipo_Producto(String Nombre_Tipo_Producto) {
        this.Nombre_Tipo_Producto = Nombre_Tipo_Producto;
    }
    
    
}
