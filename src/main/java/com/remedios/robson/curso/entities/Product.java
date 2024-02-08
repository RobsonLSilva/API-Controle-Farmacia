package com.remedios.robson.curso.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.remedios.robson.curso.entities.enums.Laboratory;
import com.remedios.robson.curso.entities.enums.Way;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Entity(name = "Product")
@Table(name = "tb_product")
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer way;
    private String lote;
    private Integer quantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant validity;
    private Integer laboratory;

    public Product(){

    }

    public Product(Long id, String description, Way way, String lote, Integer quantity, Instant validity, Laboratory laboratory) {
        this.id = id;
        this.description = description;
        setWay(way);
        this.lote = lote;
        this.quantity = quantity;
        this.validity = validity;
        setLaboratory(laboratory);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Instant getValidity() {
        return validity;
    }

    public void setValidity(Instant validity) {
        this.validity = validity;
    }

    public Way getWay() {
        return Way.valueOf(way);
    }

    public void setWay(Way way) {
        if (way != null){
            this.way = way.getCode();
        }
    }

    public Laboratory getLaboratory() {
        return Laboratory.valueOf(laboratory);
    }

    public void setLaboratory(Laboratory laboratory) {
        if (laboratory != null){
            this.laboratory = laboratory.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", way=" + way +
                ", lote='" + lote + '\'' +
                ", quantity=" + quantity +
                ", validity=" + validity +
                ", laboratory=" + laboratory +
                '}';
    }
}
