package com.remedios.robson.curso.entities;

import com.remedios.robson.curso.entities.enums.Laboratory;
import com.remedios.robson.curso.entities.enums.Way;
import lombok.Getter;

import java.time.Instant;

@Getter
public class ProductDTO {
    private String description;
    private Way way;
    private String lote;
    private Integer quantity;
    private Instant validity;
    private Laboratory laboratory;

    public Product transformaParaObjeto(){
        return new Product(description, way, lote, quantity, validity, laboratory);
    }


}
