package com.serv.market.domain;

public class Category {
    private int categoryId;
    private String category;
    private boolean active;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String nombre) {
        this.category = nombre;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean estado) {
        this.active = estado;
    }
}
