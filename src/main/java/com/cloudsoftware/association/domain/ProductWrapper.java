package com.cloudsoftware.association.domain;

import org.springframework.stereotype.Component;

@Component
public class ProductWrapper {

    Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
