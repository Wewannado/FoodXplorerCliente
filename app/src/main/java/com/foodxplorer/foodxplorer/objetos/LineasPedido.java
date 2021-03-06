package com.foodxplorer.foodxplorer.objetos;

public class LineasPedido {
    private long idPedido;
    private long idProducto;
    private int cantidad;
    private double precio;
    private int iva;

    public LineasPedido() {
    }
    /**
     * Generaremos la clase LinesPedido para poder obtener los productos de un pedido en concreto
     * @param idPedido
     * @param idProducto
     * @param cantidad
     * @param precio
     * @param iva
     */
    public LineasPedido(long idPedido, long idProducto, int cantidad, double precio, int iva) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
    }
    public double getPrecio() {
        return precio;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "LineasPedido{" +
                "idPedido=" + idPedido +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", iva=" + iva +
                '}';
    }
}
