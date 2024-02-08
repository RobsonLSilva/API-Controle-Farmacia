package com.remedios.robson.curso.dto.request;

import com.remedios.robson.curso.entities.enums.Laboratory;
import com.remedios.robson.curso.entities.enums.Way;

import java.time.Instant;

public class ProductDTORequest {
    private String description;
    private Way way;
    private String lote;
    private Integer quantity;
    private Instant validity;
    private Laboratory laboratory;

    public ProductDTORequest() {
    }

    public ProductDTORequest(String description, Way way, String lote, Integer quantity, Instant validity, Laboratory laboratory) {
        this.description = description;
        this.way = way;
        this.lote = lote;
        this.quantity = quantity;
        this.validity = validity;
        this.laboratory = laboratory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
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

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }

}
