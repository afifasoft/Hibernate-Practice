package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int schoolId;
    private String schoolName;

    @Embedded
    private SchoolDetails schoolDetails;

}
