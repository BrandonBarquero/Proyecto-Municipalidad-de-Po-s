/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



public class Producto{
	private String pa_codigoProducto;
        private String pa_codigoPresupuestario;
	private String pa_Nombre;
	private String pa_Unidad;
	private String pa_Descripcion;
	private String pa_Precio;
	private String pa_Cantidad;
	private String pa_Estado;
        private String pa_Marca;
        private String pa_Fecha_Entrada;
        private String pa_Ubicacion;
        private String pa_tipoProducto;
        private String pa_Garantia;
        private String pa_Proveedor;

        
    public Producto() {
    }

    public Producto(String ta_codigoProducto, String ta_codigoPresupuestario, String ta_Nombre, String ta_Unidad, String ta_Descripcion, String ta_Precio, String ta_Cantidad, String ta_Estado, String ta_Marca, String ta_fechaEntrada, String ta_Ubicacion, String ta_tipoProducto, String ta_Garantia, String ta_Proveedor) {
        this.pa_codigoProducto = ta_codigoProducto;
        this.pa_codigoPresupuestario = ta_codigoPresupuestario;
        this.pa_Nombre = ta_Nombre;
        this.pa_Unidad = ta_Unidad;
        this.pa_Descripcion = ta_Descripcion;
        this.pa_Precio = ta_Precio;
        this.pa_Cantidad = ta_Cantidad;
        this.pa_Estado = ta_Estado;
        this.pa_Marca = ta_Marca;
        this.pa_Fecha_Entrada = ta_fechaEntrada;
        this.pa_Ubicacion = ta_Ubicacion;
        this.pa_tipoProducto = ta_tipoProducto;
        this.pa_Garantia = ta_Garantia;
        this.pa_Proveedor = ta_Proveedor;
    }

    public Producto(String ta_codigoProducto, String ta_codigoPresupuestario, String ta_Nombre, String ta_Unidad, String ta_Descripcion, String ta_Precio, String ta_Cantidad, String ta_Marca, String ta_fechaEntrada, String ta_Ubicacion, String ta_tipoProducto, String ta_Garantia, String ta_Proveedor) {

        this.pa_codigoProducto = ta_codigoProducto;
        this.pa_codigoPresupuestario = ta_codigoPresupuestario;
        this.pa_Nombre = ta_Nombre;
        this.pa_Unidad = ta_Unidad;
        this.pa_Descripcion = ta_Descripcion;
        this.pa_Precio = ta_Precio;
        this.pa_Cantidad = ta_Cantidad;
        this.pa_Marca = ta_Marca;
        this.pa_Fecha_Entrada = ta_fechaEntrada;
        this.pa_Ubicacion = ta_Ubicacion;
        this.pa_tipoProducto = ta_tipoProducto;
        this.pa_Garantia = ta_Garantia;
        this.pa_Proveedor = ta_Proveedor;

    }

    public Producto(String ta_codigoPresupuestario, String  ta_codigoProducto, String ta_Nombre, 
            String ta_Unidad, String ta_Descripcion, String ta_Precio, String ta_Marca, 
            String ta_fechaEntrada, String ta_Ubicacion, String ta_tipoProducto, String ta_Garantia, String ta_Proveedor) {
         this.pa_codigoProducto = ta_codigoProducto;
        this.pa_codigoPresupuestario = ta_codigoPresupuestario;
        this.pa_Nombre = ta_Nombre;
        this.pa_Unidad = ta_Unidad;
        this.pa_Descripcion = ta_Descripcion;
        this.pa_Precio = ta_Precio;
        this.pa_Marca = ta_Marca;
        this.pa_Fecha_Entrada = ta_fechaEntrada;
        this.pa_Ubicacion = ta_Ubicacion;
        this.pa_tipoProducto = ta_tipoProducto;
        this.pa_Garantia = ta_Garantia;
        this.pa_Proveedor = ta_Proveedor;    }

    public String getCodigoProducto() {
        return pa_codigoProducto;
    }

    public void setCodigoProducto(String ta_codigoProducto) {
        this.pa_codigoProducto = ta_codigoProducto;
    }

    public String getCodigoPresupuestario() {
        return pa_codigoPresupuestario;
    }

    public void setCodigoPresupuestario(String ta_codigoPresupuestario) {
        this.pa_codigoPresupuestario = ta_codigoPresupuestario;
    }

    public String getNombre() {
        return pa_Nombre;
    }

    public void setNombre(String ta_Nombre) {
        this.pa_Nombre = ta_Nombre;
    }

    public String getUnidad() {
        return pa_Unidad;
    }

    public void setUnidad(String ta_Unidad) {
        this.pa_Unidad = ta_Unidad;
    }

    public String getDescripcion() {
        return pa_Descripcion;
    }

    public void setDescripcion(String ta_Descripcion) {
        this.pa_Descripcion = ta_Descripcion;
    }

    public String getPrecio() {
        return pa_Precio;
    }

    public void setPrecio(String ta_Precio) {
        this.pa_Precio = ta_Precio;
    }

    public String getCantidad() {
        return pa_Cantidad;
    }

    public void setCantidad(String ta_Cantidad) {
        this.pa_Cantidad = ta_Cantidad;
    }

    public String getEstado() {
        return pa_Estado;
    }

    public void setEstado(String ta_Estado) {
        this.pa_Estado = ta_Estado;
    }

    public String getMarca() {
        return pa_Marca;
    }

    public void setMarca(String ta_Marca) {
        this.pa_Marca = ta_Marca;
    }

    public String getFechaEntrada() {
        return pa_Fecha_Entrada;
    }

    public void setFechaEntrada(String ta_fechaEntrada) {
        this.pa_Fecha_Entrada = ta_fechaEntrada;
    }

    public String getUbicacion() {
        return pa_Ubicacion;
    }

    public void setUbicacion(String ta_Ubicacion) {
        this.pa_Ubicacion = ta_Ubicacion;
    }

    public String getTipoProducto() {
        return pa_tipoProducto;
    }

    public void setTipoProducto(String ta_tipoProducto) {
        this.pa_tipoProducto = ta_tipoProducto;
    }

    public String getGarantia() {
        return pa_Garantia;
    }

    public void setGarantia(String ta_Garantia) {
        this.pa_Garantia = ta_Garantia;
    }

    public String getProveedor() {
        return pa_Proveedor;
    }

    public void setProveedor(String ta_Proveedor) {
        this.pa_Proveedor = ta_Proveedor;
    }

}