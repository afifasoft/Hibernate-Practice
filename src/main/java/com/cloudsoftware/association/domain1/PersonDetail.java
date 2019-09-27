package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PersonDetail {

    @Id
    @GeneratedValue
    @Column(name = "detailId_PK")
    private int personDetailId;
    private String zipCode;
    private String job;
    private double income;

    @OneToOne(mappedBy = "personDetail", cascade = CascadeType.ALL)
    private Person person;

}
