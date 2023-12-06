package com.serv.market.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(Integer id) {
        this.idCategoria = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String description) {
        this.descripcion = description;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean state) {
        this.estado = state;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> products) {
        this.productos = products;
    }
}
