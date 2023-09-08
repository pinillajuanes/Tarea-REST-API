package com.inventario.donpedro.model;

import java.util.Date;

public class LogInventoryTransaction {
    private int id;
    private Date timestamp;
    private ProductModel product;
    private int quantity;
    private String action;


    public LogInventoryTransaction(int id, Date timestamp, ProductModel product, int quantity, String action) {
        this.id = id;
        this.timestamp = timestamp;
        this.product = product;
        this.quantity = quantity;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "LogInventoryModel{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", product=" + product +
                ", quantity=" + quantity +
                ", action='" + action + '\'' +
                '}';
    }
}