/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



public class Producto{
	private String Codigo_Producto;
        private String Codigo_Presupuestario;
	private String Nombre;
	private String Unidad;
	private String Descripcion;
	private String Precio;
	private String Cantidad;
	private String Estado;
        private String Marca;
        private String Fecha_Entrada;
        private String Ubicacion;
        private String Tipo_Producto;
        private String Garantia;
        private String Proveedor;

        
    public Producto() {
    }

    public Producto(String Codigo_Producto, String Codigo_Presupuestario, String Nombre, String Unidad, String Descripcion, String Precio, String Cantidad, String Estado, String Marca, String Fecha_Entrada, String Ubicacion, String Tipo_Producto, String Garantia, String Proveedor) {
        this.Codigo_Producto = Codigo_Producto;
        this.Codigo_Presupuestario = Codigo_Presupuestario;
        this.Nombre = Nombre;
        this.Unidad = Unidad;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Estado = Estado;
        this.Marca = Marca;
        this.Fecha_Entrada = Fecha_Entrada;
        this.Ubicacion = Ubicacion;
        this.Tipo_Producto = Tipo_Producto;
        this.Garantia = Garantia;
        this.Proveedor = Proveedor;
    }

    public Producto(String Codigo_Producto, String Codigo_Presupuestario, String Nombre, String Unidad, String Descripcion, String Precio, String Cantidad, String Marca, String Fecha_Entrada, String Ubicacion, String Tipo_Producto, String Garantia, String Proveedor) {

        this.Codigo_Producto = Codigo_Producto;
        this.Codigo_Presupuestario = Codigo_Presupuestario;
        this.Nombre = Nombre;
        this.Unidad = Unidad;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Marca = Marca;
        this.Fecha_Entrada = Fecha_Entrada;
        this.Ubicacion = Ubicacion;
        this.Tipo_Producto = Tipo_Producto;
        this.Garantia = Garantia;
        this.Proveedor = Proveedor;

    }

    public Producto(String Codigo_Presupuestario, String  Codigo_Producto, String Nombre, 
            String Unidad, String Descripcion, String Precio, String Marca, 
            String Fecha_Entrada, String Ubicacion, String Tipo_Producto, String Garantia, String Proveedor) {
         this.Codigo_Producto = Codigo_Producto;
        this.Codigo_Presupuestario = Codigo_Presupuestario;
        this.Nombre = Nombre;
        this.Unidad = Unidad;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Marca = Marca;
        this.Fecha_Entrada = Fecha_Entrada;
        this.Ubicacion = Ubicacion;
        this.Tipo_Producto = Tipo_Producto;
        this.Garantia = Garantia;
        this.Proveedor = Proveedor;    }

    public String getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(String Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public String getCodigo_Presupuestario() {
        return Codigo_Presupuestario;
    }

    public void setCodigo_Presupuestario(String Codigo_Presupuestario) {
        this.Codigo_Presupuestario = Codigo_Presupuestario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getFecha_Entrada() {
        return Fecha_Entrada;
    }

    public void setFecha_Entrada(String Fecha_Entrada) {
        this.Fecha_Entrada = Fecha_Entrada;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getTipo_Producto() {
        return Tipo_Producto;
    }

    public void setTipo_Producto(String Tipo_Producto) {
        this.Tipo_Producto = Tipo_Producto;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

}