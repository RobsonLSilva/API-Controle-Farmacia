package com.remedios.robson.curso.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.remedios.robson.curso.entities.enums.Laboratory;
import com.remedios.robson.curso.entities.enums.Way;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Getter
@NoArgsConstructor // JPA Only Adiciona um construtor vazio.
@Table(name = "tb_product")
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Getter
    private String description;

    @Setter
    @Getter
    private String lote;

    @Setter
    @Getter
    private Integer quantity;

    @Setter
    @Getter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant validity;

    private Integer way;

    private Integer laboratory;

    public Product(Long id, String description, Way way, String lote, Integer quantity, Instant validity, Laboratory laboratory) {
        this.id = id;
        this.description = description;
        setWay(way);
        this.lote = lote;
        this.quantity = quantity;
        this.validity = validity;
        setLaboratory(laboratory);
    }

    public Product(String description, Way way, String lote, Integer quantity, Instant validity, Laboratory laboratory) {
        this.id = id;
        this.description = description;
        setWay(way);
        this.lote = lote;
        this.quantity = quantity;
        this.validity = validity;
        setLaboratory(laboratory);
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

        return id == product.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", lote='" + lote + '\'' +
                ", quantity=" + quantity +
                ", validity=" + validity +
                ", way=" + way +
                ", laboratory=" + laboratory +
                '}';
    }
}
