package com.Examen.promoweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import lombok.Builder;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data   @NoArgsConstructor @AllArgsConstructor @Builder

public class Product {
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Id
    private Long id;
    private String label;
    private String description;
    private double price;
    private boolean onSale;

    public Object getImage() {
        Object o = null;
        return o;
    }

    public void setImage(Object image) {
    }

    public Object getCategory() {
        Object o = null;
        return null;
    }

    public void setCategory(Object category) {
    }
}
