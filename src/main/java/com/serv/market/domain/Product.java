package com.serv.market.domain;

public class Product {
    private int productId;
    private String name;
    private int categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productoId) {
        this.productId = productoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoriaId) {
        this.categoryId = categoriaId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double precio) {
        this.price = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean estado) {
        this.active = estado;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category categoria) {
        this.category = categoria;
    }

}
