package com.cloudsoftware.association.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;         // pk

    @Version
    private int version;

    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier supplier;

  //  @OneToMany(mappedBy = "product", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, orphanRemoval = true)
   // @MapKey(name = "localizedId.locale")
 //   private Map<String, LocalizedProduct> localizations = new HashMap<>();


   /* @Column(name = "description_en")
    private String descriptionEn;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "description_ar")
    private String descriptionAr;

    @Column(name ="name_ar")
    private String nameAr;
*/
    private double price;

    private String name;

    private String description;


    public Long getId() {
        return id;
    }





    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

/*
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }
*/



    /*public Map<String, LocalizedProduct> getLocalizations() {
        return localizations;
    }

    public void setLocalizations(Map<String, LocalizedProduct> localizations) {
        this.localizations = localizations;
    }*/

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
