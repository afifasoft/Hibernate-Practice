package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class SchoolDetails {

    private String schoolAddress;
    private boolean isPublicSchool;
    private int studentCount;



}
