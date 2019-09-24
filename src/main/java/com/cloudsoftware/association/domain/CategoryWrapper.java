package com.cloudsoftware.association.domain;

import org.springframework.stereotype.Component;

@Component
public class CategoryWrapper {

    private Category category;


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
