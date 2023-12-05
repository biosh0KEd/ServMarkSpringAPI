package com.serv.market.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ComprasProductoPK implements Serializable{
    @Column(name = "id_compra")
    public Integer idCompra;

    @Column(name = "id_producto")
    public Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
