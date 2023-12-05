package com.serv.market.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    private String correo;  

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCelular() {
        return this.celular;
    }

    public void setCelular(Long phone) {
        this.celular = phone;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String address) {
        this.direccion = address;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String email) {
        this.correo = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }                                       

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String lastNames) {
        this.apellidos = lastNames;
    }
}
