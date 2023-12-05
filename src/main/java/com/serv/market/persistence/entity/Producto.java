package com.serv.market.persistence.entity;

import jakarta.persistence.*; 

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(Integer id) {
        this.idProducto = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public Integer getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(Integer id) {
        this.idCategoria = id;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String code) {
        this.codigoBarras = code;
    }

    public Double getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(Double price) {
        this.precioVenta = price;
    }

    public Integer getCantidadStock() {
        return this.cantidadStock;
    }

    public void setCantidadStock(Integer stock) {
        this.cantidadStock = stock;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean state) {
        this.estado = state;
    }
    
}
