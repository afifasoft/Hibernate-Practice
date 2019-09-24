package com.cloudsoftware.association.domain;

import lombok.Data;

import javax.persistence.*;


public class LocalizedProduct {

   // @EmbeddedId
    private LocalizedId localizedId;

   // @ManyToOne
   // @MapsId("id")
  //  @JoinColumn(name = "id")
    private Product product;

    private String name;

    private String description;


}
