package com.remedios.robson.curso.dto.mapped;

import com.remedios.robson.curso.dto.request.ProductDTORequest;
import com.remedios.robson.curso.dto.response.ProductDTOResponse;
import com.remedios.robson.curso.entities.Product;

import java.util.Optional;

public class ProductMapped {
    public static Product toProduct(ProductDTORequest request){
        Product product = new Product();

        product.setDescription(request.getDescription());
        product.setWay(request.getWay());
        product.setLote(request.getLote());
        product.setQuantity(request.getQuantity());
        product.setValidity(request.getValidity());
        product.setLaboratory(request.getLaboratory());

        return product;
    }

    public static ProductDTOResponse toProductDTOResponse(Product product){
        ProductDTOResponse response = new ProductDTOResponse();

        response.setDescription(product.getDescription());
        response.setWay(product.getWay());
        response.setLote(product.getLote());
        response.setQuantity(product.getQuantity());
        response.setValidity(product.getValidity());
        response.setLaboratory(product.getLaboratory());

        return response;
    }

    public static ProductDTOResponse toProductDTOResponse(Optional<Product> optional){ // Overload do método toProductDTOResponse
        ProductDTOResponse response = new ProductDTOResponse();
        if (optional.isPresent()){
            response.setDescription(optional.get().getDescription());
            response.setWay(optional.get().getWay());
            response.setLote(optional.get().getLote());
            response.setQuantity(optional.get().getQuantity());
            response.setValidity(optional.get().getValidity());
            response.setLaboratory(optional.get().getLaboratory());
        }

        return response;
    }
}
