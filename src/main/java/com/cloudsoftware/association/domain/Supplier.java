package com.cloudsoftware.association.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    @Column(name = "description_en")
    public String descriptionEn;

    @Column(name = "description_ar")
    public String descriptionAr;



}
