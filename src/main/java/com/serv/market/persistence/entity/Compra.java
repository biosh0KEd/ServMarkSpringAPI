package com.serv.market.persistence.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDate fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
    private List<ComprasProducto> productos;

    public Integer getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(Integer id) {
        this.idCompra = id;
    }

    public String getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(String id) {
        this.idCliente = id;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate date) {
        this.fecha = date;
    }

    public String getMedioPago() {
        return this.medioPago;
    }

    public void setMedioPago(String paymentMethod) {
        this.medioPago = paymentMethod;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comment) {
        this.comentario = comment;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String state) {
        this.estado = state;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public List<ComprasProducto> getProductos() {
        return this.productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<ComprasProducto> purchaseProducts) {
        this.productos = purchaseProducts;
    }
    
}
